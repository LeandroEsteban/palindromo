import java.util.Scanner;

public class palindromo {

    public static void main(String[] args) {
        String palabra = obtenerPalabra();

        while (!esPalabraValida(palabra)) {
            System.out.println("La palabra ingresada no es válida. Debe contener solo letras.");
            palabra = obtenerPalabra();
        }

        if (esPalindromo(palabra)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }

    public static String obtenerPalabra() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        return scanner.nextLine();
    }

    public static boolean esPalabraValida(String palabra) {
        return palabra.matches("[a-zA-Z]+");
    }

    public static boolean esPalindromo(String cadena) {
        int longitud = cadena.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
