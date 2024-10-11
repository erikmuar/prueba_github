import java.util.Random;
import java.util.Scanner;

public class RuletaDeApuestas {
    public static void main(String[] args) {

        System.out.println("Alvaro melon");
        // Definimos las posibilidades de la ruleta
        String[] posibilidades = new String[20];
        for (int i = 0; i < 10; i++) {
            posibilidades[i * 2] = "No ganas nada";
            if (i < 9) {
                posibilidades[i * 2 + 1] = "Premio de " + (i + 1) * 10 + "€";
            } else {
                posibilidades[i * 2 + 1] = "Jackpot de 100€";
            }
        }
        System.out.println("Hola");
        // Pedimos al usuario que ingrese la cantidad que quiere apostar
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuánto dinero quieres apostar? ");
        double apuesta = scanner.nextDouble();

        // Simulamos la ruleta girando
        System.out.println("La ruleta está girando...");
        Random random = new Random();
        int resultado = random.nextInt(20);

        // Mostramos el resultado
        System.out.println("La ruleta ha parado en: " + posibilidades[resultado]);

        // Calculamos el premio
        double premio = 0;
        if (resultado % 2 == 1 && resultado < 19) {
            premio = (resultado / 2 + 1) * 10;
        } else if (resultado == 19) {
            premio = 100;
        }

        // Mostramos el resultado final
        if (premio > 0) {
            System.out.println("¡Has ganado " + premio + "€!");
            System.out.println("Tu nuevo saldo es: " + (apuesta + premio));
        } else {
            System.out.println("Lo siento, no has ganado nada.");
            System.out.println("Tu nuevo saldo es: " + apuesta);
        }
    }
}