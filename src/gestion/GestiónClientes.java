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
import negocio.Clientes;


/**
 *
 * @author valentina
 */
public class GestiónClientes 
{
    //Variables de clase
    private ArrayList<Clientes> cliente;
    private ListIterator iteraClientes;
    private  String ruta;

    
    public GestiónClientes() 
    {
        this.cliente=new ArrayList();
        this.iteraClientes=null;
        this.ruta="./Archivos/misClientes.txt";
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
    
    public boolean verificaClientes()
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
    
    public ArrayList<Clientes> getTodos() 
    {
        ArrayList<Clientes> clientes=new ArrayList();
        FileReader file;
        BufferedReader br;
        String registro;
        Clientes elCliente=null;
        
        
        try 
        {
            file=new FileReader(ruta);
            br = new BufferedReader(file);
            while ((registro = br.readLine()) != null) 
            {
                String campos[]=registro.split(",");
                elCliente=new Clientes(campos[0],campos[1],(campos[2])); 
                clientes.add(elCliente);
            }
        }
        catch(IOException ioe) 
        {
            JOptionPane.showMessageDialog(null,"Error..buscando..!!"); 
        }
        return clientes;
    }    
    
    /*public void verInventario(char opcion) 
    {
        ArrayList<Producto> produs=this.getTodos(); 
        
        if(opcion=='1') 
            Collections.sort(produs,Comparator.comparing(tiendanivel5.Producto::getCodigo));
        if(opcion=='2') 
            Collections.sort(produs,Comparator.comparing(tiendanivel5.Producto::getNombre));
        if(opcion=='3') 
            Collections.sort(produs,Comparator.comparing(tiendanivel5.Producto::getPrecioCompra));
        if(opcion=='4') 
            Collections.sort(produs,Comparator.comparing(tiendanivel5.Producto::getExistencias));
        
        produs.stream().forEach(produ-> System.out.println(produ)); 
        System.out.println("===================================");
    }*/
    
    public Clientes buscarCliente(String ID)
    {
      FileReader file;
      BufferedReader br;
      String registro;
      Clientes elCliente=null;
      
      try 
      {
        file=new FileReader(ruta);
        br = new BufferedReader(file);
      
        while((registro = br.readLine()) !=null)
        {
            String campos[] = registro.split(",");
            if(campos[0].equals(ID))
            {
                elCliente=new Clientes(campos[0],campos[1],campos[2]);
                break;
            }
        }
      }
      catch(IOException ioe) 
      {
        JOptionPane.showMessageDialog(null,"Error..buscando médico..!!"); 
      }
        return elCliente;
    }
    
    
  
    public void recargArchivo(ArrayList<Clientes> clientes)
    {

        try 
        {
            File file=new File(ruta);
            FileWriter fr=new FileWriter(file, false); 
            PrintWriter ps = new PrintWriter(fr); 
            for(Clientes elCliente:clientes)
            {
                ps.println(elCliente); 
            }
            ps.close(); 
        }
        catch(IOException ioe) 
        {
            JOptionPane.showMessageDialog(null,"Error..recargando archivo..!!"); 
        }
    }
    
    public void guardarCliente(Clientes elCliente)
    {      
        try
        {
            File file= new File(ruta);
            FileWriter fr= new FileWriter(file, true);
            PrintWriter ps=new PrintWriter(fr);
                ps.println(elCliente);
            ps.close();
            JOptionPane.showMessageDialog(null, "El cliente ha sido guardado en la base...");

        }
        catch(IOException ioe)
        {
          JOptionPane.showMessageDialog(null, "Errror... El cliente NO fue guardado en la base...!!");
        }
    }

    public boolean verificarID(String ID)
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

