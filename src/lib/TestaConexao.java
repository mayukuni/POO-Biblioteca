package lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
    private static final String URL = "jdbc:sqlserver://35.171.95.17/1433;databaseName=biblioteca";
    private static final String USUARIO = "sa";
    private static final String SENHA = "Bmdeb@20&Bmdeb@20&";

    public static void main(String[] args) {
        try {
            Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão bem-sucedida com o banco de dados!");
            conexao.close();
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}

