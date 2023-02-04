
import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
                Scanner entrada = new Scanner(System.in);

                int option;

                String menu1 = "\n =======ESTACIÓN ESPACIAL SOFKA=======\n\n------------ Menú Principal -----------\n -----> Seleccione una opción: <-----\n 1. Crear nueva Nave\n 2. Consultar Información de las Naves\n 3. Salir";

                System.out.println(menu1);

                option = entrada.nextInt();

                switch(option){
                        case 1: System.out.println("Crear nueva Nave");
                                break;
                        case 2: System.out.println("Consultar Información de las Naves");
                                break;
                        case 3: System.out.println("Salir");
                                break;
                        default: System.out.println("Opcion seleccionada no válida");
            
                }
        }
}
