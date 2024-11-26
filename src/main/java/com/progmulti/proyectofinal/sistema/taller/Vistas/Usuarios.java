package com.progmulti.proyectofinal.sistema.taller.Vistas;

import com.progmulti.proyectofinal.sistema.taller.Controlador.ControladorUsuarios;
import com.progmulti.proyectofinal.sistema.taller.Modelos.Usuario;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Alejandro
 */
public class Usuarios extends javax.swing.JFrame {

    int fila;
    Long codigo = 0L;
    paneles panel = new paneles();
    botones boton = new botones();
    Usuario usuario = new Usuario();
    ControladorUsuarios controlador = new ControladorUsuarios();

    public Usuarios() {
        this.setUndecorated(true);
        this.setBackground(new Color(0, 0, 0, 0));
        this.setContentPane(panel);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Usuarios");
        CargarTabla();
    }

    public void CargarTabla() {
        List<Usuario> usuarios = controlador.Lista();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Correo");
        model.addColumn("Telefono");
        model.addColumn("Clave");
        for (Usuario usuario : usuarios) {
            Object[] row = new Object[5];
            row[0] = usuario.getIdUsuario();
            row[1] = usuario.getNombre();
            row[2] = usuario.getCorreo();
            row[3] = usuario.getTelefono();
            row[4] = usuario.getClave();
            model.addRow(row);
        }
        Registros.setModel(model);
    }
    
    public void Busqueda(String busqueda) {
        List<Usuario> usuarios = controlador.Lista(busqueda);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Correo");
        model.addColumn("Telefono");
        model.addColumn("Clave");
        for (Usuario usuario : usuarios) {
            Object[] row = new Object[5];
            row[0] = usuario.getIdUsuario();
            row[1] = usuario.getNombre();
            row[2] = usuario.getCorreo();
            row[3] = usuario.getTelefono();
            row[4] = usuario.getClave();
            model.addRow(row);
        }
        Registros.setModel(model);
    }

    public void Guardar() {
        usuario.setIdUsuario(codigo);
        usuario.setNombre(tbNombre.getText());
        usuario.setCorreo(tbCorreo.getText());
        usuario.setTelefono(tbTel.getText());
        usuario.setClave(tbClave.getText());
        controlador.Guardar(usuario);
    }

    public void Limpiar() {
        codigo = 0L;
        tbNombre.setText("");
        tbCorreo.setText("");
        tbTel.setText("");
        tbClave.setText("");
        tbBusqueda.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new paneles();
        paneles1 = new com.progmulti.proyectofinal.sistema.taller.Vistas.paneles();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tbNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        tbCorreo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        tbTel = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        tbClave = new javax.swing.JTextField();
        btnEliminar = new com.progmulti.proyectofinal.sistema.taller.Vistas.botones();
        btnGuardar = new com.progmulti.proyectofinal.sistema.taller.Vistas.botones();
        btnMinimizar = new com.progmulti.proyectofinal.sistema.taller.Vistas.botones();
        btnCerrar = new com.progmulti.proyectofinal.sistema.taller.Vistas.botones();
        paneles2 = new com.progmulti.proyectofinal.sistema.taller.Vistas.paneles();
        jScrollPane2 = new javax.swing.JScrollPane();
        Registros = new com.progmulti.proyectofinal.sistema.taller.Vistas.tablas();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        tbBusqueda = new javax.swing.JTextField();
        btnBuscar = new com.progmulti.proyectofinal.sistema.taller.Vistas.botones();
        btnInicio = new com.progmulti.proyectofinal.sistema.taller.Vistas.botones();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        paneles1.setBackground(new java.awt.Color(18, 18, 18));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(3, 218, 198));
        jLabel1.setText("Registros");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(3, 218, 198));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(3, 218, 198));
        jLabel3.setText("Correo");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(3, 218, 198));
        jLabel4.setText("Telefono");

        jLabel5.setBackground(new java.awt.Color(25, 25, 25));
        jLabel5.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(3, 218, 198));
        jLabel5.setText("Clave");

        tbNombre.setBackground(new java.awt.Color(18, 18, 18));
        tbNombre.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        tbNombre.setForeground(new java.awt.Color(255, 255, 255));
        tbNombre.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(3, 218, 198));
        jSeparator1.setForeground(new java.awt.Color(3, 218, 198));

        tbCorreo.setBackground(new java.awt.Color(18, 18, 18));
        tbCorreo.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        tbCorreo.setForeground(new java.awt.Color(255, 255, 255));
        tbCorreo.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(3, 218, 198));
        jSeparator2.setForeground(new java.awt.Color(3, 218, 198));

        tbTel.setBackground(new java.awt.Color(18, 18, 18));
        tbTel.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        tbTel.setForeground(new java.awt.Color(255, 255, 255));
        tbTel.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(3, 218, 198));
        jSeparator3.setForeground(new java.awt.Color(3, 218, 198));

        jSeparator4.setBackground(new java.awt.Color(3, 218, 198));
        jSeparator4.setForeground(new java.awt.Color(3, 218, 198));

        tbClave.setBackground(new java.awt.Color(18, 18, 18));
        tbClave.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        tbClave.setForeground(new java.awt.Color(255, 255, 255));
        tbClave.setBorder(null);

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderColor(new java.awt.Color(255, 0, 0));
        btnEliminar.setColor(new java.awt.Color(255, 0, 0));
        btnEliminar.setColorClick(new java.awt.Color(204, 0, 0));
        btnEliminar.setColorOver(new java.awt.Color(204, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        btnEliminar.setRadio(40);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 204, 102));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderColor(new java.awt.Color(0, 204, 102));
        btnGuardar.setColor(new java.awt.Color(0, 204, 102));
        btnGuardar.setColorClick(new java.awt.Color(0, 153, 102));
        btnGuardar.setColorOver(new java.awt.Color(0, 153, 102));
        btnGuardar.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        btnGuardar.setRadio(40);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneles1Layout = new javax.swing.GroupLayout(paneles1);
        paneles1.setLayout(paneles1Layout);
        paneles1Layout.setHorizontalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles1Layout.createSequentialGroup()
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tbCorreo)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(tbNombre)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tbTel)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tbClave)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(paneles1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        paneles1Layout.setVerticalGroup(
            paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(paneles1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 0));
        btnMinimizar.setBorderColor(new java.awt.Color(255, 255, 0));
        btnMinimizar.setColor(new java.awt.Color(255, 255, 0));
        btnMinimizar.setColorClick(new java.awt.Color(255, 204, 0));
        btnMinimizar.setColorOver(new java.awt.Color(255, 204, 0));
        btnMinimizar.setRadio(100);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar.setBorderColor(new java.awt.Color(255, 0, 0));
        btnCerrar.setColor(new java.awt.Color(255, 0, 0));
        btnCerrar.setColorClick(new java.awt.Color(204, 0, 0));
        btnCerrar.setColorOver(new java.awt.Color(204, 0, 0));
        btnCerrar.setRadio(100);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        paneles2.setBackground(new java.awt.Color(18, 18, 18));

        Registros.setBackground(new java.awt.Color(18, 18, 18));
        Registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Correo", "Telefono", "Clave"
            }
        ));
        Registros.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Registros);

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(3, 218, 198));
        jLabel6.setText("Lista de Usuarios");

        jSeparator5.setBackground(new java.awt.Color(3, 218, 198));
        jSeparator5.setForeground(new java.awt.Color(3, 218, 198));

        tbBusqueda.setBackground(new java.awt.Color(18, 18, 18));
        tbBusqueda.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        tbBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        tbBusqueda.setBorder(null);

        btnBuscar.setBackground(new java.awt.Color(3, 218, 198));
        btnBuscar.setForeground(new java.awt.Color(0, 51, 51));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderColor(new java.awt.Color(3, 218, 198));
        btnBuscar.setColor(new java.awt.Color(3, 218, 198));
        btnBuscar.setColorClick(new java.awt.Color(0, 204, 204));
        btnBuscar.setColorOver(new java.awt.Color(0, 204, 204));
        btnBuscar.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        btnBuscar.setRadio(40);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneles2Layout = new javax.swing.GroupLayout(paneles2);
        paneles2.setLayout(paneles2Layout);
        paneles2Layout.setHorizontalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneles2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneles2Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel6))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneles2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(jSeparator5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        paneles2Layout.setVerticalGroup(
            paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneles2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneles2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneles2Layout.createSequentialGroup()
                        .addComponent(tbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        btnInicio.setBackground(new java.awt.Color(3, 218, 198));
        btnInicio.setForeground(new java.awt.Color(0, 51, 51));
        btnInicio.setText("Inicio");
        btnInicio.setBorderColor(new java.awt.Color(3, 218, 198));
        btnInicio.setColor(new java.awt.Color(3, 218, 198));
        btnInicio.setColorClick(new java.awt.Color(0, 204, 204));
        btnInicio.setColorOver(new java.awt.Color(0, 204, 204));
        btnInicio.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        btnInicio.setRadio(40);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(paneles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(391, 391, 391)
                        .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paneles2, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paneles1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Guardar();
        Limpiar();
        CargarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        controlador.Eliminar(codigo);
        Limpiar();
        CargarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void RegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrosMouseClicked
        fila = Registros.rowAtPoint(evt.getPoint());
        codigo = Long.valueOf(String.valueOf(Registros.getValueAt(fila, 0)));
        tbNombre.setText(String.valueOf(Registros.getValueAt(fila, 1)));
        tbCorreo.setText(String.valueOf(Registros.getValueAt(fila, 2)));
        tbTel.setText(String.valueOf(Registros.getValueAt(fila, 3)));
        tbClave.setText(String.valueOf(Registros.getValueAt(fila, 4)));
    }//GEN-LAST:event_RegistrosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String busqueda = tbBusqueda.getText();
        Busqueda(busqueda);
        Limpiar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
       Menu menu = new Menu();
       menu.show();
       this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.progmulti.proyectofinal.sistema.taller.Vistas.tablas Registros;
    private com.progmulti.proyectofinal.sistema.taller.Vistas.botones btnBuscar;
    private com.progmulti.proyectofinal.sistema.taller.Vistas.botones btnCerrar;
    private com.progmulti.proyectofinal.sistema.taller.Vistas.botones btnEliminar;
    private com.progmulti.proyectofinal.sistema.taller.Vistas.botones btnGuardar;
    private com.progmulti.proyectofinal.sistema.taller.Vistas.botones btnInicio;
    private com.progmulti.proyectofinal.sistema.taller.Vistas.botones btnMinimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private com.progmulti.proyectofinal.sistema.taller.Vistas.paneles paneles1;
    private com.progmulti.proyectofinal.sistema.taller.Vistas.paneles paneles2;
    private javax.swing.JTextField tbBusqueda;
    private javax.swing.JTextField tbClave;
    private javax.swing.JTextField tbCorreo;
    private javax.swing.JTextField tbNombre;
    private javax.swing.JTextField tbTel;
    // End of variables declaration//GEN-END:variables
}
