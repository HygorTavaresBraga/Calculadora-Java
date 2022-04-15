
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Calculadora extends javax.swing.JFrame {


    public Calculadora() {
        initComponents();
        txtCalculo.setText("");
        Icone(this);
    }

    Double valor1, valor2;
    String operador;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        painelCabecalho = new javax.swing.JPanel();
        txtVisualizacao = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        painelCentral = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnce = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        txtCalculo = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        btnigual = new javax.swing.JButton();
        btndivisao = new javax.swing.JButton();
        btnmultiplicacao = new javax.swing.JButton();
        btnadicao = new javax.swing.JButton();
        btnsubtracao = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        painelRodape = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);

        painelPrincipal.setBackground(new java.awt.Color(153, 153, 153));
        painelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(400, 500));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelCabecalho.setBackground(new java.awt.Color(51, 51, 51));
        painelCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        painelCabecalho.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtVisualizacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtVisualizacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtVisualizacao.setEnabled(false);
        txtVisualizacao.setFont(new java.awt.Font("Vrinda", 0, 48)); // NOI18N
        painelCabecalho.add(txtVisualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("v 1.0");
        painelCabecalho.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 30, 20));

        painelPrincipal.add(painelCabecalho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 90));

        painelCentral.setBackground(new java.awt.Color(255, 255, 255));
        painelCentral.setForeground(new java.awt.Color(255, 255, 255));
        painelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn7.setFont(new java.awt.Font("Vrinda", 1, 48)); // NOI18N
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/7.png"))); // NOI18N
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        painelCentral.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 50, 40));

        btn8.setFont(new java.awt.Font("Vrinda", 1, 48)); // NOI18N
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/8.png"))); // NOI18N
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        painelCentral.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 50, 40));

        btn9.setFont(new java.awt.Font("Vrinda", 1, 48)); // NOI18N
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/9.png"))); // NOI18N
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        painelCentral.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 50, 40));

        btn4.setFont(new java.awt.Font("Vrinda", 1, 48)); // NOI18N
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.png"))); // NOI18N
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        painelCentral.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 50, 40));

        btn5.setFont(new java.awt.Font("Vrinda", 1, 48)); // NOI18N
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png"))); // NOI18N
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        painelCentral.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 50, 40));

        btn6.setFont(new java.awt.Font("Vrinda", 1, 48)); // NOI18N
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/6.png"))); // NOI18N
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        painelCentral.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 50, 40));

        btn2.setFont(new java.awt.Font("Vrinda", 1, 48)); // NOI18N
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/2.png"))); // NOI18N
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        painelCentral.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 50, 40));

        btn1.setFont(new java.awt.Font("Vrinda", 1, 48)); // NOI18N
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        painelCentral.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 50, 40));

        btnce.setBackground(new java.awt.Color(0, 0, 0));
        btnce.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        btnce.setForeground(new java.awt.Color(255, 255, 255));
        btnce.setText("CE");
        btnce.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnceActionPerformed(evt);
            }
        });
        painelCentral.add(btnce, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 40));

        btnc.setBackground(new java.awt.Color(0, 0, 0));
        btnc.setFont(new java.awt.Font("Corbel", 1, 15)); // NOI18N
        btnc.setForeground(new java.awt.Color(255, 255, 255));
        btnc.setText("C");
        btnc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });
        painelCentral.add(btnc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 50, 40));

        btn10.setFont(new java.awt.Font("Vrinda", 1, 48)); // NOI18N
        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3.png"))); // NOI18N
        btn10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        painelCentral.add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 50, 40));

        txtCalculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCalculo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCalculo.setEnabled(false);
        txtCalculo.setFont(new java.awt.Font("Vrinda", 0, 48)); // NOI18N
        painelCentral.add(txtCalculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 60));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnigual.setFont(new java.awt.Font("Vrinda", 0, 36)); // NOI18N
        btnigual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        btnigual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });

        btndivisao.setFont(new java.awt.Font("Vrinda", 0, 36)); // NOI18N
        btndivisao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/divisao.png"))); // NOI18N
        btndivisao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndivisao.setPreferredSize(new java.awt.Dimension(50, 50));
        btndivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivisaoActionPerformed(evt);
            }
        });

        btnmultiplicacao.setFont(new java.awt.Font("Vrinda", 0, 36)); // NOI18N
        btnmultiplicacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/multiplicacao.png"))); // NOI18N
        btnmultiplicacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmultiplicacao.setPreferredSize(new java.awt.Dimension(50, 50));
        btnmultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicacaoActionPerformed(evt);
            }
        });

        btnadicao.setFont(new java.awt.Font("Vrinda", 0, 36)); // NOI18N
        btnadicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mais.png"))); // NOI18N
        btnadicao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnadicao.setPreferredSize(new java.awt.Dimension(50, 50));
        btnadicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadicaoActionPerformed(evt);
            }
        });

        btnsubtracao.setFont(new java.awt.Font("Vrinda", 0, 36)); // NOI18N
        btnsubtracao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menos.png"))); // NOI18N
        btnsubtracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsubtracao.setPreferredSize(new java.awt.Dimension(50, 50));
        btnsubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubtracaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnadicao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnsubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnmultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btndivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(btnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnadicao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsubtracao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        painelCentral.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 160, 350));

        btn0.setFont(new java.awt.Font("Vrinda", 1, 48)); // NOI18N
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/0.png"))); // NOI18N
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        painelCentral.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 50, 40));

        painelPrincipal.add(painelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 400, 350));

        painelRodape.setBackground(new java.awt.Color(51, 51, 51));
        painelRodape.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("By Hygor Braga");
        painelRodape.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 20));

        painelPrincipal.add(painelRodape, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 400, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Icone(JFrame frm){
        try{
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/img/calculadora.png"));
        }catch(Exception e){
            System.out.print(e.toString());
        }
    }
    
    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
        valor2 = Double.parseDouble(txtCalculo.getText());
        if(operador == "soma"){
            txtVisualizacao.setText(String.valueOf(valor1+valor2));
            txtCalculo.setText("");
                }
        if(operador == "subtracao"){
            txtVisualizacao.setText(String.valueOf(valor1-valor2));
            txtCalculo.setText("");
                }
        if(operador == "multiplicacao"){
            txtVisualizacao.setText(String.valueOf(valor1*valor2));
            txtCalculo.setText("");
                }
        if(operador == "divisao"){
            txtVisualizacao.setText(String.valueOf(valor1/valor2));
            txtCalculo.setText("");
                }
    }//GEN-LAST:event_btnigualActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        txtCalculo.setText(txtCalculo.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnceActionPerformed
        txtVisualizacao.setText("");
    }//GEN-LAST:event_btnceActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        if("".equals(txtCalculo.getText())){
            txtCalculo.setText("3");
        }else{
            txtCalculo.setText(txtCalculo.getText()+"3");
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if("".equals(txtCalculo.getText())){
            txtCalculo.setText("2");
        }else{
            txtCalculo.setText(txtCalculo.getText()+"2");
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if("".equals(txtCalculo.getText())){
            txtCalculo.setText("1");
        }else{
            txtCalculo.setText(txtCalculo.getText()+"1");
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if("".equals(txtCalculo.getText())){
            txtCalculo.setText("6");
        }else{
            txtCalculo.setText(txtCalculo.getText()+"6");
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if("".equals(txtCalculo.getText())){
            txtCalculo.setText("5");
        }else{
            txtCalculo.setText(txtCalculo.getText()+"5");
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if("".equals(txtCalculo.getText())){
            txtCalculo.setText("4");
        }else{
            txtCalculo.setText(txtCalculo.getText()+"4");
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if("".equals(txtCalculo.getText())){
            txtCalculo.setText("9");
        }else{
            txtCalculo.setText(txtCalculo.getText()+"9");
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if("".equals(txtCalculo.getText())){
            txtCalculo.setText("8");
        }else{
            txtCalculo.setText(txtCalculo.getText()+"8");
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if("".equals(txtCalculo.getText())){
            txtCalculo.setText("7");
        }else{
            txtCalculo.setText(txtCalculo.getText()+"7");
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnadicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadicaoActionPerformed
        valor1 = Double.parseDouble(txtCalculo.getText());
        txtCalculo.setText("");
        operador = "soma";
    }//GEN-LAST:event_btnadicaoActionPerformed

    private void btnsubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubtracaoActionPerformed
        valor1 = Double.parseDouble(txtCalculo.getText());
        txtCalculo.setText("");        
        operador = "subtracao";
    }//GEN-LAST:event_btnsubtracaoActionPerformed

    private void btnmultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicacaoActionPerformed
        valor1 = Double.parseDouble(txtCalculo.getText());
        txtCalculo.setText("");        
        operador = "multiplicacao";
    }//GEN-LAST:event_btnmultiplicacaoActionPerformed

    private void btndivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivisaoActionPerformed
        valor1 = Double.parseDouble(txtCalculo.getText());
        txtCalculo.setText("");        
        operador = "divisao";
    }//GEN-LAST:event_btndivisaoActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        valor1 = null;
        valor2 = null;
        txtCalculo.setText("");
    }//GEN-LAST:event_btncActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnadicao;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnce;
    private javax.swing.JButton btndivisao;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmultiplicacao;
    private javax.swing.JButton btnsubtracao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painelCabecalho;
    private javax.swing.JPanel painelCentral;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelRodape;
    private javax.swing.JFormattedTextField txtCalculo;
    private javax.swing.JFormattedTextField txtVisualizacao;
    // End of variables declaration//GEN-END:variables
}
