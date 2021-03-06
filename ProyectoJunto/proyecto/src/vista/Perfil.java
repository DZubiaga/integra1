/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import excepciones.*;
import proyecto.Proyecto;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Perfil extends javax.swing.JFrame {

    private static boolean encontrado;
    private static boolean decision;
    private static boolean nuevo;
    
    public Perfil() {
        initComponents();
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,-18);
        fecha.setMaxDate(c);
        encontrado = false;
        nuevo = false;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tfCalle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfPortal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfPiso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfMano = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tfPersonal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfEmpresa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfSalario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        rbAdmin = new javax.swing.JRadioButton();
        rbLogistica = new javax.swing.JRadioButton();
        fecha = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Perfil");

        jLabel2.setText("DNI");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellidos");

        tfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDniActionPerformed(evt);
            }
        });

        tfNombre.setEnabled(false);

        tfApellidos.setEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Direccion"));

        jLabel5.setText("Calle");

        tfCalle.setEnabled(false);

        jLabel6.setText("Portal");

        tfPortal.setEnabled(false);

        jLabel7.setText("Piso");

        tfPiso.setEnabled(false);

        jLabel8.setText("Mano");

        tfMano.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfPortal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(tfPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(tfMano)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfPortal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tfPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tfMano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Telefonos"));

        jLabel9.setText("Personal");

        tfPersonal.setEnabled(false);

        jLabel10.setText("Empresa");

        tfEmpresa.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(tfPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(tfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setText("Salario");

        tfSalario.setEnabled(false);

        jLabel12.setText("Fecha de Nacimiento");

        bAceptar.setText("Aceptar");
        bAceptar.setEnabled(false);
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbAdmin);
        rbAdmin.setText("Administracion");
        rbAdmin.setEnabled(false);

        buttonGroup1.add(rbLogistica);
        rbLogistica.setText("Logistica");
        rbLogistica.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(46, 46, 46)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(tfApellidos))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rbAdmin)
                                        .addComponent(rbLogistica))
                                    .addGap(22, 22, 22)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(bAceptar)
                        .addGap(129, 129, 129)
                        .addComponent(bCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbAdmin)
                        .addGap(18, 18, 18)
                        .addComponent(rbLogistica)
                        .addGap(39, 39, 39)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        // TODO add your handling code here:
        if(nuevo){
            insert();
        }else{
            update();
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void tfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDniActionPerformed
        // TODO add your handling code here:
        if(validarDni() && !nuevo){
            Decidir d = new Decidir(this, true);
            d.setVisible(true);
            if(decision){
                bAceptar.setEnabled(true);
                tfDni.setEnabled(false);
                tfNombre.setEnabled(true);
                tfApellidos.setEnabled(true);
                tfCalle.setEnabled(true);
                tfPortal.setEnabled(true);
                tfPiso.setEnabled(true);
                tfMano.setEnabled(true);
                tfPersonal.setEnabled(true);
                tfEmpresa.setEnabled(true);
                tfSalario.setEnabled(true);
                fecha.setEnabled(true);
                tfNombre.setText(Proyecto.getNombreT());
                tfApellidos.setText(Proyecto.getApe1T() + " " + Proyecto.getApe2T());
                tfCalle.setText(Proyecto.getCalleT());
                tfPortal.setText(Proyecto.getPortalT());
                tfPiso.setText(Proyecto.getPisoT());
                tfMano.setText(Proyecto.getManoT());
                tfPersonal.setText(Proyecto.getPersonalT());
                tfEmpresa.setText(Proyecto.getEmpresaT());
                try{
                    tfSalario.setText(Proyecto.getSalarioT());
                }
                catch(NullPointerException e){
                    tfSalario.setText("Salario no indicado");
                }
                Calendar c = Proyecto.getFechaNacT();
                if (c != null){
                    fecha.setSelectedDate(c);
                }
                if(Proyecto.getClase() == Proyecto.getClaseLogistica()){
                    rbLogistica.setSelected(true);
                }else{
                    rbAdmin.setSelected(true);
                }
            }else{
                Proyecto.borrarTrabajador();
                javax.swing.JOptionPane.showMessageDialog(rootPane, "El trabajador ha sido borrado");
                dispose();
            }
        }else if(validarDni() && nuevo){
            bAceptar.setEnabled(true);
            tfDni.setEnabled(false);
            tfNombre.setEnabled(true);
            tfApellidos.setEnabled(true);
            tfCalle.setEnabled(true);
            tfPortal.setEnabled(true);
            tfPiso.setEnabled(true);
            tfMano.setEnabled(true);
            tfPersonal.setEnabled(true);
            tfEmpresa.setEnabled(true);
            tfSalario.setEnabled(true);
            fecha.setEnabled(true);
            rbAdmin.setEnabled(true);
            rbLogistica.setEnabled(true);
        }
    }//GEN-LAST:event_tfDniActionPerformed

    private void validarNombre(){
        try{
            String n = tfNombre.getText();
            Pattern pat = Pattern.compile("^[A-Z][a-z][a-zA-Z ]*$");
            Matcher mat = pat.matcher(n);
            if (mat.matches()){
                Proyecto.setNombreT(n);
            }else{
                throw new Exception();
            }
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(this,"Problemas con el nombre");
        }
    }
    
    private boolean validarDni(){
        try{
            String dni = tfDni.getText();
            char[] letraDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',  'X',  'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            String num= "";
            int ind = 0;
            if(dni.length() == 8) {
                dni = "0" + dni;
            }
             if (Character.isLetter(dni.charAt(8))) {
                    if (dni.length() == 9){
                         int i;
                         for ( i=0; i<8 && Character.isDigit(dni.charAt(i)) ; i++) {
                             num+=dni.charAt(i);
                         }
                          if(i==8)
                          {
                               // paso a int el string donde tengo el numero del dni
                               ind = Integer.parseInt(num);
                               ind %= 23;
  
                                // verifico que la letra del dni corresponde con la del array
                                if ((Character.toUpperCase(dni.charAt(8))) == letraDni[ind]){
                                    encontrado = Proyecto.buscarTrabajador(tfDni.getText());
                                    if(encontrado){
                                        return true;
                                    }else{
                                        nuevo = true;
                                        return true;
                                    }
                                }
                                else
                                    throw new DniNoValido();
                           }
                           else
                                throw new DniNoValido();
                    }
                    else
                       throw new DniNoValido();
                }
                else
                    throw new DniNoValido();
        }
        catch(DniNoValido e)
        {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Error con el DNI introducido");
            return false;
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Error no relacionado con el DNI");
            return false;
        }
    }
    
    public static void setDecision(boolean p){
        decision = p;
    }
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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private datechooser.beans.DateChooserCombo fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbAdmin;
    private javax.swing.JRadioButton rbLogistica;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCalle;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfEmpresa;
    private javax.swing.JTextField tfMano;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPersonal;
    private javax.swing.JTextField tfPiso;
    private javax.swing.JTextField tfPortal;
    private javax.swing.JTextField tfSalario;
    // End of variables declaration//GEN-END:variables

    private void insert() {
        if(rbAdmin.isSelected()){
            Proyecto.iniAdmin();
        }else{
            Proyecto.iniLog();
        }
        Proyecto.setDniT(tfDni.getText());
        validarNombre();
        Proyecto.setApellidosT(tfApellidos.getText());
        Proyecto.setCalleT(tfCalle.getText());
        Proyecto.setPortalT(tfPortal.getText());
        Proyecto.setPisoT(tfPiso.getText());
        Proyecto.setManoT(tfMano.getText());
        Proyecto.setPersonalT(tfPersonal.getText());
        Proyecto.setEmpresaT(tfEmpresa.getText());
        Proyecto.setSalarioT(tfSalario.getText());
        Proyecto.setFechaT(fecha.getCurrent());
        Proyecto.insertar();
        dispose();
    }

    private void update() {
        validarNombre();
        Proyecto.setApellidosT(tfApellidos.getText());
        Proyecto.setCalleT(tfCalle.getText());
        Proyecto.setPortalT(tfPortal.getText());
        Proyecto.setPisoT(tfPiso.getText());
        Proyecto.setManoT(tfMano.getText());
        Proyecto.setPersonalT(tfPersonal.getText());
        Proyecto.setEmpresaT(tfEmpresa.getText());
        Proyecto.setSalarioT(tfSalario.getText());
        Proyecto.setFechaT(fecha.getCurrent());
        Proyecto.modificar();
        dispose();
    }
    
    public void visualizar(){
        tfDni.setEnabled(false);
        tfDni.setText(Proyecto.getDni());
        tfNombre.setText(Proyecto.getNombre());
        tfApellidos.setText(Proyecto.getApe1() + " " + Proyecto.getApe2());
        tfCalle.setText(Proyecto.getCalle());
        tfPortal.setText(Proyecto.getPortal());
        tfPiso.setText(Proyecto.getPiso());
        tfMano.setText(Proyecto.getMano());
        tfPersonal.setText(Proyecto.getPersonal());
        tfEmpresa.setText(Proyecto.getEmpresa());
        try{
            tfSalario.setText(Proyecto.getSalario());
        }
        catch(NullPointerException e){
            tfSalario.setText("Salario no indicado");
        }
        Calendar c = Proyecto.getFechaNac();
        if (c != null){
            fecha.setSelectedDate(c);
        }
        fecha.setEnabled(false);
        if(Proyecto.getClase() == Proyecto.getClaseLogistica()){
            rbLogistica.setSelected(true);
        }else{
            rbAdmin.setSelected(true);
        }
    }
    
    public void modificarTrab(){
        bAceptar.setEnabled(true);
        tfDni.setEnabled(false);
        tfNombre.setEnabled(true);
        tfApellidos.setEnabled(true);
        tfCalle.setEnabled(true);
        tfPortal.setEnabled(true);
        tfPiso.setEnabled(true);
        tfMano.setEnabled(true);
        tfPersonal.setEnabled(true);
        tfEmpresa.setEnabled(true);
        tfSalario.setEnabled(true);
        fecha.setEnabled(true);
        tfDni.setText(Proyecto.getDniT());
        tfNombre.setText(Proyecto.getNombreT());
        tfApellidos.setText(Proyecto.getApe1T() + " " + Proyecto.getApe2T());
        tfCalle.setText(Proyecto.getCalleT());
        tfPortal.setText(Proyecto.getPortalT());
        tfPiso.setText(Proyecto.getPisoT());
        tfMano.setText(Proyecto.getManoT());
        tfPersonal.setText(Proyecto.getPersonalT());
        tfEmpresa.setText(Proyecto.getEmpresaT());
        try{
            tfSalario.setText(Proyecto.getSalarioT());
        }
        catch(NullPointerException e){
            tfSalario.setText("Salario no indicado");
        }
        Calendar c = Proyecto.getFechaNacT();
        if (c != null){
            fecha.setSelectedDate(c);
        }
        if(Proyecto.getClase() == Proyecto.getClaseLogistica()){
            rbLogistica.setSelected(true);
        }else{
            rbAdmin.setSelected(true);
        }
    }
}
