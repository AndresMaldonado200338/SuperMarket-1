package Controller;

import View.*;

public class Controller {
    private  View view;

    public Controller() {
        view = new View();
    }

    public static void main(String[] args){
        Controller controller = new Controller();
        controller.run();
    }

    public void run(){
        int opcion = 0 ;
        do{
            View.print("\n\t\t\t...BIENVENIDO...");
            opcion = view.menu();

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:

                    break;
                default:
                    View.print("Salio Del Programa");
            }
        }while (opcion != 0);
    }
}
