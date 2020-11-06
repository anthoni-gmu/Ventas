/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.Empleado;
import modelo.EmpleadoDAO;

/**
 *
 * @author anthoni
 */
public class Empleados extends javax.swing.JFrame {

    EmpleadoDAO dao = new EmpleadoDAO();
    Empleado em = new Empleado();
    public String modo;
    DefaultTableModel modelo = new DefaultTableModel();

    public Empleados() {

        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setBackground(new Color(0, 0, 0, 0));
        PanelCli.setBackground(new Color(0, 0, 0, 0));
        iniciar();

        txtidEmpleado.setVisible(false);
        txtfechaIng.setVisible(false);
        txtfechana.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCli = new javax.swing.JPanel();
        txtidEmpleado = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txtfechaIng = new javax.swing.JTextField();
        txtfechana = new javax.swing.JTextField();
        FechaIngreso = new com.toedter.calendar.JDateChooser();
        categoria = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        fechaNacimiento = new com.toedter.calendar.JDateChooser();
        btnAgregar = new javax.swing.JButton();
        ComboSexo = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        PanelCli.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtidEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidEmpleadoActionPerformed(evt);
            }
        });
        PanelCli.add(txtidEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 50, 50, 50));

        btnActualizar.setBackground(new Color(0,0,0,0));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bnt-actualizar.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.setOpaque(false);
        btnActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn-actualizarP.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        PanelCli.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 760, 240, 70));

        btnEliminar.setBackground(new Color(0,0,0,0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTN-eliminarcli.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setOpaque(false);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTN-eliminarcliP.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        PanelCli.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 760, 230, -1));

        txtApellido.setBackground(new Color(0,0,0,0));
        txtApellido.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtApellido.setBorder(null);
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        PanelCli.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 250, 30));

        txtDNI.setBackground(new Color(0,0,0,0));
        txtDNI.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtDNI.setBorder(null);
        PanelCli.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 210, 30));

        txtNumero.setBackground(new Color(0,0,0,0));
        txtNumero.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtNumero.setBorder(null);
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        PanelCli.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 220, 30));

        jButton1.setBackground(new Color(0,0,0,0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RU0.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setOpaque(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RU.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelCli.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 910, 368, 103));

        jButton7.setBackground(new Color(0,0,0,0));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTN-C.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setOpaque(false);
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BTN-CEP.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        PanelCli.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtfechaIng.setBackground(new Color(0,0,0,0));
        txtfechaIng.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtfechaIng.setBorder(null);
        PanelCli.add(txtfechaIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 50, 50, 50));

        txtfechana.setBackground(new Color(0,0,0,0));
        txtfechana.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtfechana.setBorder(null);
        PanelCli.add(txtfechana, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 50, 50, 50));

        FechaIngreso.setBackground(new Color(0,0,0,0));
        FechaIngreso.setForeground(new java.awt.Color(0, 204, 102));
        FechaIngreso.setDateFormatString("yyyy-MM-dd");
        FechaIngreso.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PanelCli.add(FechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 559, 160, 30));

        categoria.setBackground(new java.awt.Color(166, 163, 111));
        categoria.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        categoria.setForeground(new java.awt.Color(166, 163, 111));
        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Administracion", "Vendedor", "Limpieza" }));
        categoria.setBorder(null);
        categoria.setOpaque(false);
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });
        PanelCli.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 748, 170, 40));

        txtNombre.setBackground(new Color(0,0,0,0));
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtNombre.setBorder(null);
        PanelCli.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 162, 250, 30));

        jButton2.setBackground(new Color(0,0,0,0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iraVentas.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setOpaque(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sombrairVentas.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelCli.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 910, 368, 103));

        tabla.setBackground(new java.awt.Color(255, 255, 204));
        tabla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tabla.setForeground(new java.awt.Color(102, 102, 102));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idEmpleado", "DNI", "NOMBRE", "APELLIDO", "NUMERO", "FECHA NA", "FECHA INGR.", "IDCATEGORIA", "SEXO"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        PanelCli.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 760, 560));

        fechaNacimiento.setBackground(new Color(0,0,0,0));
        fechaNacimiento.setForeground(new java.awt.Color(0, 204, 102));
        fechaNacimiento.setDateFormatString("yyyy-MM-dd");
        fechaNacimiento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PanelCli.add(fechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 170, 30));

        btnAgregar.setBackground(new Color(0,0,0,0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AGREGAR.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setOpaque(false);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AGREGARp.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        PanelCli.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 760, 240, 70));

        ComboSexo.setBackground(new java.awt.Color(166, 163, 111));
        ComboSexo.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        ComboSexo.setForeground(new java.awt.Color(166, 163, 111));
        ComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "M", "F" }));
        ComboSexo.setBorder(null);
        ComboSexo.setOpaque(false);
        ComboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboSexoActionPerformed(evt);
            }
        });
        PanelCli.add(ComboSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 648, 170, 40));

        jButton3.setBackground(new Color(0,0,0,0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setOpaque(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back1.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PanelCli.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PanelEmpleado.png"))); // NOI18N
        PanelCli.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PanelCli);
        PanelCli.setBounds(0, 0, 1360, 1070);

        setSize(new java.awt.Dimension(1358, 1071));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ComboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboSexoActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Menu mn = new Menu();
        mn.setVisible(true);
        mn.mode=modo;
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RegistrarUsuario ru = new RegistrarUsuario();
        ru.setVisible(true);
        ru.modo=modo;
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        limpiar();
        iniciar();

        nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        limpiar();
        iniciar();

        nuevo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiar();
        iniciar();

        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            dateString();

            String idEmpleado = tabla.getValueAt(fila, 0).toString();
            String dni = tabla.getValueAt(fila, 1).toString();
            String nom = tabla.getValueAt(fila, 2).toString();
            String ape = tabla.getValueAt(fila, 3).toString();
            String numero = tabla.getValueAt(fila, 4).toString();

            String idcategoria = tabla.getValueAt(fila, 7).toString();
            String sexo = tabla.getValueAt(fila, 8).toString();

            String idcat;
            if (idcategoria.equalsIgnoreCase("01")) {
                idcat = "Administracion";
            } else if (idcategoria.equalsIgnoreCase("02")) {
                idcat = "Vendedor";
            } else {
                idcat = "Limpieza";
            }

            
            txtidEmpleado.setText(idEmpleado);
            txtDNI.setText(dni);
            txtNombre.setText(nom);
            txtApellido.setText(ape);
            txtNumero.setText(numero);
            categoria.setSelectedItem(idcat);

            ComboSexo.setSelectedItem(sexo);
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void txtidEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidEmpleadoActionPerformed
        
    }//GEN-LAST:event_txtidEmpleadoActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Venta Vt = new Venta();
        Vt.setVisible(true);
        Vt.modo=modo;
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Diseño();
    }//GEN-LAST:event_formWindowActivated

    void Diseño() {
        if ("0".equals(modo)) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PanelEmpleado.png"))); // NOI18N
        } else if ("1".equals(modo)) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EmpleadoClaro.png"))); // NOI18N
        } else if ("2".equals(modo)) {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EmpleadoDarkV.png"))); // NOI18N
        } else {
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EmpleadoDarkM.png"))); // NOI18N
        }
    }

    void dateString() {
        int fila = tabla.getSelectedRow();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String fechana = tabla.getValueAt(fila, 5).toString();
        String fechaing = tabla.getValueAt(fila, 6).toString();
        try {

            Date dates = formatter.parse(fechana);
            fechaNacimiento.setDate(dates);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {

            Date date = formatter.parse(fechaing);
            FechaIngreso.setDate(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    void iniciar() {
        listar();
        idAleatorio();
    }

    void agregar() {

        FechaCalendario();
        String idEmpleado = txtidEmpleado.getText();
        String dni = txtDNI.getText();
        String nom = txtNombre.getText();
        String ape = txtApellido.getText();
        String numero = txtNumero.getText();
        String fechana = txtfechana.getText();
        String FechaIng = txtfechaIng.getText();
        String idCategoria = (String) categoria.getSelectedItem();
        String sexo = (String) ComboSexo.getSelectedItem();
        String idcat;
        if (idCategoria == "Administracion") {
            idcat = "01";
        } else if (idCategoria == "Vendedor") {
            idcat = "02";
        } else {
            idcat = "03";
        }

        

        Object[] ob = new Object[9];
        ob[0] = idEmpleado;
        ob[1] = dni;
        ob[2] = nom;
        ob[3] = ape;
        ob[4] = numero;
        ob[5] = fechana;
        ob[6] = FechaIng;
        ob[7] = idcat;
        ob[8] = sexo;

        dao.add(ob);

    }

    void idAleatorio() {
        String idcli = dao.IdEmpleado();
        int id = Integer.valueOf(idcli);
        txtidEmpleado.setText(Integer.toString(id + 1));
    }

    void actualizar() {

        FechaCalendario();
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            String idEmpleado = txtidEmpleado.getText();
            String dni = txtDNI.getText();
            String nom = txtNombre.getText();
            String ape = txtApellido.getText();
            String numero = txtNumero.getText();
            String fechana = txtfechana.getText();
            String FechaIng = txtfechaIng.getText();
            String idCategoria = (String) categoria.getSelectedItem();
            String sexo = (String) ComboSexo.getSelectedItem();
            String idcat;
            if (idCategoria == "Administracion") {
                idcat = "01";
            } else if (idCategoria == "Vendedor") {
                idcat = "02";
            } else {
                idcat = "03";
            }

            Object[] ob = new Object[9];
            ob[8] = idEmpleado;
            ob[0] = dni;
            ob[1] = nom;
            ob[2] = ape;
            ob[3] = numero;
            ob[4] = fechana;
            ob[5] = FechaIng;
            ob[6] = idcat;
            ob[7] = sexo;

            dao.actualizarEmpleado(ob);

        }

    }

    void eliminar() {
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            String idEmpleado = tabla.getValueAt(fila, 0).toString();
            dao.eliminarEmpleado(idEmpleado);
        }
    }

    void listar() {
        List<Empleado> lista = dao.listarEmpleado();
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[9];
        for (int i = 0; i < lista.size(); i++) {
            ob[0] = lista.get(i).getIdEmpleado();
            ob[1] = lista.get(i).getDNI();
            ob[2] = lista.get(i).getNombre();
            ob[3] = lista.get(i).getApellido();
            ob[4] = lista.get(i).getNumero();
            ob[5] = lista.get(i).getFechaNa();
            ob[6] = lista.get(i).getFechaIng();
            ob[7] = lista.get(i).getIdCategoria();
            ob[8] = lista.get(i).getSexo();

            modelo.addRow(ob);
        }

        tabla.setModel(modelo);
    }

    void nuevo() {

        FechaIngreso.setDate(null);
        fechaNacimiento.setDate(null);
        txtDNI.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtNumero.setText("");
        categoria.setSelectedItem("Seleccionar");
        ComboSexo.setSelectedItem("Seleccionar");
        txtNombre.requestFocus();

    }

    void limpiar() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    void FechaCalendario() {

        String Dia = Integer.toString(FechaIngreso.getCalendar().get(Calendar.DAY_OF_MONTH));
        String Mes = Integer.toString(FechaIngreso.getCalendar().get(Calendar.MONTH) + 1);
        String año = Integer.toString(FechaIngreso.getCalendar().get(Calendar.YEAR));

        if (Integer.valueOf(Mes) < 10) {
            if (Integer.valueOf(Dia) < 10) {
                txtfechaIng.setText(año + "-0" + Mes + "-0" + Dia);
            } else {
                String FechaIngr = (año + "-0" + Mes + "-" + Dia);
                txtfechaIng.setText(FechaIngr);
            }
        } else {
            if (Integer.valueOf(Dia) < 10) {
                txtfechaIng.setText(año + "-" + Mes + "-0" + Dia);
            } else {
                txtfechaIng.setText(año + "-" + Mes + "-" + Dia);
            }
        }

        String DiaNa = Integer.toString(fechaNacimiento.getCalendar().get(Calendar.DAY_OF_MONTH));
        String MesNa = Integer.toString(fechaNacimiento.getCalendar().get(Calendar.MONTH) + 1);
        String añoNa = Integer.toString(fechaNacimiento.getCalendar().get(Calendar.YEAR));

        if (Integer.valueOf(MesNa) < 10) {
            if (Integer.valueOf(DiaNa) < 10) {
                txtfechana.setText(añoNa + "-0" + MesNa + "-0" + DiaNa);
            } else {
                txtfechana.setText(añoNa + "-0" + MesNa + "-" + DiaNa);
            }

        } else {
            if (Integer.valueOf(DiaNa) < 10) {
                txtfechana.setText(añoNa + "-" + Mes + "-0" + DiaNa);
            } else {
                txtfechana.setText(añoNa + "-" + MesNa + "-" + DiaNa);

            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboSexo;
    private com.toedter.calendar.JDateChooser FechaIngreso;
    private javax.swing.JPanel PanelCli;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> categoria;
    private com.toedter.calendar.JDateChooser fechaNacimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtfechaIng;
    private javax.swing.JTextField txtfechana;
    private javax.swing.JTextField txtidEmpleado;
    // End of variables declaration//GEN-END:variables
}
