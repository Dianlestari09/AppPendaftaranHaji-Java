package uas;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    /** Creates new form Login */
    public Login() {
        initComponents();
        setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        lbLogin = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        tfUserName = new javax.swing.JTextField();
        jPass = new javax.swing.JPasswordField();
        btLogin = new javax.swing.JButton();
        btRefresh = new javax.swing.JButton();
        btBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpeg"))); // NOI18N
        jPanel1.add(lbIcon);
        lbIcon.setBounds(140, 0, 220, 200);

        lbLogin.setFont(new java.awt.Font("Stencil", 3, 36)); // NOI18N
        lbLogin.setText("LOGIN yuk");
        jPanel1.add(lbLogin);
        lbLogin.setBounds(140, 210, 220, 30);

        lbUserName.setFont(new java.awt.Font("Sylfaen", 3, 22)); // NOI18N
        lbUserName.setText("Username");
        jPanel1.add(lbUserName);
        lbUserName.setBounds(60, 300, 110, 30);

        lbPass.setFont(new java.awt.Font("Sylfaen", 3, 22)); // NOI18N
        lbPass.setText("Password");
        jPanel1.add(lbPass);
        lbPass.setBounds(60, 370, 100, 30);
        jPanel1.add(tfUserName);
        tfUserName.setBounds(190, 300, 230, 26);

        jPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassActionPerformed(evt);
            }
        });
        jPanel1.add(jPass);
        jPass.setBounds(190, 370, 230, 26);

        btLogin.setText("Login");
        btLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLoginMouseClicked(evt);
            }
        });
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btLogin);
        btLogin.setBounds(350, 480, 90, 29);

        btRefresh.setText("Refresh");
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btRefresh);
        btRefresh.setBounds(210, 480, 90, 29);

        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        jPanel1.add(btBack);
        btBack.setBounds(60, 480, 90, 29);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassActionPerformed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        try {
            Connection conn = Conn.getConnection();
            Statement s = (Statement) conn.createStatement();

            String sql = "SELECT * FROM user WHERE username='" + tfUserName.getText() + "'and password='" + jPass.getText() + "'";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                JOptionPane.showMessageDialog(null, "Login Sukses");
                this.dispose();
                Recap rekap = new Recap();
                rekap.setVisible(true);
                rekap.pack();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Username / Password Salah");
                jPass.requestFocus();
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_btLoginActionPerformed

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        tfUserName.setText("");
        jPass.setText("");
    }//GEN-LAST:event_btRefreshActionPerformed

    private void btLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLoginMouseClicked

    }//GEN-LAST:event_btLoginMouseClicked

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        Registration daftar = new Registration();
        daftar.setVisible(true);
        daftar.pack();
        this.dispose();    }//GEN-LAST:event_btBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btRefresh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables
}
