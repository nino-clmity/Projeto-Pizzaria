package controle;
import conexao.conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
public class Estoque extends javax.swing.JFrame {
    RegistrarProduto ad;
    Solicitar so;
    Retirar re;
    deletar del;
    Menu voltar;
conexao con_cliente;
conexao con_cliente2;
    public Estoque() {
        initComponents();
        con_cliente = new conexao(); // inicialização do objeto como instância
        con_cliente.conecta();
        con_cliente.executaSQL("SELECT * FROM produto ORDER BY id_Produto");
        
        con_cliente2 = new conexao(); // inicialização do objeto como instância
        con_cliente2.conecta();
        con_cliente2.executaSQL("SELECT * FROM categoria ORDER BY id_Cat");
             
        atualizarData();
        preencherTabela();
        tblProduto.setAutoCreateRowSorter(true);
    }
    public void atualizarData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dataAtual = LocalDate.now().format(formatter);
        
        try{
        String insert_sql = "UPDATE produto SET data_Acesso = '" + dataAtual + "'";
        con_cliente.statement.executeUpdate(insert_sql);
        }catch(SQLException errosql){
           JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n "+errosql, "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void preencherTabela() {
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(45);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(10);
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(30);
        tblProduto.getColumnModel().getColumn(4).setPreferredWidth(30);
        tblProduto.getColumnModel().getColumn(5).setPreferredWidth(40);

   
        
        DefaultTableModel modelo = (DefaultTableModel) tblProduto.getModel();
        modelo.setNumRows(0);
            String select_sql = "SELECT prod.id_Produto, prod.nome_Produto, prod.quantidade, prod.validade, prod.data_Acesso," +
                        " cate.tipo FROM produto AS prod " +
                        "INNER JOIN categoria AS cate ON prod.id_Cat = cate.id_Cat " +
                        "ORDER BY prod.id_Produto";
            // inner join junta as informações das tabelas pra que possam ser exibidas como uma aq em baixo
            
            // "prod." e "cate." são "alias", uns bgl do sql q deixa vc especificar de qual tabela é cada campo
            // pra definir uma alias vc faz (tabela) AS (alias), exemplo: produto AS prod
            // especialmente útil em inner join
            
        try {
            con_cliente.executaSQL(select_sql);
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("id_Produto"),
                    con_cliente.resultset.getString("nome_Produto"),
                    con_cliente.resultset.getString("quantidade"),
                    con_cliente.resultset.getString("validade"),
                    con_cliente.resultset.getString("data_Acesso"),
                    con_cliente.resultset.getString("tipo")});
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }   
    
    
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        Retirarjb = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        Solicitarjb = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Registrarjb = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Deletarb1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 160, 135));
        setForeground(new java.awt.Color(255, 168, 168));

        jPanel3.setBackground(new java.awt.Color(48, 36, 36));

        Retirarjb.setBackground(new java.awt.Color(255, 102, 102));
        Retirarjb.setText("Retirar");
        Retirarjb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetirarjbActionPerformed(evt);
            }
        });

        tblProduto.setAutoCreateRowSorter(true);
        tblProduto.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Quantidade", "Validade", "Data de Acesso", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblProduto);

        Solicitarjb.setBackground(new java.awt.Color(255, 255, 153));
        Solicitarjb.setText("Solicitar");
        Solicitarjb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolicitarjbActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("ESTOQUE");

        Registrarjb.setBackground(new java.awt.Color(153, 255, 153));
        Registrarjb.setText("Registrar");
        Registrarjb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarjbActionPerformed(evt);
            }
        });

        jButton1.setText("voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Deletarb1.setBackground(new java.awt.Color(153, 255, 153));
        Deletarb1.setText("Deletar");
        Deletarb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Deletarb1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(87, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Registrarjb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Solicitarjb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Retirarjb, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Deletarb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(268, 268, 268)))
                .addGap(94, 94, 94))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Deletarb1)
                        .addGap(56, 56, 56)
                        .addComponent(Registrarjb)
                        .addGap(42, 42, 42)
                        .addComponent(Retirarjb)
                        .addGap(52, 52, 52)
                        .addComponent(Solicitarjb))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarjbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarjbActionPerformed
     ad = new RegistrarProduto();
     ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     ad.setVisible(true);
     ad.setLocationRelativeTo(null);
     setVisible(false);
     dispose();
    }//GEN-LAST:event_RegistrarjbActionPerformed

    private void SolicitarjbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolicitarjbActionPerformed
     so = new Solicitar();
     so.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     so.setVisible(true);
     so.setLocationRelativeTo(null);
     setVisible(false);
     dispose();
    }//GEN-LAST:event_SolicitarjbActionPerformed

    private void RetirarjbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetirarjbActionPerformed
     re = new Retirar();
     re.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     re.setVisible(true);
     re.setLocationRelativeTo(null);
     setVisible(false);
     dispose();
    }//GEN-LAST:event_RetirarjbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    voltar = new Menu();
     voltar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     voltar.setLocationRelativeTo(null);
     voltar.setVisible(true);
     setVisible(false);
     dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Deletarb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Deletarb1ActionPerformed
        del = new deletar();
        del.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        del.setVisible(true);
        del.setLocationRelativeTo(null);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_Deletarb1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estoque().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletarb1;
    private javax.swing.JButton Registrarjb;
    private javax.swing.JButton Retirarjb;
    private javax.swing.JButton Solicitarjb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblProduto;
    // End of variables declaration//GEN-END:variables
}
