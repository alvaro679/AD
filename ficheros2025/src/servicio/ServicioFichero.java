package servicio;

import modelo.Incidencia;
import repositorio.Fichero;

public class ServicioFichero {

    public static void guardar(String usuario, String fecha){

        Incidencia incidencia = new Incidencia(usuario);
        Fichero pokedex = new Fichero("datos/pokemon.txt");
        pokedex.addDato(pikachu.toString());

    }

    public static void guardar(Pokemon miPokemon){

        Fichero pokedex = new Fichero("datos/pokemon.txt");
        pokedex.addDato(pokedex.toString());

    }

}
