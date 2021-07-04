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
public class Persona 
{
   private String ID;
   private String nombre; 

    public Persona() 
    {
        this.ID = "";
        this.nombre = "";
    }
   
    public Persona(String ID, String nombre) 
    {
        this.ID = ID;
        this.nombre = nombre;
    }
    
    public String getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
}
