package gestorTickets;

import java.util.Random;

public class gestor_tickets {
    public class gestorTickets {
        private static final String CHARACTERS = "123456789ABCDEFHIJKLMNOPQRSTUVWXYZ-"; // caracteres para generar el codigo del ticket

        public static void main(String[] args) {

            // Generador de fecha aleatoria

            // Dia
            Random dia = new Random();
            int fechaDia = 0;

            for (int counter = 2; counter == 2; counter++) {
                fechaDia = dia.nextInt(31);
            }

            // Mes
            Random mes = new Random();
            int fechaMes = 0;

            for (int counter = 2; counter == 2; counter++) {
                fechaMes = mes.nextInt(12);
            }

            // Generador de numero del asiento
            Random asiento = new Random();
            int asientoNumero = 0;

            for (int counter = 2; counter == 2; counter++) {
                asientoNumero = asiento.nextInt(2000);
            }


            // Generador para el codigo del ticket
            int length = 6; // largo de el codigo
            String codigo = generateCodigo(length);


            // Imprimiendo informacion del ticket
            System.out.println("Su codigo es: " + codigo + "\nFecha: " + fechaDia + "/" + fechaMes + "\nSu asiento es: " + asientoNumero);
        }

        public static String generateCodigo(int length) {
            Random random = new Random();
            StringBuilder codigo = new StringBuilder(length);

            for (int i = 0; i < length; i++) {
                int index = random.nextInt(CHARACTERS.length());
                codigo.append(CHARACTERS.charAt(index));
            }
            return codigo.toString();
        }
    }
}
