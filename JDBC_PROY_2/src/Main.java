import modelo.Preguntas;
import util.DBConnection;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Preguntas preg = new Preguntas();
        String sql = "INSERT INTO usuarios (nombre, edad) VALUES ('Juan Pérez', 25);";
        try {
            DBConnection.getConnection();
            System.out.println("Te has conectado a la base de datos");

            preg.ejecutar(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}