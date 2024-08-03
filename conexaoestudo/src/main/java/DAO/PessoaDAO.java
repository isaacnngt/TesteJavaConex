package DAO;

import conexao.OracleConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDAO {

    public void inserirPessoa(String nome) {
        String sql = "INSERT INTO ZACDBA.PESSOA (ID_PESSOA, NOME, DATA_INCLUSAO) " +
                "VALUES (ZACDBA.ID_PESSOA_SEQ.NEXTVAL, ?, SYSDATE)";

        try (Connection conn = OracleConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.executeUpdate();
            System.out.println("Pessoa inserida com sucesso!");

        } catch (SQLException e) {
            System.err.println("Erro ao inserir pessoa: " + e.getMessage());
            // Trate a exceção de forma adequada (log, etc.)
        }
    }
}