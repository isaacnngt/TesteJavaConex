package princ;

import conexao.OracleConnection;
import DAO.PessoaDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try (Connection conn = OracleConnection.getConnection()) {
            if (conn != null && !conn.isClosed()) {
                System.out.println("Conexão com o banco de dados Oracle estabelecida com sucesso!");
            } else {
                System.err.println("Falha ao estabelecer conexão com o banco de dados Oracle.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao testar a conexão: " + e.getMessage());
        }

        PessoaDAO dao = new PessoaDAO();
        dao.inserirPessoa("REBECA"); // Insere uma pessoa com o nome "DAYANA"
    }

}