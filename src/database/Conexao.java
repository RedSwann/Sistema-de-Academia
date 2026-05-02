package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL =
            "jdbc:postgresql://localhost:5432/smartgymdb";

    private static final String USUARIO = "postgres";
    private static final String SENHA = "1234";

    public static Connection conectar(){

        try{
            Connection conn =
                    DriverManager.getConnection(URL, USUARIO, SENHA);

            System.out.println("Conectado ao banco!");
            return conn;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar");
            e.printStackTrace();
            return null;
        }
    }
}