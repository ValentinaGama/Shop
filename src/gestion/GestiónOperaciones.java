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
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;
import negocio.Operaciones;

/**
 *
 * @author valentina
 */
public class GestiónOperaciones
{
    private ArrayList<Operaciones> inventario;
    private ListIterator iteraInventario;
    private  String ruta;
    private GestiónProductos gestor;

    
    public GestiónOperaciones() 
    {
        this.inventario=new ArrayList();
        this.iteraInventario=null;
        this.gestor= new GestiónProductos();
        this.ruta="./Archivos/misOps.txt";
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
    
    public boolean verificaOperaciones()
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
            JOptionPane.showMessageDialog(null,"Error..!!");
        }
        return hay;
    }
    
    public ArrayList<Operaciones> getTodos() 
    {
        ArrayList<Operaciones> ops=new ArrayList();
        FileReader file;
        BufferedReader br;
        String registro;
        Operaciones elOp=null;
        
        
        try 
        {
            file=new FileReader(ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) 
            {
                String campos[]=registro.split(",");
                elOp=new Operaciones((campos[0]),campos[1],campos[2],Float.parseFloat(campos[3]),Boolean.parseBoolean(campos[4]),Integer.parseInt(campos[5])); 
                ops.add(elOp);
            }
        }
        catch(IOException ioe) 
        {
            JOptionPane.showMessageDialog(null,"Error..buscando..!!"); 
        }
        return ops;
    }    
    
    private void recargArchivo(ArrayList<Operaciones> ops)
    {

        try 
        {
            File file=new File(ruta);
            FileWriter fr=new FileWriter(file, false); 
            PrintWriter ps = new PrintWriter(fr); 
            for(Operaciones elProdu:ops)
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
    
    
    public void guardarOperaciones(Operaciones elProdu)
    {      
        try
        {
            File file= new File(ruta);
            FileWriter fr= new FileWriter(file, true);
            PrintWriter ps=new PrintWriter(fr);
                ps.println(elProdu);
            ps.close();
            JOptionPane.showMessageDialog(null, "La operación ha sido exitosa");

        }
        catch(IOException ioe)
        {
          JOptionPane.showMessageDialog(null, "Error..");
        }
    }
    
    /*
    public ArrayList<Operaciones> getCompras()
    {
        FileReader fr;
        BufferedReader br;
        Operaciones ope=null;
        String registro;
        ArrayList<Operaciones> ops=new ArrayList();
        
        try
        {
            fr=new FileReader(ruta);
            br= new BufferedReader(fr);
            while ((registro= br.readLine()) != null)
            {
                String[] campos= registro.split(",");
                if(Integer.parseInt(campos[5])==1)
                {
                    ope= new Operaciones((campos[0]),campos[1],campos[2],Float.parseFloat(campos[3]),(campos[4]),Integer.parseInt(campos[5]));
                    ops.add(ope);
                }
            }
        }
        catch(IOException ioe)
        {
            JOptionPane.showMessageDialog(null,"Fallo buscando!"); 
        }
       return ops;   
    }
    
    public ArrayList<Operaciones> getVentas()
    {
        FileReader fr;
        BufferedReader br;
        Operaciones ope=null;
        String registro;
        ArrayList<Operaciones> ops=new ArrayList();
        
        try
        {
            fr=new FileReader(ruta);
            br= new BufferedReader(fr);
            while ((registro= br.readLine()) != null)
            {
                String[] campos= registro.split(",");
                if(campos[5].equals(2))
                {
                ope= new Operaciones((campos[0]),campos[1],campos[2],Float.parseFloat(campos[3]),(campos[4]),Integer.parseInt(campos[5]));
                ops.add(ope);
                }
            }
        }
        catch(IOException ioe)
        {
            JOptionPane.showMessageDialog(null,"Fallo buscando!"); 
        }
       return ops; 
       
    }*/
    
   
}
