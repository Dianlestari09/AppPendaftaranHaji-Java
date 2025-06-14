package uas;

import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import uas.Conn;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class Registration extends javax.swing.JFrame {

    Enscapsulation enscap = new Enscapsulation();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    /** Creates new form Pendaftaran */
    public Registration() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        lbpendaftaran1 = new javax.swing.JLabel();
        lbNama1 = new javax.swing.JLabel();
        lbJenisKelamin1 = new javax.swing.JLabel();
        lbTanggal1 = new javax.swing.JLabel();
        lbNIK1 = new javax.swing.JLabel();
        lbAlamat1 = new javax.swing.JLabel();
        tfNIK1 = new javax.swing.JTextField();
        tfNama1 = new javax.swing.JTextField();
        tfTanggal1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        taAlamat1 = new javax.swing.JTextArea();
        btSubmit1 = new javax.swing.JButton();
        btRefresh1 = new javax.swing.JButton();
        rbPria1 = new javax.swing.JRadioButton();
        rbWanita1 = new javax.swing.JRadioButton();
        btExit1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbpendaftaran = new javax.swing.JLabel();
        lbNama = new javax.swing.JLabel();
        lbJenisKelamin = new javax.swing.JLabel();
        lbTanggal = new javax.swing.JLabel();
        lbNIK = new javax.swing.JLabel();
        lbAlamat = new javax.swing.JLabel();
        tfNIK = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        taAlamat = new javax.swing.JTextArea();
        btSubmit = new javax.swing.JButton();
        btRefresh = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        cbkel = new javax.swing.JComboBox<>();
        jDate = new com.toedter.calendar.JDateChooser();
        btUpdate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbLoginAdmin = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setBackground(new java.awt.Color(255, 255, 255));
        jFrame1.setResizable(false);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setPreferredSize(new java.awt.Dimension(800, 500));

        lbpendaftaran1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lbpendaftaran1.setForeground(new java.awt.Color(255, 255, 255));
        lbpendaftaran1.setText("Pendaftaran");

        lbNama1.setForeground(new java.awt.Color(255, 255, 255));
        lbNama1.setText("Nama");

        lbJenisKelamin1.setForeground(new java.awt.Color(255, 255, 255));
        lbJenisKelamin1.setText("Jenis Kelamin");

        lbTanggal1.setForeground(new java.awt.Color(255, 255, 255));
        lbTanggal1.setText("Tanggal Daftar");

        lbNIK1.setForeground(new java.awt.Color(255, 255, 255));
        lbNIK1.setText("NIK");

        lbAlamat1.setForeground(new java.awt.Color(255, 255, 255));
        lbAlamat1.setText("Alamat");

        tfNIK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNIK1ActionPerformed(evt);
            }
        });

        tfNama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNama1ActionPerformed(evt);
            }
        });

        taAlamat1.setColumns(20);
        taAlamat1.setRows(5);
        jScrollPane3.setViewportView(taAlamat1);

        btSubmit1.setText("Submit");
        btSubmit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSubmit1MouseClicked(evt);
            }
        });
        btSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmit1ActionPerformed(evt);
            }
        });

        btRefresh1.setText("Refresh");
        btRefresh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btRefresh1MouseClicked(evt);
            }
        });
        btRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefresh1ActionPerformed(evt);
            }
        });

        rbPria1.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(rbPria1);
        rbPria1.setForeground(new java.awt.Color(255, 255, 255));
        rbPria1.setText("Pria");
        rbPria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPria1ActionPerformed(evt);
            }
        });

        rbWanita1.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(rbWanita1);
        rbWanita1.setForeground(new java.awt.Color(255, 255, 255));
        rbWanita1.setText("Wanita\n");

        btExit1.setText("Exit");
        btExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExit1MouseClicked(evt);
            }
        });
        btExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbpendaftaran1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTanggal1)
                    .addComponent(lbNIK1)
                    .addComponent(lbNama1)
                    .addComponent(lbJenisKelamin1)
                    .addComponent(lbAlamat1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btExit1)))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btRefresh1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(btSubmit1))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfNIK1)
                        .addComponent(tfNama1)
                        .addComponent(tfTanggal1)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rbPria1)
                        .addGap(18, 18, 18)
                        .addComponent(rbWanita1)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbpendaftaran1)
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNIK1)
                    .addComponent(tfNIK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNama1)
                    .addComponent(tfNama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbJenisKelamin1)
                    .addComponent(rbPria1)
                    .addComponent(rbWanita1))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTanggal1)
                    .addComponent(tfTanggal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAlamat1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSubmit1)
                    .addComponent(btRefresh1)
                    .addComponent(btExit1))
                .addGap(38, 38, 38))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/image1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 520));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        lbpendaftaran.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lbpendaftaran.setForeground(new java.awt.Color(255, 255, 255));
        lbpendaftaran.setText("Pendaftaran");

        lbNama.setForeground(new java.awt.Color(255, 255, 255));
        lbNama.setText("Nama");

        lbJenisKelamin.setForeground(new java.awt.Color(255, 255, 255));
        lbJenisKelamin.setText("Jenis Kelamin");

        lbTanggal.setForeground(new java.awt.Color(255, 255, 255));
        lbTanggal.setText("Tanggal Daftar");

        lbNIK.setForeground(new java.awt.Color(255, 255, 255));
        lbNIK.setText("NIK");

        lbAlamat.setForeground(new java.awt.Color(255, 255, 255));
        lbAlamat.setText("Alamat");

        tfNIK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNIKActionPerformed(evt);
            }
        });

        tfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaActionPerformed(evt);
            }
        });

        taAlamat.setColumns(20);
        taAlamat.setRows(5);
        jScrollPane2.setViewportView(taAlamat);

        btSubmit.setText("Submit");
        btSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSubmitMouseClicked(evt);
            }
        });
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });

        btRefresh.setText("Refresh");
        btRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btRefreshMouseClicked(evt);
            }
        });
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        btExit.setText("Exit");
        btExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btExitMouseClicked(evt);
            }
        });
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        cbkel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pria", "Wanita" }));
        cbkel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbkelMouseClicked(evt);
            }
        });
        cbkel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkelActionPerformed(evt);
            }
        });

        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTanggal)
                            .addComponent(lbNIK)
                            .addComponent(lbNama)
                            .addComponent(lbJenisKelamin)
                            .addComponent(lbAlamat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbpendaftaran, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btRefresh)
                        .addGap(35, 35, 35)
                        .addComponent(btUpdate)
                        .addGap(37, 37, 37)
                        .addComponent(btSubmit))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfNIK)
                        .addComponent(tfNama)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                .addComponent(jDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbpendaftaran)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNIK)
                    .addComponent(tfNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNama)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbJenisKelamin)
                    .addComponent(cbkel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTanggal)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAlamat)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRefresh)
                    .addComponent(btExit)
                    .addComponent(btUpdate)
                    .addComponent(btSubmit))
                .addGap(38, 38, 38))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uas/image1.jpg"))); // NOI18N

        lbLoginAdmin.setForeground(new java.awt.Color(51, 153, 255));
        lbLoginAdmin.setText("Login Admin");
        lbLoginAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLoginAdminMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(lbLoginAdmin))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSubmitActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed

        String nik = tfNIK.getText();
        String nama = tfNama.getText();
        String jenis_kelamin = (String) cbkel.getSelectedItem();
        String tanggal_daftar = sdf.format(jDate.getDate());
        String alamat = taAlamat.getText();

        try {
            Statement statement = (Statement) Conn.getConnection().createStatement();
            statement.executeUpdate("insert into pendaftaran (nik, nama, jenis_kelamin, tanggal_daftar, alamat) VALUES('"
                    + nik + "','"
                    + nama + "','"
                    + jenis_kelamin + "','"
                    + tanggal_daftar + "','"
                    + alamat + "');");
            statement.close();
            System.out.println(tfNIK.getText());
            System.out.println(jDate.getDate());
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
            tfNIK.setText("");
            tfNama.setText("");
            cbkel.setSelectedItem("Pria");
            jDate.setDateFormatString("");
            taAlamat.setText("");
            tfNIK.requestFocus();

        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, "Data Gagal disimpan");
            System.err.println(t);
        }

    }//GEN-LAST:event_btSubmitActionPerformed

    private void tfNamaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_tfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaActionPerformed

    private void tfNIKActionPerformed(ActionEvent evt) {//GEN-FIRST:event_tfNIKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNIKActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        dispose();
    }//GEN-LAST:event_btExitActionPerformed

    private void btExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExitMouseClicked
        dispose();
    }//GEN-LAST:event_btExitMouseClicked

    private void btRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRefreshMouseClicked
        tfNIK.setText("");
        tfNama.setText("");
        cbkel.setSelectedItem("Pria");
        jDate.setDateFormatString("");
        taAlamat.setText("");
        tfNIK.requestFocus();

    }//GEN-LAST:event_btRefreshMouseClicked

    private void btSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSubmitMouseClicked

    }//GEN-LAST:event_btSubmitMouseClicked

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRefreshActionPerformed

    private void tfNIK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNIK1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNIK1ActionPerformed

    private void tfNama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNama1ActionPerformed

    private void btSubmit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSubmit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btSubmit1MouseClicked

    private void btSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSubmit1ActionPerformed

    private void btRefresh1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRefresh1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btRefresh1MouseClicked

    private void btRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefresh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRefresh1ActionPerformed

    private void rbPria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPria1ActionPerformed

    private void btExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btExit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btExit1MouseClicked

    private void btExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExit1ActionPerformed

    private void lbLoginAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLoginAdminMouseClicked
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        this.dispose();
    }//GEN-LAST:event_lbLoginAdminMouseClicked

    private void cbkelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbkelActionPerformed

    private void cbkelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbkelMouseClicked
     }//GEN-LAST:event_cbkelMouseClicked

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        try {
            String tanggal_daftar = sdf.format(jDate.getDate());
            Statement statement = (Statement) Conn.getConnection().createStatement();
            String sql = "UPDATE pendaftaran SET nama ='" + tfNama.getText() + "',jenis_kelamin='" + cbkel.getSelectedItem() + "',tanggal_daftar='" + tanggal_daftar + "',alamat= '" + taAlamat.getText() + "' WHERE nik = " + tfNIK.getText();
            statement.execute(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil diUpdate");
            tfNIK.setText("");
            tfNama.setText("");
            cbkel.setSelectedItem("Pria");
            jDate.setDateFormatString("");
            taAlamat.setText("");
            tfNIK.requestFocus();
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Data Gagal diUpdate");
        }
    }//GEN-LAST:event_btUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btExit;
    public javax.swing.JButton btExit1;
    public javax.swing.JButton btRefresh;
    public javax.swing.JButton btRefresh1;
    public javax.swing.JButton btSubmit;
    public javax.swing.JButton btSubmit1;
    private javax.swing.JButton btUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> cbkel;
    public com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JLabel lbAlamat;
    public javax.swing.JLabel lbAlamat1;
    public javax.swing.JLabel lbJenisKelamin;
    public javax.swing.JLabel lbJenisKelamin1;
    public javax.swing.JLabel lbLoginAdmin;
    public javax.swing.JLabel lbNIK;
    public javax.swing.JLabel lbNIK1;
    public javax.swing.JLabel lbNama;
    public javax.swing.JLabel lbNama1;
    public javax.swing.JLabel lbTanggal;
    public javax.swing.JLabel lbTanggal1;
    private javax.swing.JLabel lbpendaftaran;
    private javax.swing.JLabel lbpendaftaran1;
    public javax.swing.JRadioButton rbPria1;
    public javax.swing.JRadioButton rbWanita1;
    public javax.swing.JTextArea taAlamat;
    public javax.swing.JTextArea taAlamat1;
    public javax.swing.JTextField tfNIK;
    public javax.swing.JTextField tfNIK1;
    public javax.swing.JTextField tfNama;
    public javax.swing.JTextField tfNama1;
    public javax.swing.JTextField tfTanggal1;
    // End of variables declaration//GEN-END:variables
}
