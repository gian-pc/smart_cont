

import java.util.Scanner;

public class Factura {

    public static void main(String[] args) {

        String [] producto = {"Pijama de seda","Pijama de algodón","Pijama infantil","Pijama de franela","Pijama de tela","Pijama de Otoño","Pijama de Impermeable","Pijama de Primavera","Pijama de Verano","Pijama de Invierno"};
        double [] precio = {10,12,13,16,18,16,25,27,16,22};
        String [] codigo = {"P001","P002","P003","P004","P005","P006","P007","P008","P009","P0010"};


        double impuesto = 0.18; // Ejemplo de impuesto del 18%
        // Calcular factura
        double subtotal = 0.0;

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        String objeto = "";
        double cantidad = 0;
        String enlace = "";
        double preciaso;
        int repetidor = 0;


        do {
            System.out.println("¿Que producto vas a llevar? ");
            objeto = input1.nextLine();
            System.out.println("Seleccione la cantida a llevar");
            cantidad = input.nextInt();

            for (int i = 0; i < producto.length; i++) {

                if (objeto.equals(producto[i])) {
                    subtotal = subtotal + (precio[i] * cantidad);
                    System.out.println("Producto: " + codigo [i] + " " + producto[i]);
                    System.out.println("Cantidad: " + cantidad);
                    System.out.println("Precio Unitario: S/" + precio[i]);
                    System.out.println("Subtotal: S/" + (precio[i] * cantidad));
                    System.out.println("--------------------");
                }
            }
            System.out.println("¿Vas a añadir más productos? (0)Sí (1)No");
            repetidor = input.nextInt();

        }while (repetidor==0);

        double impuestoTotal = subtotal * impuesto;
        double total = subtotal + impuestoTotal;

        System.out.println("------------------------------------------");
        System.out.println("Subtotal: S/" + subtotal);
        System.out.println("Impuesto: S/" + impuestoTotal);
        System.out.println("Total: S/" + total);

    }
}


