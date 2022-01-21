package ejemploLinkedList;

import model.Persona;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Interfaz Collection
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html

        //Clase LinkedList
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/LinkedList.html

        Persona p1 = new Persona(001, "Pablo", 2000.0);
        Persona p2 = new Persona(002, "Ari", 7000.0);
        Persona p3 = new Persona(003, "Mariano", 4000.0);
        Persona p4 = new Persona(001, "Maria", 6000.0);
        Persona p5 = new Persona(001, "Maribel", 10000.0);

        List<Persona> personaList = new LinkedList<>();

        personaList.add(p1);
        personaList.add(p2);
        personaList.add(0,p3);
        personaList.add(p4);
        personaList.add(0,p5);

        for (Persona persona : personaList) {
            System.out.println(persona.getNombre());
        }

    }
}
