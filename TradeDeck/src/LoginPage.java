
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;

public class LoginPage extends javax.swing.JFrame {
    static String username;
   
    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        loginPage_Container = new javax.swing.JPanel();
        loginPage_leftContainer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LoginForm_Container = new javax.swing.JPanel();
        Login_Heading = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Username_input = new javax.swing.JTextField();
        Username = new javax.swing.JLabel();
        Password_input = new javax.swing.JPasswordField();
        submit_button = new javax.swing.JButton();
        RegisterPageRoute = new javax.swing.JButton();
        LoginPage_Heading = new javax.swing.JLabel();
        LoginPage_tagline = new javax.swing.JLabel();
        forgotPassword_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPage_Container.setBackground(new java.awt.Color(255, 51, 51));

        loginPage_leftContainer.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/TradeDeck.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 200));

        org.jdesktop.layout.GroupLayout loginPage_leftContainerLayout = new org.jdesktop.layout.GroupLayout(loginPage_leftContainer);
        loginPage_leftContainer.setLayout(loginPage_leftContainerLayout);
        loginPage_leftContainerLayout.setHorizontalGroup(
            loginPage_leftContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, loginPage_leftContainerLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginPage_leftContainerLayout.setVerticalGroup(
            loginPage_leftContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(loginPage_leftContainerLayout.createSequentialGroup()
                .add(76, 76, 76)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 198, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LoginForm_Container.setBackground(new java.awt.Color(255, 102, 102));

        Login_Heading.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Login_Heading.setForeground(new java.awt.Color(255, 255, 255));
        Login_Heading.setText("Login");

        Password.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Password.setText("Password :");
        Password.setToolTipText("Enter the password");

        Username_input.setBackground(new java.awt.Color(255, 102, 102));
        Username_input.setToolTipText("Enter your Username");
        Username_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Username.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Username.setText("Username :");

        Password_input.setBackground(new java.awt.Color(255, 102, 102));
        Password_input.setToolTipText("Enter the password");
        Password_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        submit_button.setBackground(new java.awt.Color(0, 51, 204));
        submit_button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submit_button.setForeground(new java.awt.Color(255, 255, 255));
        submit_button.setText("Login");
        submit_button.setBorder(null);
        submit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_buttonActionPerformed(evt);
            }
        });

        RegisterPageRoute.setBackground(new java.awt.Color(255, 51, 51));
        RegisterPageRoute.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RegisterPageRoute.setForeground(new java.awt.Color(255, 255, 255));
        RegisterPageRoute.setText("New User?");
        RegisterPageRoute.setBorder(null);
        RegisterPageRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterPageRouteActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout LoginForm_ContainerLayout = new org.jdesktop.layout.GroupLayout(LoginForm_Container);
        LoginForm_Container.setLayout(LoginForm_ContainerLayout);
        LoginForm_ContainerLayout.setHorizontalGroup(
            LoginForm_ContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(LoginForm_ContainerLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(LoginForm_ContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(LoginForm_ContainerLayout.createSequentialGroup()
                        .add(Login_Heading)
                        .add(85, 85, 85))
                    .add(LoginForm_ContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, LoginForm_ContainerLayout.createSequentialGroup()
                            .add(submit_button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(RegisterPageRoute, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, LoginForm_ContainerLayout.createSequentialGroup()
                            .add(LoginForm_ContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(Username, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(Password, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(LoginForm_ContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(Password_input, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(Username_input, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 143, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        LoginForm_ContainerLayout.setVerticalGroup(
            LoginForm_ContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(LoginForm_ContainerLayout.createSequentialGroup()
                .add(20, 20, 20)
                .add(Login_Heading)
                .add(19, 19, 19)
                .add(LoginForm_ContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Username_input, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Username, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(LoginForm_ContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Password_input, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Password, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(18, 18, 18)
                .add(LoginForm_ContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(submit_button, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .add(RegisterPageRoute, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(22, 22, 22))
        );

        LoginPage_Heading.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LoginPage_Heading.setForeground(new java.awt.Color(255, 255, 255));
        LoginPage_Heading.setText("TradeDeck");

        LoginPage_tagline.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        LoginPage_tagline.setForeground(new java.awt.Color(255, 255, 255));
        LoginPage_tagline.setText("Welcome to TradeVerse");

        forgotPassword_button.setBackground(new java.awt.Color(255, 51, 51));
        forgotPassword_button.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        forgotPassword_button.setForeground(new java.awt.Color(255, 255, 255));
        forgotPassword_button.setText("Forgot Password?");
        forgotPassword_button.setBorder(null);
        forgotPassword_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPassword_buttonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout loginPage_ContainerLayout = new org.jdesktop.layout.GroupLayout(loginPage_Container);
        loginPage_Container.setLayout(loginPage_ContainerLayout);
        loginPage_ContainerLayout.setHorizontalGroup(
            loginPage_ContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(loginPage_ContainerLayout.createSequentialGroup()
                .add(loginPage_leftContainer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(loginPage_ContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(loginPage_ContainerLayout.createSequentialGroup()
                        .add(65, 65, 65)
                        .add(loginPage_ContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(LoginPage_Heading)
                            .add(loginPage_ContainerLayout.createSequentialGroup()
                                .add(25, 25, 25)
                                .add(LoginPage_tagline)))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, loginPage_ContainerLayout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 46, Short.MAX_VALUE)
                        .add(loginPage_ContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(forgotPassword_button)
                            .add(LoginForm_Container, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(35, 35, 35))))
        );
        loginPage_ContainerLayout.setVerticalGroup(
            loginPage_ContainerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(loginPage_leftContainer, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(loginPage_ContainerLayout.createSequentialGroup()
                .add(19, 19, 19)
                .add(LoginPage_Heading)
                .add(1, 1, 1)
                .add(LoginPage_tagline)
                .add(18, 18, 18)
                .add(LoginForm_Container, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(forgotPassword_button)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(loginPage_Container, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(loginPage_Container, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
    
    
    private void submit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_buttonActionPerformed
        String Username = Username_input.getText();
        String Password = String.valueOf(Password_input.getPassword());
        try {
            PreparedStatement ps;
            ResultSet rs;
            
            String HashedPassword = HashedPassword(Password);
            String query = "SELECT * FROM user_details WHERE UserName='"+Username+"' AND Password='"+HashedPassword+"';";
            
            //Establishing connection to sql server
            ps = SqlConnection.getConnection().prepareStatement(query);
            rs= ps.executeQuery();//storing the result of execution in rs
            if(rs.next()){
                MainScreen ms = new MainScreen();
                ms.username=Username;
                ms.setVisible(true);
                ms.pack();
                ms.setLocationRelativeTo(null);
                ms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Invalid credentials");

            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submit_buttonActionPerformed

    private void RegisterPageRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterPageRouteActionPerformed
        // TODO add your handling code here:
        RegisterPage rp = new RegisterPage();
        rp.setVisible(true);
        rp.pack();
        rp.setLocationRelativeTo(null);
        rp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_RegisterPageRouteActionPerformed

    private void forgotPassword_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPassword_buttonActionPerformed
        // TODO add your handling code here:
        ForgotPassword fp = new ForgotPassword();
        fp.setVisible(true);
        fp.pack();
        fp.setLocationRelativeTo(null);
        fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_forgotPassword_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginForm_Container;
    private javax.swing.JLabel LoginPage_Heading;
    private javax.swing.JLabel LoginPage_tagline;
    private javax.swing.JLabel Login_Heading;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField Password_input;
    private javax.swing.JButton RegisterPageRoute;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField Username_input;
    private javax.swing.JButton forgotPassword_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel loginPage_Container;
    private javax.swing.JPanel loginPage_leftContainer;
    private javax.swing.JButton submit_button;
    // End of variables declaration//GEN-END:variables
}
