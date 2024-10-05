// ClerigoBuilder.java
public class ClerigoBuilder implements PersonajeBuilder {
    private Personaje personaje;

    @Override
    public void setTipo() {
        personaje.setTipo("Clérigo");
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
        personaje.setGAC0(19); // GAC0 para clérigos nivel 1
    }

    @Override
    public void setTiradasSalvacion() {
        personaje.setTiradasSalvacion(new int[]{11, 12, 14, 16, 15}); // Valores de la tabla del Clérigo
    }

    @Override
    public void setMonedasOro() {
        personaje.setMonedasOro(AtributosAleatorios.tirar3d6x10());
    }

    @Override
    public Personaje getPersonaje() {
        return personaje;
    }

    public ClerigoBuilder() {
        personaje = new Personaje();
    }
}
