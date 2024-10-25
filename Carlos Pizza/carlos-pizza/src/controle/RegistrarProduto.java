package controle;
import conexao.conexao;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.JFrame;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
public class RegistrarProduto extends javax.swing.JFrame {
conexao con_cliente;
conexao con_cliente2;
conexao con_cliente3;
conexao con_cliente4;
Estoque voltar;
    public RegistrarProduto() {
        initComponents();
        
        con_cliente = new conexao(); // inicialização do objeto como instância
        con_cliente.conecta();
        con_cliente.executaSQL("select * from produto order by id_Produto");
        
        con_cliente2 = new conexao(); // inicialização do objeto como instância
        con_cliente2.conecta();
        con_cliente2.executaSQL("select * from funcionario order by id_Fun");
        
        con_cliente3 = new conexao(); // inicialização do objeto como instância
        con_cliente3.conecta();
        con_cliente3.executaSQL("select * from fornecedor order by idFor");
        
        con_cliente4 = new conexao(); // inicialização do objeto como instância
        con_cliente4.conecta();
        con_cliente4.executaSQL("select * from categoria order by id_Cat");
             
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataAtual = LocalDate.now().format(formatter);
        txtData.setText(dataAtual);

        mostrar_Dados();
        }
public void mostrar_Dados() {
    try {
        // valores padrão na index 0
        comboFun.addItem("N/A");
        comboFor.addItem("Selecione um fornecedor");
        comboCat.addItem("Selecione uma categoria");
        
        while (con_cliente2.resultset.next()) {
            comboFun.addItem(con_cliente2.resultset.getString("id_Fun")); // Popula o ComboBox com id_Fun
        }
        while (con_cliente3.resultset.next()) {
            comboFor.addItem(con_cliente3.resultset.getString("nomeE"));
        }
        while (con_cliente4.resultset.next()) {
            comboCat.addItem(con_cliente4.resultset.getString("tipo"));
    }
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null,"Não localizou dados: " + erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
    }
}
                       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollBar2 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cadastrar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtQntd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        limpar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboFun = new javax.swing.JComboBox<>();
        comboFor = new javax.swing.JComboBox<>();
        comboCat = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtVal = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carlos Pizza - Cadastro de Produto");

        jPanel1.setBackground(new java.awt.Color(48, 36, 36));

        jLabel5.setBackground(new java.awt.Color(255, 255, 204));
        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Validade:");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Quantidade:");

        cadastrar.setBackground(new java.awt.Color(153, 255, 153));
        cadastrar.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        txtQntd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("Garet Book", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("CADASTRAR PRODUTO");

        limpar.setBackground(new java.awt.Color(255, 102, 102));
        limpar.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 204));
        jLabel9.setText("Fornecedor:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 204));
        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 204));

        jLabel11.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 204));
        jLabel11.setText("Categoria:");

        comboFun.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N

        comboFor.setFont(new java.awt.Font("Lucida Sans", 1, 10)); // NOI18N

        comboCat.setFont(new java.awt.Font("Lucida Sans", 1, 10)); // NOI18N
        comboCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCatActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 204));
        jLabel12.setText("ID do funcionário atual:");

        try {
            txtVal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtVal.setCaretColor(new java.awt.Color(204, 204, 204));
        txtVal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtVal.setName(""); // NOI18N

        jLabel7.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 204));
        jLabel7.setText("Data:");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setCaretColor(new java.awt.Color(204, 204, 204));
        txtData.setEnabled(false);
        txtData.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtData.setName(""); // NOI18N
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(comboFor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(21, 21, 21)
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(comboCat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 17, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtVal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel7))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtQntd, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(130, 130, 130)
                                    .addComponent(jLabel10)
                                    .addGap(17, 17, 17)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(comboFun, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(cadastrar)
                                            .addGap(26, 26, 26)
                                            .addComponent(limpar)))))
                            .addComponent(jLabel5))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtQntd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboFor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(comboCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(comboFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpar)
                    .addComponent(cadastrar)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
    txtNome.setText("");
    txtQntd.setText("");
    txtVal.setText("");
    comboCat.setSelectedIndex(0);
    comboFor.setSelectedIndex(0);
    }//GEN-LAST:event_limparActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String dataAtual = LocalDate.now().format(formatter);
    String nome = txtNome.getText();
    String quantidade = txtQntd.getText();
    String validade = txtVal.getText();
    String validadeConvertida;
    
    if (comboFun.getSelectedIndex() == 0 || comboFor.getSelectedIndex() == 0 || comboCat.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(null, "Por favor, selecione todos os registros.");
        return;
    }
    try {
        DateTimeFormatter entradaFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataValidade = LocalDate.parse(validade, entradaFormatter);
        validadeConvertida = dataValidade.format(formatter);
        System.out.println("Data Convertida: " + validadeConvertida);
    } catch (DateTimeParseException e) {
        JOptionPane.showMessageDialog(null, "Data de validade no formato incorreto: " + validade, "Erro", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    String dataAcesso = dataAtual;
    String idfun = (String) comboFun.getSelectedItem();
    String forn = (String) comboFor.getSelectedItem();
    String cate = (String) comboCat.getSelectedItem();
    int idFor = 0;
    int idCat = 0;

    String select_sql = "SELECT idFor FROM fornecedor WHERE nomeE = '" + forn + "'";
    con_cliente3.executaSQL(select_sql);
    try {
        if (con_cliente3.resultset.next()) {
            idFor = con_cliente3.resultset.getInt("idFor");
        } else {
            JOptionPane.showMessageDialog(null, "Fornecedor não encontrado, tente novamente");
            return;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "\n Erro ao buscar dados :\n " + e, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    String select_sql2 = "SELECT id_Cat FROM categoria WHERE tipo = '" + cate + "'";
    con_cliente4.executaSQL(select_sql2);
    try {
        if (con_cliente4.resultset.next()) {
            idCat = con_cliente4.resultset.getInt("id_Cat");
        } else {
            JOptionPane.showMessageDialog(null, "Categoria não encontrada, tente novamente");
            return;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "\n Erro ao buscar dados :\n " + e, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    try {
        String insert_sql = "insert into `produto`(`id_Fun`,`id_Cat`,`id_For`,`nome_Produto`,`quantidade`,`validade`,`data_Acesso`) values ('" 
                            + idfun + "', '" + idCat + "','" + idFor + "','" + nome + "','" + quantidade + "','" + validadeConvertida + "','" + dataAcesso + "')";
        con_cliente.statement.executeUpdate(insert_sql);

        JOptionPane.showMessageDialog(null, "Produto registrado com sucesso!!", "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        con_cliente.executaSQL("select * from produto order by id_Produto");
        con_cliente.resultset.first();
    } catch (SQLException errosql) {
        JOptionPane.showMessageDialog(null, "\n Erro ao inserir: \n " + errosql, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     voltar = new Estoque();
     voltar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     voltar.setLocationRelativeTo(null);
     voltar.setVisible(true);
     setVisible(false);
     dispose(); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void comboCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCatActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFunc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JComboBox<String> comboCat;
    private javax.swing.JComboBox<String> comboFor;
    private javax.swing.JComboBox<String> comboFun;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollBar jScrollBar2;
    private javax.swing.JButton limpar;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQntd;
    private javax.swing.JFormattedTextField txtVal;
    // End of variables declaration//GEN-END:variables
}