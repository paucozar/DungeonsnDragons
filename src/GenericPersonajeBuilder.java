// GenericPersonajeBuilder.java
public class GenericPersonajeBuilder implements PersonajeBuilder {
    private Personaje personaje;

    @Override
    public void setTipo() {
        personaje.setTipo("Genérico");
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
    public void setGAC0() {
        personaje.setGAC0(0); // No aplica para un personaje genérico
    }

    @Override
    public void setTiradasSalvacion() {
        personaje.setTiradasSalvacion(new int[]{0, 0, 0, 0, 0}); // No aplica para un personaje genérico
    }

    @Override
    public void setMonedasOro() {
        personaje.setMonedasOro(AtributosAleatorios.tirar3d6x10());
    }

    @Override
    public Personaje getPersonaje() {
        return personaje;
    }

    public GenericPersonajeBuilder() {
        personaje = new Personaje();
    }
}
