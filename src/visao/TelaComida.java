
package visao;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class TelaComida extends javax.swing.JFrame {

    
    public TelaComida() {
        initComponents();
        
         this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/ADXBAR tamanho grande.jpg")).getImage());
        
        resetlabelcolorBitoque(jBitoque); 
        resetlabelcolorCachorro(jCachorro); 
        resetlabelcolorChurrasco(jChurrasco); 
        resetlabelcolorFahíta(jFahíta); 
        resetlabelcolorHamburguer(jHamburguer);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        jValor = new javax.swing.JLabel();
        jHamburguer = new javax.swing.JLabel();
        jFahíta = new javax.swing.JLabel();
        jChurrasco = new javax.swing.JLabel();
        jCachorro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jImagem = new javax.swing.JLabel();
        jBitoque = new javax.swing.JLabel();
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

        jHamburguer.setBackground(new java.awt.Color(0, 199, 190));
        jHamburguer.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jHamburguer.setForeground(new java.awt.Color(255, 255, 255));
        jHamburguer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jHamburguer.setText("HAMBURGUER");
        jHamburguer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jHamburguer.setOpaque(true);
        jHamburguer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jHamburguerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jHamburguerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jHamburguerMouseExited(evt);
            }
        });
        jPanel1.add(jHamburguer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 240, 40));

        jFahíta.setBackground(new java.awt.Color(0, 199, 190));
        jFahíta.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jFahíta.setForeground(new java.awt.Color(255, 255, 255));
        jFahíta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jFahíta.setText("FAHÍTA");
        jFahíta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jFahíta.setOpaque(true);
        jFahíta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFahítaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jFahítaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jFahítaMouseExited(evt);
            }
        });
        jPanel1.add(jFahíta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 240, 40));

        jChurrasco.setBackground(new java.awt.Color(0, 199, 190));
        jChurrasco.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jChurrasco.setForeground(new java.awt.Color(255, 255, 255));
        jChurrasco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jChurrasco.setText("CHURRASCO");
        jChurrasco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jChurrasco.setOpaque(true);
        jChurrasco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jChurrascoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jChurrascoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jChurrascoMouseExited(evt);
            }
        });
        jPanel1.add(jChurrasco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, 40));

        jCachorro.setBackground(new java.awt.Color(0, 199, 190));
        jCachorro.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jCachorro.setForeground(new java.awt.Color(255, 255, 255));
        jCachorro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCachorro.setText("CACHORRO");
        jCachorro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCachorro.setOpaque(true);
        jCachorro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCachorroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCachorroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCachorroMouseExited(evt);
            }
        });
        jPanel1.add(jCachorro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 240, 40));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 199, 190));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PREÇO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 300, 40));

        jImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 300, 200));

        jBitoque.setBackground(new java.awt.Color(0, 199, 190));
        jBitoque.setFont(new java.awt.Font("Tw Cen MT", 1, 48)); // NOI18N
        jBitoque.setForeground(new java.awt.Color(255, 255, 255));
        jBitoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBitoque.setText("BITOQUE");
        jBitoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBitoque.setOpaque(true);
        jBitoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBitoqueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBitoqueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBitoqueMouseExited(evt);
            }
        });
        jPanel1.add(jBitoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensComida/Fundo Menu Comida outras cores.jpg"))); // NOI18N
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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:

        TelaOpçoes to = new TelaOpçoes();
        to.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void jHamburguerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHamburguerMouseEntered
        // TODO add your handling code here:

        labelcolorHamburguer(jHamburguer);

    }//GEN-LAST:event_jHamburguerMouseEntered

    private void jHamburguerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHamburguerMouseExited
        // TODO add your handling code here:

        resetlabelcolorHamburguer(jHamburguer);

    }//GEN-LAST:event_jHamburguerMouseExited

    private void jFahítaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFahítaMouseEntered
        // TODO add your handling code here:

        labelcolorFahíta(jFahíta);
    }//GEN-LAST:event_jFahítaMouseEntered

    private void jFahítaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFahítaMouseExited
        // TODO add your handling code here:

        resetlabelcolorFahíta(jFahíta);

    }//GEN-LAST:event_jFahítaMouseExited

    private void jChurrascoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jChurrascoMouseEntered
        // TODO add your handling code here:

        labelcolorChurrasco(jChurrasco);

    }//GEN-LAST:event_jChurrascoMouseEntered

    private void jChurrascoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jChurrascoMouseExited
        // TODO add your handling code here:

        resetlabelcolorChurrasco(jChurrasco);

    }//GEN-LAST:event_jChurrascoMouseExited

    private void jCachorroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCachorroMouseEntered
        // TODO add your handling code here:

        labelcolorCachorro(jCachorro);

    }//GEN-LAST:event_jCachorroMouseEntered

    private void jCachorroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCachorroMouseExited
        // TODO add your handling code here:

        resetlabelcolorCachorro(jCachorro);

    }//GEN-LAST:event_jCachorroMouseExited

    private void jBitoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBitoqueMouseClicked
        // TODO add your handling code here:

        TelaBitoque tboo = new TelaBitoque();
        tboo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBitoqueMouseClicked

    private void jBitoqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBitoqueMouseEntered
        // Linha de Cód. do Preço das Bebidas:

        labelcolorBitoque(jBitoque);

    }//GEN-LAST:event_jBitoqueMouseEntered

    private void jBitoqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBitoqueMouseExited
        // TODO add your handling code here:
        resetlabelcolorBitoque(jBitoque);

    }//GEN-LAST:event_jBitoqueMouseExited

    private void jCachorroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCachorroMouseClicked
        // TODO add your handling code here:
        
        TelaCachorro tbc = new TelaCachorro();
        tbc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jCachorroMouseClicked

    private void jChurrascoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jChurrascoMouseClicked
        // TODO add your handling code here:
        
        TelaChurrasco tboo = new TelaChurrasco();
        tboo.setVisible(true);
        this.dispose(); 
        
    }//GEN-LAST:event_jChurrascoMouseClicked

    private void jFahítaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFahítaMouseClicked
        // TODO add your handling code here:
        
        TelaFahíta tboo = new TelaFahíta();
        tboo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jFahítaMouseClicked

    private void jHamburguerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jHamburguerMouseClicked
        // TODO add your handling code here:
        
        TelaHamburguer tboo = new TelaHamburguer();
        tboo.setVisible(true);
        this.dispose(); 
        
    }//GEN-LAST:event_jHamburguerMouseClicked

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
            java.util.logging.Logger.getLogger(TelaComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaComida().setVisible(true);
            }
        });
    }
// Camada de cor Bitoque:
    
   private void labelcolorBitoque(JLabel label){
       
       label.setBackground(new java.awt.Color(214, 165, 63));
        
       ImageIcon imagem = new ImageIcon(getClass().getClassLoader().getResource("imagensComida/Bitoque branco.jpg"));
       jImagem.setIcon(imagem); 
       
       String valor = "1.250 KZ";
       jValor.setText(valor);
       
    }
     
     private void resetlabelcolorBitoque(JLabel label){
         
      label.setBackground(new java.awt.Color(0, 199, 190));
        
      ImageIcon imagem = new ImageIcon();
      jImagem.setIcon(imagem);
      
       String valor = "";
       jValor.setText(valor);
      
    }
     
   // Camada de cor Cachorro:
    
   private void labelcolorCachorro(JLabel label){
       
       label.setBackground(new java.awt.Color(198, 40, 1));
        
       ImageIcon imagem = new ImageIcon(getClass().getClassLoader().getResource("imagensComida/Cachorro Quente.jpg"));
       jImagem.setIcon(imagem); 
       
       String valor = "500 KZ";
       jValor.setText(valor);   
       
    }
     
     private void resetlabelcolorCachorro(JLabel label){
         
      label.setBackground(new java.awt.Color(0, 199, 190));
        
      ImageIcon imagem = new ImageIcon();
      jImagem.setIcon(imagem); 
      
      String valor = "";
      jValor.setText(valor);
       
    }
     
   // Camada de cor Churrasco:
    
   private void labelcolorChurrasco(JLabel label){
       
       label.setBackground(new java.awt.Color(255, 191, 13));
        
       ImageIcon imagem = new ImageIcon(getClass().getClassLoader().getResource("imagensComida/Churrasco branco.jpg"));
       jImagem.setIcon(imagem);  
       
       String valor = "1.200 KZ";
       jValor.setText(valor);      
       
    }
     
     private void resetlabelcolorChurrasco(JLabel label){
         
      label.setBackground(new java.awt.Color(0, 199, 190));
        
      ImageIcon imagem = new ImageIcon();
      jImagem.setIcon(imagem); 
      
      String valor = "";
      jValor.setText(valor);
      
    }
     
   // Camada de cor Fahíta:
    
   private void labelcolorFahíta(JLabel label){
       
       label.setBackground(new java.awt.Color(245, 228, 0));
        
       ImageIcon imagem = new ImageIcon(getClass().getClassLoader().getResource("imagensComida/Faíta Branco.jpg"));
       jImagem.setIcon(imagem);
       
       String valor = "1.200 KZ";
       jValor.setText(valor);
         
    }
     
     private void resetlabelcolorFahíta(JLabel label){
         
      label.setBackground(new java.awt.Color(0, 199, 190));
        
      ImageIcon imagem = new ImageIcon();
      jImagem.setIcon(imagem); 
      
      String valor = "";
      jValor.setText(valor);
      
    }
     
   // Camada de cor Hamburguer:
    
   private void labelcolorHamburguer(JLabel label){
       
       label.setBackground(new java.awt.Color(206, 108, 1));
        
       ImageIcon imagem = new ImageIcon(getClass().getClassLoader().getResource("imagensComida/Hamburguer Branco.jpg"));
       jImagem.setIcon(imagem);
       
       String valor = "1000 KZ";
       jValor.setText(valor);
       
    }
     
     private void resetlabelcolorHamburguer(JLabel label){
         
      label.setBackground(new java.awt.Color(0, 199, 190));
        
      ImageIcon imagem = new ImageIcon();
      jImagem.setIcon(imagem); 
      
      String valor = "";
      jValor.setText(valor);
      
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jBitoque;
    private javax.swing.JLabel jCachorro;
    private javax.swing.JLabel jChurrasco;
    private javax.swing.JLabel jFahíta;
    private javax.swing.JLabel jHamburguer;
    private javax.swing.JLabel jImagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jValor;
    // End of variables declaration//GEN-END:variables
}
