
package visao;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class TelaBebida extends javax.swing.JFrame {

   
    public TelaBebida() {
        initComponents();
        
         this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/ADXBAR tamanho grande.jpg")).getImage());
        
        resetlabelcolorBooster(jBooster); 
        resetlabelcolorCocaCola(jCocaCola); 
        resetlabelcolorCuca(jCuca); 
        resetlabelcolorEka(jEka); 
        resetlabelcolorNocal(jNocal); 
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        jValor = new javax.swing.JLabel();
        jNocal = new javax.swing.JLabel();
        jEka = new javax.swing.JLabel();
        jCuca = new javax.swing.JLabel();
        jCocaCola = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jImagem = new javax.swing.JLabel();
        jBooster = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setBackground(new java.awt.Color(243, 161, 42));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaBebida/back_icon-icons.com_74430.png"))); // NOI18N
        btnVoltar.setToolTipText("Voltar");
        btnVoltar.setBorder(null);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 40, 30));

        jValor.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 170, 40));

        jNocal.setBackground(new java.awt.Color(0, 199, 190));
        jNocal.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jNocal.setForeground(new java.awt.Color(255, 255, 255));
        jNocal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jNocal.setText("NOCAL");
        jNocal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jNocal.setOpaque(true);
        jNocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNocalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jNocalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jNocalMouseExited(evt);
            }
        });
        jPanel1.add(jNocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 240, 40));

        jEka.setBackground(new java.awt.Color(0, 199, 190));
        jEka.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jEka.setForeground(new java.awt.Color(255, 255, 255));
        jEka.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jEka.setText("EKA");
        jEka.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jEka.setOpaque(true);
        jEka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEkaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jEkaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jEkaMouseExited(evt);
            }
        });
        jPanel1.add(jEka, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 240, 40));

        jCuca.setBackground(new java.awt.Color(0, 199, 190));
        jCuca.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jCuca.setForeground(new java.awt.Color(255, 255, 255));
        jCuca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCuca.setText("CUCA");
        jCuca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCuca.setOpaque(true);
        jCuca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCucaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCucaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCucaMouseExited(evt);
            }
        });
        jPanel1.add(jCuca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, 40));

        jCocaCola.setBackground(new java.awt.Color(0, 199, 190));
        jCocaCola.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jCocaCola.setForeground(new java.awt.Color(255, 255, 255));
        jCocaCola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCocaCola.setText("COCA-COLA");
        jCocaCola.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCocaCola.setOpaque(true);
        jCocaCola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCocaColaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCocaColaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCocaColaMouseExited(evt);
            }
        });
        jPanel1.add(jCocaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 240, 40));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 199, 190));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PREÇO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 300, 40));

        jImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 300, 200));

        jBooster.setBackground(new java.awt.Color(0, 199, 190));
        jBooster.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jBooster.setForeground(new java.awt.Color(255, 255, 255));
        jBooster.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBooster.setText("BOOSTER");
        jBooster.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBooster.setOpaque(true);
        jBooster.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBoosterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBoosterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBoosterMouseExited(evt);
            }
        });
        jPanel1.add(jBooster, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaBebida/Fundo Menu Bebida outras cores.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        setSize(new java.awt.Dimension(749, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBoosterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBoosterMouseEntered
         // Linha de Cód. do Preço das Bebidas:
 
         labelcolorBooster(jBooster);
     
    }//GEN-LAST:event_jBoosterMouseEntered

    private void jBoosterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBoosterMouseExited
        // TODO add your handling code here:
        resetlabelcolorBooster(jBooster);
         
    }//GEN-LAST:event_jBoosterMouseExited

    private void jCocaColaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCocaColaMouseEntered
        // TODO add your handling code here:
        
        labelcolorCocaCola(jCocaCola);
        
    }//GEN-LAST:event_jCocaColaMouseEntered

    private void jCocaColaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCocaColaMouseExited
        // TODO add your handling code here:
        
         resetlabelcolorCocaCola(jCocaCola);
        
    }//GEN-LAST:event_jCocaColaMouseExited

    private void jCucaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCucaMouseEntered
        // TODO add your handling code here:
        
         labelcolorCuca(jCuca);
        
    }//GEN-LAST:event_jCucaMouseEntered

    private void jCucaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCucaMouseExited
        // TODO add your handling code here:
        
        resetlabelcolorCuca(jCuca); 
        
    }//GEN-LAST:event_jCucaMouseExited

    private void jEkaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEkaMouseEntered
        // TODO add your handling code here:
        
        labelcolorEka(jEka); 
    }//GEN-LAST:event_jEkaMouseEntered

    private void jEkaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEkaMouseExited
        // TODO add your handling code here:
        
       resetlabelcolorEka(jEka);  
        
    }//GEN-LAST:event_jEkaMouseExited

    private void jNocalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNocalMouseEntered
        // TODO add your handling code here:
        
       labelcolorNocal(jNocal);  
        
    }//GEN-LAST:event_jNocalMouseEntered

    private void jNocalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNocalMouseExited
        // TODO add your handling code here:
        
         resetlabelcolorNocal(jNocal);  
        
    }//GEN-LAST:event_jNocalMouseExited

    private void jBoosterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBoosterMouseClicked
        // TODO add your handling code here:
        
        TelaBooster tboo = new TelaBooster();
        tboo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBoosterMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        
        TelaOpçoes to = new TelaOpçoes();
        to.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jCocaColaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCocaColaMouseClicked
        // TODO add your handling code here:
        
        TelaCocaCola tboo = new TelaCocaCola();
        tboo.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jCocaColaMouseClicked

    private void jCucaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCucaMouseClicked
        // TODO add your handling code here:
        
        TelaCuca tboo = new TelaCuca();
        tboo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jCucaMouseClicked

    private void jEkaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEkaMouseClicked
        // TODO add your handling code here:
        
        TelaEka tboo = new TelaEka();
        tboo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jEkaMouseClicked

    private void jNocalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNocalMouseClicked
        // TODO add your handling code here:
        
        TelaNocal tboo = new TelaNocal();
        tboo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jNocalMouseClicked

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
            java.util.logging.Logger.getLogger(TelaBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBebida().setVisible(true);
            }
        });
    }
    
   // Camada de cor BOOSTER:
    
   private void labelcolorBooster(JLabel label){
       
       label.setBackground(new java.awt.Color(33, 147, 0));
        
       ImageIcon imagem = new ImageIcon(getClass().getClassLoader().getResource("imagensTelaBebida/Booster~1.jpg"));
       jImagem.setIcon(imagem); 
       
       String valor = "200 KZ";
       jValor.setText(valor);
       
    }
     
     private void resetlabelcolorBooster(JLabel label){
         
      label.setBackground(new java.awt.Color(0, 199, 190));
        
      ImageIcon imagem = new ImageIcon();
      jImagem.setIcon(imagem);
      
       String valor = "";
       jValor.setText(valor);
      
    }
     
   // Camada de cor CocaCola:
    
   private void labelcolorCocaCola(JLabel label){
       
       label.setBackground(new java.awt.Color(199, 0, 21));
        
       ImageIcon imagem = new ImageIcon(getClass().getClassLoader().getResource("imagensTelaBebida/Coca-Cola~1.jpg"));
       jImagem.setIcon(imagem); 
       
       String valor = "250 KZ";
       jValor.setText(valor);   
       
    }
     
     private void resetlabelcolorCocaCola(JLabel label){
         
      label.setBackground(new java.awt.Color(0, 199, 190));
        
      ImageIcon imagem = new ImageIcon();
      jImagem.setIcon(imagem); 
      
      String valor = "";
      jValor.setText(valor);
       
    }
     
   // Camada de cor Cuca:
    
   private void labelcolorCuca(JLabel label){
       
       label.setBackground(new java.awt.Color(255, 191, 13));
        
       ImageIcon imagem = new ImageIcon(getClass().getClassLoader().getResource("imagensTelaBebida/Cuca~1.jpg"));
       jImagem.setIcon(imagem);  
       
       String valor = "200 KZ";
       jValor.setText(valor);      
       
    }
     
     private void resetlabelcolorCuca(JLabel label){
         
      label.setBackground(new java.awt.Color(0, 199, 190));
        
      ImageIcon imagem = new ImageIcon();
      jImagem.setIcon(imagem); 
      
      String valor = "";
      jValor.setText(valor);
      
    }
     
   // Camada de cor Eka:
    
   private void labelcolorEka(JLabel label){
       
       label.setBackground(new java.awt.Color(245, 228, 0));
        
       ImageIcon imagem = new ImageIcon(getClass().getClassLoader().getResource("imagensTelaBebida/Eka~1.jpg"));
       jImagem.setIcon(imagem);
       
       String valor = "200 KZ";
       jValor.setText(valor);
         
    }
     
     private void resetlabelcolorEka(JLabel label){
         
      label.setBackground(new java.awt.Color(0, 199, 190));
        
      ImageIcon imagem = new ImageIcon();
      jImagem.setIcon(imagem); 
      
      String valor = "";
      jValor.setText(valor);
      
    }
     
   // Camada de cor Nocal:
    
   private void labelcolorNocal(JLabel label){
       
       label.setBackground(new java.awt.Color(219, 34, 39));
        
       ImageIcon imagem = new ImageIcon(getClass().getClassLoader().getResource("imagensTelaBebida/Nocal~1.jpg"));
       jImagem.setIcon(imagem);
       
       String valor = "200 KZ";
       jValor.setText(valor);
       
    }
     
     private void resetlabelcolorNocal(JLabel label){
         
      label.setBackground(new java.awt.Color(0, 199, 190));
        
      ImageIcon imagem = new ImageIcon();
      jImagem.setIcon(imagem); 
      
      String valor = "";
      jValor.setText(valor);
      
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jBooster;
    private javax.swing.JLabel jCocaCola;
    private javax.swing.JLabel jCuca;
    private javax.swing.JLabel jEka;
    private javax.swing.JLabel jImagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jNocal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jValor;
    // End of variables declaration//GEN-END:variables
}
