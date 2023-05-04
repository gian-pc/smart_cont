
import java.util.Scanner;

public class sistema_contable {

    public static void main(String[] args) {

        // Productos
        String[] cod_productos = {"P001", "P002", "P003", "P004", "P005", "P006", "P007", "P008", "P009", "P010"};
        String[] productos = {"Pijama de seeda", "Pijama de algodón", "Pijama infantil", "Pijama de franela", "Pijama de tela", "Pijama de Otoño", "Pijama de Impermeable", "Pijama de Primavera", "Pijama de Verano", "Pijama de Invierno"};
        double[] precio = {10.00, 12.00, 13.00, 16.00, 18.00, 16.00, 25.00, 27.00, 16.00, 22.00};
        int[] stock = {50, 120, 200, 150, 100, 180, 200, 150, 130, 80};

        // Clientes
        String[] cod_clientes = {"C001", "C002", "C003", "C004", "C005", "C006", "C007", "C008", "C009", "C010"};
        String[] clientes = {"Jose Garcia", "Maria Jimenez", "Antonio Gonzalez", "Martha Suarez", "Miguel Sanchez", "Marisol Gutierres", "Rosario Poma", "Raquel Soto", "Angel Cano", "Alicia  Hurtado"};
        int[] cantidad = {24, 48, 36, 12, 60, 48, 60, 120, 60, 48};


        // Ventas_diarias
        int[][] ventas_abril = {

                {0, 10, 0, 15, 0, 0, 0, 0, 10, 5},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//Domingo

                {10, 2, 2, 10, 10, 0, 0, 0, 0, 10},
                {0, 0, 20, 0, 0, 0, 0, 10, 0, 5},
                {8, 0, 2, 10, 10, 12, 6, 6, 6, 6},
                {0, 10, 6, 0, 0, 0, 0, 6, 0, 12},
                {0, 0, 12, 0, 2, 6, 10, 0, 0, 24},
                {0, 6, 12, 2, 0, 12, 0, 12, 12, 6},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//Domingo

                {0, 2, 0, 10, 0, 10, 0, 0, 0, 12},
                {10, 0, 6, 0, 6, 10, 2, 2, 0, 12},
                {6, 0, 6, 0, 0, 12, 10, 6, 2, 6},
                {6, 0, 12, 10, 6, 0, 6, 2, 0, 0},
                {0, 12, 6, 0, 10, 0, 6, 12, 0, 12},
                {10, 0, 0, 12, 6, 2, 6, 12, 0, 12},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//Domingo

                {0, 0, 6, 6, 0, 12, 0, 0, 0, 12},
                {0, 0, 0, 6, 0, 6, 0, 12, 12, 20},
                {6, 0, 12, 0, 0, 0, 0, 0, 6, 12},
                {6, 12, 0, 0, 0, 6, 6, 6, 12, 12},
                {0, 6, 0, 12, 0, 6, 0, 2, 0, 12},
                {0, 6, 0, 0, 12, 0, 12, 6, 6, 12},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//Domingo

                {0, 12, 2, 0, 22, 0, 0, 10, 0, 10},
                {6, 0, 0, 0, 0, 0, 6, 10, 12, 12},
                {6, 12, 6, 0, 0, 12, 0, 12, 0, 12},
                {0, 0, 0, 10, 0, 0, 6, 12, 0, 12},
                {0, 10, 10, 0, 12, 6, 0, 12, 0, 2},
                {12, 2, 0, 10, 0, 0, 6, 6, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},//Domingo


        };


        int[] abril_01 = {0, 10, 0, 15, 0, 0, 0, 0, 10, 5};
        int[] abril_02 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int[] abril_03 = {10, 2, 2, 10, 10, 0, 0, 0, 0, 10};
        int[] abril_04 = {0, 0, 20, 0, 0, 0, 0, 10, 0, 5};
        int[] abril_05 = {8, 0, 2, 10, 10, 12, 6, 6, 6, 6};
        int[] abril_06 = {0, 10, 6, 0, 0, 0, 0, 6, 0, 12};
        int[] abril_07 = {0, 0, 12, 0, 2, 6, 10, 0, 0, 24};
        int[] abril_08 = {0, 6, 12, 2, 0, 12, 0, 12, 12, 6};
        int[] abril_09 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


        int[] abril_10 = {0, 2, 0, 10, 0, 10, 0, 0, 0, 12};
        int[] abril_11 = {10, 0, 6, 0, 6, 10, 2, 2, 0, 12};
        int[] abril_12 = {6, 0, 6, 0, 0, 12, 10, 6, 2, 6};
        int[] abril_13 = {6, 0, 12, 10, 6, 0, 6, 2, 0, 0};
        int[] abril_14 = {0, 12, 6, 0, 10, 0, 6, 12, 0, 12};
        int[] abril_15 = {10, 0, 0, 12, 6, 2, 6, 12, 0, 12};
        int[] abril_16 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


        int[] abril_17 = {0, 0, 6, 6, 0, 12, 0, 0, 0, 12};
        int[] abril_18 = {0, 0, 0, 6, 0, 6, 0, 12, 12, 20};
        int[] abril_19 = {6, 0, 12, 0, 0, 0, 0, 0, 6, 12};
        int[] abril_20 = {6, 12, 0, 0, 0, 6, 6, 6, 12, 12};
        int[] abril_21 = {0, 6, 0, 12, 0, 6, 0, 2, 0, 12};
        int[] abril_22 = {0, 6, 0, 0, 12, 0, 12, 6, 6, 12};
        int[] abril_23 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


        int[] abril_24 = {0, 12, 2, 0, 22, 0, 0, 10, 0, 10};
        int[] abril_25 = {6, 0, 0, 0, 0, 0, 6, 10, 12, 12};
        int[] abril_26 = {6, 12, 6, 0, 0, 12, 0, 12, 0, 12};
        int[] abril_27 = {0, 0, 0, 10, 0, 0, 6, 12, 0, 12};
        int[] abril_28 = {0, 10, 10, 0, 12, 6, 0, 12, 0, 2};
        int[] abril_29 = {12, 2, 0, 10, 0, 0, 6, 6, 0, 0};
        int[] abril_30 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


        // Call
        int[] ventas_dia = ventas_x_dia(ventas_abril);
        int[] ventas_mes = ventas_x_mes(ventas_abril);

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
            System.out.printf("|      %-5s |       %-8s       | %n", "4", "FACTURA");
            System.out.printf("|      %-5s |       %-8s       | %n", "5", "REPORTES");

            System.out.printf("-------------------------------------%n");

            opcion = new Scanner(System.in);
            opelegida = opcion.nextInt();

            switch (opelegida) {
                case 1:
                    NuevoProducto.add_producto();
                    break;
                case 2:
                    ventas_abril(cod_productos, productos, ventas_dia, ventas_mes, abril_01, abril_02, abril_03, abril_04, abril_05, abril_06, abril_07, abril_08, abril_09, abril_10,
                            abril_11, abril_12, abril_13, abril_14, abril_15, abril_16, abril_17, abril_18, abril_19, abril_20, abril_21, abril_22, abril_23, abril_24, abril_25,
                            abril_26, abril_27, abril_28, abril_29, abril_30);
                    ventas(cod_productos, productos, precio, cantidad);
                    break;
                case 3:
                    clientes(cod_clientes, clientes, cantidad);
                    break;
                case 4:
                    Factura.compra();
                    break;
                case 5:
                    productos(cod_productos, productos, precio, stock);
                    break;
                default:
                    System.out.println("Lo sentimos, la opción que elegiste no es válida");

            }
            Scanner cambiaEstado = new Scanner(System.in);
            System.out.println("Desea realizar otra operacion? (0: Si / 1: No)");
            estado = cambiaEstado.nextInt();

        } while (estado == 0);


    }


    public static void productos(String[] cod_productos, String[] productos, double[] precio, int[] stock) {
        System.out.println("\n---------------------------------------------------------------------------------");
        System.out.format("%-20s %-25s %-20s %-20s", "CODIGO", "PRODUCTOS", "PRECIO U.", "STOCK");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");

        for (int i = 0; i < cod_productos.length; i++) {

            System.out.format("%-20s %-25s %-20.2f %-20d ", cod_productos[i], productos[i], precio[i], stock[i]);
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------");

    }

    public static void ventas(String[] cod_productos, String[] productos, double[] precio, int[] cantidad) {

        double[] ventas = new double[cod_productos.length];
        double total_ventas = 0;

        System.out.println("\n---------------------------------------------------------------------------------------------------");
        System.out.format("%-20s %-25s %-20s %-20s %-20s ", "CODIGO", "PRODUCTOS", "PRECIO U.", "CANTIDAD", "SUBTOTAL");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------");

        for (int i = 0; i < cod_productos.length; i++) {
            ventas[i] = precio[i] * cantidad[i];
            total_ventas += ventas[i];

            System.out.format("%-20s %-25s %-20.2f %-20d %-20.2f", cod_productos[i], productos[i], precio[i], cantidad[i], ventas[i]);
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

    public static int[] ventas_x_dia(int[][] ventas_diarias) {

        int[] resp = new int[30];

        for (int y = 0; y < ventas_diarias.length; y++) {
            int suma = 0;
            for (int x = 0; x < ventas_diarias[y].length; x++) {
                suma += ventas_diarias[y][x];
                resp[y] = suma;
            }
        }

        return resp;

    }

    public static int[] ventas_x_mes(int[][] ventas_diarias) {
        int[] resp = new int[10];

        for (int x = 0; x < ventas_diarias[0].length; x++) {
            int suma = 0;
            for (int y = 0; y < ventas_diarias.length; y++) {
                suma += ventas_diarias[y][x];
                resp[x] = suma;
            }
        }
        return resp;

    }


    public static void ventas_abril(String[] cod_productos, String[] productos, int[] ventas_x_dia, int[] ventas_x_mes, int[] abril_01, int[] abril_02, int[] abril_03,
                                    int[] abril_04, int[] abril_05, int[] abril_06, int[] abril_07, int[] abril_08, int[] abril_09,
                                    int[] abril_10, int[] abril_11, int[] abril_12, int[] abril_13, int[] abril_14, int[] abril_15, int[] abril_16,
                                    int[] abril_17, int[] abril_18, int[] abril_19, int[] abril_20, int[] abril_21, int[] abril_22, int[] abril_23,
                                    int[] abril_24, int[] abril_25, int[] abril_26, int[] abril_27, int[] abril_28, int[] abril_29, int[] abril_30) {


        System.out.println("\n---------------------------------------------------------------------------------");
        System.out.format("%-6s %-25s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-3s %-5s",
                "CODIGO", "PRODUCTOS", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "SUBTOTAL");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");


        for (int i = 0; i < cod_productos.length; i++) {

            System.out.format("%-6s %-25s %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-3d %-5d",
                    cod_productos[i], productos[i], abril_01[i], abril_02[i], abril_03[i], abril_04[i], abril_05[i], abril_06[i], abril_07[i], abril_08[i],
                    abril_09[i], abril_10[i], abril_11[i], abril_12[i], abril_13[i], abril_14[i], abril_15[i], abril_16[i], abril_17[i], abril_18[i], abril_19[i],
                    abril_20[i], abril_21[i], abril_22[i], abril_23[i], abril_24[i], abril_25[i], abril_26[i], abril_27[i], abril_28[i], abril_29[i], abril_30[i], ventas_x_mes[i]);
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("                                 ");
        for (int i = 0; i < ventas_x_dia.length; i++) {
            System.out.format("%-4d", ventas_x_dia[i]);
        }
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println();


    }


}





