
package GUI;

import dao.TaiKhoanDAO;
import pojo.TaiKhoan;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import GUI.ThoatChuongTrinh;
import dao.NhanVienDAO;
import main.Run;

/**
 *
 * @author PC
 */
public class LoginForm extends javax.swing.JFrame {
    
    
    public static String maNV;
    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        try {
            initComponents();
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
            } catch (InstantiationException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        lbimage = new javax.swing.JLabel();
        pnDangNhap = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        lbTenDN = new javax.swing.JLabel();
        lbMatKhau = new javax.swing.JLabel();
        txtTenDN = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtMatKhau = new javax.swing.JPasswordField();
        btnDangNhap = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coffe.jpg"))); // NOI18N
        pnMain.add(lbimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        pnDangNhap.setBackground(new java.awt.Color(50, 67, 95));

        lbTitle.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("Log in");

        lbTenDN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbTenDN.setForeground(new java.awt.Color(255, 255, 255));
        lbTenDN.setText("T??n ????ng nh???p");

        lbMatKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        lbMatKhau.setText("M???t kh???u");

        txtTenDN.setBackground(new java.awt.Color(50, 67, 95));
        txtTenDN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTenDN.setForeground(new java.awt.Color(255, 255, 255));
        txtTenDN.setText("NV1");
        txtTenDN.setBorder(null);
        txtTenDN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTenDNFocusGained(evt);
            }
        });

        txtMatKhau.setBackground(new java.awt.Color(50, 67, 95));
        txtMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhau.setText("120995");
        txtMatKhau.setBorder(null);
        txtMatKhau.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMatKhauFocusGained(evt);
            }
        });
        txtMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauActionPerformed(evt);
            }
        });

        btnDangNhap.setBackground(new java.awt.Color(197, 112, 34));
        btnDangNhap.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("????ng nh???p");
        btnDangNhap.setBorderPainted(false);
        btnDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseClicked(evt);
            }
        });
        btnDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDangNhapKeyPressed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(197, 112, 34));
        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setText("Tho??t");
        btnThoat.setBorderPainted(false);
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnDangNhapLayout = new javax.swing.GroupLayout(pnDangNhap);
        pnDangNhap.setLayout(pnDangNhapLayout);
        pnDangNhapLayout.setHorizontalGroup(
            pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDangNhapLayout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDangNhapLayout.createSequentialGroup()
                        .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbMatKhau)
                            .addComponent(lbTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMatKhau)
                            .addComponent(jSeparator1)
                            .addComponent(txtTenDN, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDangNhapLayout.createSequentialGroup()
                        .addComponent(lbTitle)
                        .addGap(119, 119, 119))))
        );
        pnDangNhapLayout.setVerticalGroup(
            pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDangNhapLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lbTitle)
                .addGap(56, 56, 56)
                .addComponent(lbTenDN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lbMatKhau)
                .addGap(10, 10, 10)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnDangNhap)
                .addGap(18, 18, 18)
                .addComponent(btnThoat)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pnMain.add(pnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 300, 450));

        getContentPane().add(pnMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 710, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenDNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenDNFocusGained
        // TODO add your handling code here:
        //txtTenDN.setText("");
    }//GEN-LAST:event_txtTenDNFocusGained

    private void txtMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauActionPerformed

    private void txtMatKhauFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMatKhauFocusGained
        // TODO add your handling code here:
        txtMatKhau.setText("");
    }//GEN-LAST:event_txtMatKhauFocusGained

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        ThoatChuongTrinh thoat = new ThoatChuongTrinh(this, true);
        thoat.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnDangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseClicked
        // TODO add your handling code here:
        String user, pass;
        user = txtTenDN.getText();
        pass = txtMatKhau.getText();

        TaiKhoan tk = new TaiKhoan();
        tk.setTenDN(user);
        tk.setMatKhau(pass);
        boolean check = TaiKhoanDAO.ktraLogin(tk);
        
        if(check == true){
            Run.tk = TaiKhoanDAO.layTaiKhoan(user, pass);
            //int lv = Run.tk.getPhanQuyen();
            maNV = Run.tk.getMaNV();
            this.setVisible(false);
            Run.QLCF();
        }else{
            JOptionPane.showMessageDialog(null, "T??i kho???n ho???c m???t kh???u kh??ng ????ng", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDangNhapMouseClicked

    private void btnDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangNhapKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String user, pass;
            user = txtTenDN.getText();
            pass = txtMatKhau.getText();

            TaiKhoan tk = new TaiKhoan();
            tk.setTenDN(user);
            tk.setMatKhau(pass);
            boolean check = TaiKhoanDAO.ktraLogin(tk);

            if(check == true){
                Run.tk = TaiKhoanDAO.layTaiKhoan(user, pass);
                //int lv = Run.tk.getPhanQuyen();
                maNV = NhanVienDAO.layMaNV(Run.tk);
                this.setVisible(false);
                Run.QLCF();
            }else{
                JOptionPane.showMessageDialog(null, "T??i kho???n ho???c m???t kh???u kh??ng ????ng", "Login Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDangNhapKeyPressed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnThoat;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbMatKhau;
    private javax.swing.JLabel lbTenDN;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbimage;
    private javax.swing.JPanel pnDangNhap;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDN;
    // End of variables declaration//GEN-END:variables

    private void display() {
        this.setTitle("Log in");
        this.setSize(750,500);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0,0,0,0));
        pnMain.setBackground(new Color(0,0,0,0));
    }
    
    

    
    
}
