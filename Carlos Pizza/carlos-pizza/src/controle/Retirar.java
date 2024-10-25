package controle;
import conexao.conexao;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.JFrame;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Retirar extends javax.swing.JFrame {
conexao con_cliente;
conexao con_cliente2;
conexao con_cliente3;
Estoque voltar;
    public Retirar() {
        initComponents();
        con_cliente = new conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("select * from produto order by id_Produto");

        con_cliente2 = new conexao();
        con_cliente2.conecta();
        con_cliente2.executaSQL("select NOW()");
        
        con_cliente3 = new conexao();
        con_cliente3.conecta();
        mostrar_Dados();
    }
public void mostrar_Dados() {
    try {
        comboNome.addItem("Selecione um produto");
        while (con_cliente.resultset.next()) {
            comboNome.addItem(con_cliente.resultset.getString("nome_Produto"));
        }
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null,"Não localizou dados: " + erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
    }
            try {
                if (con_cliente2.resultset.next()) {
            Date dataCompleta = con_cliente2.resultset.getTimestamp(1); // Obtém como Timestamp
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dataFormatada = sdf.format(dataCompleta);
            dataTxt.setText(dataFormatada);
        }
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Não localizou dados: " + erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
    }
    atualizarQntd();
}
    private void atualizarQntd() {
    String nome = (String) comboNome.getSelectedItem();
    try {
        con_cliente3.executaSQL("SELECT * FROM produto WHERE nome_Produto = '" + nome + "'");
        if (con_cliente3.resultset.next()) {
            txtQntdA.setText(String.valueOf(con_cliente3.resultset.getInt("quantidade")));
        }
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null,"Erro ao buscar quantidade: " + erro, "Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        confirmar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtQntd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboNome = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        dataTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQntdA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carlos Pizza - Retirar Produto");
        setResizable(false);
        setSize(new java.awt.Dimension(500, 450));

        jPanel1.setBackground(new java.awt.Color(48, 36, 36));

        confirmar.setBackground(new java.awt.Color(153, 255, 153));
        confirmar.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Quantidade atual:");

        txtQntd.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Produto:");

        comboNome.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        comboNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNomeActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dataTxt.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        dataTxt.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 204));
        jLabel5.setText("Data de acesso:");

        txtQntdA.setEditable(false);
        txtQntdA.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 204));
        jLabel6.setText("Quantidade a retirar:");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RETIRAR");
        jLabel2.setAlignmentY(0.0F);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtQntdA, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtQntd, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dataTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(351, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmar)
                        .addGap(175, 175, 175))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtQntdA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtQntd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dataTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(confirmar)
                .addGap(40, 40, 40))
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
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
String nome = (String) comboNome.getSelectedItem();
        int qntdatual = Integer.parseInt(txtQntdA.getText());
        int qntdescrita = Integer.parseInt(txtQntd.getText());
        
        int soma = qntdatual - qntdescrita;
        System.out.println("Soma de quantidade:" + soma);
        
        if (comboNome.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(null, "Por favor, selecione um produto.");
        return;
        }
        if(qntdescrita>=1){
        if(soma>=0){
        try {
            String insert_sql = "update `produto` set `quantidade` = `quantidade` - ('" + qntdescrita + "') where `nome_Produto` = ('" + nome + "')";
            con_cliente.statement.executeUpdate(insert_sql);
 
            JOptionPane.showMessageDialog(null, "Produtos retirados com sucesso!!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            con_cliente.executaSQL("select * from produto order by id_Produto");
            con_cliente.resultset.first();
            atualizarQntd();
            txtQntd.setText("");
        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n "+errosql, "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Não há o suficiente de "+nome+".");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Insira um valor acima de 0.");
        }
    }//GEN-LAST:event_confirmarActionPerformed

    private void comboNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNomeActionPerformed
        atualizarQntd();
    }//GEN-LAST:event_comboNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        voltar = new Estoque();
        voltar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        voltar.setLocationRelativeTo(null);
        voltar.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                new Retirar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboNome;
    private javax.swing.JButton confirmar;
    private javax.swing.JTextField dataTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtQntd;
    private javax.swing.JTextField txtQntdA;
    // End of variables declaration//GEN-END:variables
}
