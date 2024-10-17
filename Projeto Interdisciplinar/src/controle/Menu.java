package controle;
import conexao.conexao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.*;
import java.sql.SQLException;
import javax.swing.*;   
public class Menu extends JFrame {
    Estoque cadest;
    CadastroFunc cadfun;
    CadastroFor cadfor;
    CadastroCat cadcat;
                            // sim, tudo aqui vai ser na mão pq não conseguimos mudar a cor da menubar no form
    public Menu() {
    super("Menu Principal");
    setSize(515, 350);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(48,36,36));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255,255,204));

        JMenu menu = new JMenu("Estoque");
        JMenu menu2 = new JMenu("Cadastro de Funcionário");
        JMenu menu3 = new JMenu("Cadastro de Fornecedor");
        JMenu menu4 = new JMenu("Cadastro de Categoria");
        menu.setForeground(Color.BLACK);
        menu2.setForeground(Color.BLACK);
        menu3.setForeground(Color.BLACK);
        menu4.setForeground(Color.BLACK);
        
        menuBar.add(menu);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);
        
        JMenuItem menuItem1 = new JMenuItem("Entrar");
        JMenuItem menuItem2 = new JMenuItem("Entrar");
        JMenuItem menuItem3 = new JMenuItem("Entrar");
        JMenuItem menuItem4 = new JMenuItem("Entrar");
        
        menuItem1.setBackground(new Color(255,255,204));
        menuItem2.setBackground(new Color(255,255,204));
        menuItem3.setBackground(new Color(255,255,204));
        menuItem4.setBackground(new Color(255,255,204));

        menuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              cadest = new Estoque();
              cadest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              cadest.setLocationRelativeTo(null);
              cadest.setVisible(true);
              setVisible(false);
              dispose();
        }});     
        menuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              cadfun = new CadastroFunc();
              cadfun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              cadfun.setLocationRelativeTo(null);
              cadfun.setVisible(true);
              setVisible(false);
              dispose(); 
        }});
        menuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              cadfor = new CadastroFor();
              cadfor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              cadfor.setLocationRelativeTo(null);
              cadfor.setVisible(true);
              setVisible(false);
              dispose();
        }});
        menuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              cadcat = new CadastroCat();
              cadcat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              cadcat.setLocationRelativeTo(null);
              cadcat.setVisible(true);
              setVisible(false);
              dispose(); 
        }});
        
        menu.add(menuItem1);
        menu2.add(menuItem2);
        menu3.add(menuItem3);
        menu4.add(menuItem4);
     
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }
}