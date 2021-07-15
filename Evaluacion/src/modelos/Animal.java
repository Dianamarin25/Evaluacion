package modelos;

/**
 *
 * @author dianita
 */
public class Animal {
    
    private String nombre;
    private int numPatas;
    private int tamano;

    public Animal() {
    }

    public Animal(String nombre, int numPatas, int tamano) {
        this.nombre = nombre;
        this.numPatas = numPatas;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Animal{Nombre: " + this.getNombre() + "Numero de patas :" + this.getNumPatas() + 
                "Tamano:" + this.getTamano();
    }

    public void setTamanoAlas(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setRaza(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

//