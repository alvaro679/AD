package modelo;

import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Preguntas {

    private int id;
    private String pregunta;
    private String respuesta;

    public int ejecutar(String sql) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int datos = 0;

        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(sql);
            datos =stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (conn != null) {
                conn.close();
            }
        }
        return datos;
    }

    public String generarInsert(Preguntas item){

        String sql="INSERT INTO ENTRENAMINETO  (ID, INTENSIDAD, SERIES, TIPO) VALUES( NULL, %d,%d, '%s')";
        // sql = sql.concat(item.intensidad + "," + item.series + ",'" + item.tipo + "');" );
        Connection con;

        try {

            con = DBConnection.getConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sql;
    }
}
