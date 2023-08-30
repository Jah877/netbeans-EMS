import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class editEmployeeFrame extends javax.swing.JFrame {
    private MyHashTable mainHT;
    private boolean flag;

    /**
     * Creates new form editEmployeeFrame
     */
    public editEmployeeFrame() {
        initComponents();
        FTEIntFrame.setVisible(false);
        PTEIntFrame.setVisible(false);
        pack();
    }
    
    public void setMainHT (MyHashTable theRefVal){
        mainHT = theRefVal;
        System.out.println("EDIT EMPLOYEE IS LIVE");
        
        flag = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        empNumField = new javax.swing.JTextField();
        loadButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        statusTeller = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        empNumEntry = new javax.swing.JTextField();
        firstNameEntry = new javax.swing.JTextField();
        lastNameEntry = new javax.swing.JTextField();
        genderEntry = new javax.swing.JTextField();
        locationEntry = new javax.swing.JTextField();
        deductRateEntry = new javax.swing.JTextField();
        FTERadButt = new javax.swing.JRadioButton();
        PTERadButt = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        FTEIntFrame = new javax.swing.JInternalFrame();
        jLabel11 = new javax.swing.JLabel();
        salaryEntry = new javax.swing.JTextField();
        PTEIntFrame = new javax.swing.JInternalFrame();
        jLabel12 = new javax.swing.JLabel();
        wageEntry = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        hoursEntry = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        weeksEntry = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jLabel1.setText("Edit Employee Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 6, -1, -1));

        jLabel2.setText("Enter an employee number to load an employee that you wish to edit:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 55, -1, -1));
        getContentPane().add(empNumField, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 52, 142, -1));

        loadButton.setText("Load");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 52, -1, -1));

        jLabel3.setText("Employee Selected:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 92, -1, -1));

        statusTeller.setText("No Employee Currently Selected");
        getContentPane().add(statusTeller, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 92, -1, -1));

        jLabel4.setText("Employee Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 136, -1, -1));

        jLabel5.setText("First Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 176, -1, -1));

        jLabel6.setText("Last Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 213, -1, -1));

        jLabel7.setText("Gender (M:1, F:2, O:3)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 253, -1, -1));

        jLabel8.setText("Location (TO: 1, MI: 2)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 293, -1, -1));

        jLabel9.setText("Deduct Rate");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 333, -1, -1));
        getContentPane().add(empNumEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 133, 332, -1));
        getContentPane().add(firstNameEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 173, 332, -1));
        getContentPane().add(lastNameEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 213, 332, -1));
        getContentPane().add(genderEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 253, 332, -1));
        getContentPane().add(locationEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 293, 332, -1));
        getContentPane().add(deductRateEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 333, 332, -1));

        FTERadButt.setText("Full Time Employee");
        FTERadButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTERadButtActionPerformed(evt);
            }
        });
        getContentPane().add(FTERadButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 401, -1, -1));

        PTERadButt.setText("Part Time Employee");
        PTERadButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PTERadButtActionPerformed(evt);
            }
        });
        getContentPane().add(PTERadButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 401, -1, -1));

        jLabel10.setText("Select:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 367, -1, -1));

        FTEIntFrame.setVisible(true);

        jLabel11.setText("Salary ($)");

        javax.swing.GroupLayout FTEIntFrameLayout = new javax.swing.GroupLayout(FTEIntFrame.getContentPane());
        FTEIntFrame.getContentPane().setLayout(FTEIntFrameLayout);
        FTEIntFrameLayout.setHorizontalGroup(
            FTEIntFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FTEIntFrameLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(salaryEntry, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
        );
        FTEIntFrameLayout.setVerticalGroup(
            FTEIntFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FTEIntFrameLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(salaryEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 189, Short.MAX_VALUE))
        );

        getContentPane().add(FTEIntFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 439, -1, 281));

        PTEIntFrame.setVisible(true);

        jLabel12.setText("Hourly Wage ($)");

        jLabel13.setText("Hours Per Week");

        jLabel14.setText("Weeks Per Year");

        javax.swing.GroupLayout PTEIntFrameLayout = new javax.swing.GroupLayout(PTEIntFrame.getContentPane());
        PTEIntFrame.getContentPane().setLayout(PTEIntFrameLayout);
        PTEIntFrameLayout.setHorizontalGroup(
            PTEIntFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wageEntry)
            .addComponent(hoursEntry)
            .addGroup(PTEIntFrameLayout.createSequentialGroup()
                .addGroup(PTEIntFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(0, 108, Short.MAX_VALUE))
            .addComponent(weeksEntry)
        );
        PTEIntFrameLayout.setVerticalGroup(
            PTEIntFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PTEIntFrameLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(wageEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(hoursEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(weeksEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        getContentPane().add(PTEIntFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 439, -1, -1));

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 670, -1, -1));

        editButton.setText("Exit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 670, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_editButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
try {
    int theEmpNum = Integer.parseInt(empNumField.getText());
    
    EmployeeInfo foundEmployee = mainHT.getEmployee(theEmpNum);
    
    if (foundEmployee!= null){
        // Employee found, load all the given fields
        statusTeller.setVisible(false);
        flag = true;
        
        if (foundEmployee instanceof FTE){
            FTE theFTE = (FTE) foundEmployee;
            
            FTEIntFrame.setVisible(true);
            PTEIntFrame.setVisible(false);
            
            empNumEntry.setText(String.valueOf(foundEmployee.empNum));
            firstNameEntry.setText(foundEmployee.firstName);
            lastNameEntry.setText(foundEmployee.lastName);
            genderEntry.setText(String.valueOf(((FTE) foundEmployee).gender));
            locationEntry.setText(String.valueOf(((FTE) foundEmployee).workLoc));
            deductRateEntry.setText(String.valueOf(((FTE) foundEmployee).deductRate));
            salaryEntry.setText(String.valueOf(((FTE) foundEmployee).yearlySalary));
            
        }
        
        if (foundEmployee instanceof PTE) {
            PTE thePTE = (PTE) foundEmployee;
            PTEIntFrame.setVisible(true);
            FTEIntFrame.setVisible(false);
            
            empNumEntry.setText(String.valueOf(((PTE) foundEmployee).empNum));
            firstNameEntry.setText(foundEmployee.firstName);
            lastNameEntry.setText(((PTE) foundEmployee).lastName);
            genderEntry.setText(String.valueOf(((PTE) foundEmployee).gender));
            locationEntry.setText(String.valueOf(((PTE) foundEmployee).workLoc));
            deductRateEntry.setText(String.valueOf(((PTE) foundEmployee).deductRate));
            wageEntry.setText(String.valueOf(((PTE) foundEmployee).hourlyWage));
            hoursEntry.setText(String.valueOf(((PTE) foundEmployee).hoursPerWeek));
            weeksEntry.setText(String.valueOf(((PTE) foundEmployee).weeksPerYear));
        
        }
        
    } else {
        // set all fields to blank
            empNumEntry.setText("");
            firstNameEntry.setText("");
            lastNameEntry.setText("");
            genderEntry.setText("");
            locationEntry.setText("");
            deductRateEntry.setText("");
            salaryEntry.setText("");
            wageEntry.setText("");
            hoursEntry.setText("");
            weeksEntry.setText("");
        
        statusTeller.setVisible(true);
        throw new IllegalArgumentException("Employee not found.");
        
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Invalid number format. Please enter valid numeric values.");
} catch (IllegalArgumentException e) {
    JOptionPane.showMessageDialog(null, e.getMessage());
}
    }//GEN-LAST:event_loadButtonActionPerformed

    private void FTERadButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTERadButtActionPerformed
        FTEIntFrame.setVisible(true);
        PTEIntFrame.setVisible(false);
    }//GEN-LAST:event_FTERadButtActionPerformed

    private void PTERadButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PTERadButtActionPerformed
        PTEIntFrame.setVisible(true);
        FTEIntFrame.setVisible(false);
    }//GEN-LAST:event_PTERadButtActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
try {
    int theEmpNum = Integer.parseInt(empNumEntry.getText());
    String theFirstName = firstNameEntry.getText();
    String theLastName = lastNameEntry.getText();

    int theGender = Integer.parseInt(genderEntry.getText());

    // validate gender range
    if (theGender <= 0 || theGender > 3){
        throw new IllegalArgumentException("Gender option is not in range;");
    }

    int theWorkLoc = Integer.parseInt(locationEntry.getText());

    // validate work location range
    if (theWorkLoc <= 0 || theWorkLoc > 2) {
        throw new IllegalArgumentException("Work location option is not in range.");
    }


    String strDR = deductRateEntry.getText();
    double dDeductRate = Double.parseDouble(strDR);

    // validate the deduct rate
    if (dDeductRate < 0 || dDeductRate > 0.99){
        throw new IllegalArgumentException("Deduct rate must be between 0 and 0.99.");
    }

    // Retrieve the existing employee from the hashtable
    
    EmployeeInfo foundEmployee = mainHT.getEmployee(theEmpNum);
    
    if (foundEmployee != null) {
        // Create a new instance of EmployeeInfo with ypdated values
        EmployeeInfo updatedEmployee = null;
   
        // FULL TIME EMPLOYEE HANDLING

        if (FTERadButt.isSelected()){
            String strSalary = salaryEntry.getText();
            double dSalary = Double.parseDouble(strSalary);

            // Validate Salary Range
            if (dSalary <= 0) {
                throw new IllegalArgumentException("Salary must be greater than zero.");
            }
            
            updatedEmployee = new FTE(theEmpNum, theFirstName, theLastName, theGender, theWorkLoc, dDeductRate, dSalary);
        }

        // PART TIME EMPLOYEE HANDLING 
        if (PTERadButt.isSelected()){
            String strHourlyWage = wageEntry.getText();
            double theHourlyWage = Double.parseDouble (strHourlyWage);

            // Validate Wage range
            if (theHourlyWage <= 0) {
                throw new IllegalArgumentException("Hourly wage must be greater than zero.");
            }

            String strHoursPerWeek = hoursEntry.getText();
            double theHoursPerWeek = Double.parseDouble(strHoursPerWeek);

            // Validate Hours Per Week Range
            if (theHoursPerWeek <= 0 || theHoursPerWeek > 168) {
                throw new IllegalArgumentException("Hours per week must be between 1 and 168.");
            }

            String strWeeksPerYear = weeksEntry.getText();
            double theWeeksPerYear = Double.parseDouble(strWeeksPerYear);

            // Validate Weeks per Year Range
            if (theWeeksPerYear <= 0 || theWeeksPerYear > 52 ) {
                throw new IllegalArgumentException ("Weeks per year must be between 1 and 52.");
            }
        
            updatedEmployee = new PTE (theEmpNum, theFirstName, theLastName, theGender, theWorkLoc,dDeductRate, theHourlyWage, theHoursPerWeek, theWeeksPerYear);
        }
        
        if (updatedEmployee != null) {
                // Remove the old employee reference from the hashtable
                mainHT.removeEmployee(foundEmployee.empNum);

                // Add the updated employee to the hashtable
                if (mainHT.addEmployee(updatedEmployee)) {
                    JOptionPane.showMessageDialog(null, updatedEmployee.firstName + " " + updatedEmployee.lastName + " Updated Successfully!" + "Click to Edit a New Employee");
                } else {
                    throw new IllegalArgumentException("Employee with the same number already exists in the system!");
                }
            }
        
        empNumEntry.setText("");
        firstNameEntry.setText("");
        lastNameEntry.setText("");
        genderEntry.setText("");
        locationEntry.setText("");
        deductRateEntry.setText("");
        salaryEntry.setText("");
        wageEntry.setText("");
        hoursEntry.setText("");
        weeksEntry.setText("");
        statusTeller.setVisible(true);
    } else {
        throw new IllegalArgumentException("Employee not found.");
    }
    
} catch (NumberFormatException e) {
    // Handle invalid number format in input fields
    JOptionPane.showMessageDialog(null, "Invalid number format. Please enter valid numeric values.");
} catch (IllegalArgumentException e) {
    JOptionPane.showMessageDialog(null, e.getMessage());
}
    }//GEN-LAST:event_updateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(editEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame FTEIntFrame;
    private javax.swing.JRadioButton FTERadButt;
    private javax.swing.JInternalFrame PTEIntFrame;
    private javax.swing.JRadioButton PTERadButt;
    private javax.swing.JTextField deductRateEntry;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField empNumEntry;
    private javax.swing.JTextField empNumField;
    private javax.swing.JTextField firstNameEntry;
    private javax.swing.JTextField genderEntry;
    private javax.swing.JTextField hoursEntry;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameEntry;
    private javax.swing.JButton loadButton;
    private javax.swing.JTextField locationEntry;
    private javax.swing.JTextField salaryEntry;
    private javax.swing.JLabel statusTeller;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField wageEntry;
    private javax.swing.JTextField weeksEntry;
    // End of variables declaration//GEN-END:variables
}
