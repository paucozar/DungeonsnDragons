// PersonajeBuilder.java
public interface PersonajeBuilder {
    void setTipo();
    void setAtributos();
    void setAlineamiento(String alineamiento);
    void setIdiomaHablado();
    Personaje getPersonaje();
}

