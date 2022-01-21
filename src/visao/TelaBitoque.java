
package visao;

import Atxy2k.CustomTextField.RestrictedTextField;
import conexao.ConnectionFactory;
import controle.BitoqueDao;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.BitoqueBean;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


public class TelaBitoque extends javax.swing.JFrame {

   
    public TelaBitoque() {
        initComponents();
     limitarnum();
     
     this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/ADXBAR tamanho grande.jpg")).getImage());
     
        try {
            oListar();
        } catch (SQLException ex) {
            Logger.getLogger(TelaBooster.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
   private void limitarnum(){ 
       
       setLocationRelativeTo(null);
        RestrictedTextField r = new RestrictedTextField(txtValordaCompra);
        r.setLimit(4);
        r.setOnlyNums(true);
        
   } 
   private void calcularBitoque(){
       
       if ((jImagem)!= null)
       {    
         
        int num = Integer.parseInt (txtUnidade.getText());
        int num2 = Integer.parseInt(txtValordaCompra.getText());
        int calc = num-num2;
        txtTroco.setText(Integer.toString(calc).replaceAll("\\-", ""));  
        
        }
       }

     //Mostrar valores de Bitoque na Tabela:
    
    public void oListar() throws SQLException {
        
       DefaultTableModel modelo = (DefaultTableModel) jTabelaBitoque.getModel(); 
       modelo.setNumRows(0);
       
       BitoqueDao bdao = new BitoqueDao();
       for(BitoqueBean b: bdao.CervejaB()) {
        
       modelo.addRow(new Object[]{
          
        b.getId(),
        b.getDesc(),
        b.getNome(),
        b.getValor_da_compra(),
        b.getMoeda(),
        b.getUnidade(),
        b.getData(),
        });
        }
         }
    
    //Gerar Relatório Bitoque:
    
     private void gerarRelatórioBitoque() throws SQLException, JRException {  
         
       Connection conn = ConnectionFactory.getConnection();
       
       String sql ="select id, descricao, nome, valor_da_compra, moeda, unidade, data from bitoque";
       
       JasperPrint jaspertPrint = null;
       
       //Caminho Relatório:
     
      InputStream caminhoRelatório = this.getClass().getClassLoader().getResourceAsStream("relatórioADXBAR/relatórioBitoqueADXBAR.jasper");
      try {
          jaspertPrint = JasperFillManager.fillReport(caminhoRelatório, null, conn);
          
      } catch (JRException ex) {
          
       JOptionPane.showMessageDialog(null, "Error:"+ex.getMessage());
      }
      JasperViewer view = new JasperViewer(jaspertPrint, false);
      view.setVisible(true);
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaBitoque = new javax.swing.JTable();
        jImagem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtValordaCompra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUnidade = new javax.swing.JTextField();
        jSpinnerUnidade = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTroco = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnGerarRelatório = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(214, 165, 63));

        jTabelaBitoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIÇÃO", "NOME", "V.DA COMPRA", "MOEDA", "UNIDADE", "DATA"
            }
        ));
        jScrollPane1.setViewportView(jTabelaBitoque);

        jImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaComida/Bitoque branco~1.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setText("Valor da compra :");

        txtValordaCompra.setBackground(new java.awt.Color(214, 165, 63));
        txtValordaCompra.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        txtValordaCompra.setForeground(new java.awt.Color(255, 255, 255));
        txtValordaCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AKZ");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Unidade :");

        txtUnidade.setEditable(false);
        txtUnidade.setBackground(new java.awt.Color(214, 165, 63));
        txtUnidade.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        txtUnidade.setForeground(new java.awt.Color(255, 255, 255));
        txtUnidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jSpinnerUnidade.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jSpinnerUnidade.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));
        jSpinnerUnidade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerUnidadeStateChanged(evt);
            }
        });
        jSpinnerUnidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSpinnerUnidadeMouseReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("AKZ");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Troco :");

        txtTroco.setEditable(false);
        txtTroco.setBackground(new java.awt.Color(214, 165, 63));
        txtTroco.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        txtTroco.setForeground(new java.awt.Color(255, 255, 255));
        txtTroco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTroco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTrocoFocusLost(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Cancel_40972.png"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Tick_Mark_Dark_icon-icons.com_69147.png"))); // NOI18N
        btnConfirmar.setToolTipText("Confirmar");
        btnConfirmar.setContentAreaFilled(false);
        btnConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1455739720_Kitchen_Bold_Line_Color_Mix-28_icon-icons.com_53404.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerUnidade))
                            .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtValordaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValordaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinnerUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        btnVer.setBackground(new java.awt.Color(214, 165, 63));
        btnVer.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnVer.setForeground(new java.awt.Color(153, 255, 255));
        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_millenium_eye_24px_1.png"))); // NOI18N
        btnVer.setToolTipText("Ver");
        btnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        btnVer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnVerKeyPressed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(214, 165, 63));
        btnDeletar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(153, 255, 255));
        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_trash_24px.png"))); // NOI18N
        btnDeletar.setToolTipText("Apagar");
        btnDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        btnDeletar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDeletarKeyPressed(evt);
            }
        });

        btnGerarRelatório.setBackground(new java.awt.Color(214, 165, 63));
        btnGerarRelatório.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_report_file_24px.png"))); // NOI18N
        btnGerarRelatório.setToolTipText("Relatório");
        btnGerarRelatório.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerarRelatório.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatórioActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGerarRelatório, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnVer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGerarRelatório, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
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

        setSize(new java.awt.Dimension(868, 677));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinnerUnidadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerUnidadeStateChanged
        // TODO add your handling code here:

        if((jImagem)!= null)
        {

            int num = 1250;
            int num2 = Integer.parseInt(jSpinnerUnidade.getValue().toString());
            int calc = num*num2;

            txtUnidade.setText(Integer.toString(calc));
        }

        else {

            jSpinnerUnidade.setValue("");

        }

    }//GEN-LAST:event_jSpinnerUnidadeStateChanged

    private void jSpinnerUnidadeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinnerUnidadeMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jSpinnerUnidadeMouseReleased

    private void txtTrocoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTrocoFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTrocoFocusLost

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Limpar os campos de textos:

        txtValordaCompra.setText("");
        txtUnidade.setText("");
        txtTroco.setText("");
        jSpinnerUnidade.setValue(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // Linha de Cód. de Salvar Bitoque:

        BitoqueBean bb = new BitoqueBean();
        BitoqueDao bdao = new BitoqueDao();

        String descrição = "COMIDA";
        String nome = "BITOQUE";
        String moeda ="AKZ";

        if(txtValordaCompra.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Coloque o valor da compra!");

        } else if(jSpinnerUnidade.getValue().equals(0)){

            JOptionPane.showMessageDialog(null, "Coloque o número de unidades!");

        }

        else {

            int num = 1250;
            int num2 =Integer.parseInt(txtValordaCompra.getText());

            if( num2 < num ) {

                JOptionPane.showMessageDialog(null, "Valor não aceite!");
            }
            else {

                bb.setDesc((descrição));
                bb.setNome((nome));
                bb.setValor_da_compra(txtValordaCompra.getText());
                bb.setMoeda((moeda));
                bb.setUnidade(jSpinnerUnidade.getValue().toString());               

                try {

                    bdao.salvarBitoque(bb);

                    JOptionPane.showMessageDialog(null, "BITOQUE, compra feita com Sucesso! ");

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro Bitoque ao Depositar o Valor! /n  Erro: !!"+ex.getMessage());
                }

                calcularBitoque();

            }

            txtValordaCompra.setText("");
            txtUnidade.setText("");
            jSpinnerUnidade.setValue(0);

        }

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        try {
            // TODO add your handling code here:
            oListar();
        } catch (SQLException ex) {
            Logger.getLogger(TelaBitoque.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnVerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnVerKeyPressed
        // Cód. de pressionar na tecla Enter:
    }//GEN-LAST:event_btnVerKeyPressed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // Deletar a lista toda:

        BitoqueDao bdao = new BitoqueDao();
        BitoqueBean bda = new BitoqueBean();

        if(jTabelaBitoque.getSelectedRow() != -1){

            bda.setId((int) jTabelaBitoque.getValueAt(jTabelaBitoque.getSelectedRow(), 0));

            try {
                bdao.delete(bda);
            } catch (SQLException ex) {
                Logger.getLogger(TelaBitoque.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                oListar();
            } catch (SQLException ex) {
            }

        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnDeletarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDeletarKeyPressed
        // Cód. de pressionar na tecla Enter:

    }//GEN-LAST:event_btnDeletarKeyPressed

    private void btnGerarRelatórioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatórioActionPerformed
        // Chamar o Relatório Bitoque:

        final TelaAguarde carregando = new TelaAguarde();
        carregando.setVisible(true);
        Thread t = new Thread() {

            public void run () {
                //Método de imprimir:

                try {
                    try {

                        gerarRelatórioBitoque();

                         carregando.dispose();

                    } catch (JRException ex) {
                        Logger.getLogger(TelaBooster.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (SQLException ex) {

                }

            }

        };

        t.start();
    }//GEN-LAST:event_btnGerarRelatórioActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:

        TelaComida tb = new TelaComida();
        tb.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBitoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBitoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBitoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBitoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBitoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnGerarRelatório;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jImagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerUnidade;
    private javax.swing.JTable jTabelaBitoque;
    private javax.swing.JTextField txtTroco;
    private javax.swing.JTextField txtUnidade;
    private javax.swing.JTextField txtValordaCompra;
    // End of variables declaration//GEN-END:variables
}
