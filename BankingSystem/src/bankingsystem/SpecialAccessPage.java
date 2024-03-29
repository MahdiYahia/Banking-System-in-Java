/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 *
 * @author mahdi
 */
public class SpecialAccessPage extends javax.swing.JFrame {

    /**
     * Creates new form SpecialAccessPage
     */
    public SpecialAccessPage() {
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

        jLabel1 = new javax.swing.JLabel();
        checkTheBalance = new javax.swing.JButton();
        jDepositMoneyButton = new javax.swing.JButton();
        jDeductButton = new javax.swing.JButton();
        jHistoryButton = new javax.swing.JButton();
        jButtonChangeData = new javax.swing.JButton();
        jButtonChangeCurrency = new javax.swing.JButton();
        jLogOutButton = new javax.swing.JButton();
        jSendNotificationButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        currentUsername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("You are logged in");

        checkTheBalance.setText("Check the client's Balance");
        checkTheBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTheBalanceActionPerformed(evt);
            }
        });

        jDepositMoneyButton.setText("Make a deposit");
        jDepositMoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDepositMoneyButtonActionPerformed(evt);
            }
        });

        jDeductButton.setText("Deduct Money");
        jDeductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeductButtonActionPerformed(evt);
            }
        });

        jHistoryButton.setText("Check the history of transactions");
        jHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHistoryButtonActionPerformed(evt);
            }
        });

        jButtonChangeData.setText("Change the client's personal data");
        jButtonChangeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeDataActionPerformed(evt);
            }
        });

        jButtonChangeCurrency.setText("Change the client's default currency");
        jButtonChangeCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeCurrencyActionPerformed(evt);
            }
        });

        jLogOutButton.setText("Log Out");
        jLogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogOutButtonActionPerformed(evt);
            }
        });

        jSendNotificationButton.setText("Send a notification");
        jSendNotificationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSendNotificationButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter the client's username:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(209, 209, 209))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLogOutButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonChangeCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonChangeData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDeductButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDepositMoneyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkTheBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSendNotificationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(currentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(currentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(checkTheBalance)
                .addGap(18, 18, 18)
                .addComponent(jDepositMoneyButton)
                .addGap(18, 18, 18)
                .addComponent(jDeductButton)
                .addGap(26, 26, 26)
                .addComponent(jHistoryButton)
                .addGap(18, 18, 18)
                .addComponent(jButtonChangeData)
                .addGap(18, 18, 18)
                .addComponent(jButtonChangeCurrency)
                .addGap(26, 26, 26)
                .addComponent(jSendNotificationButton)
                .addGap(20, 20, 20)
                .addComponent(jLogOutButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogOutButtonActionPerformed
        dispose();
        LogInPage LogInPage = new LogInPage();
        LogInPage.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLogOutButtonActionPerformed

    private void jSendNotificationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSendNotificationButtonActionPerformed
        // TODO add your handling code here
            File tmpFile = new File(currentUsername.getText()+"data.ser");
        boolean Valid = tmpFile.exists();
        if (Valid ){
           SendingNotificationsPage SendingNotificationsPage = new SendingNotificationsPage(currentUsername.getText());
           SendingNotificationsPage.setVisible(true);
        }
        else{
          InputIssue InputIssue =new InputIssue();
          InputIssue.setVisible(true);
        }

    }//GEN-LAST:event_jSendNotificationButtonActionPerformed

    private void jButtonChangeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeDataActionPerformed
        // TODO add your handling code here:
        File tmpFile = new File(currentUsername.getText()+"data.ser");
        boolean Valid = tmpFile.exists();
        if (Valid ){
        ChangeUserDataPage ChangeUserDataPage = new ChangeUserDataPage(currentUsername.getText());
        ChangeUserDataPage.setVisible(true);
        } 
         else{
          InputIssue InputIssue =new InputIssue();
          InputIssue.setVisible(true);
        }
    }//GEN-LAST:event_jButtonChangeDataActionPerformed

    private void jButtonChangeCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeCurrencyActionPerformed
        // TODO add your handling code here:
        File tmpFile = new File(currentUsername.getText()+"data.ser");
        boolean Valid = tmpFile.exists();
        if (Valid ){
        ChangingCurrency ChangingCurrency = new ChangingCurrency(currentUsername.getText());
        ChangingCurrency.setVisible(true);}
         else{
          InputIssue InputIssue =new InputIssue();
          InputIssue.setVisible(true);
        }
    }//GEN-LAST:event_jButtonChangeCurrencyActionPerformed

    private void checkTheBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTheBalanceActionPerformed
        // TODO add your handling code here:
         File tmpFile = new File(currentUsername.getText()+"data.ser");
        boolean Valid = tmpFile.exists();
        if (Valid ){
        float sum=0;
        try {
      File thisUserHistory = new File(currentUsername.getText()+"history.txt");
      Scanner histroryFile = new Scanner(thisUserHistory);
      while (histroryFile.hasNextLine()) {
        String data = histroryFile.nextLine();
       String[] arrOfData   =data.split("   ",3);
       sum+=Float.parseFloat(arrOfData[0]);
      }
      histroryFile.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        BalancePage BalancePage = new BalancePage(sum);
        BalancePage.setVisible(true);}
        else{
          InputIssue InputIssue =new InputIssue();
          InputIssue.setVisible(true);
        }
    }//GEN-LAST:event_checkTheBalanceActionPerformed

    private void jDepositMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDepositMoneyButtonActionPerformed
        // TODO add your handling code here
        File tmpFile = new File(currentUsername.getText()+"data.ser");
        boolean Valid = tmpFile.exists();
        if (Valid ){
        DepositMoney DepositMoney =new DepositMoney(currentUsername.getText());
        DepositMoney.setVisible(true);}
        else{
          InputIssue InputIssue =new InputIssue();
          InputIssue.setVisible(true);
        }
    }//GEN-LAST:event_jDepositMoneyButtonActionPerformed

    private void jDeductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeductButtonActionPerformed
        // TODO add your handling code here:
        File tmpFile = new File(currentUsername.getText()+"data.ser");
        boolean Valid = tmpFile.exists();
        if (Valid ){
         SpendMoney SpendMoney =new SpendMoney(currentUsername.getText());
         SpendMoney.setVisible(true);}
        else{
          InputIssue InputIssue =new InputIssue();
          InputIssue.setVisible(true);
        }
    }//GEN-LAST:event_jDeductButtonActionPerformed

    private void jHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHistoryButtonActionPerformed
        // TODO add your handling code here
        File tmpFile = new File(currentUsername.getText()+"data.ser");
        boolean Valid = tmpFile.exists();
        if (Valid ){
        HistoryOfTransactions HistoryOfTransactions = new HistoryOfTransactions(currentUsername.getText());
        HistoryOfTransactions.setVisible(true);
        }
        else{
          InputIssue InputIssue =new InputIssue();
          InputIssue.setVisible(true);
        }
    }//GEN-LAST:event_jHistoryButtonActionPerformed

   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkTheBalance;
    private javax.swing.JTextField currentUsername;
    private javax.swing.JButton jButtonChangeCurrency;
    private javax.swing.JButton jButtonChangeData;
    private javax.swing.JButton jDeductButton;
    private javax.swing.JButton jDepositMoneyButton;
    private javax.swing.JButton jHistoryButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jLogOutButton;
    private javax.swing.JButton jSendNotificationButton;
    // End of variables declaration//GEN-END:variables
   }