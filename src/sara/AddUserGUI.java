/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

//THIS IS CASEYS PUSH RIGHT HERE
//Hopefully this work cause that would be awesome!
//Once more please lets see
 */

package sara;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Casey
 */
public class AddUserGUI extends javax.swing.JFrame implements Serializable{
private static ReservationSystem resSystem;
    /**
     * Creates new form AddUserGUI
     
    public AddUserGUI() {
        initComponents();
    }*/

    AddUserGUI(ReservationSystem resSystem) {
        this.resSystem = resSystem;
        initComponents(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FacultyRadio = new javax.swing.ButtonGroup();
        AdminRadio = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        UserIDField = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        EMailField = new javax.swing.JTextField();
        FacultyYes = new javax.swing.JRadioButton();
        FacultyNo = new javax.swing.JRadioButton();
        AdminYes = new javax.swing.JRadioButton();
        AdminNo = new javax.swing.JRadioButton();
        AddUserAdd = new javax.swing.JButton();
        AddUserCancel = new javax.swing.JButton();
        DepartmentLabel = new javax.swing.JLabel();
        DepartmentField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        PhoneLabel = new javax.swing.JLabel();
        PhoneField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SARA - Add User");

        jLabel2.setText("UserId");

        jLabel3.setText("Name");

        jLabel4.setText("E-Mail");

        jLabel5.setText("Password");

        jLabel6.setText("Faculty");

        jLabel7.setText("Admin");

        FacultyRadio.add(FacultyYes);
        FacultyYes.setText("Yes");

        FacultyRadio.add(FacultyNo);
        FacultyNo.setText("No");

        AdminRadio.add(AdminYes);
        AdminYes.setText("Yes");
        AdminYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminYesActionPerformed(evt);
            }
        });

        AdminRadio.add(AdminNo);
        AdminNo.setText("No");
        AdminNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminNoActionPerformed(evt);
            }
        });

        AddUserAdd.setText("Add");
        AddUserAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserAddActionPerformed(evt);
            }
        });

        AddUserCancel.setText("Cancel");
        AddUserCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUserCancelActionPerformed(evt);
            }
        });

        DepartmentLabel.setText("Department");

        PasswordField.setText("jPasswordField1");

        PhoneLabel.setText("Phone");

        PhoneField.setText("(xxx)xxx-xxxx");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DepartmentLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel2))
                                            .addGap(42, 42, 42))
                                        .addComponent(AddUserAdd, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EMailField)
                                    .addComponent(PasswordField)
                                    .addComponent(NameField)
                                    .addComponent(UserIDField)
                                    .addComponent(DepartmentField)
                                    .addComponent(PhoneField)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(AddUserCancel))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(FacultyYes)
                                                .addGap(18, 18, 18)
                                                .addComponent(FacultyNo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addComponent(AdminYes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(AdminNo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 43, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(PhoneLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(UserIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(EMailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepartmentLabel)
                    .addComponent(DepartmentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FacultyNo)
                        .addComponent(FacultyYes))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AdminNo)
                        .addComponent(AdminYes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PhoneLabel)
                    .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddUserAdd)
                    .addComponent(AddUserCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminYesActionPerformed
        PhoneLabel.setVisible(AdminYes.isSelected());
        PhoneField.setVisible(AdminYes.isSelected());
    }//GEN-LAST:event_AdminYesActionPerformed

    private void AdminNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminNoActionPerformed
        PhoneLabel.setVisible(false);
        PhoneField.setVisible(false);
    }//GEN-LAST:event_AdminNoActionPerformed

    private void AddUserCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserCancelActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_AddUserCancelActionPerformed

    private void AddUserAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUserAddActionPerformed
        //Add User Clicked
        try { 
        Integer.parseInt(UserIDField.getText()); 
        } catch(NumberFormatException e) { 
        JOptionPane.showMessageDialog(null, "Please enter in a valid UserID");
        return; 
       }     
        if(AdminYes.isSelected())
           resSystem.addAdmin(Integer.parseInt(UserIDField.getText()), NameField.getText(), EMailField.getText(),PasswordField.getPassword(), FacultyYes.isSelected(), PhoneField.getText()); 
        else
            resSystem.addUser(Integer.parseInt(UserIDField.getText()), NameField.getText(), EMailField.getText(),PasswordField.getPassword(), FacultyYes.isSelected(), DepartmentField.getText() );
        ReservationSystem.save(resSystem);
        JOptionPane.showMessageDialog(null, "User Added");
        this.setVisible(false);
    }//GEN-LAST:event_AddUserAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUserAdd;
    private javax.swing.JButton AddUserCancel;
    private javax.swing.JRadioButton AdminNo;
    private javax.swing.ButtonGroup AdminRadio;
    private javax.swing.JRadioButton AdminYes;
    private javax.swing.JTextField DepartmentField;
    private javax.swing.JLabel DepartmentLabel;
    private javax.swing.JTextField EMailField;
    private javax.swing.JRadioButton FacultyNo;
    private javax.swing.ButtonGroup FacultyRadio;
    private javax.swing.JRadioButton FacultyYes;
    private javax.swing.JTextField NameField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField PhoneField;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField UserIDField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
