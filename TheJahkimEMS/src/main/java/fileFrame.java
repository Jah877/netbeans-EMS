import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class fileFrame extends javax.swing.JFrame {
    private MyHashTable mainHT;
    private String filePath;
    /**
     * Creates new form fileFrame
     */
    public fileFrame() {
        initComponents();
       
    }
    
    public void setMainHT(MyHashTable theRefVal){
        mainHT = theRefVal;
        System.out.println("FILE IS LIVE");
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
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jLabel1.setText("File Menu");

        saveButton.setText("Save Current File");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        loadButton.setText("Load Existing File");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(saveButton))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loadButton)))
                        .addGap(0, 209, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exitButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addGap(18, 18, 18)
                .addComponent(loadButton)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed
private void saveHashtableToFile(String filePath) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        // Write each employee's information to the file
        for (int i = 0; i < mainHT.buckets.length; i++) {
            ArrayList<EmployeeInfo> bucket = mainHT.buckets[i];
            for (EmployeeInfo employee : bucket) {
                writer.write(employee.getEmpNum() + "/" +
                        employee.getFirstName() + "/" +
                        employee.getLastName() + "/" +
                        employee.getGender() + "/" +
                        employee.getWorkLoc() + "/" +
                        employee.getDeductRate());

                if (employee instanceof FTE) {
                    writer.write("/FTE/" + ((FTE) employee).getYearlySalary());
                } else if (employee instanceof PTE) {
                    writer.write("/PTE/" + ((PTE) employee).getHourlyWage() + "/" +
                            ((PTE) employee).getHoursPerWeek() + "/" +
                            ((PTE) employee).getWeeksPerYear());
                }

                writer.newLine();
            }
        }

        System.out.println("Employee data saved to file: " + filePath);
    } catch (IOException e) {
        System.out.println("Error saving employee data to file: " + e.getMessage());
    }
}  

private void loadHashtableFromFile(String filePath) {
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] employeeData = line.split("/");
            int empNum = Integer.parseInt(employeeData[0]);
            String firstName = employeeData[1];
            String lastName = employeeData[2];
            int gender = Integer.parseInt(employeeData[3]);
            int workLoc = Integer.parseInt(employeeData[4]);
            double deductRate = Double.parseDouble(employeeData[5]);

            if (employeeData[6].equals("FTE")) {
                double yearlySalary = Double.parseDouble(employeeData[7]);
                FTE employee = new FTE(empNum, firstName, lastName, gender, workLoc, deductRate, yearlySalary);
                mainHT.addEmployee(employee);
            } else if (employeeData[6].equals("PTE")) {
                double hourlyWage = Double.parseDouble(employeeData[7]);
                double hoursPerWeek = Double.parseDouble(employeeData[8]);
                double weeksPerYear = Double.parseDouble(employeeData[9]);
                PTE employee = new PTE(empNum, firstName, lastName, gender, workLoc, deductRate, hourlyWage, hoursPerWeek, weeksPerYear);
                mainHT.addEmployee(employee);
            }
        }

        System.out.println("Employee data loaded from file: " + filePath);
    } catch (IOException e) {
        System.out.println("Error loading employee data from file: " + e.getMessage());
    }
}
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int userSelection = fileChooser.showSaveDialog(this);
        
        if (userSelection == JFileChooser.APPROVE_OPTION){
            java.io.File fileToSave = fileChooser.getSelectedFile();
            filePath = fileToSave.getAbsolutePath();
            saveHashtableToFile(filePath);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
    JFileChooser fileChooser = new JFileChooser();
    int userSelection = fileChooser.showOpenDialog(this);
    
    if (userSelection == JFileChooser.APPROVE_OPTION){
        java.io.File fileToLoad = fileChooser.getSelectedFile();
        filePath = fileToLoad.getAbsolutePath();
        loadHashtableFromFile(filePath);
    }
    }//GEN-LAST:event_loadButtonActionPerformed

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
            java.util.logging.Logger.getLogger(fileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fileFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loadButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}