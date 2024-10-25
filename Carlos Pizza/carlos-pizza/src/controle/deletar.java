package controle;
import conexao.conexao;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JFrame;
public class deletar extends javax.swing.JFrame {
conexao con_cliente;
conexao con_cliente2;
conexao con_cliente3;
Estoque voltar;
    public deletar() {
        initComponents();
        con_cliente = new conexao();
        con_cliente.conecta();
        con_cliente.executaSQL("SELECT id_Produto, nome_Produto FROM produto ORDER BY id_Produto");

        
        con_cliente2 = new conexao();
        con_cliente2.conecta();
        con_cliente2.executaSQL("SELECT * FROM categoria ORDER BY id_Cat");
        
        con_cliente3 = new conexao();
        con_cliente3.conecta();
        mostrar_Dados();
    }
    
public void mostrar_Dados() {
    try {
        comboNome.removeAllItems();
        comboNome.addItem("Selecione um produto");
        con_cliente.executaSQL("SELECT id_Produto, nome_Produto FROM produto ORDER BY id_Produto");


        if (!con_cliente.resultset.first()) {
            JOptionPane.showMessageDialog(null, "Não há nenhum produto registrado.");
            return;
        }

        do {
            comboNome.addItem(con_cliente.resultset.getString("nome_Produto"));
        } while (con_cliente.resultset.next());
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro ao buscar produtos: " + erro.getMessage(), "Mensagem do Programa", JOptionPane.ERROR_MESSAGE);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboNome = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCat = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(48, 36, 36));
        setSize(new java.awt.Dimension(450, 400));

        jPanel1.setBackground(new java.awt.Color(48, 36, 36));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("DELETAR");

        comboNome.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        comboNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Produto:");

        confirmar.setBackground(new java.awt.Color(153, 255, 153));
        confirmar.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("ID do produto:");

        txtCat.setEditable(false);
        txtCat.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 204));
        jLabel4.setText("Categoria do produto:");

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(136, 136, 136))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboNome, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                .addComponent(txtCat))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(confirmar)
                .addGap(31, 31, 31))
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
        if (comboNome.getSelectedIndex() == 0) {
        JOptionPane.showMessageDialog(null, "Por favor, selecione um produto.");
        return;
        }
        try {
        String insert_sql = "delete from `produto` where `nome_Produto` = ('" + nome + "')";
        con_cliente.statement.executeUpdate(insert_sql);

        JOptionPane.showMessageDialog(null, "Produto removido com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        
        con_cliente.executaSQL("SELECT id_Produto, nome_Produto FROM produto ORDER BY id_Produto");
        mostrar_Dados();
        
        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n "+errosql, "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_confirmarActionPerformed
            
    private void comboNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNomeActionPerformed
   String nome = (String) comboNome.getSelectedItem();
   
        try {
            String select_sql = "SELECT * FROM produto WHERE nome_Produto = '" + nome + "'";
            con_cliente3.executaSQL(select_sql);
            ResultSet selec = con_cliente3.resultset; 
            
            if (selec.next()) {
                txtId.setText(selec.getString("id_Produto"));
                String idCategoria = selec.getString("id_Cat");
                String select_sql2 = "SELECT tipo FROM categoria WHERE id_Cat = '" + idCategoria + "'";
                con_cliente2.executaSQL(select_sql2);
                ResultSet selec2 = con_cliente2.resultset;

                if (selec2.next()) {
                    txtCat.setText(selec2.getString("tipo"));
                }else{
                    txtId.setText("");
                    txtCat.setText("");
                }
            }else{
                    txtCat.setText("");
                    txtId.setText("");
                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar informações do produto: " + e.getMessage());
        }
    
    }//GEN-LAST:event_comboNomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        voltar = new Estoque();
        voltar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        voltar.setLocationRelativeTo(null);
        voltar.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
                new deletar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboNome;
    private javax.swing.JButton confirmar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCat;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
