/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Form4 extends javax.swing.JFrame {

    protected ArrayList<Word> listWord;

    /**
     * Creates new form Form4
     */
    public Form4() {
        this.listWord = new ArrayList<>();
        initComponents();
        this.init();
        setVisible(true);
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
        jLabel3 = new javax.swing.JLabel();
        tfEn = new javax.swing.JTextField();
        tfVn = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Từ điển Anh - Việt");

        jLabel2.setText("English");

        jLabel3.setText("Vietnamese");

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAdd.setText("Bổ sung");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfVn, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(tfEn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfEn, tfVn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfEn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfVn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnAdd))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        int pos = BinarySearch(tfEn.getText());
        for(Word w: this.listWord) {
            w.show();
        }
        if (pos == -1) {
            JOptionPane.showMessageDialog(null, "Không tìm thấy từ");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Tu \"" + tfEn.getText() + "\" có nghĩa tiếng Việt: \"" + listWord.get(pos).getVn() + "\"");
            return;
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(tfVn.getText().isEmpty() && tfEn.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Từ không được để trống");
            return;
        }
        if(checkExist(tfEn.getText())) {
            JOptionPane.showMessageDialog(null, "Từ này đã có trong từ điển");
            return;
        } else {
            int size = this.listWord.size() + 1;
            this.listWord.add(new Word(size, tfEn.getText(), tfVn.getText()));
            this.sort();
            JOptionPane.showMessageDialog(null, "Đã thêm thành công vào từ điển");
            return;
        }
    }//GEN-LAST:event_btnAddActionPerformed
    private Boolean checkExist(String s) {
        int pos = BinarySearch(s);
        return pos != -1;
    }
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
            java.util.logging.Logger.getLogger(Form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form4().setVisible(true);
            }
        });
    }

    public void sort() {
        Collections.sort(this.listWord, new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                return o1.getEn().compareToIgnoreCase(o2.getEn());
            }
        });
    }

    public void init() {
        Word w1 = new Word(1, "one", "một");
        Word w2 = new Word(2, "two", "hai");
        Word w3 = new Word(3, "three", "ba");
        Word w4 = new Word(4, "four", "bốn");
        Word w5 = new Word(5, "five", "năm");
        Word w6 = new Word(6, "six", "sáu");
        Word w7 = new Word(7, "seven", "bảy");
        Word w8 = new Word(8, "eight", "tám");
        Word w9 = new Word(9, "nine", "chín");
        Word w10 = new Word(10, "ten", "mười");
        Word w11 = new Word(11, "eleven", "mười một");
        Word w12 = new Word(12, "twelve", "mười hai");
        this.listWord.add(w1);
        this.listWord.add(w2);
        this.listWord.add(w3);
        this.listWord.add(w4);
        this.listWord.add(w5);
        this.listWord.add(w6);
        this.listWord.add(w7);
        this.listWord.add(w8);
        this.listWord.add(w9);
        this.listWord.add(w10);
        this.listWord.add(w11);
        this.listWord.add(w12);
        this.sort();
    }

    public int BinarySearch(String s) {
        int left = 0;
        int right = this.listWord.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            Word w = this.listWord.get(mid);
            if (w.getEn().equals(s)) {
                return mid;
            } else if (w.getEn().compareToIgnoreCase(s) > 0) {
                right = mid - 1;
            } else {
                mid = (left + right) / 2;
                left = mid + 1;
            }
        }
        return -1;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField tfEn;
    private javax.swing.JTextField tfVn;
    // End of variables declaration//GEN-END:variables
}
