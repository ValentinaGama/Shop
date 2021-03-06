/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swtienda;

import gestion.GestiónClientes;
import gestion.GestiónFactura;
import gestion.GestiónOperaciones;
import gestion.GestiónProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.Clientes;
import negocio.Factura;
import negocio.Operaciones;
import negocio.Producto;

/**
 *
 * @author valentina
 */
public class PanelVentas extends javax.swing.JPanel implements ActionListener, MouseListener, ItemListener
{

    /**
     * Creates new form PanelCompras
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        jPanel7.setBackground(new java.awt.Color(255, 204, 102));

        jLabel10.setText("Factura # :");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("Fecha :");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("Identificación");
        jLabel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("Cliente :");
        jLabel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setText("Producto :");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setText(" Cantidad :");
        jLabel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton6.setText("Eliminar");

        jButton7.setText("Guardar Venta");

        jButton8.setText("Ver Todas");

        jButton9.setText("Agregar");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        jTextField5.setEnabled(false);

        jDateChooser1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Total:");

        jCheckBox1.setText("crédito");

        jButton1.setText("Actualizar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jCheckBox1)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1))))
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(174, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    GestiónClientes gestorClie;
    GestiónProductos gestorProd;
    GestiónOperaciones gestorOp;
    GestiónFactura fact;
    ArrayList<Clientes> listaClie = new ArrayList<>();
    ArrayList<Producto> listaProductos = new ArrayList<>();
    private DefaultTableModel modelo;
    private Ppal ppal;
    private float total;
    private boolean tipo;
    private SimpleDateFormat fe;
    
    public PanelVentas(Ppal pp) 
    {
        initComponents();
        this.setBounds(0, 0 , 650, 270);
        this.gestorClie= new GestiónClientes();
        this.gestorProd= new GestiónProductos();
        this.gestorOp= new GestiónOperaciones();
        this.fact= new GestiónFactura();
        this.llenarcombos();
        this.total=0;
        this.ppal=pp;
        this.Listener();
        this.modelaTabla();
        this.tipo=false; 
        this.fe= new SimpleDateFormat("dd/MM/yyyy");
    }
     private void Listener()
    {
        this.jButton6.addActionListener(this);
        this.jButton7.addActionListener(this);
        this.jButton8.addActionListener(this);
        this.jButton9.addActionListener(this); 
        this.jComboBox1.addItemListener(this);
        this.jComboBox2.addItemListener(this);
        this.jCheckBox1.addActionListener(this);
        this.jButton1.addActionListener(this);
    }
    
    private void factura()
    {
      double factura= (int)(Math.random()*(999999-100000+1))+100000;
      this.jTextField5.setText(factura+"");
    }
    public void llenarcombos()
      {
        listaClie = this.gestorClie.getTodos();
        this.jComboBox1.removeAllItems();
        this.jComboBox1.addItem("seleccione un cliente");

        for (Clientes prov : listaClie)
          {
            this.jComboBox1.addItem(prov.getNombre());
          }
        
        listaProductos = this.gestorProd.getTodos();
        this.jComboBox2.removeAllItems();
        this.jComboBox2.addItem("seleccione un producto");

        for (Producto prod : listaProductos)
          {
            this.jComboBox2.addItem(prod.getNombre());
          }
      }
    private float salvarPrecio(String nombre)
    {
       float precio=0;
       for (Producto prod : listaProductos)
          {
            if(prod.getNombre().equals(nombre))
            {
                 precio=prod.getPrecioVenta();
                break;
            }
          } 
       return precio;
    }
    
    private int salvarPrecio(String nombre,int cantidad)
    {
       int precio=0,decision,lleva=0;
       int hay=0;
       for (Producto prod : listaProductos)
          {
            if(prod.getNombre().equals(nombre))
            {
                hay=prod.getExistencias();
                break;
            }
          } 
       if(hay<cantidad)
       {
           JOptionPane.showMessageDialog(null, "Solo hay "+hay+" de "+nombre);
           decision=Integer.parseInt(JOptionPane.showInputDialog("Los lleva? 1.SI || 2.NO"));
                if(decision==1)
                {
                   lleva=hay; 
                } 
                else
                {
                    lleva=0;
                }  
       }
       else
          lleva=cantidad;
       
       return lleva;
    }
    
    private void salvarProducto()
    {
        String factura,persona,fechaF,proveedor;
        int cant;
        float subtotal,prec;
        Factura fac=null;
        int i=0;
        String dato;
        Date fecha;
        
        this.factura();
        factura=this.jTextField5.getText();
        
        for(i=0;i<this.jTable4.getRowCount();i++)
        {
            String nombre=this.jTable4.getValueAt(i,0).toString();
            subtotal=(float) this.jTable4.getValueAt(i,3);
            prec=(float) this.jTable4.getValueAt(i,2);
            cant=(int) this.jTable4.getValueAt(i,1);
            for (Producto prod : listaProductos)
              {
                if(prod.getNombre().equals(nombre))
                {
                     int inv=prod.getExistencias()-cant;
                     prod.setExistencias(inv);
                     fac = new Factura(factura,nombre,cant,prec,subtotal,2);
                     this.fact.guardarOperaciones(fac);
                    break;
                }
              } 
        }
        this.gestorProd.recargArchivo(listaProductos);
        
        proveedor=(String) this.jComboBox1.getSelectedItem();
        total=Float.parseFloat(this.jTextField2.getText());
        fecha=this.jDateChooser1.getDate();
        fechaF=this.fe.format(fecha);
       
        Operaciones elProdu=new Operaciones(factura,fechaF,proveedor,total,this.tipo,2);
        this.gestorOp.guardarOperaciones(elProdu);
        
        this.limpiar();
    } 
    
    private void limpiar()
    {
        int a =modelo.getRowCount()-1;
        for(int i=a; i>=0; i--)
        {
            modelo.removeRow(i );
        }
        this.jTextField1.setText("");
        this.jTextField5.setText("");
        this.jTextField2.setText("");
        //this.jDateChooser1.setDate("");
        this.jComboBox1.setSelectedIndex(0);
        this.jComboBox2.setSelectedIndex(0);
    }
    
    private void modelaTabla()
    {
        this.modelo= new DefaultTableModel();
        this.jTable4.setModel(modelo);
        
        this.modelo.addColumn("Producto");
        this.modelo.addColumn("Cantidad");
        this.modelo.addColumn("Precio Unidad");
        this.modelo.addColumn("Total");
          
    }
    
    private void llenaTabla()
    {
          Vector fila=new Vector();
          fila.add(this.jComboBox2.getSelectedItem());
          int cantidad=Integer.parseInt(this.jTextField1.getText());
          int lleva=this.salvarPrecio((String) this.jComboBox2.getSelectedItem(), cantidad);
          if(lleva!=0)
          {
            fila.add(lleva);
            float precio=this.salvarPrecio((String) this.jComboBox2.getSelectedItem());
            fila.add(precio);
            float acumulado=precio*cantidad;
            fila.add(acumulado);

            this.modelo.addRow(fila);
            this.total+=acumulado;
            this.jTextField2.setText(this.total+"");
          }
          else
          {
             this.jComboBox2.setSelectedIndex(0);
             this.jTextField1.setText("");
          }
              
        
    }
   
    private void verTodas() 
    {
       this.ppal.setVisible(false);
       Ventas xxx= new Ventas(this.ppal);
       
    }
    
    private void eliminarProducto()
    {
        int seleccionada;
        float tots;
        seleccionada=this.jTable4.getSelectedRow();
        System.out.println(seleccionada);
        if(seleccionada>=0)
        {
            tots=(float) this.jTable4.getValueAt(seleccionada,3);
            this.total=this.total-tots;
            this.jTextField2.setText(this.total+"");
            this.modelo.removeRow(seleccionada);
        }
        else
            JOptionPane.showMessageDialog(null, "no ha seleccionado una fila");
    }
            
    

    @Override
    public void actionPerformed(ActionEvent e) 
    {
         if(e.getSource()==this.jButton9)
        {
            this.llenaTabla();
        }
         if(e.getSource()==this.jButton8)
        {
            this.verTodas();
        }
         if(e.getSource()==this.jButton7)
        {
            this.salvarProducto();
        }
         if(e.getSource()==this.jButton6)
        {
            this.eliminarProducto();
        }
         if (this.jCheckBox1.isSelected()==true) 
       {
            this.tipo=true;
       } 
         if(e.getSource()==this.jButton1)
        {
            this.llenarcombos();
        }
         
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
         }

    @Override
    public void mouseEntered(MouseEvent e) {
         }

    @Override
    public void mouseExited(MouseEvent e) {
         }

    @Override
    public void itemStateChanged(ItemEvent e) {
        }

   
}
