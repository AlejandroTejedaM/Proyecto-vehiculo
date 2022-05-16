package Agencia;


public class Motocicleta extends Vehiculo{
    private float potencia; 
    private byte rodada;

    public Motocicleta(float potencia, byte rodada, String noSerie, String marca, String modelo, char color) {
        super(noSerie, marca, modelo, color);
        setPotencia (potencia);
        setRodada (rodada);
    }
    public Motocicleta(){
        this(1f,(byte)1,"Sin numero de serie","Sin marca","Sin modelo",'A');
    }
    /**
     * @return the potencia
     */
    public float getPotencia() {
        return potencia;
    }
    
    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the rodada
     */
    public byte getRodada() {
        return rodada;
    }

    /**
     * @param rodada the rodada to set
     */
    public void setRodada(byte rodada) {
        this.rodada = rodada;
    }
    
}
