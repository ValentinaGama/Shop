/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author valentina
 */
public class Clientes extends Persona
{
    //Atributos
    
    private String tipo;
    private String ID;
    private String nombre; 
    //Métodos

    public Clientes()
    {
        super();
       
        this.tipo = "";
        
    }

    public Clientes(String ID, String nombre, String tipo) 
    {
        super(ID,nombre);
        this.ID = ID;
        this.nombre = nombre;
        this.tipo = tipo;  
    }
    
    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    

    @Override
    public String toString() {
        return this.ID + "," + this.nombre + "," + this.tipo;
    }
    
    
    
    
    
    
}
