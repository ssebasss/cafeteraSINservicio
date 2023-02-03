import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cafeteraaa cafechito = new Cafeteraaa(1000, 0);

        boolean bandera = false;
        int opciones, taza = 0;

        while (bandera == false) {
            System.out.println("");
            System.out.println("--------------------------------------");
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir cafe");
            System.out.println("3. Vaciar Cefetera");
            System.out.println("4. Agregar Cafe");
            System.out.println("5. mostrar cantidad de Cafe");
            System.out.println("6. Cerrar negocio");
            opciones = sc.nextInt();1
            switch (opciones) {
                case 1:
                    System.out.println("");
                    cafechito.llenarCafetera();
                    break;
                case 2:
                    System.out.println("");
                    do {
                        System.out.println("-------sub menu---------");
                        System.out.println("1. Taza de 150cc");
                        System.out.println("2. Taza de 250cc");
                        System.out.println("3. Taza de 350cc");
                        taza = sc.nextInt();
                        switch (taza) {
                            case 1:
                                cafechito.servirCafe(150);
                                break;
                            case 2:
                                cafechito.servirCafe(250);
                                break;
                            case 3:
                                cafechito.servirCafe(350);
                                break;
                            default:
                                System.out.println("Intente de nuevo");
                                break;
                        }
                    } while (taza != 1 && taza != 2 && taza != 3);
                    break;
                case 3:
                    cafechito.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("ingresa la cantidad de cafe que tenes recien hecho");
                    int cafe = sc.nextInt();
                    cafechito.agregarCafe(cafe);
                    break;
                case 5:
                    cafechito.mostrarCafe();
                    break;
                case 6:
                    System.out.println("saliendo...");
                    bandera = true;
            }
        }
    }
}
