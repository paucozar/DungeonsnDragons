// AtributosAleatorios.java
import java.util.Random;

public class AtributosAleatorios {
    private static Random random = new Random();

    public static int generar() {
        return random.nextInt(16) + 3; // Genera un número entre 3 y 18
    }
}

