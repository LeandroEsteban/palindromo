import java.util.Scanner;
import java.text.Normalizer;

public class palindromo {

    public static void main(String[] args) {
        String palabra = ingresarPalabra();

        if (esPalindromo(palabra)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo.");
        }
    }

    public static String ingresarPalabra() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra o frase para ver si es palindromo o no:");
        return scanner.nextLine();
    }

    public static boolean esPalindromo(String cadena) {
        String letrasPalindromo = quitarAcentos(cadena).replaceAll("\\s", "").replaceAll(",", "").toLowerCase();
        int longitud = letrasPalindromo.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (letrasPalindromo.charAt(i) != letrasPalindromo.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static String quitarAcentos(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
}
