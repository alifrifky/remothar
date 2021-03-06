/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import controller.c_adduser;

/**
 *
 * @author Muhtar
 */
public class addUser extends javax.swing.JFrame {

    /**
     * Creates new form addUser
     */
    
//    c_adduser a = new c_adduser();
            
    public addUser() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public String getId() {
        return id.getText();
    }

    public void setId(String id) {
        this.id.setText(id);
    }

    public String getNamauser() {
        return namauser.getText();
    }

    public String getPass() {
        return pass.getText();
    }

    public String getStatus() {
        return status.getSelectedItem().toString();
    }

    public String getUsername() {
        return username.getText();
    }

    public void setNamauser(String isi) {
        this.namauser.setText(isi);
    }

    public void setPass(String isi) {
        this.pass.setText(isi);
    }

    public void setStatus(int status) {
        this.status.setSelectedIndex(status);
    }

    public void setUsername(String isi) {
        this.username.setText(isi);
    }

    public int getSelectedRow() {
        return table.getSelectedRow();
    }

    public void addBtnAddMotorListener(ActionListener e) {
        this.btn_addmotor.addActionListener(e);
    }

    public void addBtnPinjamListener(ActionListener e) {
        this.btn_pinjam.addActionListener(e);
    }

    public void addBtnPengembalianListener(ActionListener e) {
        this.btn_pengembalian.addActionListener(e);
    }

    public void addBtnKeluarListener(ActionListener e) {
        this.btn_keluar.addActionListener(e);
    }

    public void setTable(DefaultTableModel table) {
        this.table.setModel(table);
    }

    public String getValueAt(int baris, int kolom) {
        return (String) this.table.getValueAt(baris, kolom);
    }

    public void addsaveListener(ActionListener e) {
        this.btn_save.addActionListener(e);
    }

    public void addeditListener(ActionListener e) {
        this.btn_edit.addActionListener(e);
    }

    public void addupdateListener(ActionListener e) {
        this.btn_update.addActionListener(e);
    }

    public void addhapusListener(ActionListener e) {
        this.btn_delete.addActionListener(e);
    }

    public void message(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }

    public void text(boolean status) {
        this.namauser.setEnabled(status);
        this.username.setEnabled(status);
        this.pass.setEnabled(status);
    }

    public void button(boolean status) {
        this.btn_save.setEnabled(status);
        this.btn_edit.setEnabled(status);
        this.btn_update.setEnabled(status);
        this.btn_delete.setEnabled(status);
    }

    public void buttonsave(boolean status) {
        this.btn_save.setEnabled(status);
    }

    public void delete(boolean status) {
        this.btn_delete.setEnabled(status);
    }

    public void buttonedit(boolean status) {
        this.btn_edit.setEnabled(status);
    }

    public void buttonupdate(boolean status) {
        this.btn_update.setEnabled(status);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        keluar2 = new javax.swing.JLabel();
        minimaze = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btn_addmotor = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btn_pinjam = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        btn_pengembalian = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btn_adduser = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        btn_keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        btn_edit = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        btn_delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        namauser = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        btn_update = new javax.swing.JButton();
        status = new javax.swing.JComboBox<>();
        id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(81, 3, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(221, 79, 67));
        jPanel6.setPreferredSize(new java.awt.Dimension(910, 43));

        keluar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keluar2MouseClicked(evt);
            }
        });

        minimaze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimazeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 211, 181));
        jLabel2.setText("Add User");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 799, Short.MAX_VALUE)
                .addComponent(minimaze)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keluar2))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keluar2)
                    .addComponent(minimaze)
                    .addComponent(jLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 30));

        jPanel7.setBackground(new java.awt.Color(227, 148, 104));

        jPanel8.setBackground(new java.awt.Color(255, 190, 127));

        btn_addmotor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_addmotor.setText("Add Motor");
        btn_addmotor.setBorderPainted(false);
        btn_addmotor.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_addmotor, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_addmotor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 190, 127));

        btn_pinjam.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_pinjam.setText("Pinjam Motor");
        btn_pinjam.setBorderPainted(false);
        btn_pinjam.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 190, 127));

        btn_pengembalian.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_pengembalian.setText("Pengembalian");
        btn_pengembalian.setBorderPainted(false);
        btn_pengembalian.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_pengembalian))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_pengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 190, 127));

        btn_adduser.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_adduser.setText("Add User");
        btn_adduser.setBorderPainted(false);
        btn_adduser.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_adduser, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_adduser, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 190, 127));

        btn_keluar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_keluar.setText("Keluar");
        btn_keluar.setBorderPainted(false);
        btn_keluar.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_keluar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_keluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 930, 80));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id_User", "Nama", "Username", "Password", "Status"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 570, 110));

        jPanel13.setBackground(new java.awt.Color(255, 190, 127));

        btn_save.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_save.setText("Save");
        btn_save.setBorderPainted(false);
        btn_save.setContentAreaFilled(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, 60));

        jPanel14.setBackground(new java.awt.Color(255, 190, 127));

        btn_edit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.setBorderPainted(false);
        btn_edit.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, 60));

        jPanel15.setBackground(new java.awt.Color(255, 190, 127));

        btn_delete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.setBorderPainted(false);
        btn_delete.setContentAreaFilled(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(221, 79, 67));
        jLabel1.setText("Nama");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(221, 79, 67));
        jLabel3.setText("Username");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(221, 79, 67));
        jLabel4.setText("Password");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(221, 79, 67));
        jLabel5.setText("Status");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        namauser.setBackground(new java.awt.Color(255, 190, 127));
        namauser.setBorder(null);
        namauser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namauserActionPerformed(evt);
            }
        });
        jPanel5.add(namauser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 390, 20));

        username.setBackground(new java.awt.Color(255, 190, 127));
        username.setBorder(null);
        jPanel5.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 390, 20));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(221, 79, 67));
        jLabel8.setText("Id_User");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        pass.setBackground(new java.awt.Color(255, 190, 127));
        pass.setBorder(null);
        jPanel5.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 390, 20));

        jPanel16.setBackground(new java.awt.Color(255, 190, 127));

        btn_update.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_update.setText("Update");
        btn_update.setBorderPainted(false);
        btn_update.setContentAreaFilled(false);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Pegawai" }));
        jPanel5.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 120, -1));

        id.setForeground(new java.awt.Color(81, 3, 0));
        jPanel5.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 100, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluar2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_keluar2MouseClicked

    private void minimazeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimazeMouseClicked
        this.setState(login.ICONIFIED);
    }//GEN-LAST:event_minimazeMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void namauserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namauserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namauserActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
//        a.clear();
    }//GEN-LAST:event_btn_updateActionPerformed

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
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addmotor;
    private javax.swing.JButton btn_adduser;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_pengembalian;
    private javax.swing.JButton btn_pinjam;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel keluar2;
    private javax.swing.JLabel minimaze;
    private javax.swing.JTextField namauser;
    private javax.swing.JTextField pass;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTable table;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
