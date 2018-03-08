/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author Gunea-Lasagno-Prisecaru
 */
public class ClientGUI extends javax.swing.JFrame {

    /**
     * Creates new form ClientGUI1
     */
    public ClientGUI() {
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

        addQuizAnswers = new javax.swing.ButtonGroup();
        TabbedPane = new javax.swing.JTabbedPane();
        homeTab = new javax.swing.JPanel();
        addQuizTab = new javax.swing.JPanel();
        questionLabel = new javax.swing.JLabel();
        questionTextField = new javax.swing.JTextField();
        correctAnswerButton1 = new javax.swing.JRadioButton();
        answerTextField1 = new javax.swing.JTextField();
        correctAnswerButton2 = new javax.swing.JRadioButton();
        answerTextField2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout homeTabLayout = new javax.swing.GroupLayout(homeTab);
        homeTab.setLayout(homeTabLayout);
        homeTabLayout.setHorizontalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        homeTabLayout.setVerticalGroup(
            homeTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        TabbedPane.addTab("Home", homeTab);

        questionLabel.setText("Question :");

        questionTextField.setText("jTextField1");
        questionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionTextFieldActionPerformed(evt);
            }
        });

        addQuizAnswers.add(correctAnswerButton1);
        correctAnswerButton1.setText("Answer 1");
        correctAnswerButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        correctAnswerButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correctAnswerButton1ActionPerformed(evt);
            }
        });

        answerTextField1.setText("jTextField2");

        addQuizAnswers.add(correctAnswerButton2);
        correctAnswerButton2.setText("jRadioButton2");

        answerTextField2.setText("+");
        answerTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addQuizTabLayout = new javax.swing.GroupLayout(addQuizTab);
        addQuizTab.setLayout(addQuizTabLayout);
        addQuizTabLayout.setHorizontalGroup(
            addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addQuizTabLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(questionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(questionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(addQuizTabLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(answerTextField2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addQuizTabLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addGroup(addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addQuizTabLayout.createSequentialGroup()
                            .addComponent(correctAnswerButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(answerTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGroup(addQuizTabLayout.createSequentialGroup()
                            .addComponent(correctAnswerButton2)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(91, 91, 91)))
        );
        addQuizTabLayout.setVerticalGroup(
            addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addQuizTabLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(questionLabel))
                .addGap(72, 72, 72)
                .addComponent(answerTextField2)
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addQuizTabLayout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addGroup(addQuizTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(correctAnswerButton1)
                        .addComponent(answerTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(correctAnswerButton2)
                    .addContainerGap(147, Short.MAX_VALUE)))
        );

        TabbedPane.addTab("Add Quiz!", addQuizTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void questionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionTextFieldActionPerformed

    private void correctAnswerButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correctAnswerButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correctAnswerButton1ActionPerformed

    private void answerTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGUI().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.ButtonGroup addQuizAnswers;
    private javax.swing.JPanel addQuizTab;
    private javax.swing.JTextField answerTextField1;
    private javax.swing.JButton answerTextField2;
    private javax.swing.JRadioButton correctAnswerButton1;
    private javax.swing.JRadioButton correctAnswerButton2;
    private javax.swing.JPanel homeTab;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JTextField questionTextField;
    // End of variables declaration//GEN-END:variables
}
