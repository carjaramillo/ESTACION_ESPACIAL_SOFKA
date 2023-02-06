package ClasesYobjetos;

import java.util.Scanner;
import ClasesYobjetos.Operacion;
public class App {
        public static void main(String[] args) throws Exception {
                Scanner input = new Scanner(System.in);
                int option;
                Operacion op = new Operacion();
                String menu1 = "\n =======ESTACIÓN ESPACIAL SOFKA=======\n\n------------ Menú Principal -----------\n -----> Seleccione una opción: <-----\n 1. Ver Inventario de Naves\n 2. Agregar Nueva Nave\n 3. Salir";

                do {
                        System.out.println(menu1);
                        option = input.nextInt();
                        switch (option) {
                                case 1:
                                        op.inventario();
                                        break;
                                case 2:
                                        op.agregarnave();
                                        break;
                                case 3:
                                        System.out.println("Salir");
                                        //System.exit(0);
                                        break;
                                default:
                                        System.out.println("Opcion seleccionada no válida");
                                        break;
                        }
                } while (option != 3);

                Nave nave1 = new Nave(false, "Lanzadera",
                                "se trata de un cohete autopropulsado que sirve para lanzar una carga útil al espacio, normalmente un satélite artificial, una sonda o una nave tripulada",
                                "Saturno V", "EE.UU.", 2500, 2900, 32000 * 5, 118, 100, "H(liq.)+O(liq.)");
                System.out.println("nombre: " + nave1.getNombre());
                nave1.encender();
        }
}
