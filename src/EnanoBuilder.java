// EnanoBuilder.java
public class EnanoBuilder implements PersonajeBuilder {
    private Personaje personaje;

    @Override
    public void setTipo() {
        personaje.setTipo("Enano");
    }

    @Override
    public void setAtributos() {
        personaje.setFuerza(AtributosAleatorios.generar());
        personaje.setInteligencia(AtributosAleatorios.generar());
        personaje.setDestreza(AtributosAleatorios.generar());
        personaje.setConstitucion(AtributosAleatorios.generar());
        personaje.setSabiduria(AtributosAleatorios.generar());
        personaje.setCarisma(AtributosAleatorios.generar());
    }

    @Override
    public void setAlineamiento(String alineamiento) {
        personaje.setAlineamiento(alineamiento);
    }

    @Override
    public void setIdiomaHablado() {
        personaje.setIdiomaHablado("Enano");
    }

    @Override
    public void setGAC0() {
        personaje.setGAC0(19); // GAC0 para enanos nivel 1
    }

    @Override
    public void setTiradasSalvacion() {
        personaje.setTiradasSalvacion(new int[]{8, 9, 10, 13, 12}); // Valores de la tabla del Enano&#8203;:contentReference[oaicite:0]{index=0}
    }

    @Override
    public void setMonedasOro() {
        personaje.setMonedasOro(AtributosAleatorios.tirar3d6x10());
    }

    @Override
    public Personaje getPersonaje() {
        return personaje;
    }

    public EnanoBuilder() {
        personaje = new Personaje();
    }
}
