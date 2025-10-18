package GestionClubDeportivo;

import ClubDeportivo.Cancha;

public class GestionCanchas {
    // 1. ATRIBUTOS: Mover la lista y el scanner aquí.
    private ArrayList<Cancha> listaCanchas;
    private Scanner sc;

    // 2. CONSTRUCTOR: Inicializar la lista y el scanner.
    public GestionCanchas() {
        this.listaCanchas = new ArrayList<>();
        // Asumiendo que el Scanner es el mismo que se usa en Main o se crea uno nuevo
        // Lo ideal es que el Scanner se maneje de forma centralizada, pero por ahora lo creamos aquí.
        this.sc = new Scanner(System.in);
    }

    // 3. MÉTODO PRINCIPAL DE GESTIÓN (Toma el lugar del 'case 1' en el main)
    public void mostrarMenuCanchas() {
        int opcionCanchas = -1;
        while (opcionCanchas != 0) {
            System.out.println("\n--- 🎾 Gestión de Canchas ---");
            System.out.println("1. Registrar una cancha");
            System.out.println("2. Modificar una cancha");
            System.out.println("3. Eliminar una cancha");
            System.out.println("4. Consultas");
            System.out.println("0. Volver al Menú Principal");

            try {
                opcionCanchas = sc.nextInt();
                sc.nextLine(); // Limpiar buffer
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número.");
                sc.nextLine(); // Limpiar el buffer si hay error
                opcionCanchas = -1;
                continue;
            }

            switch (opcionCanchas) {
                case 1:
                    registrarCanchas(); // Llama al registrarCanchas
                    break;
                case 2:
                    modificarCanchas(); // Llama al método modificarCanchas
                    break;
                case 3:
                    eliminarCanchas(); // Llama al método eliminarCanchas
                    break;
                case 4:
                    mostrarMenuConsultas(); // Llama al menú de consultas
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    public void registrarCanchas() {
        System.out.println("--REGISTRAR CANCHAS--");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Deporte: ");
        String deporte = sc.nextLine();

        System.out.println("¿Cubierta? S/N");
        String cubiertaStr = sc.nextLine();
        boolean cubierta = cubiertaStr.equalsIgnoreCase("s");

        System.out.println("Capacidad: ");
        int capacidad = sc.nextInt();
        sc.nextLine();

        System.out.println("Estado: (disponible/reservada/ocupada");
        String estado = sc.nextLine();

        System.out.println("Características: (separadas por coma)");
        String[] caracteristicasArray = sc.nextLine().split(",");
        List<String> caracteristicas = new ArrayList<>();
        for (String c : caracteristicasArray) {
            caracteristicas.add(c.trim());
        }

        Cancha nuevaCancha = new Cancha(nombre, deporte, cubierta, capacidad, estado, caracteristicas);
        listaCanchas.add(nuevaCancha);

        System.out.println("Cancha registrada con éxito!");
        System.out.println(nuevaCancha);}
}

public void modificarCanchas() {
    System.out.println("--MODIFICAR CANCHAS--");
    System.out.println("Canchas disponibles:");
    for (Cancha c : listaCanchas) {
        System.out.println("ID: " + c.getIdCancha() + " - " + c.getNombre());
    }

    System.out.print("Ingrese el ID de la cancha a modificar: ");
    int idModificar = sc.nextInt();
    sc.nextLine();

    Cancha canchaAModificar = null;
    for (Cancha c : listaCanchas) {
        if (c.getIdCancha() == idModificar) {
            canchaAModificar = c;
            break;
        }
    }

    if (canchaAModificar == null) {
        System.out.println("No se encontró una cancha con ese ID.");
    }

    System.out.println("Cancha actual:");
    System.out.println(canchaAModificar);

    System.out.print("Nuevo nombre (enter para mantener): ");
    String nuevoNombre = sc.nextLine();
    if (!nuevoNombre.isBlank()){
        canchaAModificar.setNombre(nuevoNombre);
    }

    System.out.print("Nuevo deporte (enter para mantener): ");
    String nuevoDeporte = sc.nextLine();
    if (!nuevoDeporte.isBlank()){
        canchaAModificar.setDeporte(nuevoDeporte);
    }

    System.out.print("¿Es cubierta? (s/n, enter para mantener): ");
    String cubiertaMod = sc.nextLine();
    if (cubiertaMod.equalsIgnoreCase("s")){
        canchaAModificar.setCubierta(true);
    }else if (cubiertaMod.equalsIgnoreCase("n")){
        canchaAModificar.setCubierta(false);
    }

    System.out.print("Nueva capacidad (enter para mantener): ");
    String capacidadStr = sc.nextLine();
    if (!capacidadStr.isBlank()){
        canchaAModificar.setCapacidad(Integer.parseInt(capacidadStr));
    }

    System.out.print("Nuevo estado (disponible/reservada/ocupada, enter para mantener): ");
    String nuevoEstado = sc.nextLine();
    if (!nuevoEstado.isBlank()){
        canchaAModificar.setEstado(nuevoEstado);
    }

    System.out.print("Nuevas características (separadas por coma, enter para mantener): ");
    String nuevasCaract = sc.nextLine();
    if (!nuevasCaract.isBlank()) {
        String[] caractArray = nuevasCaract.split(",");
        List<String> caractList = new ArrayList<>();
        for (String c : caractArray) {
            caractList.add(c.trim());
        }
        canchaAModificar.setCaracteristicas(caractList);
    }

    System.out.println("Cancha modificada con éxito.");
}

public void eliminarCanchas() {
    System.out.println("--ELIMINAR CANCHAS--");
}

public void mostrarMenuConsultas() {
    int opcionCanchasConsultas = -1;
    while (opcionCanchasConsultas != 0) {
        System.out.println("Consultas de canchas");
        System.out.println("1. Canchas por deporte");
        System.out.println("2. Canchas por nombre");
        System.out.println("3. Canchas por fecha");
        System.out.println("4. Canchas por condición (cubiertas o descubiertas)");
        System.out.println("0. Salir");

        opcionCanchasConsultas = sc.nextInt();
        sc.nextLine();
        switch (opcionCanchasConsultas) {
            case 1:
                canchasPorDeporte();
                break;
            case 2:
                canchasPorNombre();
                break;
            case 3:
                canchasPorFecha();
                break;
            case 4:
                canchasPorCondicion();
                break;
            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Intenta de nuevo");
        }
    }
}

public void canchasPorDeporte() {
    System.out.println("Canchas por deporte");
}

public void canchasPorNombre() {
    System.out.println("Canchas por nombre");
}

public void canchasPorFecha() {
    System.out.println("Canchas por fecha");
}

public void canchasPorCondicion() {
    System.out.println("Canchas por condicion");
}
}
