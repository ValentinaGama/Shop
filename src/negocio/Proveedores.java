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
public class Proveedores extends Persona
{
    private String ID;
    private String nombre; 
    
    public Proveedores() 
    {
       super(); 
    }

    public Proveedores(String ID, String nombre) 
    {
        super(ID,nombre);
        this.ID = ID;
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return ID + "," + nombre ;
    }
    
    
    
}
