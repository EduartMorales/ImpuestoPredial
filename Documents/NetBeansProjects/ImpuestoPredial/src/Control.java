
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Control {

    ArrayList<Vivienda> viviendas = new ArrayList<>();
    String[] numerosMatricula = new String[viviendas.size()];
    Scanner scan = new Scanner(System.in);
    
    void registrarVivienda() {
        System.out.println("Ingrese el número de matrícula inmobiliaria:");
        String numeroMatricula = scan.nextLine();
        System.out.println("Ingrese la dirección:");
        String direccion = scan.nextLine();
        System.out.println("Ingrese el nombre del propietario:");
        String nombrePropietario = scan.nextLine();
        System.out.println("Ingrese el apellido del propietario:");
        String apellidoPropietario = scan.nextLine();
        System.out.println("Ingrese el barrio:");
        String barrio = scan.nextLine();

        Vivienda vivienda = new Vivienda(numeroMatricula, direccion, nombrePropietario, apellidoPropietario, barrio);
        viviendas.add(vivienda);
        
        System.out.println("Vivienda registrada exitosamente.");
    }

    void buscarViviendaPorMatricula() {
        System.out.println("Ingrese el número de matrícula inmobiliaria:");
        String numeroMatricula = scan.nextLine();

        for (Vivienda vivienda : viviendas) {
            if (vivienda.getNumeroMatricula().equals(numeroMatricula)) {
                System.out.println(vivienda);
                return;
            }
        }
        System.out.println("Vivienda no encontrada.");
    }

    void buscarViviendaPorApellido() {
        
        System.out.println("Ingrese el apellido del propietario:");
        String apellidoPropietario = scan.nextLine();

        for (Vivienda vivienda : viviendas) {
            if (vivienda.getApellidoPropietario().equalsIgnoreCase(apellidoPropietario)) {
                System.out.println(vivienda);
                return;
            }
        }
        System.out.println("Vivienda no encontrada.");
    }

    void listarNumerosMatricula() {
        System.out.println("Listando...");
        for (int i = 0; i < viviendas.size(); i++) {
            numerosMatricula[i] = viviendas.get(i).getNumeroMatricula();
        }
        System.out.println("Números de matrícula:");
        System.out.println(Arrays.toString(numerosMatricula));
    }

    void ordenarPorBurbuja() {      
        for (int i = 0; i < viviendas.size(); i++) {
            numerosMatricula[i] = viviendas.get(i).getNumeroMatricula();
        }

        for (int i = 0; i < numerosMatricula.length - 1; i++) {
            for (int j = 0; j < numerosMatricula.length - 1 - i; j++) {
                if (numerosMatricula[j].compareTo(numerosMatricula[j + 1]) > 0) {
                    String temp = numerosMatricula[j];
                    numerosMatricula[j] = numerosMatricula[j + 1];
                    numerosMatricula[j + 1] = temp;
                }
            }
        }
        System.out.println("Números de matrícula ordenados por burbuja:");
        System.out.println(Arrays.toString(numerosMatricula));
    }

    void ordenarPorInsercion() {
        for (int i = 0; i < viviendas.size(); i++) {
            numerosMatricula[i] = viviendas.get(i).getNumeroMatricula();
        }

        for (int i = 1; i < numerosMatricula.length; i++) {
            String key = numerosMatricula[i];
            int j = i - 1;
            while (j >= 0 && numerosMatricula[j].compareTo(key) > 0) {
                numerosMatricula[j + 1] = numerosMatricula[j];
                j = j - 1;
            }
            numerosMatricula[j + 1] = key;
        }
        System.out.println("Números de matrícula ordenados por inserción:");
        System.out.println(Arrays.toString(numerosMatricula));
    }

    void buscarPorBinaria() {
        System.out.println("Ingrese el número de matrícula inmobiliaria a buscar:");
        String numeroMatricula = scan.nextLine();

        for (int i = 0; i < viviendas.size(); i++) {
            numerosMatricula[i] = viviendas.get(i).getNumeroMatricula();
        }

        Arrays.sort(numerosMatricula);
        int result = Arrays.binarySearch(numerosMatricula, numeroMatricula);

        if (result >= 0) {
            System.out.println("Número de matrícula encontrado: " + numerosMatricula[result]);
        } else {
            System.out.println("Número de matrícula no encontrado.");
        }
    }

    void menu() {
        
        int option;
        do {
            System.out.println("!!!!Menu!!!!");
            System.out.println("1. Registrar vivienda");
            System.out.println("2. Buscar vivienda por numero de matricula");
            System.out.println("3. Buscar vivienda por apellido del propietario");
            System.out.println("4. Listar numeros de matricula");
            System.out.println("5. Ordenar numeros de matricula por burbuja");
            System.out.println("6. Ordenar numeros de matricula por insercion");
            System.out.println("7. Buscar numero de matricula por busqueda binaria");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opcion: ");
            option = scan.nextInt();
            scan.nextLine(); // Consumir el salto de línea

            switch (option) {
                case 1:
                    registrarVivienda();
                    break;
                case 2:
                    buscarViviendaPorApellido();
                    break;
                case 3:
                    buscarViviendaPorMatricula();
                    break;
                case 4:
                    listarNumerosMatricula();
                    break;
                case 5:
                    ordenarPorBurbuja();
                    break;
                case 6:
                    ordenarPorInsercion();
                    break;
                case 7:
                    buscarPorBinaria();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (option > 0 && option < 8);
    }
}
