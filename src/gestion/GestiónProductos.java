/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;
import negocio.Producto;
import java.io.IOException;


/**
 *
 * @author valentina
 */
public class GestiónProductos {
    //Variables de clase
    private ArrayList<Producto> inventario;
    private ListIterator iteraInventario;
    private  String ruta;

    
    public GestiónProductos() 
    {
        this.inventario=new ArrayList();
        this.iteraInventario=null;
        this.ruta="./Archivos/misProdus.txt";
        this.verificaArchivo();
        
    }
    
    public void verificaArchivo()
    {
      try
        {
            File filex= new File(ruta);
            if (!filex.exists())
                filex.createNewFile();// lo crea
        }  
        catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null,"Fallo en la ruta...!!");
            //ex.printStackTrace();
            
        }
        
    }
    
    public boolean verificaProductos()
    {
        boolean hay=false; 
        FileReader file; 
        BufferedReader br; 
        String registro;
        
        try 
        {
            file=new FileReader(ruta);
            br = new BufferedReader(file);
            if ((registro = br.readLine()) != null) 
            {
                hay=true;
                
            }
        }
        catch(IOException ioe)
        {
            JOptionPane.showMessageDialog(null,"Error..buscando productos..!!");
        }
        return hay;
    }
    
    public ArrayList<Producto> getTodos() 
    {
        ArrayList<Producto> productos=new ArrayList();
        FileReader file;
        BufferedReader br;
        String registro;
        Producto elProdu=null;
        
        
        try 
        {
            file=new FileReader(ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) 
            {
                String campos[]=registro.split(",");
                elProdu=new Producto(campos[0],campos[1],Float.parseFloat(campos[2]),Float.parseFloat(campos[3]),Integer.parseInt(campos[4]),campos[5]); 
                productos.add(elProdu);
            }
        }
        catch(IOException ioe) 
        {
            JOptionPane.showMessageDialog(null,"Error..buscando..!!"); 
        }
        return productos;
    }    
    
    
    
    public Producto buscarProducto(String codigo)
    {
      FileReader file;
      BufferedReader br;
      String registro;
      Producto elProdu=null;
      
      try 
      {
        file=new FileReader(ruta);
        br = new BufferedReader(file);
      
        while((registro = br.readLine()) !=null)
        {
            String campos[] = registro.split(",");
            if(campos[0].equals(codigo))
            {
                elProdu=new Producto(campos[0],campos[1],Float.parseFloat(campos[2]),Float.parseFloat(campos[3]),Integer.parseInt(campos[4]),campos[5]);
                break;
            }
        }
      }
      catch(IOException ioe) 
      {
        JOptionPane.showMessageDialog(null,"Error..buscando médico..!!"); 
      }
        return elProdu;
    }
    
    public void eliminarProducto(String code) 
    {
        int caso;
        boolean existe=false;
        ArrayList<Producto> produs=this.getTodos();
        
        this.iteraInventario=produs.listIterator(); 
        while(this.iteraInventario.hasNext())
        {
            Producto produ = (Producto)(this.iteraInventario.next());
            if(produ.getCodigo().equalsIgnoreCase(code))
            {
                caso=JOptionPane.showConfirmDialog(null, "Esta Seguro?"); 
                if (caso==0)
                {
                    produs.remove(produ);
                    JOptionPane.showMessageDialog(null, "EL PRODUCTO HA SIDO ELIMINADO.!!!"); 
                    existe=true;
                    this.recargArchivo(produs);
                }
                break;
            }  
        }
        if(!existe)
            JOptionPane.showMessageDialog(null, "ESE CODIGO NO EXISTE..!!!"); 
    }
  
    public void recargArchivo(ArrayList<Producto> productos)
    {

        try 
        {
            File file=new File(ruta);
            FileWriter fr=new FileWriter(file, false); 
            PrintWriter ps = new PrintWriter(fr); 
            for(Producto elProdu:productos)
            {
            ps.println(elProdu); 
            }
            ps.close(); 
        }
        catch(IOException ioe) 
        {
            JOptionPane.showMessageDialog(null,"Error..recargando archivo..!!"); 
        }
    }
    
    
    public void guardarProducto(Producto elProdu)
    {      
        try
        {
            File file= new File(ruta);
            FileWriter fr= new FileWriter(file, true);
            PrintWriter ps=new PrintWriter(fr);
                ps.println(elProdu);
            ps.close();
            JOptionPane.showMessageDialog(null, "El Producto ha sido guardado en la base...");

        }
        catch(IOException ioe)
        {
          JOptionPane.showMessageDialog(null, "Errror... El producto NO fue guardado en la base...!!");
        }
    }
  
    public void modificarProducto(Producto productoModificado, String code)
    { 
      boolean existe=false;
      ArrayList<Producto> produs=this.getTodos();
      int i=- 1;
      
     
       this.iteraInventario=produs.listIterator(); 
        while(this.iteraInventario.hasNext())
        {
            i++;
            Producto produ = (Producto)(this.iteraInventario.next());
            if(produ.getCodigo().equals(code))
            {
               //lo reemplaza por el nuevo
                produs.set(i, productoModificado);
               
                JOptionPane.showMessageDialog(null, "EL PRODUCTO HA SIDO MODIFICADO");
                existe=true;
                this.recargArchivo(produs);
                break;
            }  
        }
        if(!existe)
            JOptionPane.showMessageDialog(null, "ESE CODIGO NO EXISTE..!!!");
    }
   
    public ArrayList<Producto> get()
    {
        FileReader fr;
        BufferedReader br;
        Producto prod=null;
        String registro;
        ArrayList<Producto> produ=new ArrayList();
        
        try
        {
            fr=new FileReader(ruta);
            br= new BufferedReader(fr);
            while ((registro= br.readLine()) != null)
            {
                String[] campos= registro.split(",");
                prod= new Producto(campos[0],campos[1],Float.parseFloat(campos[2]),Float.parseFloat(campos[3]),Integer.parseInt(campos[4]),campos[5]);
                produ.add(prod);
            }
        }
        catch(IOException ioe)
        {
            JOptionPane.showMessageDialog(null,"Fallo buscando!"); 
        }
       return produ;   
    }
    
    public boolean verificarNombre(String produ)
    {
      boolean existe=false;
      FileReader file;
      BufferedReader br;
      String registro;
      
      
      try 
      {
        file=new FileReader(ruta);
        br = new BufferedReader(file);
      
        while((registro = br.readLine()) !=null)
        {
            String campos[] = registro.split(",");
            if(campos[1].equals(produ))
            {
                existe=true;
                break;
            }
        }
      }
      catch(IOException ioe) 
      {
        JOptionPane.showMessageDialog(null,"Error..buscando..!!"); 
      }
        
        return existe;
    }

    public boolean verificarCodigo(String code)
    {
      boolean existe=false;
      FileReader file;
      BufferedReader br;
      String registro;
      Producto elProdu=null;
      
      try 
      {
        file=new FileReader(ruta);
        br = new BufferedReader(file);
      
        while((registro = br.readLine()) !=null)
        {
            String campos[] = registro.split(",");
            if(campos[0].equals(code))
            {
                existe=true;
                break;
            }
        }
      }
      catch(IOException ioe) 
      {
        JOptionPane.showMessageDialog(null,"Error..buscando..!!"); 
      }
        
        return existe;
    }
    
}

