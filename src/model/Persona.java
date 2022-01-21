package model;

public class Persona {
    private int nroPersona;
    private String nombre;
    private double sueldo;

    public Persona(int nroPersona, String nombre, double sueldo) {
        this.nroPersona = nroPersona;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getNroPersona() {
        return nroPersona;
    }

    public void setNroPersona(int nroPersona) {
        this.nroPersona = nroPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nroPersona=" + nroPersona +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }


    //Metodos

    public double impuesto(){
        double total=0;

        if (this.getSueldo() > 1000.0){
            total = this.getSueldo() - ((this.getSueldo() * 0.1) );
        }

        return total;
    }

    public double impuesto(double descuento){
        double total=0;

        total = this.getSueldo() - ((this.getSueldo() * descuento) );

        return total;
    }

}
