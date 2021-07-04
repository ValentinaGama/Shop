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
public class Producto {
    //Atributos
    private String codigo;
    private String nombre;
    private String foto;
    private float precioCompra;
    private float precioVenta;
    private int existencias;
    
    //Métodos

    public Producto()
    {
        this.codigo = "";
        this.nombre = "";
        this.foto = "";
        this.precioCompra = 0;
        this.precioVenta = 0;
        this.existencias = 0;
    }

    public Producto(String codigo, String nombre, float precioCompra,String foto) 
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = this.precioCompra*1.25f;
        this.existencias =0;
        this.foto=foto;
    }
    public Producto(String codigo, String nombre, float precioCompra,float precioVenta, int existencias, String foto) 
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = this.precioCompra*1.25f;
        this.existencias =existencias;
        this.foto=foto;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public int getExistencias() {
        return existencias;
    }
    
    public String getfoto(){
        return foto;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
    public void setfoto(String foto){
        this.foto=foto;
    }

    @Override
    public String toString() {
        return this.codigo + "," + this.nombre + "," + this.precioCompra + "," + this.precioVenta + "," + this.existencias+ "," + this.foto;
    }
    
    
    
    
    
    
}
