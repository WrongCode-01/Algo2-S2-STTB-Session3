/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Administrator
 */
public class Latihan4 extends javax.swing.JFrame {
    String nama, asal;
    int pilih;
    public Latihan4() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ListAsal21552011440 = new javax.swing.JList<>();
        ButtonCetak21552011440 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TampilTextArea21552011440 = new javax.swing.JTextArea();
        LabelNama21552011440 = new javax.swing.JLabel();
        LabelJudul21552011440 = new javax.swing.JLabel();
        TextFieldNama21552011440 = new javax.swing.JTextField();
        LabelAsal21552011440 = new javax.swing.JLabel();
        ButtonClear21552011440 = new javax.swing.JButton();
        ButtonExit21552011440 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListAsal21552011440.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "SOLO", "PADANG", "BUKIT TINGGI", "JAKARTA", "BANDUNG", "PLANET BEKASI", "BOGOR" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListAsal21552011440);

        ButtonCetak21552011440.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonCetak21552011440.setText("CETAK");
        ButtonCetak21552011440.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCetak21552011440ActionPerformed(evt);
            }
        });

        TampilTextArea21552011440.setColumns(20);
        TampilTextArea21552011440.setRows(5);
        jScrollPane2.setViewportView(TampilTextArea21552011440);

        LabelNama21552011440.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelNama21552011440.setText("NAMA");

        LabelJudul21552011440.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelJudul21552011440.setText("Menggunakan Method getSelectedIndex()");

        LabelAsal21552011440.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelAsal21552011440.setText("ASAL");

        ButtonClear21552011440.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonClear21552011440.setText("CLEAR");
        ButtonClear21552011440.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClear21552011440ActionPerformed(evt);
            }
        });

        ButtonExit21552011440.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonExit21552011440.setText("CLOSE");
        ButtonExit21552011440.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExit21552011440ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNama21552011440)
                            .addComponent(LabelAsal21552011440))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(TextFieldNama21552011440))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonCetak21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonExit21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonClear21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(134, 134, 134))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelJudul21552011440)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelJudul21552011440)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNama21552011440)
                    .addComponent(TextFieldNama21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelAsal21552011440)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonCetak21552011440)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonClear21552011440)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonExit21552011440))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCetak21552011440ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCetak21552011440ActionPerformed
        nama = TextFieldNama21552011440.getText();
        
        pilih=ListAsal21552011440.getSelectedIndex();
        switch(pilih)
        {
            case 0:
                asal = "SOLO";
                break;
            case 1:
                asal = "PADANG";
                break;
            case 2:
                asal = "BUKIT TINGGI";
                break;
            case 3:
                asal = "JAKARTA";
                break; 
            case 4:
                asal = "BANDUNG";
                break;   
            case 5:
                asal = "PLANET BEKASI";
                break;    
            case 6:
                asal = "BOGOR";
                break;    
        }
        TampilTextArea21552011440.setText("NAMA\t    :"+nama+"\nASAL\t    :"+asal);
    }//GEN-LAST:event_ButtonCetak21552011440ActionPerformed

    private void ButtonClear21552011440ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClear21552011440ActionPerformed
        TextFieldNama21552011440.setText("");
        TampilTextArea21552011440.setText("");
    }//GEN-LAST:event_ButtonClear21552011440ActionPerformed

    private void ButtonExit21552011440ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExit21552011440ActionPerformed
        this.dispose();
    }//GEN-LAST:event_ButtonExit21552011440ActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCetak21552011440;
    private javax.swing.JButton ButtonClear21552011440;
    private javax.swing.JButton ButtonExit21552011440;
    private javax.swing.JLabel LabelAsal21552011440;
    private javax.swing.JLabel LabelJudul21552011440;
    private javax.swing.JLabel LabelNama21552011440;
    private javax.swing.JList<String> ListAsal21552011440;
    private javax.swing.JTextArea TampilTextArea21552011440;
    private javax.swing.JTextField TextFieldNama21552011440;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
