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
public class Factura 
{
    private String factura;
    private float total;
    private float precio;
    private String producto;
    private int cantidad;
    private int tipo;

    
    public Factura() {
    }

    public Factura(String factura, String producto,int cantidad, float precio, float total, int tipo) 
    {
        this.factura = factura;
        this.precio = precio;
        this.total = total;
        this.producto = producto;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getFactura() {
        return factura;
    }

    public float getTotal() {
        return total;
    }

    public float getPrecio() {
        return precio;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return factura + "," + producto+ "," + cantidad + "," + precio+ ","+ total  + "," + tipo;
    }
    
    
}
