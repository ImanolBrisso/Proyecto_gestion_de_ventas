import ModelosInfo.*;
// pendiente importar gestor de tickets a modificar
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Entrada> entradas = new ArrayList<>();
    private static List<Compra> compras = new ArrayList<>();
    private static Usuario usuarioActual = null;
    private static int usuarioIdCounter = 1;
    private static int entradaIdCounter = 1;
    private static int compraIdCounter = 1;

    public static void main(String[] args) {
        // Se crean entradas de partidos guia
        crearEntradas();

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("¡Bienvenido a RedTickets, donde podrás comprar tus entradas de manera online!");
            System.out.println("1. Registrarme");
            System.out.println("2. Inicio de Sesión");
            System.out.println("3. Salir...");
            System.out.print("Elija una opción disponible: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    registrarUsuario(scanner);
                    break;
                case 2:
                    iniciarSesion(scanner);
                    break;
                case 3:
                    System.out.println("Gracias por visitarnos. ¡Vuelva pronto!");
                    break;
                default:
                    System.out.println("Verifique que este ingresando la opción correcta por favor. ");
            }
        } while (opcion != 3);
    }

    private static void crearEntradas() {
        entradas.add(new Entrada(entradaIdCounter++, "Arsenal vs Liverpool", "15-05-2024", 150.00, true));
        entradas.add(new Entrada(entradaIdCounter++, "Porto vs Benfica", "16-05-2024", 100.00, true));
        entradas.add(new Entrada(entradaIdCounter++, "Nacional vs Peñarol", "17-05-2024", 80.00, true));
        System.out.println("Se encuentran disponibles entradas para estos mismos partidos");
    }

    private static void registrarUsuario(Scanner scanner) {
        System.out.println("Registro de Usuario");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Correo electronico: ");
        String correo = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();
        String rol = "usuario";  // Se diferencia el rol entre administrador y el de usuario que seria el no intercambiable y de registro para todos por igual.

        Usuario usuario = new Usuario(usuarioIdCounter++, nombre, correo, contraseña, rol);
        usuarios.add(usuario);
        System.out.println("¡Se ha registrado correctamente!.");
        System.out.println("---------------------");
    }

    private static void iniciarSesion(Scanner scanner) {
        System.out.println("Inicio de Sesión");
        System.out.print("Correo electronico: ");
        String correo = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = scanner.nextLine();
        // dar un nuevo enter para proseguir al interactuar en el scanner

        // verificar correctamente la opcion
        usuarioActual = usuarios.stream()
                .filter(u -> u.getCorreo().equals(correo) && u.getContraseña().equals(contraseña))
                .findFirst()
                .orElse(null);

        if (usuarioActual != null) {
            System.out.println("¡Su inicio de sesión fue exitoso!. Bienvenido, " + usuarioActual.getNombre());
            System.out.println("---------------------");
            if (usuarioActual.getRol().equals("administrador")) {
                menuAdministrador(scanner);
            } else {
                menuUsuario(scanner);
            }
        } else {
            System.out.println("Correo o contraseña incorrectos. Verifique que este ingresando las credenciales correctas nuevamente");
        }
    }

    private static void menuAdministrador(Scanner scanner) {
        int opcion;
        do {
            System.out.println("Menú Administrador");
            System.out.println("1. Crear Entrada");
            System.out.println("2. Actualizar Entrada");
            System.out.println("3. Eliminar Entrada");
            System.out.println("4. Cerrar Sesión");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            // realizar salto de linea

            switch (opcion) {
                case 1:
                    crearEntrada(scanner);
                    break;
                case 2:
                    actualizarEntrada(scanner);
                    break;
                case 3:
                    eliminarEntrada(scanner);
                    break;
                case 4:
                    usuarioActual = null;
                    System.out.println("Se ha cerrado la sesión.");
                    break;
                default:
                    System.out.println("Opción Incorrecta. Verifique nuevamente");
            }
        } while (opcion != 4);
    }

    private static void menuUsuario(Scanner scanner) {
        int opcion;
        do {
            System.out.println("Menú Usuario");
            System.out.println("1. Ver Partidos Disponibles");
            System.out.println("2. Comprar Entrada"); // se podría crear una alternativa para ingresar datos bancarios de confirmación
            System.out.println("3. Ver Mis Compras de mis Tickets");
            System.out.println("4. Cerrar Sesión");
            System.out.print("Seleccione una opción correcta: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            // recordar salto de línea y consultar

            switch (opcion) {
                case 1:
                    verEntradasDisponibles();
                    break;
                case 2:
                    comprarEntrada(scanner);
                    break;
                case 3:
                    verMisCompras();
                    break;
                case 4:
                    usuarioActual = null;
                    System.out.println("Has cerrado tu sesión correctamente.");
                    System.out.println("---------------------");
                    break;
                default:
                    System.out.println("Opción Inválida. Verifique nuevamente");
                    System.out.println("---------------------"); 
            }
        } while (opcion != 4);
    }

    private static void crearEntrada(Scanner scanner) {
        System.out.println("Creación de Entrada");
        System.out.print("Partido: ");
        String partido = scanner.nextLine();
        System.out.print("Fecha: ");
        String fecha = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        boolean disponibilidad = true;  // se verifica que hay disponibilidad con el true si no la hay será false - hacer un partido de prueba sin entradas

        Entrada entrada = new Entrada(entradaIdCounter++, partido, fecha, precio, disponibilidad);
        entradas.add(entrada);
        System.out.println("Entrada creada exitosamente.");
    }

    private static void actualizarEntrada(Scanner scanner) {
        System.out.println("Actualización de Entrada");
        System.out.print("ID de la Entrada: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        // realizar salto de línea \n
        System.out.print("Partido: ");
        String partido = scanner.nextLine();
        System.out.print("Fecha: ");
        String fecha = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Disponibilidad (true/false): ");
        boolean disponibilidad = scanner.nextBoolean();

        Entrada entrada = entradas.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
        if (entrada != null) {
            entrada.setPartido(partido);
            entrada.setFecha(fecha);
            entrada.setPrecio(precio);
            entrada.setDisponibilidad(disponibilidad);
            System.out.println("Se ha actualizado la entrada correctamente.");
        } else {
            System.out.println("No se ha logrado localizar la entrada de manera correcta. Verifique nuevamente.");
        }
    }

    private static void eliminarEntrada(Scanner scanner) {
        System.out.println("Eliminación de Entrada");
        System.out.print("ID de la Entrada: ");
        int id = scanner.nextInt();

        Entrada entrada = entradas.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
        if (entrada != null) {
            entradas.remove(entrada);
            System.out.println("Se ha eliminado la entrada correctamente.");
        } else {
            System.out.println("No se ha logrado localizar la entrada de manera correcta. Verifique nuevamente para poder eliminarla.");
        }
    }

    private static void verEntradasDisponibles() {
        System.out.println("Entradas Disponibles");
        entradas.stream().filter(Entrada::isDisponibilidad).forEach(entrada -> {
            System.out.println("ID: " + entrada.getId());
            System.out.println("Partido: " + entrada.getPartido());
            System.out.println("Fecha: " + entrada.getFecha());
            System.out.println("Precio: " + entrada.getPrecio());
            System.out.println("Disponibilidad: " + entrada.isDisponibilidad());
            System.out.println("---------------------");
        });
    }

    private static void comprarEntrada(Scanner scanner) {
        System.out.println("Compra de Entrada");
        System.out.print("ID de la Entrada: ");
        int entradaId = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        Entrada entrada = entradas.stream().filter(e -> e.getId() == entradaId && e.isDisponibilidad()).findFirst().orElse(null);
        if (entrada != null) {
            Compra compra = new Compra(compraIdCounter++, usuarioActual.getId(), entradaId, java.time.LocalDate.now().toString());
            compras.add(compra);
            entrada.setDisponibilidad(false);
            System.out.println("Tu compra se ha realizado correctamente.");
            System.out.println("---------------------");
        } else {
            System.out.println("Entrada no disponible.");
            System.out.println("---------------------");
        }
    }

    private static void verMisCompras() {
        System.out.println("Mis Compras");
        compras.stream().filter(c -> c.getUsuarioId() == usuarioActual.getId()).forEach(compra -> {
            System.out.println("ID de Compra: " + compra.getId());
            System.out.println("ID de Entrada: " + compra.getEntradaId());
            System.out.println("Fecha de Compra: " + compra.getFechaCompra()); // verificar fecha ingresada actualizada al día actual (de hoy)
            System.out.println("Recuerde presentar este mismo ticket en puerta.");
            System.out.println("---------------------");
        });
    }
}
