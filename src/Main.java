import ClubDeportivo.Canchas;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Canchas> listaCanchas = new ArrayList<>();
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("CLUB DEPORTIVO ISLA MALA");
            System.out.println("1. Canchas");
            System.out.println("2. Socios");
            System.out.println("3. Tarifas");
            System.out.println("4. Reservas");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    int opcionCanchas = -1;
                    while (opcionCanchas != 0) {
                        System.out.println("CANCHAS");
                        System.out.println("1. Ingresar una cancha");
                        System.out.println("2. Modificar una cancha");
                        System.out.println("3. Eliminar una cancha");
                        System.out.println("4. Consultas");
                        System.out.println("0. Salir");

                        opcionCanchas = sc.nextInt();
                        sc.nextLine();
                        switch (opcionCanchas) {
                            case 1:
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

                                Canchas nuevaCancha = new Canchas(nombre, deporte, cubierta, capacidad, estado, caracteristicas);
                                listaCanchas.add(nuevaCancha);

                                System.out.println("Cancha registrada con éxito!");
                                System.out.println(nuevaCancha);
                                break;
                            case 2:
                                System.out.println("--MODIFICAR CANCHAS--");
                                System.out.println("Canchas disponibles:");
                                for (Canchas c : listaCanchas) {
                                    System.out.println("ID: " + c.getIdCancha() + " - " + c.getNombre());
                                }

                                System.out.print("Ingrese el ID de la cancha a modificar: ");
                                int idModificar = sc.nextInt();
                                sc.nextLine();

                                Canchas canchaAModificar = null;
                                for (Canchas c : listaCanchas) {
                                    if (c.getIdCancha() == idModificar) {
                                        canchaAModificar = c;
                                        break;
                                    }
                                }

                                if (canchaAModificar == null) {
                                    System.out.println("No se encontró una cancha con ese ID.");
                                    break;
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
                                break;
                            case 3:
                                break;
                            case 4:
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
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                        case 0:
                                            System.out.println("Saliendo...");
                                            break;
                                        default:
                                            System.out.println("Intenta de nuevo");
                                    }
                                }
                                break;
                            case 0:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("Intenta de nuevo");
                        }
                    }
                    break;
                case 2:
                    int opcionSocios = 0;
                    while (opcionSocios != -1) {
                        System.out.println("SOCIOS");
                        System.out.println("1. Ingresar un socio");
                        System.out.println("2. Modificar un socio");
                        System.out.println("3. Eliminar un socio");
                        System.out.println("0. Salir");

                        opcionSocios = sc.nextInt();
                        sc.nextLine();
                        switch (opcionSocios) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 0:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("Intenta de nuevo");
                        }
                    }
                    break;
                case 3:
                    int opcionTarifas = 0;
                    while (opcionTarifas != -1) {
                        System.out.println("TARIFAS");
                        System.out.println("1. Ingresar una tarifa");
                        System.out.println("2. Modificar una tarifa");
                        System.out.println("3. Eliminar una tarifa");
                        System.out.println("0. Salir");

                        opcionTarifas = sc.nextInt();
                        sc.nextLine();
                        switch (opcionTarifas) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 0:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("Intenta de nuevo");
                        }
                    }
                    break;
                case 4:
                    int opcionReservas = 0;
                    while (opcionReservas != -1) {
                        System.out.println("RESERVAS");
                        System.out.println("1. Ingresar una reserva");
                        System.out.println("2. Modificar una reserva");
                        System.out.println("3. Eliminar una reservaa");
                        System.out.println("4. Consultas");
                        System.out.println("0. Salir");

                        opcionReservas = sc.nextInt();
                        sc.nextLine();
                        switch (opcionReservas) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                int opcionReservasConsultas = 0;
                                while (opcionReservasConsultas != 0) {
                                    System.out.println("Consultas de reservas");
                                    System.out.println("1. Canchas reservadas en un período de tiempo");
                                    System.out.println("2. Canchas con reservas en una fecha dada");
                                    System.out.println("3. Canchas sin reservas en una fecha dada");
                                    System.out.println("0. Salir");

                                    opcionReservasConsultas = sc.nextInt();
                                    sc.nextLine();
                                    switch (opcionReservasConsultas) {
                                        case 1:
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 0:
                                            System.out.println("Saliendo...");
                                            break;
                                        default:
                                            System.out.println("Intenta de nuevo");
                                    }
                                }
                                break;
                            case 0:
                                System.out.println("Saliendo...");
                                break;
                            default:
                                System.out.println("Intenta de nuevo");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Intenta de nuevo");
            }
        }
    }
}
