/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import proyecto.Proyecto;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import excepciones.*;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author 1gprog08
 */
public class VistaParte extends javax.swing.JFrame {

    private String d;
    
    /**
     * Creates new form Parte
     */
    public VistaParte() {
        
        initComponents();
        
        getContentPane().setBackground(Color.BLACK);
        
        setLocationRelativeTo(null);
        
        tfFecha.setText(FechaActual());
        tfTrabajador.setText(Proyecto.getDni());
        /*
        rellenarHora();
        rellenarMinutos();
        */
        rellenarVehiculos();
        
        
    }

    public String FechaActual()
    {
        DateFormat fecha = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        
       d = fecha.format(date);
        return d;
    }
    public void comprobarHoras()
    {
        try {
        if(Integer.parseInt(tfHoras1.getText())>24||Integer.parseInt(tfHoras1.getText())<0)
            {
                
                throw new HoraInvalida();
                
            }
        else if(Integer.parseInt(tfHoras2.getText())>24||Integer.parseInt(tfHoras2.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfHoras3.getText())>24||Integer.parseInt(tfHoras3.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfHoras4.getText())>24||Integer.parseInt(tfHoras4.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfHoras5.getText())>24||Integer.parseInt(tfHoras5.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfHoras6.getText())>24||Integer.parseInt(tfHoras6.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfHoras7.getText())>24||Integer.parseInt(tfHoras7.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfHoras8.getText())>24||Integer.parseInt(tfHoras8.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfHoras9.getText())>24||Integer.parseInt(tfHoras9.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfHoras10.getText())>24||Integer.parseInt(tfHoras10.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        }
        catch(HoraInvalida e)
        {
            JOptionPane.showMessageDialog(this, "Error con la hora");
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Error ");
        }



    }
    public void comprobarMinutos()
    {
        try {
        if(Integer.parseInt(tfMinutos1.getText())>59||Integer.parseInt(tfMinutos1.getText())<0)
            {
                
                throw new HoraInvalida();
                
            }
        else if(Integer.parseInt(tfMinutos2.getText())>59||Integer.parseInt(tfMinutos2.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfMinutos3.getText())>59||Integer.parseInt(tfMinutos3.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfMinutos4.getText())>59||Integer.parseInt(tfMinutos4.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfMinutos5.getText())>59||Integer.parseInt(tfMinutos5.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfMinutos6.getText())>59||Integer.parseInt(tfMinutos6.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfMinutos7.getText())>59||Integer.parseInt(tfMinutos7.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfMinutos8.getText())>59||Integer.parseInt(tfMinutos8.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfMinutos9.getText())>59||Integer.parseInt(tfMinutos9.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        else if(Integer.parseInt(tfMinutos10.getText())>59||Integer.parseInt(tfMinutos10.getText())<0)
            {
                
                throw new HoraInvalida();
            } 
        }
        catch(HoraInvalida e)
        {
            JOptionPane.showMessageDialog(this, "Error con los minutos");
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Error ");
        }



    }

    /*
    public void rellenarHora()
    {
        int hora=0;
        int x;
        for(x=24;x>0;x--)
        {
          hora1.insertItemAt(String.valueOf(x), hora);
          hora2.insertItemAt(String.valueOf(x), hora);
          hora3.insertItemAt(String.valueOf(x), hora);
          hora4.insertItemAt(String.valueOf(x), hora);
          hora5.insertItemAt(String.valueOf(x), hora);
          hora6.insertItemAt(String.valueOf(x), hora);
          hora7.insertItemAt(String.valueOf(x), hora);
          hora8.insertItemAt(String.valueOf(x), hora);
          hora9.insertItemAt(String.valueOf(x), hora);
          hora10.insertItemAt(String.valueOf(x), hora);
        }
        
    }
   
    public void rellenarMinutos()
    {
        int minutos=0;
        int x;
        for(x=60;x>0;x--)
        {
            minutos1.insertItemAt(String.valueOf(x),minutos);
            minutos2.insertItemAt(String.valueOf(x),minutos);
            minutos3.insertItemAt(String.valueOf(x),minutos);
            minutos4.insertItemAt(String.valueOf(x),minutos);
            minutos5.insertItemAt(String.valueOf(x),minutos);
            minutos6.insertItemAt(String.valueOf(x),minutos);
            minutos7.insertItemAt(String.valueOf(x),minutos);
            minutos8.insertItemAt(String.valueOf(x),minutos);
            minutos9.insertItemAt(String.valueOf(x),minutos);
            minutos10.insertItemAt(String.valueOf(x),minutos);
        }
    }
    */
    public void rellenarVehiculos()
    {
        int x;
        Proyecto.prueba();
        for(x=0;x<Proyecto.getListaVehiculos().size();x++)
        {
            vehiculo1.insertItemAt(Proyecto.getListaVehiculos().get(x).getMatricula(), x);
            vehiculo2.insertItemAt(Proyecto.getListaVehiculos().get(x).getMatricula(), x);
            vehiculo3.insertItemAt(Proyecto.getListaVehiculos().get(x).getMatricula(), x);
            vehiculo4.insertItemAt(Proyecto.getListaVehiculos().get(x).getMatricula(), x);
            vehiculo5.insertItemAt(Proyecto.getListaVehiculos().get(x).getMatricula(), x);            
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfTrabajador = new javax.swing.JTextField();
        tfFecha = new javax.swing.JTextField();
        jPane1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfAlbaran1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vehiculo1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        tfHoras1 = new javax.swing.JTextField();
        tfMinutos1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tfHoras2 = new javax.swing.JTextField();
        tfMinutos2 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jPane6 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        tfAlbaran2 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        vehiculo2 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        tfHoras3 = new javax.swing.JTextField();
        tfMinutos3 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        tfHoras4 = new javax.swing.JTextField();
        tfMinutos4 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jPane7 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        tfAlbaran3 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        vehiculo3 = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        tfHoras5 = new javax.swing.JTextField();
        tfMinutos5 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        tfHoras6 = new javax.swing.JTextField();
        tfMinutos6 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jPane8 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        tfAlbaran5 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        vehiculo4 = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        tfHoras9 = new javax.swing.JTextField();
        tfMinutos9 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        tfHoras10 = new javax.swing.JTextField();
        tfMinutos10 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jPane9 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        tfAlbaran4 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        vehiculo5 = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        tfHoras7 = new javax.swing.JTextField();
        tfMinutos7 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        tfHoras8 = new javax.swing.JTextField();
        tfMinutos8 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Operario:");

        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Fecha:");

        tfTrabajador.setEditable(false);
        tfTrabajador.setBackground(new java.awt.Color(102, 102, 102));
        tfTrabajador.setForeground(new java.awt.Color(255, 153, 0));
        tfTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTrabajadorActionPerformed(evt);
            }
        });

        tfFecha.setEditable(false);
        tfFecha.setBackground(new java.awt.Color(102, 102, 102));
        tfFecha.setForeground(new java.awt.Color(255, 153, 0));
        tfFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tfTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(tfTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jPane1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Albaran:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hora Salida:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora Llegada:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vehiculo Utilizado");

        vehiculo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehiculo", " " }));
        vehiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculo1ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText(":");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(tfHoras1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(tfMinutos1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel34)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfHoras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfMinutos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText(":");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(tfHoras2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(tfMinutos2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel35)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfHoras2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfMinutos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPane1Layout = new javax.swing.GroupLayout(jPane1);
        jPane1.setLayout(jPane1Layout);
        jPane1Layout.setHorizontalGroup(
            jPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfAlbaran1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vehiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPane1Layout.setVerticalGroup(
            jPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane1Layout.createSequentialGroup()
                .addGroup(jPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPane1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4))
                            .addGroup(jPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(tfAlbaran1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5)
                                .addComponent(vehiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPane1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jPane6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Albaran:");

        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Hora Salida:");

        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Hora Llegada:");

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Vehiculo Utilizado");

        vehiculo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehiculo", " " }));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText(":");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(tfHoras3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(tfMinutos3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel40)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfHoras3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfMinutos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText(":");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(tfHoras4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(tfMinutos4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel41)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfHoras4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfMinutos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPane6Layout = new javax.swing.GroupLayout(jPane6);
        jPane6.setLayout(jPane6Layout);
        jPane6Layout.setHorizontalGroup(
            jPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfAlbaran2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vehiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPane6Layout.setVerticalGroup(
            jPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane6Layout.createSequentialGroup()
                .addGroup(jPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPane6Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel38))
                            .addGroup(jPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel36)
                                .addComponent(tfAlbaran2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel37)
                                .addComponent(jLabel39)
                                .addComponent(vehiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPane6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPane7.setBackground(new java.awt.Color(0, 0, 0));

        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Albaran:");

        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Hora Salida:");

        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Hora Llegada:");

        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Vehiculo Utilizado");

        vehiculo3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehiculo", " " }));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText(":");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(tfHoras5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(tfMinutos5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel46)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfHoras5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfMinutos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText(":");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(tfHoras6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(tfMinutos6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel47)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfHoras6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfMinutos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPane7Layout = new javax.swing.GroupLayout(jPane7);
        jPane7.setLayout(jPane7Layout);
        jPane7Layout.setHorizontalGroup(
            jPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfAlbaran3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel43)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vehiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPane7Layout.setVerticalGroup(
            jPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane7Layout.createSequentialGroup()
                .addGroup(jPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPane7Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel44))
                            .addGroup(jPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel42)
                                .addComponent(tfAlbaran3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel43)
                                .addComponent(jLabel45)
                                .addComponent(vehiculo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPane7Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPane8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Albaran:");

        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Hora Salida:");

        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Hora Llegada:");

        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Vehiculo Utilizado");

        vehiculo4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehiculo", " " }));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText(":");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(tfHoras9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(tfMinutos9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel52)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfHoras9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfMinutos9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText(":");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(tfHoras10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(tfMinutos10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel53)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfHoras10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfMinutos10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPane8Layout = new javax.swing.GroupLayout(jPane8);
        jPane8.setLayout(jPane8Layout);
        jPane8Layout.setHorizontalGroup(
            jPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfAlbaran5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vehiculo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPane8Layout.setVerticalGroup(
            jPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane8Layout.createSequentialGroup()
                .addGroup(jPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPane8Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel50))
                            .addGroup(jPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel48)
                                .addComponent(tfAlbaran5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel49)
                                .addComponent(jLabel51)
                                .addComponent(vehiculo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPane8Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPane9.setBackground(new java.awt.Color(0, 0, 0));

        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Albaran:");

        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Hora Salida:");

        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Hora Llegada:");

        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Vehiculo Utilizado");

        vehiculo5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehiculo", " " }));

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));

        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText(":");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(tfHoras7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(tfMinutos7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel58)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfHoras7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfMinutos7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText(":");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(tfHoras8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(tfMinutos8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel59)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfHoras8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfMinutos8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPane9Layout = new javax.swing.GroupLayout(jPane9);
        jPane9.setLayout(jPane9Layout);
        jPane9Layout.setHorizontalGroup(
            jPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfAlbaran4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel55)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vehiculo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPane9Layout.setVerticalGroup(
            jPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane9Layout.createSequentialGroup()
                .addGroup(jPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane9Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPane9Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel56))
                            .addGroup(jPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel54)
                                .addComponent(tfAlbaran4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel55)
                                .addComponent(jLabel57)
                                .addComponent(vehiculo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPane9Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(Aceptar)
                        .addGap(189, 189, 189)
                        .addComponent(Salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir)
                    .addComponent(Aceptar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTrabajadorActionPerformed

        
        
    }//GEN-LAST:event_tfTrabajadorActionPerformed

    private void tfFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFechaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

        Proyecto.getVistaParte().dispose();
        
    }//GEN-LAST:event_SalirActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed

       /* comprobarHoras();
        comprobarMinutos();
        */
        Proyecto.ventanaAfterParteAbrir();
        
        
        
        
        
    }//GEN-LAST:event_AceptarActionPerformed
      
    public void preguntaFinal()
    {

        if (!tfAlbaran1.getText().equals(""))
            {
              Proyecto.rellenarViaje(Integer.parseInt(tfAlbaran1.getText()), hora1(), hora2(), vehiculo1.getSelectedItem().toString(),AfterParteBD.getAuto_id());
            }
        if (!tfAlbaran2.getText().equals(""))
            {
              Proyecto.rellenarViaje(Integer.parseInt(tfAlbaran2.getText()), hora3(), hora4(), vehiculo2.getSelectedItem().toString(),AfterParteBD.getAuto_id());
            }
        if (!tfAlbaran3.getText().equals(""))
            {
              Proyecto.rellenarViaje(Integer.parseInt(tfAlbaran3.getText()), hora5(), hora6(), vehiculo3.getSelectedItem().toString(),AfterParteBD.getAuto_id());
            }
        if (!tfAlbaran4.getText().equals(""))
            {
              Proyecto.rellenarViaje(Integer.parseInt(tfAlbaran4.getText()), hora7(), hora8(), vehiculo4.getSelectedItem().toString(),AfterParteBD.getAuto_id());
            }
        if (!tfAlbaran5.getText().equals(""))
            {
              Proyecto.rellenarViaje(Integer.parseInt(tfAlbaran5.getText()), hora9(), hora10(), vehiculo5.getSelectedItem().toString(),AfterParteBD.getAuto_id());
            }

    }
    private String hora1()
    {
        String hora;
        hora=tfHoras1.getText()+":"+tfMinutos1.getText();
        return hora;
    }
    private String hora2()
    {
        String hora;
        hora=tfHoras2.getText()+":"+tfMinutos2.getText();
        return hora;
    }
    private String hora3()
    {
        String hora;
        hora=tfHoras3.getText()+":"+tfMinutos3.getText();
        return hora;
    }
    private String hora4()
    {
        String hora;
        hora=tfHoras4.getText()+":"+tfMinutos4.getText();
        return hora;
    }
    private String hora5()
    {
        String hora;
        hora=tfHoras5.getText()+":"+tfMinutos5.getText();
        return hora;
    }
    private String hora6()
    {
        String hora;
        hora=tfHoras6.getText()+":"+tfMinutos6.getText();
        return hora;
    }
    private String hora7()
    {
        String hora;
        hora=tfHoras7.getText()+":"+tfMinutos7.getText();
        return hora;
    }
    private String hora8()
    {
        String hora;
        hora=tfHoras8.getText()+":"+tfMinutos8.getText();
        return hora;
    }
    private String hora9()
    {
        String hora;
        hora=tfHoras8.getText()+":"+tfMinutos8.getText();
        return hora;
    }
    private String hora10()
    {
        String hora;
        hora=tfHoras10.getText()+":"+tfMinutos10.getText();
        return hora;
    }
    
    
    private void vehiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehiculo1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaParte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaParte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaParte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaParte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaParte().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPane1;
    private javax.swing.JPanel jPane6;
    private javax.swing.JPanel jPane7;
    private javax.swing.JPanel jPane8;
    private javax.swing.JPanel jPane9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField tfAlbaran1;
    private javax.swing.JTextField tfAlbaran2;
    private javax.swing.JTextField tfAlbaran3;
    private javax.swing.JTextField tfAlbaran4;
    private javax.swing.JTextField tfAlbaran5;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfHoras1;
    private javax.swing.JTextField tfHoras10;
    private javax.swing.JTextField tfHoras2;
    private javax.swing.JTextField tfHoras3;
    private javax.swing.JTextField tfHoras4;
    private javax.swing.JTextField tfHoras5;
    private javax.swing.JTextField tfHoras6;
    private javax.swing.JTextField tfHoras7;
    private javax.swing.JTextField tfHoras8;
    private javax.swing.JTextField tfHoras9;
    private javax.swing.JTextField tfMinutos1;
    private javax.swing.JTextField tfMinutos10;
    private javax.swing.JTextField tfMinutos2;
    private javax.swing.JTextField tfMinutos3;
    private javax.swing.JTextField tfMinutos4;
    private javax.swing.JTextField tfMinutos5;
    private javax.swing.JTextField tfMinutos6;
    private javax.swing.JTextField tfMinutos7;
    private javax.swing.JTextField tfMinutos8;
    private javax.swing.JTextField tfMinutos9;
    private javax.swing.JTextField tfTrabajador;
    private javax.swing.JComboBox<String> vehiculo1;
    private javax.swing.JComboBox<String> vehiculo2;
    private javax.swing.JComboBox<String> vehiculo3;
    private javax.swing.JComboBox<String> vehiculo4;
    private javax.swing.JComboBox<String> vehiculo5;
    // End of variables declaration//GEN-END:variables
}
