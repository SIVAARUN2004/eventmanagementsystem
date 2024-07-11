/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author S Siva Arunachalam
 */
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class ChangePassword1 extends javax.swing.JFrame {

    Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form UserRegisteration
     */
    public ChangePassword1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        oldPasswordField = new javax.swing.JPasswordField();
        newpasswordlabel = new javax.swing.JLabel();
        newPasswordfield = new javax.swing.JPasswordField();
        usertypelabel = new javax.swing.JLabel();
        usertypeComboBox = new javax.swing.JComboBox<>();
        showpasswordCheckBox = new javax.swing.JCheckBox();
        showpasswordCheckBox1 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        verifybutton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();
        New1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Registeration");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Details to verify", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Name");

        txtUserName.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Old Password");

        oldPasswordField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        newpasswordlabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        newpasswordlabel.setForeground(new java.awt.Color(255, 255, 255));
        newpasswordlabel.setText("New Password");

        newPasswordfield.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        usertypelabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        usertypelabel.setForeground(new java.awt.Color(255, 255, 255));
        usertypelabel.setText("User Type");

        usertypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Admin", "Attendee", "Event Organizer" }));

        showpasswordCheckBox.setText("Show Password");
        showpasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordCheckBoxActionPerformed(evt);
            }
        });

        showpasswordCheckBox1.setText("Show Password");
        showpasswordCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(newpasswordlabel)
                    .addComponent(usertypelabel))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oldPasswordField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(newPasswordfield)
                    .addComponent(usertypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(showpasswordCheckBox))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showpasswordCheckBox1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(showpasswordCheckBox))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newpasswordlabel)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(newPasswordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(showpasswordCheckBox1)))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usertypelabel)
                    .addComponent(usertypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {oldPasswordField, txtUserName});

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        verifybutton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        verifybutton.setText("Verify");
        verifybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifybuttonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        resetbutton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        resetbutton.setText("New");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verifybutton, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(resetbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(resetbutton)
                .addGap(30, 30, 30)
                .addComponent(verifybutton)
                .addGap(43, 43, 43)
                .addComponent(backButton)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        New1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        New1.setText("New");
        New1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(452, 452, 452)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(704, 704, 704)
                    .addComponent(New1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addGap(704, 704, 704)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(198, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(392, 392, 392)
                    .addComponent(New1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(393, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Reset(){
    txtUserName.setText("");
    oldPasswordField.setText("");
    verifybutton.setEnabled(true);
    txtUserName.requestDefaultFocus();
    }
    
    private void verifybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifybuttonActionPerformed
        try{
            con=Connect.ConnectDB();
            if (txtUserName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter user name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String Password= String.valueOf(oldPasswordField.getPassword());
            if (Password.equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter password","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(usertypeComboBox.getSelectedItem().equals("Admin")){
                Statement stmt;
                stmt= con.createStatement();
                String sql1="Select * from adminuser where Username= '" + txtUserName.getText() + "'";
                rs=stmt.executeQuery(sql1);
                String Password1= String.valueOf(oldPasswordField.getPassword());
                String Password2= String.valueOf(newPasswordfield.getPassword());
                if(rs.next()){
                    if(Password1.equals(rs.getString("User_Password"))){
                    if(Password1.equals(Password2)){
                        JOptionPane.showMessageDialog( this, "Password Already used or same as old Password","Error", JOptionPane.ERROR_MESSAGE);
                        newPasswordfield.setText("");
                        txtUserName.requestDefaultFocus();
                        return;
                    }
                    String sql2= "update adminuser set User_Password='" + Password2 + "' where Username='" + txtUserName.getText() + "'";
                    pst=con.prepareStatement(sql2);
                    pst.execute();
                    JOptionPane.showMessageDialog(this,"Password Changed Successfully","User",JOptionPane.INFORMATION_MESSAGE);
                    verifybutton.setEnabled(false);
                    }
                }
                else{
                    JOptionPane.showMessageDialog( this, "User name not exists","Error", JOptionPane.ERROR_MESSAGE);
                    txtUserName.setText("");
                    oldPasswordField.setText("");
                    txtUserName.requestDefaultFocus();
                    return;
                }
            }
            else if(usertypeComboBox.getSelectedItem().equals("Attendee")){
                Statement stmt;
                stmt= con.createStatement();
                String sql1="Select username from attendeeuser where Username= '" + txtUserName.getText() + "'";
                rs=stmt.executeQuery(sql1);
                String Password1= String.valueOf(oldPasswordField.getPassword());
                String Password2= String.valueOf(newPasswordfield.getPassword());
                if(rs.next()){
                    if(Password1.equals(rs.getString("User_Password"))){
                    if(Password1.equals(Password2)){
                        JOptionPane.showMessageDialog( this, "Password Already used or same as old Password","Error", JOptionPane.ERROR_MESSAGE);
                        newPasswordfield.setText("");
                        txtUserName.requestDefaultFocus();
                        return;
                    }
                    String sql2= "update attendeeuser set User_Password='" + Password2 + "' where Username='" + txtUserName.getText() + "'";
                    pst=con.prepareStatement(sql2);
                    pst.execute();
                    JOptionPane.showMessageDialog(this,"Password Changed Successfully","User",JOptionPane.INFORMATION_MESSAGE);
                    verifybutton.setEnabled(false);
                    }
                }
                else{
                    JOptionPane.showMessageDialog( this, "User name not exists","Error", JOptionPane.ERROR_MESSAGE);
                    txtUserName.setText("");
                    oldPasswordField.setText("");
                    txtUserName.requestDefaultFocus();
                    return;
                }
            }
            else if(usertypeComboBox.getSelectedItem().equals("Event Organizer")){
                Statement stmt;
                stmt= con.createStatement();
                String sql1="Select username from eventorguser where Username= '" + txtUserName.getText() + "'";
                rs=stmt.executeQuery(sql1);
                String Password1= String.valueOf(oldPasswordField.getPassword());
                String Password2= String.valueOf(newPasswordfield.getPassword());
                if(rs.next()){
                    if(Password1.equals(rs.getString("User_Password"))){
                    if(Password1.equals(Password2)){
                        JOptionPane.showMessageDialog( this, "Password Already used or same as old Password","Error", JOptionPane.ERROR_MESSAGE);
                        newPasswordfield.setText("");
                        txtUserName.requestDefaultFocus();
                        return;
                    }
                    String sql2= "update eventorguser set User_Password='" + Password2 + "' where Username='" + txtUserName.getText() + "'";
                    pst=con.prepareStatement(sql2);
                    pst.execute();
                    JOptionPane.showMessageDialog(this,"Password Changed Successfully","User",JOptionPane.INFORMATION_MESSAGE);
                    verifybutton.setEnabled(false);
                    }
                }
                else{
                    JOptionPane.showMessageDialog( this, "User name not exists or Incorrect Password","Error", JOptionPane.ERROR_MESSAGE);
                    txtUserName.setText("");
                    oldPasswordField.setText("");
                    txtUserName.requestDefaultFocus();
                    return;
                }
            }
        }
        catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_verifybuttonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Login login=new Login();
        this.hide();
        login.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void New1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New1ActionPerformed
        Reset();
    }//GEN-LAST:event_New1ActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
        // TODO add your handling code here:
            Reset();
    }//GEN-LAST:event_resetbuttonActionPerformed

    private void showpasswordCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordCheckBox1ActionPerformed
        // TODO add your handling code here:
                if(showpasswordCheckBox.isSelected())
        {
            newPasswordfield.setEchoChar((char)0);
        }
        else
        {
            newPasswordfield.setEchoChar('*');
        }
    }//GEN-LAST:event_showpasswordCheckBox1ActionPerformed

    private void showpasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordCheckBoxActionPerformed
        // TODO add your handling code here:
                if(showpasswordCheckBox.isSelected())
        {
            oldPasswordField.setEchoChar((char)0);
        }
        else
        {
            oldPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_showpasswordCheckBoxActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePassword1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ChangePassword1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton New1;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPasswordField newPasswordfield;
    private javax.swing.JLabel newpasswordlabel;
    public javax.swing.JPasswordField oldPasswordField;
    private javax.swing.JButton resetbutton;
    private javax.swing.JCheckBox showpasswordCheckBox;
    private javax.swing.JCheckBox showpasswordCheckBox1;
    public javax.swing.JTextField txtUserName;
    private javax.swing.JComboBox<String> usertypeComboBox;
    private javax.swing.JLabel usertypelabel;
    public javax.swing.JButton verifybutton;
    // End of variables declaration//GEN-END:variables
}
