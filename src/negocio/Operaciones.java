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
public class Operaciones 
{
    private String factura;
    private String fecha;
    private float total;
    private String persona;
    private boolean  pago;
    private int tipo;

    public Operaciones() {
    }

    public Operaciones(String factura, String fecha, String persona, float total, boolean pago, int tipo) 
    {
        this.factura = factura;
        this.fecha = fecha;
        this.total = total;
        this.persona = persona;
        this.pago = pago;
        this.tipo = tipo;
    }

    public void setFactura(String factura) 
    {
        this.factura = factura;
    }

    public void setFecha(String fecha) 
    {
        this.fecha = fecha;
    }

    public void setTotal(float total) 
    {
        this.total = total;
    }

    public void setPersona(String persona) 
    {
        this.persona = persona;
    }

    public void setPago(boolean pago) 
    {
        this.pago = pago;
    }

    public void setTipo(int tipo) 
    {
        this.tipo = tipo;
    }

    public String getFactura() 
    {
        return factura;
    }

    public String getFecha() 
    {
        return fecha;
    }

    public float getTotal() 
    {
        return total;
    }

    public String getPersona() 
    {
        return persona;
    }

    public boolean isPago() 
    {
        return pago;
    }

    public int getTipo() 
    {
        return tipo;
    }

    @Override
    public String toString() 
    {
        return  factura + "," + fecha + "," + persona +"," + total +  "," + pago + "," + tipo;
    }
    
    
}

