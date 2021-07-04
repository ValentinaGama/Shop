/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import javax.swing.JOptionPane;
import java.io.IOException;
import negocio.Proveedores;


/**
 *
 * @author valentina
 */
public class GestiónProveedores {
    //Variables de clase
    private ArrayList<Proveedores> proveedor;
    private ListIterator iteraProveedores;
    private  String ruta;

    
    public GestiónProveedores() 
    {
        this.proveedor=new ArrayList();
        this.iteraProveedores=null;
        this.ruta="./Archivos/misProveedores.txt";
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
    
    public boolean verificaProveedores()
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
            JOptionPane.showMessageDialog(null,"Error..buscando proveedores..!!");
        }
        return hay;
    }
    
    public ArrayList<Proveedores> getTodos() 
    {
        ArrayList<Proveedores> proveedores=new ArrayList();
        FileReader file;
        BufferedReader br;
        String registro;
        Proveedores elProveedor=null;
        
        
        try 
        {
            file=new FileReader(ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) 
            {
                String campos[]=registro.split(",");
                elProveedor=new Proveedores(campos[0],campos[1]); 
                proveedores.add(elProveedor);
            }
        }
        catch(IOException ioe) 
        {
            JOptionPane.showMessageDialog(null,"Error..buscando..!!"); 
        }
        return proveedores;
    }    
    
    /*public void verInventario(char opcion) 
    {
        ArrayList<Proveedores> produs=this.getTodos(); 
        
        if(opcion=='1') 
            Collections.sort(produs,Comparator.comparing(tiendanivel5.Proveedores::getCodigo));
        if(opcion=='2') 
            Collections.sort(produs,Comparator.comparing(tiendanivel5.Proveedores::getNombre));
        if(opcion=='3') 
            Collections.sort(produs,Comparator.comparing(tiendanivel5.Proveedores::getPrecioCompra));
        if(opcion=='4') 
            Collections.sort(produs,Comparator.comparing(tiendanivel5.Proveedores::getExistencias));
        
        produs.stream().forEach(produ-> System.out.println(produ)); 
        System.out.println("===================================");
    }*/
    
    public Proveedores buscarProveedores(String ID)
    {
      FileReader file;
      BufferedReader br;
      String registro;
      Proveedores elProveedor=null;
      
      try 
      {
        file=new FileReader(ruta);
        br = new BufferedReader(file);
      
        while((registro = br.readLine()) !=null)
        {
            String campos[] = registro.split(",");
            if(campos[0].equals(ID))
            {
                elProveedor=new Proveedores(campos[0],campos[1]);
                break;
            }
        }
      }
      catch(IOException ioe) 
      {
        JOptionPane.showMessageDialog(null,"Error..buscando médico..!!"); 
      }
        return elProveedor;
    }
    
    
    public void recargArchivo(ArrayList<Proveedores> proveedores)
    {

        try 
        {
            File file=new File(ruta);
            FileWriter fr=new FileWriter(file, false); 
            PrintWriter ps = new PrintWriter(fr); 
            for(Proveedores elProveedor:proveedores)
            {
            ps.println(elProveedor); 
            }
            ps.close(); 
        }
        catch(IOException ioe) 
        {
            JOptionPane.showMessageDialog(null,"Error..recargando archivo..!!"); 
        }
    }
   
    public void guardarProveedores(Proveedores elProveedor)
    {      
        try
        {
            File file= new File(ruta);
            FileWriter fr= new FileWriter(file, true);
            PrintWriter ps=new PrintWriter(fr);
                ps.println(elProveedor);
            ps.close();
            JOptionPane.showMessageDialog(null, "El Proveedores ha sido guardado en la base...");

        }
        catch(IOException ioe)
        {
          JOptionPane.showMessageDialog(null, "Errror... El proveedor NO fue guardado en la base...!!");
        }
    }
  
   
    public boolean verificarNombre(String nomb)
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
            if(campos[1].equals(nomb))
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

    public boolean verificarID(String ID)
    {
      boolean existe=false;
      FileReader file;
      BufferedReader br;
      String registro;
      Proveedores elProveedor=null;
      
      try 
      {
        file=new FileReader(ruta);
        br = new BufferedReader(file);
      
        while((registro = br.readLine()) !=null)
        {
            String campos[] = registro.split(",");
            if(campos[0].equals(ID))
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

