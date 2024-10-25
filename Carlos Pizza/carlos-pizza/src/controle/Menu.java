package controle;
import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;   
public class Menu extends JFrame {
    Estoque cadest;
    CadastroFunc cadfun;
    CadastroFor cadfor;
    CadastroCat cadcat;
    RegistrarProduto regprod;
    login log;
    
                            // sim, tudo aqui vai ser na mão pq não conseguimos mudar a cor da menubar no form
    public Menu() {
    super("Carlos Pizza - Menu Principal");
    setSize(515, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(48,36,36));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(255,255,204));

        JMenu menu = new JMenu("Controle de Estoque");
        JMenu menu2 = new JMenu("Cadastros");
        JMenu menu3 = new JMenu("Outros");
        menu.setForeground(Color.BLACK);
        menu2.setForeground(Color.BLACK);
        menu3.setForeground(Color.BLACK);
        
        menuBar.add(menu);
        menuBar.add(menu2);
        menuBar.add(menu3);
        
        JMenuItem menuItem1 = new JMenuItem("Ver estoque");
        JMenuItem menuItem2 = new JMenuItem("Registrar produto novo");
        JMenuItem menuItem3 = new JMenuItem("Cadastrar Fornecedor");
        JMenuItem menuItem4 = new JMenuItem("Cadastrar Funcionário");
        JMenuItem menuItem5 = new JMenuItem("Cadastrar Categoria");
        JMenuItem menuItem6 = new JMenuItem("Logout");
        JMenuItem menuItem7 = new JMenuItem("Fechar o programa");
        
        menuItem1.setBackground(new Color(255,255,204));
        menuItem2.setBackground(new Color(255,255,204));
        menuItem3.setBackground(new Color(255,255,204));
        menuItem4.setBackground(new Color(255,255,204));
        menuItem5.setBackground(new Color(255,255,204));
        menuItem6.setBackground(new Color(255,255,204));
        menuItem7.setBackground(new Color(255,255,204));

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
              regprod = new RegistrarProduto();
              regprod.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              regprod.setLocationRelativeTo(null);
              regprod.setVisible(true);
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
              cadfun = new CadastroFunc();
              cadfun.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              cadfun.setLocationRelativeTo(null);
              cadfun.setVisible(true);
              setVisible(false);
              dispose(); 
        }});
        menuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              cadcat= new CadastroCat();
              cadcat.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              cadcat.setLocationRelativeTo(null);
              cadcat.setVisible(true);
              setVisible(false);
              dispose(); 
        }});
        menuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              log= new login();
              log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              log.setLocationRelativeTo(null);
              log.setVisible(true);
              setVisible(false);
              dispose(); 
        }});
        menuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOptionPane.showMessageDialog(null, "Obrigado por utilizar o nosso software.");
                System.exit(0);
        }});
        
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu2.add(menuItem3);
        menu2.add(menuItem4);
        menu2.add(menuItem5);
        menu3.add(menuItem6);
        menu3.add(menuItem7);
     
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Menu menu = new Menu();
            menu.setVisible(true);
        });
    }
}