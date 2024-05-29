import java.util.Scanner;

public class Gestion_de_Ventas {

    public static void main(String[] args) {

        String[] partidos = {"1. Arsenal vs Liverpool", "2. Porto vs Benfica", "3. Peñarol vs Nacional"};

        System.out.println("Bienvenido a la Seleccion de Partidos Disponibles: ");
        for (int i = 0; i < partidos.length; i++) {
            System.out.println(partidos[i]);
        }

        // Seleccionar partido

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione un partido:(1-" + partidos.length + ")");
        int partidosIndex = scanner.nextInt();

        //se confirma la seleccion

        if (partidosIndex >= 1 && partidosIndex <= partidos.length) {
            String SelecciondePartido = partidos[partidosIndex - 1];
            {
                System.out.println("Seleccionaste el partido: " + SelecciondePartido);
            } // va el else pero me queda marcado en rojo? {
                System.out.println("Has Seleccionado de manera invalida. Por favor selecciona una opción válida");
            } // para colocar en el Main
        }
    }


