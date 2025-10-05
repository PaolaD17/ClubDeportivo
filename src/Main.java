import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 4) {
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
                    while (opcion != 4) {
                        System.out.println("CANCHAS");
                        System.out.println("1. Ingresar una cancha");
                        System.out.println("2. Modificar una cancha");
                        System.out.println("3. Eliminar una cancha");
                        System.out.println("4. Consultas");
                        System.out.println("0. Salir");

                        opcion = sc.nextInt();
                        sc.nextLine();
                        switch (opcion) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                while (opcion != 4) {
                                    System.out.println("Consultas de canchas");
                                    System.out.println("1. Canchas por deporte");
                                    System.out.println("2. Canchas por nombre");
                                    System.out.println("3. Canchas por fecha");
                                    System.out.println("4. Canchas por condición (cubiertas o descubiertas)");
                                    System.out.println("0. Salir");

                                    opcion = sc.nextInt();
                                    sc.nextLine();
                                    switch (opcion) {
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
                    while (opcion != 3) {
                        System.out.println("SOCIOS");
                        System.out.println("1. Ingresar un socio");
                        System.out.println("2. Modificar un socio");
                        System.out.println("3. Eliminar un socio");
                        System.out.println("0. Salir");

                        opcion = sc.nextInt();
                        sc.nextLine();
                        switch (opcion) {
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
                    while (opcion != 4) {
                        System.out.println("TARIFAS");
                        System.out.println("1. Ingresar una tarifa");
                        System.out.println("2. Modificar una tarifa");
                        System.out.println("3. Eliminar una tarifa");
                        System.out.println("0. Salir");

                        opcion = sc.nextInt();
                        sc.nextLine();
                        switch (opcion) {
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
                    while (opcion != 4) {
                        System.out.println("RESERVAS");
                        System.out.println("1. Ingresar una reserva");
                        System.out.println("2. Modificar una reserva");
                        System.out.println("3. Eliminar una reservaa");
                        System.out.println("4. Consultas");
                        System.out.println("0. Salir");

                        opcion = sc.nextInt();
                        sc.nextLine();
                        switch (opcion) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                while (opcion != 3) {
                                    System.out.println("Consultas de reservas");
                                    System.out.println("1. Canchas reservadas en un período de tiempo");
                                    System.out.println("2. Canchas con reservas en una fecha dada");
                                    System.out.println("3. Canchas sin reservas en una fecha dada");
                                    System.out.println("0. Salir");

                                    opcion = sc.nextInt();
                                    sc.nextLine();
                                    switch (opcion) {
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
