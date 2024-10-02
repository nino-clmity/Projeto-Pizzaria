package conexao;
import javax.swing.JOptionPane;
import java.sql.*; // import de comandos SQL no java 
public class conexao {
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost/pizzaria"; // acessando o banco de dados chamado 'pizzaria'
    final private String usuario = "root";
    final private String senha = "";
    private Connection conexao; // variável armazena a conexão ao banco
    public Statement statement; // variável executa comandos SQL
    public ResultSet resultset; // variável armazena resultado da execução de um comando SQL
    
    public boolean conecta() {
        boolean result = true;
        try { 
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conexão estabelecida","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException Driver){
            JOptionPane.showMessageDialog(null, "Driver não localizado"+Driver,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }catch(SQLException Fonte){
            JOptionPane.showMessageDialog(null, "Fonte de dados não localizada"+Fonte,"Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
            result = false;
        }
        return false;
    }
    
    public void desconecta() {
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Conexão com o banco fechada","Mensagem do Programa",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException fecha){
            
        }
    }
    
    public void executaSQL(String sql){
        try {
            statement = conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            resultset = statement.executeQuery(sql);
        }catch(SQLException excecao){
            JOptionPane.showMessageDialog(null, "Erro no comando SQL! \n Erro: "+excecao,"Mensagem do Programa", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}