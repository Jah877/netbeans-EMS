
public class Main_jFrame extends javax.swing.JFrame {
    
    // ATTRIBUTES
   public MyHashTable theHT;
   
   // CONSTRUCTORS
   

    /**
     * Creates new form Main_jFrame
     */
    public Main_jFrame() {
        initComponents();
        
        theHT = new MyHashTable(10);
        System.out.println("MAIN ACTIVATED");
    }
    
    // METHODS
    
    public MyHashTable getTheHt() {
        return theHT;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileButton = new javax.swing.JButton();
        addEmpButton = new javax.swing.JButton();
        remEmpButton = new javax.swing.JButton();
        dispButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        empSearchButton = new javax.swing.JButton();
        editEmpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileButton.setBackground(new java.awt.Color(204, 204, 255));
        fileButton.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        fileButton.setText("File");
        fileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileButtonActionPerformed(evt);
            }
        });

        addEmpButton.setBackground(new java.awt.Color(204, 204, 255));
        addEmpButton.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        addEmpButton.setText("Add Employee");
        addEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpButtonActionPerformed(evt);
            }
        });

        remEmpButton.setBackground(new java.awt.Color(204, 204, 255));
        remEmpButton.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        remEmpButton.setText("Remove Employee");
        remEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remEmpButtonActionPerformed(evt);
            }
        });

        dispButton.setBackground(new java.awt.Color(204, 204, 255));
        dispButton.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        dispButton.setText("Display Employee System");
        dispButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jLabel1.setText("Employee Management System");

        empSearchButton.setBackground(new java.awt.Color(204, 204, 255));
        empSearchButton.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        empSearchButton.setText("Employee Search");
        empSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empSearchButtonActionPerformed(evt);
            }
        });

        editEmpButton.setBackground(new java.awt.Color(204, 204, 255));
        editEmpButton.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 18)); // NOI18N
        editEmpButton.setText("Edit Employee");
        editEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(empSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel1))
                        .addComponent(fileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(remEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dispButton, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(editEmpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(fileButton)
                .addGap(18, 18, 18)
                .addComponent(addEmpButton)
                .addGap(18, 18, 18)
                .addComponent(remEmpButton)
                .addGap(18, 18, 18)
                .addComponent(dispButton)
                .addGap(18, 18, 18)
                .addComponent(empSearchButton)
                .addGap(18, 18, 18)
                .addComponent(editEmpButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpButtonActionPerformed
        AddNewEmployee_jFrame theANEJFrame = new AddNewEmployee_jFrame();
        theANEJFrame.setVisible(true);
        theANEJFrame.setMainHT(theHT);
    }//GEN-LAST:event_addEmpButtonActionPerformed

    private void remEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remEmpButtonActionPerformed
        RemoveEmployee theRemEmpJFrame = new RemoveEmployee();
        theRemEmpJFrame.setVisible(true);
        theRemEmpJFrame.setMainHT(theHT);
    }//GEN-LAST:event_remEmpButtonActionPerformed

    private void fileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileButtonActionPerformed
        fileFrame theFF = new fileFrame();
        theFF.setVisible(true);
        theFF.setMainHT(theHT);
    }//GEN-LAST:event_fileButtonActionPerformed

    private void dispButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispButtonActionPerformed
        DisplayEmployee theNumItems_jFrame = new DisplayEmployee();
        theNumItems_jFrame.setVisible(true);
        theNumItems_jFrame.setMainHT(theHT);
        
    }//GEN-LAST:event_dispButtonActionPerformed

    private void empSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empSearchButtonActionPerformed
        EmployeeSearchFrame theEmpSearchFrame = new EmployeeSearchFrame();
        theEmpSearchFrame.setVisible(true);
        theEmpSearchFrame.setMainHT(theHT);
    }//GEN-LAST:event_empSearchButtonActionPerformed

    private void editEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmpButtonActionPerformed
        editEmployeeFrame theEditFrame = new editEmployeeFrame();
        theEditFrame.setVisible(true);
        theEditFrame.setMainHT(theHT);
    }//GEN-LAST:event_editEmpButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_jFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_jFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmpButton;
    private javax.swing.JButton dispButton;
    private javax.swing.JButton editEmpButton;
    private javax.swing.JButton empSearchButton;
    private javax.swing.JButton fileButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton remEmpButton;
    // End of variables declaration//GEN-END:variables
}
