package modelos;

/**
 *
 * @author dianita
 */
public class Aguila extends Animal {
    private int tamanoAlas;

    public Aguila() {
    }

    public Aguila(int tamanoAlas, String nombre, int numPatas, int tamano) {
        super(nombre, numPatas, tamano);
        this.tamanoAlas = tamanoAlas;
    }

    public int getTamanoAlas() {
        return tamanoAlas;
    }

    public void setTamanoAlas(int tamanoAlas) {
        this.tamanoAlas = tamanoAlas;
    }

    @Override
    public String toString() {
        return "Aguila{Nombre: " + this.getNombre() + "Numero de patas :" + this.getNumPatas() + 
                "Tamano:" + this.getTamano() + "Tamano de Alas:" + this.getTamanoAlas();
    }
    
    
    
}
//