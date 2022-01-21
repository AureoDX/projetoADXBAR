
package visao;


public class TelaOpçoes extends javax.swing.JFrame {

   
    public TelaOpçoes() {
        initComponents();
        
       this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/ADXBAR tamanho grande.jpg")).getImage());
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEntrarComida = new javax.swing.JButton();
        btnEntrarBebida = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Garfo e Faca~2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/beer-icon~1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        btnEntrarComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botão Bebida Off azul.jpg"))); // NOI18N
        btnEntrarComida.setToolTipText("Entrar");
        btnEntrarComida.setBorder(null);
        btnEntrarComida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrarComida.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botão Bebida On azul.jpg"))); // NOI18N
        btnEntrarComida.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botão Bebida On azul.jpg"))); // NOI18N
        btnEntrarComida.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botão Bebida On azul.jpg"))); // NOI18N
        btnEntrarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarComidaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrarComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 128, 41));

        btnEntrarBebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botão Bebida Off azul.jpg"))); // NOI18N
        btnEntrarBebida.setToolTipText("Entrar");
        btnEntrarBebida.setBorder(null);
        btnEntrarBebida.setContentAreaFilled(false);
        btnEntrarBebida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrarBebida.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botão Bebida On azul.jpg"))); // NOI18N
        btnEntrarBebida.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botão Bebida On azul.jpg"))); // NOI18N
        btnEntrarBebida.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Botão Bebida On azul.jpg"))); // NOI18N
        btnEntrarBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarBebidaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrarBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 128, 41));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo ADXBar outras cores.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -8, 610, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(613, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarBebidaActionPerformed
        // TODO add your handling code here:
        
        TelaBebida tb = new TelaBebida();
        tb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEntrarBebidaActionPerformed

    private void btnEntrarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarComidaActionPerformed
        // TODO add your handling code here:
        
        TelaComida tb = new TelaComida();
        tb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEntrarComidaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOpçoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOpçoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOpçoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOpçoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOpçoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarBebida;
    private javax.swing.JButton btnEntrarComida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
