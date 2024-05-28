import java.util.Scanner;

public class Gestion_de_Ventas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido a tu Gestion de Ventas");

        // Producto
        class Producto {
            private String nombre;
            private double precio;

            public Producto(String nombre, double precio) {
                this.nombre = nombre;
                this.precio = precio;
            }

            public String getNombre() {
                return nombre;
            }

            public double getPrecio() {
                return precio;
            }
        }

        // Cliente - a modificar
        class Cliente {
            private String nombre;

            public Cliente(String nombre) {
                this.nombre = nombre;
            }

            public String getNombre() {
                return nombre;
            }
        }
    }
}
