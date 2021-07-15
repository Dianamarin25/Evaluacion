package modelos;

/**
 *
 * @author dianita
 */
public class Perro extends Animal {
    
    private String raza;

    public Perro() {
    }

    public Perro(String raza, String nombre, int numPatas, int tamano) {
        super(nombre, numPatas, tamano);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{ Nombre: " + this.getNombre() + "Numero de patas :" + this.getNumPatas() + 
                "Tamano:" + this.getTamano() + "Raza:" + this.getRaza();
    }

    
}
