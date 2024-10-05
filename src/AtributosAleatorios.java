// AtributosAleatorios.java
import java.util.Random;

public class AtributosAleatorios {
    private static Random random = new Random();

    public static int generar() {
        return random.nextInt(16) + 3; // Genera un número entre 3 y 18
    }

    public static int tirar3d6x10() {
        return (tirarD6() + tirarD6() + tirarD6()) * 10;
    }

    private static int tirarD6() {
        return random.nextInt(6) + 1;
    }
}


