// ElfoBuilder.java
public class ElfoBuilder implements PersonajeBuilder {
    private Personaje personaje;

    @Override
    public void setTipo() {
        personaje.setTipo("Elfo");
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
        personaje.setIdiomaHablado("Élfico");
    }

    @Override
    public Personaje getPersonaje() {
        return personaje;
    }

    public ElfoBuilder() {
        personaje = new Personaje();
    }
}
