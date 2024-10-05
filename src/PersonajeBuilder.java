// PersonajeBuilder.java
public interface PersonajeBuilder {
    void setTipo(); // Establece el tipo de personaje
    void setAtributos(); // Establece los atributos del personaje
    void setAlineamiento(String alineamiento); // Establece el alineamiento del personaje
    void setIdiomaHablado(); // Establece el idioma hablado por el personaje
    void setGAC0(); // Establece los puntos de ataque GAC0 del personaje
    void setTiradasSalvacion(); // Establece las tiradas de salvación del personaje
    void setMonedasOro(); // Establece las monedas de oro iniciales del personaje
    Personaje getPersonaje(); // Devuelve el objeto Personaje construido
}


