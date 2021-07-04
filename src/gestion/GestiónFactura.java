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
import negocio.Factura;

/**
 *
 * @author valentina
 */
public class GestiónFactura 
{
    private ArrayList<Factura> inventario;
    private ListIterator iteraInventario;
    private  String ruta;
    private GestiónProductos gestor;

    
    public GestiónFactura() 
    {
        this.inventario=new ArrayList();
        this.iteraInventario=null;
        this.gestor= new GestiónProductos();
        this.ruta="./Archivos/misFac.txt";
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
           
        }
    }
    
    public ArrayList<Factura> getTodos() 
    {
        ArrayList<Factura> ops=new ArrayList();
        FileReader file;
        BufferedReader br;
        String registro;
        Factura elOp=null;
        
        
        try 
        {
            file=new FileReader(ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) 
            {
                String campos[]=registro.split(",");
                elOp=new Factura((campos[0]),campos[1], Integer.parseInt(campos[2]),Float.parseFloat(campos[3]),Float.parseFloat(campos[4]),Integer.parseInt(campos[5])); 
                ops.add(elOp);
            }
        }
        catch(IOException ioe) 
        {
            JOptionPane.showMessageDialog(null,"Error..buscando..!!"); 
        }
        return ops;
    }    
    
    private void recargArchivo(ArrayList<Factura> ops)
    {

        try 
        {
            File file=new File(ruta);
            FileWriter fr=new FileWriter(file, false); 
            PrintWriter ps = new PrintWriter(fr); 
            for(Factura elProdu:ops)
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
    
    
    public void guardarOperaciones(Factura elProdu)
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
}
