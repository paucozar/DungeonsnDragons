// MagoBuilder.java
public class MagoBuilder implements PersonajeBuilder {
    private Personaje personaje;

    @Override
    public void setTipo() {
        personaje.setTipo("Mago");
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
        personaje.setIdiomaHablado("Común");
    }

    @Override
    public Personaje getPersonaje() {
        return personaje;
    }

    public MagoBuilder() {
        personaje = new Personaje();
    }
}
