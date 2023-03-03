package View;

import java.util.Scanner;

public class View {
    private Scanner lector;

    public View(){
        lector = new Scanner(System.in);
    }

    public int leerEnteros(String mensaje){
        System.out.println(mensaje);
        return lector.nextInt();
    }
    public String leerStringLine(String mensaje){
        String salida;
        System.out.println(mensaje);
        lector.nextLine();
        return salida=lector.nextLine();
    }
    public String leerString(String mensaje){
        String salida;
        System.out.println(mensaje);
        return salida=lector.next();
    }
    public void pause(String mensaje){
        System.out.println(mensaje);
        lector.nextLine();
        System.out.println("\n\n");
    }

    public static void print(String mensaje){
        System.out.println(mensaje);
    }
    public int menu(){
        print("\n_______________________________________________________________________________");
        print("\n\t\t\t     ...MENU PRINCIPAL...");
        print("\n_______________________________________________________________________________");
        int opcion= 0;
        return opcion = leerEnteros("\nIngrese la opcion que desea relizar:"+
                "\n[1]Crear Proveedor "+
                "\n[2] Crear Cliente "+
                "\n[3]Crear Producto"+
                "\n[4] Registrar Venta"+
                "\n[5] Historial de ventas"+
                "\n[0]Salir");

    }


}

