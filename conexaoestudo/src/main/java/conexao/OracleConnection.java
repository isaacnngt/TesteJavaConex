package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {

    private static final
    String URL = "jdbc:oracle:thin:@//localhost:1521/xe";
    // Substitua pelos seus dados
    private static final String USUARIO = "system"; // Substitua pelo seu usuário
    private static final String SENHA = "123"; // Substitua pela sua senha

    public static Connection getConnection() throws SQLException {
        try {
            // Obtém a conexão com o banco de dados
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            // Trata a exceção de forma adequada (log, mensagem de erro, etc.)
            System.err.println("Erro ao conectar ao banco de dados Oracle: " + e.getMessage());
            throw e; // Lança a exceção para que seja tratada em outro lugar
        }
    }
}