// Personaje.java
public class Personaje {
    private String tipo;
    private int fuerza;
    private int inteligencia;
    private int destreza;
    private int constitucion;
    private int sabiduria;
    private int carisma;
    private String alineamiento;
    private String idiomaHablado;

    // Setters
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public void setConstitucion(int constitucion) {
        this.constitucion = constitucion;
    }

    public void setSabiduria(int sabiduria) {
        this.sabiduria = sabiduria;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public void setAlineamiento(String alineamiento) {
        this.alineamiento = alineamiento;
    }

    public void setIdiomaHablado(String idiomaHablado) {
        this.idiomaHablado = idiomaHablado;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getConstitucion() {
        return constitucion;
    }

    public int getSabiduria() {
        return sabiduria;
    }

    public int getCarisma() {
        return carisma;
    }

    public String getAlineamiento() {
        return alineamiento;
    }

    public String getIdiomaHablado() {
        return idiomaHablado;
    }

    @Override
    public String toString() {
        return "Personaje: " + tipo + "\n" +
                "Fuerza: " + fuerza + "\n" +
                "Inteligencia: " + inteligencia + "\n" +
                "Destreza: " + destreza + "\n" +
                "Constitución: " + constitucion + "\n" +
                "Sabiduría: " + sabiduria + "\n" +
                "Carisma: " + carisma + "\n" +
                "Alineamiento: " + alineamiento + "\n" +
                "Idioma Hablado: " + idiomaHablado;
    }
}

