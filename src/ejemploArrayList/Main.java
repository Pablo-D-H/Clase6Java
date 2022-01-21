package ejemploArrayList;

import model.Persona;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Interfaz collection
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Collection.html

        //Clase ArrayList
        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html

        Persona p1 = new Persona(001, "Pablo", 2000.0);
        Persona p2 = new Persona(002, "Ari", 7000.0);
        Persona p3 = new Persona(003, "Mariano", 4000.0);
        Persona p4 = new Persona(001, "Maria", 6000.0);
        Persona p5 = new Persona(001, "Maribel", 10000.0);

        List<Persona> personaList = new ArrayList<>();

        personaList.add(p1);
        personaList.add(p2);
        personaList.add(p3);
        personaList.add(p4);
        personaList.add(p5);

        for (Persona persona : personaList) {
            System.out.println(persona.getNombre());
        }

        Persona pe = personaList.get(0);

        //System.out.println("\n"+pe.getNombre() + " "+ pe.getNroPersona()+" "+ pe.getSueldo());
        System.out.println(pe);

        personaList.remove(0);
        personaList.remove(3);


        System.out.println("");

        for (Persona persona : personaList) {
            System.out.println(persona);
        }

        double sueldoTotalPersona = p1.impuesto();

        System.out.println("\nSueldo total de la persona " + p1.getNombre()+ " es: "+sueldoTotalPersona);


        double sueldoTotalPersona2 = p2.impuesto(0.5);

        System.out.println("\nSueldo total de la persona " + p2.getNombre()+ " es: "+sueldoTotalPersona2);




    }
}
