package controle;
import conexao.conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.*;
import javax.swing.JFrame;
public class design extends javax.swing.JFrame {
conexao con_cliente;
Adicionar add;
    public design() {
        initComponents();
        con_cliente = new conexao(); // inicialização do objeto como instância
        con_cliente.conecta();
        con_cliente.executaSQL("select * from pizzaria order by id_Produto");
        preencherTabela();
        tblProduto.setAutoCreateRowSorter(true);
    }
    
    public void preencherTabela() {
        tblProduto.getColumnModel().getColumn(0).setPreferredWidth(6);
        tblProduto.getColumnModel().getColumn(1).setPreferredWidth(45);
        tblProduto.getColumnModel().getColumn(2).setPreferredWidth(45);
        tblProduto.getColumnModel().getColumn(3).setPreferredWidth(11);
        tblProduto.getColumnModel().getColumn(4).setPreferredWidth(10);
        tblProduto.getColumnModel().getColumn(5).setPreferredWidth(10);
   
        
        DefaultTableModel modelo = (DefaultTableModel) tblProduto.getModel();
        modelo.setNumRows(0);
        
        try {
            con_cliente.resultset.beforeFirst();
            while(con_cliente.resultset.next()){
                modelo.addRow(new Object[]{
                    con_cliente.resultset.getString("ID"),con_cliente.resultset.getString("Nome"),con_cliente.resultset.getString("Categoria"),con_cliente.resultset.getString("Quantidade"), con_cliente.resultset.getString("Validade")
                });
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"\n Erro ao listar dados da tabela!! :\n "+erro,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        Consultar1 = new javax.swing.JButton();
        Retirar1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProduto1 = new javax.swing.JTable();
        Solicitar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Adicionar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 160, 135));
        setForeground(new java.awt.Color(255, 168, 168));

        jPanel3.setBackground(new java.awt.Color(48, 36, 36));

        Consultar1.setBackground(new java.awt.Color(170, 134, 174));
        Consultar1.setText("Consultar");
        Consultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar1ActionPerformed(evt);
            }
        });

        Retirar1.setBackground(new java.awt.Color(255, 102, 102));
        Retirar1.setText("Retirar");

        tblProduto1.setAutoCreateRowSorter(true);
        tblProduto1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tblProduto1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Categoria", "Quantidade", "Validade", "Data de Acesso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblProduto1);

        Solicitar1.setBackground(new java.awt.Color(255, 255, 153));
        Solicitar1.setText("Solicitar");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("ESTOQUE");

        Adicionar1.setBackground(new java.awt.Color(153, 255, 153));
        Adicionar1.setText("Adicionar");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Solicitar1)
                            .addComponent(Adicionar1)
                            .addComponent(Consultar1)
                            .addComponent(Retirar1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Consultar1)
                        .addGap(43, 43, 43)
                        .addComponent(Adicionar1)
                        .addGap(40, 40, 40)
                        .addComponent(Solicitar1)
                        .addGap(35, 35, 35)
                        .addComponent(Retirar1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Consultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Consultar1ActionPerformed
    private void txt_pesquisaKeyReleased(java.awt.event.ActionEvent evt) {
        try{
            String pesquisa = "select * from cliente where nome like '" + txt_pesquisa.getText() + "%'";
            con_cliente.executaSQL(pesquisa);
            
            if(con_cliente.resultset.first()){
                preencherTabela();
            }else{
                JOptionPane.showMessageDialog(null,"\n Não existem dados com esse parâmetro!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null,"\n Os dados digitados não foram localizados!! :\n "+errosql,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new design().setVisible(true);
            }
        });
    }
    
    private void tb1ClientesMouseClicked(java.awt.event.MouseEvent evt) {
        int linha_selecionada = tblProduto.getSelectedRow();
        txtCod.setText(tblProduto.getValueAt(linha_selecionada, 0).toString());
        txtNome.setText(tblProduto.getValueAt(linha_selecionada, 1).toString());
        txtCat.setText(tblProduto.getValueAt(linha_selecionada, 2).toString());
        txtQntd.setText(tblProduto.getValueAt(linha_selecionada, 3).toString());
        txtVal.setText(tblProduto.getValueAt(linha_selecionada, 4).toString());
    }
    
    private void tb1ClientesKeyPressed(java.awt.event.KeyEvent evt) {
        int linha_selecionada = tblProduto.getSelectedRow();
        txtCod.setText(tblProduto.getValueAt(linha_selecionada, 0).toString());
        txtNome.setText(tblProduto.getValueAt(linha_selecionada, 1).toString());
        txtCat.setText(tblProduto.getValueAt(linha_selecionada, 2).toString());
        txtQntd.setText(tblProduto.getValueAt(linha_selecionada, 3).toString());
        txtVal.setText(tblProduto.getValueAt(linha_selecionada, 4).toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar1;
    private javax.swing.JButton Consultar1;
    private javax.swing.JButton Retirar1;
    private javax.swing.JButton Solicitar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblProduto1;
    // End of variables declaration//GEN-END:variables
}
