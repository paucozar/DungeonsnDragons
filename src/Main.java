// Main.java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al creador de personajes!");

        // Generar atributos aleatorios iniciales
        GenericPersonajeBuilder genericBuilder = new GenericPersonajeBuilder();
        director.setPersonajeBuilder(genericBuilder);
        director.construirPersonaje("Sin alineamiento"); // Construir el personaje genérico
        Personaje tempPersonaje = director.getPersonaje();

        // Mostrar atributos generados
        System.out.println("\nAtributos generados:");
        System.out.println("Fuerza: " + tempPersonaje.getFuerza());
        System.out.println("Inteligencia: " + tempPersonaje.getInteligencia());
        System.out.println("Destreza: " + tempPersonaje.getDestreza());
        System.out.println("Constitución: " + tempPersonaje.getConstitucion());
        System.out.println("Sabiduría: " + tempPersonaje.getSabiduria());
        System.out.println("Carisma: " + tempPersonaje.getCarisma());

        // Elección del personaje
        PersonajeBuilder builder = null;
        boolean eleccionValida = false;

        while (!eleccionValida) {
            System.out.println("\nElige un personaje:");
            System.out.println("1. Mago");
            System.out.println("2. Guerrero");
            System.out.println("3. Ladrón");
            System.out.println("4. Clérigo");
            System.out.println("5. Elfo (Requiere Inteligencia >= 9)");
            System.out.println("6. Enano (Requiere Constitución >= 9)");
            System.out.println("7. Mediano (Requiere Destreza >= 9 y Constitución >= 9)");
            System.out.print("Ingresa el número de tu elección: ");

            try {
                int eleccion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (eleccion) {
                    case 1:
                        builder = new MagoBuilder();
                        eleccionValida = true;
                        break;
                    case 2:
                        builder = new GuerreroBuilder();
                        eleccionValida = true;
                        break;
                    case 3:
                        builder = new LadronBuilder();
                        eleccionValida = true;
                        break;
                    case 4:
                        builder = new ClerigoBuilder();
                        eleccionValida = true;
                        break;
                    case 5:
                        if (tempPersonaje.getInteligencia() >= 9) {
                            builder = new ElfoBuilder();
                            eleccionValida = true;
                        } else {
                            System.out.println("No cumples con los requisitos para ser un Elfo (Inteligencia >= 9).");
                        }
                        break;
                    case 6:
                        if (tempPersonaje.getConstitucion() >= 9) {
                            builder = new EnanoBuilder();
                            eleccionValida = true;
                        } else {
                            System.out.println("No cumples con los requisitos para ser un Enano (Constitución >= 9).");
                        }
                        break;
                    case 7:
                        if (tempPersonaje.getDestreza() >= 9 && tempPersonaje.getConstitucion() >= 9) {
                            builder = new MedianoBuilder();
                            eleccionValida = true;
                        } else {
                            System.out.println("No cumples con los requisitos para ser un Mediano (Destreza >= 9 y Constitución >= 9).");
                        }
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opción no válida. Por favor ingresa un número.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }

        // Elección del alineamiento
        String alineamiento = "";
        boolean alineamientoValido = false;

        while (!alineamientoValido) {
            System.out.println("\nElige el alineamiento de tu personaje:");
            System.out.println("1. Caótico");
            System.out.println("2. Legal");
            System.out.println("3. Neutral");
            System.out.print("Ingresa el número de tu elección: ");

            try {
                int alineamientoEleccion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (alineamientoEleccion) {
                    case 1:
                        alineamiento = "Caótico";
                        alineamientoValido = true;
                        break;
                    case 2:
                        alineamiento = "Legal";
                        alineamientoValido = true;
                        break;
                    case 3:
                        alineamiento = "Neutral";
                        alineamientoValido = true;
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opción no válida. Por favor ingresa un número.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }

        // Construir el personaje final
        director.setPersonajeBuilder(builder);
        director.construirPersonaje(alineamiento);
        Personaje personajeFinal = director.getPersonaje();

        // Mostrar la descripción del personaje
        System.out.println("\nDescripción del personaje:");
        System.out.println(personajeFinal);

        scanner.close();
    }
}


