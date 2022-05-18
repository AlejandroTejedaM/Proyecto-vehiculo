package Agencia;

public class CRUD {

    private Vehiculo[] array;
    private int indice;

    public CRUD() {
        array = new Vehiculo[100];
        indice = 0;
    }

    /**
     * @return the vehiculo
     */
    public Vehiculo[] getVehiculo() {
        return array;
    }

    /**
     * @param array the array to set
     */
    public void setVehiculo(Vehiculo[] array) {
        this.array = array;
    }

    /**
     * @return the indice
     */
    public int getIndice() {
        return indice;
    }

    /**
     * @param indice the indice to set
     */
    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void create(Vehiculo vehiculo) {
        array[indice] = vehiculo;
        indice++;
    }

    public String read() {
        String cadena = "";
        for (int i = 0; i < indice; i++) {
            cadena += array[i].toString() + "\n";
        }
        return cadena;
    }
}
