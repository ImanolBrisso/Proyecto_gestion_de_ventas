# Proyecto_gestion_de_ventas

## Uso y Objetivos

- Gestion de Ventas: Los usuarios podran visualizar e ingresar a la lista de partidos disponibles (visualización de posibilidad de acceder al partido y compra de tickets)
- Inicio de sesión y Verificación: Conecta el usuario y se le brindar proteccion a los mismos al iniciar sesión para la compra de su entrada.
- Comprar entradas para un partido donde se les brindará un código de manera aleatoria con un asiento disponible para el partido que deseen elegir.

## Estructura 

### Modulos

- Usuario: Administración, creación de cuentas personales con registro e inicio de sesión. Se hace diferenciacion de Roles entre administrador y usuario.
- Compra: Se generan los valores para la entrada de los usuarios con la fecha de compra, la Id y partido a elegir.
- Gestor de Tickets: Genera valores aleatorios de una fecha, asiento y codigo para comprobar que sea valido el ticket (entrada).

### Flujo e Interacción

- Registro de Usuario: El usuario se registra bajo su nombre, correo electrónico y su contraseña.

- Inicio de Sesión: Se ingresa unicamente con el correo y la contraseña, una vez que se confirman estos mismos datos. Se le da la bienvenida al usuario con el nombre que ingreso previamente en el registro confirmando que funcione correctamente.

- Partidos disponibles: El usuario visualizará los distintos partidos disponibles con sus especificaciones para seleccionar el que desee posteriormente.

- Venta y Compra de Entradas: El cliente opta por la opción que desee seleccionar y procede a comprar la entrada obteniendo así la ID de la misma para saber a que partido corresponde.

- Historial o Visualización de Compras: Se le detallará al usuario la compra que realizó con el ID correspondiente para diferenciarlo y la fecha en el que realizó la misma para comprobar que sea vigente.

- Cierre de Sesión: Se cierra la sesión del usuario para que no quede guardado su registro y para generar mayor seguridad.

- Salida del Sistema: Se finaliza el programa para dejar de interactuar con el usuario.

## Manejo y plataformas utilizadas para los Encuentros

- Discord y Zoom. Nos asignamos diferentes tareas a trabajar y se generaron intercambio de ideas para realizar modificaciones en el proyecto.

## Colaboradores

- Imanol
- Juan

