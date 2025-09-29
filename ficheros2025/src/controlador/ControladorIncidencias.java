package controlador;

import repositorio.Fichero;
import servicio.ServicioFichero;
import vista.Escaner;

public class ControladorIncidencias {

    public static void iniciar(){

        String tipo = Escaner.pedirString("Introduce el usuario:");
        String nombre=Escaner.pedirString("");

        ServicioFichero.guardar();
        ServicioFichero.guardar(new Fichero(tipo, nombre));

        //Pedir usuario
        //Mostrar menú
            //Introducir datos
                //Buscar usuario
                //Buscar fecha

    }
}
