

import java.util.Scanner;
import java.util.ArrayList;

public class NuevoProducto {

    public static ArrayList<String> idProd (){
        ArrayList<String> id = new ArrayList<>();
        id.add("P001");
        id.add("P002");
        id.add("P003");
        id.add("P004");
        id.add("P005");
        id.add("P006");
        id.add("P007");
        id.add("P008");
        id.add("P009");
        id.add("P010");
        return id;
    }
    public static ArrayList<String> productosTienda (){
        ArrayList<String> prods = new ArrayList<>();
        prods.add("Pijama de seeda");
        prods.add("Pijama de algodón");
        prods.add("Pijama infantil");
        prods.add("Pijama de franela");
        prods.add("Pijama de tela");
        prods.add("Pijama de Otoño");
        prods.add("Pijama de Impermeable");
        prods.add("Pijama de Primavera");
        prods.add("Pijama de Verano");
        prods.add("Pijama de Invierno");
        return prods;
    }
    public static ArrayList<Double> preciosProds (){
        ArrayList<Double> precios = new ArrayList<>();
        precios.add(10.00);
        precios.add(12.00);
        precios.add(13.00);
        precios.add(16.00);
        precios.add(18.00);
        precios.add(16.00);
        precios.add(25.00);
        precios.add(27.00);
        precios.add(16.00);
        precios.add(22.00);

        return precios;
    }

    private static String MuestraProductos(){
        String prodLista = "Lista de elementos:\n";
        prodLista = prodLista + "---------------------\n";
        for(int i = 0; i < idProd().size();++i){
            prodLista = prodLista + idProd().get(i) + " - " + productosTienda().get(i)+ " - " + String.valueOf(preciosProds().get(i)) + "\n";
        }

        return prodLista;
    }

    private static String AgregaProducto(){
        String salida ="";
        String nProducto="";
        double nPrecio = 0.00;
        Scanner producto = new Scanner(System.in);
        System.out.println("Por favor escribe el nombre del producto que desea añadir:");
        nProducto = producto.nextLine();
        Scanner precio = new Scanner(System.in);
        System.out.println("Por favor escribe el precio: (puedes incluir hasta 2 decimales)");
        nPrecio=precio.nextDouble();
        //definimos el id automaticamente para homologar los 2 arraylist
        int id_int = idProd().size();
        String nID= "000" + String.valueOf(id_int + 1);
        nID = nID.substring(nID.length() - 3);
        nID = "P" + nID;

        //agregamos valores a las listas array

        idProd().add(nID);
        productosTienda().add(nProducto);
        preciosProds().add(nPrecio);

        salida = "Se agregó el producto: " + nID + " - " + nProducto + " - " + nPrecio;
        return salida;
    }


    public static void main(String[] args) {

        int estado = 0;
        do{
            Scanner opcion;
            int opelegida=0;
            System.out.println("Por favor seleccione una opcion (solo ingresar el numero) :");
            System.out.println("(1) Agregar nuevo producto");
            System.out.println("(2) Ver productos existentes");
            System.out.println("--------------------------------");
            opcion = new Scanner(System.in);
            opelegida= opcion.nextInt();

            switch (opelegida){
                case 1:
                    System.out.println(AgregaProducto());
                    break;
                case 2:
                    System.out.println(MuestraProductos());
                    break;
                default:
                    System.out.println("Lo sentimos, la opción que elegiste no es válida");

            }
            Scanner cambiaEstado = new Scanner(System.in);
            System.out.println("Desea realizar otra operacion? (0: Si / 1: No)");
            estado = cambiaEstado.nextInt();

        } while(estado == 0);

    }
}
