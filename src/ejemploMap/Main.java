package ejemploMap;

import model.Persona;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Interfaz Map
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.Entry.html

        //clase Hashmap
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashMap.html

        //Interfaz Map.Entry
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.Entry.html

        //Debo agregar tipos de datos que no sean primitivos
        Map<Integer, Persona> mapa = new HashMap<>();

        mapa.put(1, new Persona(0001, "Pablo", 200.0));
        mapa.put(2, new Persona(0001, "Pablo", 200.0));
        /*mapa.put(3, "Maria");
        mapa.put(4, "Maribel");
        mapa.put(5, "Mariano");*/

        for (Map.Entry<Integer, Persona> mapas : mapa.entrySet()) {

            Integer key = mapas.getKey();
            Persona valor = mapas.getValue();
            System.out.println(key +" --> "+ valor);
        }

    }
}
