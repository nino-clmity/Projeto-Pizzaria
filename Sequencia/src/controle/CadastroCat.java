package controle;
import conexao.conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.*;

public class CadastroCat extends javax.swing.JFrame {
conexao con_cliente;
    public CadastroCat() {
        initComponents();
        con_cliente = new conexao(); // inicialização do objeto como instância
        con_cliente.conecta();
        con_cliente.executaSQL("select * from categoria order by id_Cat");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCat = new javax.swing.JTextField();
        catbt = new javax.swing.JButton();
        catbt2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtCat1 = new javax.swing.JTextField();
        catbt1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        catbt3 = new javax.swing.JButton();

        catbt.setText("Cadastrar");
        catbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catbtActionPerformed(evt);
            }
        });

        catbt2.setText("Cadastrar");
        catbt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catbt2ActionPerformed(evt);
            }
        });

        jLabel5.setText("jLabel5");

        jLabel4.setText("jLabel4");

        jLabel6.setText("jLabel6");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaderretidaicon.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 36, 36));

        txtCat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCat1ActionPerformed(evt);
            }
        });

        catbt1.setBackground(new java.awt.Color(0, 255, 0));
        catbt1.setText("Cadastrar");
        catbt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catbt1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 204, 102));
        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 102));
        jLabel2.setText("Cadastrar");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 102));
        jLabel3.setText("Categoria");

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setText("Nome");

        catbt3.setBackground(new java.awt.Color(255, 51, 51));
        catbt3.setText("Voltar");
        catbt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catbt3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(catbt3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(catbt1)
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(txtCat1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catbt1)
                    .addComponent(catbt3))
                .addGap(47, 47, 47))
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

    private void catbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catbtActionPerformed
       String varcat = txtCat.getText();
        try {
            String insert_sql="insert into `categoria`(`tipo`) values ('" + varcat + "')";
            con_cliente.statement.executeUpdate(insert_sql);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!!","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException errosql){
            JOptionPane.showMessageDialog(null, "\n Erro na gravação :\n "+errosql, "Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_catbtActionPerformed

    private void catbt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catbt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catbt1ActionPerformed

    private void txtCat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCat1ActionPerformed

    private void catbt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catbt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catbt2ActionPerformed

    private void catbt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catbt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catbt3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton catbt;
    private javax.swing.JButton catbt1;
    private javax.swing.JButton catbt2;
    private javax.swing.JButton catbt3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCat;
    private javax.swing.JTextField txtCat1;
    // End of variables declaration//GEN-END:variables
}
