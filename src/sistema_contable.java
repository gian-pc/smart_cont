import java.util.Scanner;

public class sistema_contable {

    public static void main(String[] args) {

        // Data
        String[] cod_productos = {"P001", "P002", "P003", "P004", "P005", "P006", "P007", "P008", "P009", "P010"};
        String[] productos = {"Pijama de seeda", "Pijama de algodón", "Pijama infantil", "Pijama de franela", "Pijama de tela", "Pijama de Otoño", "Pijama de Impermeable", "Pijama de Primavera", "Pijama de Verano", "Pijama de Invierno"};
        double[] precio = {10.00, 12.00, 13.00, 16.00, 18.00, 16.00, 25.00, 27.00, 16.00, 22.00};

        // Clientes
        String[] cod_clientes = {"C001", "C002", "C003", "C004", "C005", "C006", "C007", "C008", "C009", "C010"};
        String[] clientes = {"Jose Garcia", "Maria Jimenez", "Antonio Gonzalez", "Martha Suarez", "Miguel Sanchez", "Marisol Gutierres", "Rosario Poma", "Raquel Soto", "Angel Cano", "Alicia  Hurtado"};
        int[] cantidad = {24, 48, 36, 12, 60, 48, 60, 120, 60, 48};


        // Menu

        int estado = 0;
        do {
            Scanner opcion;
            int opelegida = 0;


            System.out.printf("-------------------------------------%n");
            System.out.printf("|              %-20s |", "SMART CONT");
            System.out.printf("\n-------------------------------------%n");

            System.out.printf("|      %-5s |       %-8s       | %n", "1", "PRODUCTO");
            System.out.printf("|      %-5s |       %-8s       | %n", "2", "VENTAS");
            System.out.printf("|      %-5s |       %-8s       | %n", "3", "CLIENTES");
            System.out.printf("|      %-5s |       %-8s       | %n", "4", "REPORTES");

            System.out.printf("-------------------------------------%n");

            opcion = new Scanner(System.in);
            opelegida = opcion.nextInt();

            switch (opelegida) {
                case 1:
                    productos(cod_productos,productos,precio);
                    break;
                case 2:
                    ventas(cod_productos, productos, precio, cantidad);
                    break;
                case 3:
                    clientes(cod_clientes, clientes, cantidad);
                    break;
                default:
                    System.out.println("Lo sentimos, la opción que elegiste no es válida");

            }
            Scanner cambiaEstado = new Scanner(System.in);
            System.out.println("Desea realizar otra operacion? (0: Si / 1: No)");
            estado = cambiaEstado.nextInt();

        } while (estado == 0);


    }


    public static void productos(String[] cod_productos, String[] productos, double[] precio) {
        System.out.println("\n---------------------------------------------------------------------------------");
        System.out.format("%-20s %-25s %-20s ", "CODIGO", "PRODUCTOS", "PRECIO U.");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");

        for (int i = 0; i < cod_productos.length; i++) {

            System.out.format("%-20s %-25s %-20.2f", cod_productos[i], productos[i], precio[i]);
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------");

    }
    public static void ventas(String[] cod_productos, String[] productos, double[] precio, int[] cantidad) {

        double[] ventas = new double[cod_productos.length];
        double total_ventas=0;

        System.out.println("\n---------------------------------------------------------------------------------------------------");
        System.out.format("%-20s %-25s %-20s %-20s %-20s ", "CODIGO", "PRODUCTOS", "PRECIO U.", "CANTIDAD", "SUBTOTAL");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------");

        for (int i = 0; i < cod_productos.length; i++) {
            ventas[i] = precio[i] * cantidad[i];
            total_ventas+=ventas[i];

            System.out.format("%-20s %-25s %-20.2f %-20d %-20.2f", cod_productos[i], productos[i],precio[i],cantidad[i], ventas[i]);
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.format("%73s %23.2f  ", "TOTAL", total_ventas);
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------");


    }

    public static void clientes(String[] cod_clientes, String[] clientes, int[] cantidad) {
        System.out.println("\n---------------------------------------------------------------------------------");
        System.out.format("%-20s %-25s %-20s ", "CODIGO", "CLIENTES", "CANTIDAD");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");

        for (int i = 0; i < cod_clientes.length; i++) {

            System.out.format("%-20s %-25s %-20d", cod_clientes[i], clientes[i], cantidad[i]);
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------");

    }

}
