
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ForgotPassword extends javax.swing.JFrame {

    public ForgotPassword() {
        initComponents();
    }
    public String HashedPassword(String Password) throws NoSuchAlgorithmException{
        MessageDigest messageDigest = MessageDigest.getInstance("SHA");//we are declaring which algorithm to hashed the password
        messageDigest.update(Password.getBytes());//function MessageDigest cannot convert directly into string thats why we are converting it to bytes first
        byte[] resultbyteArray = messageDigest.digest();//importing the output into an array
        StringBuilder sb = new StringBuilder();
        //converting bytes into hex then into strings
        for(byte b:resultbyteArray){
            sb.append(String.format("02x",b));
        }
        return sb.toString();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        newPassword = new javax.swing.JLabel();
        username_input = new javax.swing.JTextField();
        CnfNewPassword = new javax.swing.JLabel();
        submit_button = new javax.swing.JButton();
        newPassword_input = new javax.swing.JPasswordField();
        CnfNewPassword_input = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Your Username :");

        newPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        newPassword.setForeground(new java.awt.Color(255, 255, 255));
        newPassword.setText("Enter New Password :");

        CnfNewPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CnfNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        CnfNewPassword.setText("Confirm Password :");

        submit_button.setBackground(new java.awt.Color(0, 51, 204));
        submit_button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submit_button.setForeground(new java.awt.Color(255, 255, 255));
        submit_button.setText("Submit");
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        newPassword_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPassword_inputActionPerformed(evt);
            }
        });

        CnfNewPassword_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnfNewPassword_inputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CnfNewPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username_input, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(newPassword_input)
                            .addComponent(CnfNewPassword_input)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(submit_button)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPassword_input, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CnfNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CnfNewPassword_input, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(submit_button)
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        // TODO add your handling code here:
        String UserName = username_input.getText();
        String Password = String.valueOf(newPassword_input.getPassword());
        String CnfPassword = String.valueOf(CnfNewPassword_input.getPassword());
        if(!Password.equals(CnfPassword)){
            JOptionPane.showMessageDialog(null,"Password Doesn't Matched");
        }else{
            try {
               String HashedPassword = HashedPassword(Password);
               PreparedStatement ps;
               String query="UPDATE USER_DETAILS SET PASSWORD='"+HashedPassword+"' WHERE USERNAME='"+UserName+"';";
               ps=SqlConnection.getConnection().prepareStatement(query);
               if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Password Changed Successfully");
                    LoginPage lp = new LoginPage();
                    lp.setVisible(true);
                    lp.pack();
                    lp.setLocationRelativeTo(null);
                    lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    this.dispose();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(RegisterPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void newPassword_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPassword_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newPassword_inputActionPerformed

    private void CnfNewPassword_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CnfNewPassword_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CnfNewPassword_inputActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CnfNewPassword;
    private javax.swing.JPasswordField CnfNewPassword_input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel newPassword;
    private javax.swing.JPasswordField newPassword_input;
    private javax.swing.JButton submit_button;
    private javax.swing.JTextField username_input;
    // End of variables declaration//GEN-END:variables
}
