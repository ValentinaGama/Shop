/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swtienda;;
import gestion.GestiónProductos;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import negocio.Producto;

/**
 *
 * @author valentina
 */
public class PanelProducto extends javax.swing.JPanel implements ActionListener
{

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setText("Salir");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("Ver Inventario");

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Eliminar");

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Modificar");

        jButton8.setText("Foto");

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setForeground(new java.awt.Color(255, 51, 255));
        jButton9.setText("Buscar");

        jLabel1.setText("Código:");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        jLabel2.setText("Nombre:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        jLabel3.setText("Precio Compra:");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setText("Guardar");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("<");

        jButton2.setText(">");

        jButton5.setText("Limpiar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
    
    String codigo;
    private GestiónProductos gestor;
    private PanelVentas vent;
    String rutaImg;
    private Ppal ppal;
    String nombreFoto="";
    private int cont;
    
    
    //Métodos de servicio
    
    
    //Evento-Acción
    
    public PanelProducto(Ppal pp)
    {
        initComponents();
        this.setBounds(0, 0 , 650, 270);
        this.Listener();
        this.ppal=pp;
        this.gestor=new GestiónProductos();
        this.codigo=""; 
        this.rutaImg="./Fotos/";
        this.jLabel4.setSize(190, 219);
        this.poneFoto();
        this.cont=1;
    }
    
    private void Listener()
    {
        this.jButton3.addActionListener(this);
        this.jButton4.addActionListener(this);
        this.jButton6.addActionListener(this);
        this.jButton7.addActionListener(this);
        this.jButton8.addActionListener(this);
        this.jButton9.addActionListener(this); 
        this.jButton10.addActionListener(this);  
        this.jButton1.addActionListener(this);
        this.jButton2.addActionListener(this);
        this.jButton5.addActionListener(this);
    }
    
     private void accionBtnLimpiar()
    {
        this.jTextField1.setText("");
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField2.requestFocus();
    }
    
    private void accionBtnSalir()
    {
        System.exit(0);
    }
    
     private void salvarProducto()
    {
        
        String code, produ;
        float precioCompra;
        boolean existeCodigo, existeNombre;
        
        code=this.jTextField2.getText();
        produ=this.jTextField3.getText();
        precioCompra=Float.parseFloat(this.jTextField1.getText());
        
        existeCodigo=this.gestor.verificarCodigo(code);
        if(!existeCodigo)
        {
            existeNombre=this.gestor.verificarNombre(produ);
            if(!existeNombre)
            {
                Producto elProdu=new Producto(code,produ,precioCompra,this.nombreFoto);
                this.gestor.guardarProducto(elProdu);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ESE NOMBRE YA EXISTE..!!!");
                this.jTextField3.setText("");
                this.jTextField3.requestFocus();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "ESE CODIGO YA EXISTE..!!!"); 
            this.jTextField2.setText("");
            this.jTextField2.requestFocus();
        }
        
        
    }   
    
    private void accionBtnBuscar()
    {
        if(this.gestor.verificaProductos())
        {
            this.codigo=JOptionPane.showInputDialog("Digite el código del producto que desea ver");
            Producto elProdu=this.gestor.buscarProducto(codigo);
            if(elProdu!=null)
            {
                this.jTextField1.setText(String.valueOf(elProdu.getPrecioCompra()));
                this.jTextField2.setText(elProdu.getCodigo());
                this.jTextField3.setText(elProdu.getNombre());
                
                Toolkit tk=Toolkit.getDefaultToolkit();
                Image imagen=tk.createImage(this.rutaImg+elProdu.getfoto());
                ImageIcon imag= new ImageIcon(imagen.getScaledInstance(jLabel5.getWidth(),jLabel5.getHeight(),Image.SCALE_AREA_AVERAGING));
                
                this.jLabel5.setIcon(imag);
            }
            else
                JOptionPane.showMessageDialog(null, "ESE CÓDIGO NO EXISTE...!!"); 
        }
       else
            JOptionPane.showMessageDialog(null, "NO HAY PRODUCTOS EN ESTE MOMENTO..!!");          
    }
    
    private void verInventario()
    {
        this.ppal.setVisible(false);
        if (this.gestor.verificaProductos()) 
            new Inventario(this.ppal);
       else
            JOptionPane.showMessageDialog(null, "No hay productos en el inventario en el momento"); 
        
    }
    
    private void modificarProducto()
    {
        String code, produ,foto;
        float precioCompra;
        
        
        code=this.jTextField2.getText();
        produ=this.jTextField3.getText();
        precioCompra=Float.parseFloat(this.jTextField1.getText());
        foto=this.nombreFoto;
        Producto elProdu=new Producto(code,produ,precioCompra,this.nombreFoto);
        this.gestor.modificarProducto(elProdu, this.codigo);
        JOptionPane.showMessageDialog(null, "El producto ha sido Modificado"); 
            
    }
    
    private void eliminarProducto()
    {
        String code;
        boolean existe=false;

        code= this.jTextField2.getText();
        this.gestor.eliminarProducto(code);
        this.cont=1;
        this.verProd();
    }
    
    
    private void verProd()
    {
        ArrayList<Producto> prod=this.gestor.get();
        String codigo,nombre,foto,precio;
        
        
        if(this.cont<=1)
        {
            this.jButton1.setEnabled(false);
        }
        else
        {
            this.jButton1.setEnabled(true);
        }
        if(cont==prod.size())
            {
                this.jButton2.setEnabled(false);
            }
            else
            {
                this.jButton2.setEnabled(true);
            }
        if(this.gestor.verificaProductos())
            {
                codigo=prod.get(cont-1).getCodigo();
                nombre=prod.get(cont-1).getNombre();
                precio=prod.get(cont-1).getPrecioCompra()+"";
                foto=prod.get(cont-1).getfoto();
               
                this.jTextField2.setText(codigo);
                this.jTextField3.setText(nombre);
                this.jTextField1.setText(precio);
                this.nombreFoto=foto;
                Toolkit tk=Toolkit.getDefaultToolkit();
                Image imagen=tk.createImage(this.rutaImg+this.nombreFoto);
                ImageIcon imag= new ImageIcon(imagen.getScaledInstance(jLabel5.getWidth(),jLabel5.getHeight(),Image.SCALE_AREA_AVERAGING));
                this.jLabel5.setIcon(imag);
            }  
    }
    
    private void poneFoto()
    {
        Toolkit tk=Toolkit.getDefaultToolkit();
        
        Image imagen=tk.createImage(this.rutaImg+"foto tienda.jpg");
        this.jLabel4.setIcon(new ImageIcon(imagen.getScaledInstance(this.jLabel4.getWidth(), this.jLabel4.getHeight(), Image.SCALE_AREA_AVERAGING)));
    }
    
    private void buscaFoto()
    {
        JFileChooser jfc= new JFileChooser(this.rutaImg);
        int rta=jfc.showSaveDialog(null);
        if (rta == JFileChooser.APPROVE_OPTION)
          {
            nombreFoto = jfc.getSelectedFile().getName();
            nombreFoto=nombreFoto+".jpg";
          } else
          {
            nombreFoto = "sinFoto.png";
          }
       
        this.jLabel5.setIcon(new ImageIcon("./Fotos/"+nombreFoto));
    }
    
    private void limpiar()
    {
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField1.setText("");
    }

    
    

    //====================================================
    @Override
    public void actionPerformed(ActionEvent evento)
    {
        if(evento.getSource()==this.jButton9)
        {
            this.accionBtnBuscar();
        }
        if(evento.getSource()==this.jButton10)
        {
            this.salvarProducto();
        }
        if(evento.getSource()==this.jButton3)
        {
            this.verInventario();
        }
        if(evento.getSource()==this.jButton4)
        {
            int opcion = 0;
                this.eliminarProducto();
            
        }
        if(evento.getSource()==this.jButton6)
        {
            this.modificarProducto();
        }
        if(evento.getSource()==this.jButton8)
        {
            this.buscaFoto();
        }
        if(evento.getSource()==this.jButton1)
        {
            this.cont=this.cont-1;
            this.verProd();
        }
         if(evento.getSource()==this.jButton2)
        {
            this.cont=this.cont+1;
            this.verProd();
        }
          if(evento.getSource()==this.jButton5)
        {
            this.limpiar();
        }
    }

}

