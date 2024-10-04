// Director.java
public class Director {
    private PersonajeBuilder personajeBuilder;

    public void setPersonajeBuilder(PersonajeBuilder pb) {
        this.personajeBuilder = pb;
    }

    public Personaje getPersonaje() {
        return personajeBuilder.getPersonaje();
    }

    public void construirPersonaje(String alineamiento) {
        personajeBuilder.setTipo();
        personajeBuilder.setAtributos();
        personajeBuilder.setAlineamiento(alineamiento);
        personajeBuilder.setIdiomaHablado();
    }
}
