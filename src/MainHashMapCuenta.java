import java.util.HashMap;
import java.util.Scanner;

public class MainHashMapCuenta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> contador = new HashMap<>();

        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();

        // Separar el texto en palabras
        String[] palabras = texto.split(" ");

        // Recorrer el array
        for (int i = 0; i < palabras.length; i++) {

            String palabra = palabras[i];

            if (contador.containsKey(palabra)) {
                // Si ya existe, sumamos 1
                contador.put(palabra, contador.get(palabra) + 1);
            } else {
                // Si no existe, la añadimos con valor 1
                contador.put(palabra, 1);
            }
        }

        // Mostrar resultados
        System.out.println("Número de veces que aparece cada palabra:");

        for (String palabra : contador.keySet()) {
            System.out.println(palabra + " = " + contador.get(palabra));
        }

        sc.close();
    }
}
