// Director.java
public class Director {
    private PersonajeBuilder personajeBuilder;

    // Establece el builder que se utilizará para construir el personaje
    public void setPersonajeBuilder(PersonajeBuilder pb) {
        this.personajeBuilder = pb;
    }

    // Método para construir el personaje llamando a los métodos del builder
    public Personaje getPersonaje() {
        return personajeBuilder.getPersonaje();
    }

    // Método que construye el personaje utilizando el builder
    public void construirPersonaje(String alineamiento) {
        personajeBuilder.setTipo(); // Establece el tipo
        personajeBuilder.setAtributos(); // Establece los atributos
        personajeBuilder.setAlineamiento(alineamiento); // Establece el alineamiento
        personajeBuilder.setIdiomaHablado(); // Establece el idioma
        personajeBuilder.setGAC0(); // Establece los puntos de ataque GAC0
        personajeBuilder.setTiradasSalvacion(); // Establece las tiradas de salvación
        personajeBuilder.setMonedasOro(); // Establece las monedas de oro
    }
}

