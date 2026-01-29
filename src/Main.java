import clases.Desarrollador;
import clases.Empleado;
import clases.Manager;
import clases.Departamento;
import clases.Proyecto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    private static ArrayList<Departamento> departamentos = new ArrayList<>();
    private static ArrayList<Proyecto> proyectos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Inicialización de datos de prueba
        inicializarDatos();

        boolean ejecutar = true;
        while (ejecutar) {
            mostrarMenuPrincipal();
            int opcion = leerOpcion();
            
            switch (opcion) {
                case 1:
                    menuContratacion();
                    break;
                case 2:
                    menuFichaje();
                    break;
                case 3:
                    menuNominas();
                    break;
                case 4:
                    menuProyectos();
                    break;
                case 5:
                    menuInformes();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    ejecutar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
            if (ejecutar) {
                System.out.println("\nPresiona ENTER para continuar...");
                scanner.nextLine();
            }
        }
    }

    private static void inicializarDatos() {
        Empleado empleado = new Empleado("12345678A", "Juan Perez", 30, 2000, "peruano@gmail.com");
        Desarrollador desarrollador = new Desarrollador("87654321B", "Ana Gomez", 28, 2500.0, 3, "Java", "Senior");
        Manager manager = new Manager("11223344C", "Carlos Ruiz", 35, 5500, 25, 120);

        empleados.add(empleado);
        empleados.add(desarrollador);
        empleados.add(manager);
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("\n===== SISTEMA DE GESTIÓN Y FICHAJE =====");
        System.out.println("1. CONTRATACIÓN");
        System.out.println("2. FICHAJE");
        System.out.println("3. NÓMINAS");
        System.out.println("4. PROYECTOS (Solo desarrolladores)");
        System.out.println("5. INFORMES");
        System.out.println("6. SALIR");
        System.out.print("Selecciona una opción: ");
    }

    private static void menuContratacion() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- CONTRATACIÓN ---");
            System.out.println("1.1. Contratar empleado");
            System.out.println("1.2. Asignar a departamento");
            System.out.println("1.3. Ver contratos activos");
            System.out.println("0. Volver");
            System.out.print("Selecciona una opción: ");
            
            int opcion = leerOpcion();
            switch (opcion) {
                case 1:
                    contratarEmpleado();
                    break;
                case 2:
                    asignarADepartamento();
                    break;
                case 3:
                    verContratosActivos();
                    break;
                case 0:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void menuFichaje() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- FICHAJE ---");
            System.out.println("2.1. Registrar entrada");
            System.out.println("2.2. Registrar salida");
            System.out.println("2.3. Consultar mis fichajes");
            System.out.println("2.4. Reporte mensual de horas");
            System.out.println("0. Volver");
            System.out.print("Selecciona una opción: ");
            
            int opcion = leerOpcion();
            switch (opcion) {
                case 1:
                    registrarEntrada();
                    break;
                case 2:
                    registrarSalida();
                    break;
                case 3:
                    consultarFichajes();
                    break;
                case 4:
                    reporteMensualHoras();
                    break;
                case 0:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void menuNominas() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- NÓMINAS ---");
            System.out.println("3.1. Calcular salario empleado");
            System.out.println("3.2. Calcular nómina total");
            System.out.println("3.3. Ver historial de pagos");
            System.out.println("0. Volver");
            System.out.print("Selecciona una opción: ");
            
            int opcion = leerOpcion();
            switch (opcion) {
                case 1:
                    calcularSalarioEmpleado();
                    break;
                case 2:
                    calcularNominaTotal();
                    break;
                case 3:
                    verHistorialPagos();
                    break;
                case 0:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void menuProyectos() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- PROYECTOS (Solo desarrolladores) ---");
            System.out.println("4.1. Asignar a proyecto");
            System.out.println("4.2. Registrar horas proyecto");
            System.out.println("4.3. Ver productividad");
            System.out.println("0. Volver");
            System.out.print("Selecciona una opción: ");
            
            int opcion = leerOpcion();
            switch (opcion) {
                case 1:
                    asignarAProyecto();
                    break;
                case 2:
                    registrarHorasProyecto();
                    break;
                case 3:
                    verProductividad();
                    break;
                case 0:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void menuInformes() {
        boolean volver = false;
        while (!volver) {
            System.out.println("\n--- INFORMES ---");
            System.out.println("5.1. Empleados por departamento");
            System.out.println("5.2. Asistencia mensual");
            System.out.println("5.3. Horas extra aprobadas");
            System.out.println("5.4. Proyectos activos");
            System.out.println("0. Volver");
            System.out.print("Selecciona una opción: ");
            
            int opcion = leerOpcion();
            switch (opcion) {
                case 1:
                    empleadosPorDepartamento();
                    break;
                case 2:
                    asistenciaMensual();
                    break;
                case 3:
                    horasExtraAprobadas();
                    break;
                case 4:
                    proyectosActivos();
                    break;
                case 0:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}