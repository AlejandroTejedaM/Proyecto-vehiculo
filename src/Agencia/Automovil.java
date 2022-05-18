package Agencia;

public class Automovil extends Vehiculo {

    private float caballosFuerza;
    private float noPuertas;

    public Automovil(float caballosFuerza, float noPuertas, String noSerie, String marca, String modelo, char color) {
        super(noSerie, marca, modelo, color);
        setCaballosFuerza(caballosFuerza);
        setNoPuertas(noPuertas);
    }

    public Automovil() {
        this((float) 1, (float) 1, "SIN NÚMERO", "SIN MARCA", "SIN MODELO", 'N');
    }

    /**
     * @return the caballosFuerza
     */
    public float getCaballosFuerza() {
        return caballosFuerza;
    }

    /**
     * @param caballosFuerza the caballosFuerza to set
     */
    public void setCaballosFuerza(float caballosFuerza) {
        this.caballosFuerza = caballosFuerza > 0 ? this.caballosFuerza = caballosFuerza : 1;
    }

    /**
     * @return the noPuertas
     */
    public float getNoPuertas() {
        return noPuertas;
    }

    /**
     * @param noPuertas the noPuertas to set
     */
    public void setNoPuertas(float noPuertas) {
        this.noPuertas = noPuertas > 0 ? this.noPuertas = noPuertas : 1;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Automovil{" + "caballosFuerza=" + caballosFuerza + ", noPuertas=" + noPuertas + '}';
    }

    @Override
    public double costoVehiculo() {

        return 0;
    }

    @Override
    public String combustible() {

        return null;

    }

}
