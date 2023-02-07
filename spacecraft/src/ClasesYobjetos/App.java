package ClasesYobjetos;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
        
        public static void main(String[] args) throws Exception {
                ArrayList<Nave> listadeNaves = new ArrayList<>();
                Scanner input = new Scanner(System.in);
                int option;
                
                String menu1 = "\n =======ESTACIÓN ESPACIAL SOFKA=======\n\n------------ Menú Principal -----------\n -----> Seleccione una opción: <-----\n 1. Ver Inventario de Naves\n 2. Agregar Nueva Nave\n 3. Salir";

                Nave nave1 = new Nave(false, "Lanzadera",
                                "Permitió transportar la nave tripulada Apolo hasta la Luna.",
                                "Saturno V", "EE.UU.", 2500, 2900, 160000, 118, 100, "H(liq.)+O(liq.)");
                listadeNaves.add(nave1);

                Nave nave2 = new Nave(false, "Lanzadera",
                                "Ponía en órbita al transbordador Buran",
                                "Energía", "Rusia", 3060, 2400, 0, 100, 60, "Queroseno+O(liq)");
                listadeNaves.add(nave2);

                Nave nave3 = new Nave(false, "Lanzadera",
                                "Fue diseñado para elevar cargas de hasta 1.500 kg a una órbita de transferencia geoestacionaria.",
                                "Larga Marcha 3b", "China", 2960, 425, 816285, 11.2, 54.8, "UDMH+N2O4");
                listadeNaves.add(nave3);

                Nave nave4 = new Nave(false, "No Tripulada",
                                "Estudiar Saturno y sus Lunas.",
                                "Cassini-Huygens", "EE.UU.-Europa-Italia", 45.39, 5.7, "MMH y tetróxido de nitrógeno",
                                18000.0);
                listadeNaves.add(nave4);

                Nave nave5 = new Nave(false, "No Tripulada",
                                "Estudiar Plutón y sus Lunas.",
                                "New Horizons", "EE.UU", 28.4, 0.478, "N2H4***", 1044.0);
                listadeNaves.add(nave5);

                Nave nave6 = new Nave(false, "No Tripulada",
                                "Estudiar Mercurio",
                                "Mariner X,", "EE.UU", 222.0, 1.093, "N2H4***", 1044.0);
                listadeNaves.add(nave6);

                Nave nave7 = new Nave(3, false, "Tripulada",
                                "Mandar seres humanos al espacio para tareas de reparación, mantenimiento o investigación",
                                "Skylab", "EE.UU.", 77.0, "NO4+UDMH");
                listadeNaves.add(nave7);

                Nave nave8 = new Nave(3, false, "Tripulada",
                                "Mandar seres humanos al espacio para tareas de reparación, mantenimiento o investigación",
                                "Salyut", "Rusia", 19.8, "NO+Amina");
                listadeNaves.add(nave8);

                Nave nave9 = new Nave(6, false, "Tripulada",
                                "Mantenimiento de satélites, probar acoplamientos con otras naves y equipos electrónicos",
                                "EEI", "EE.UU.", 420.0, "Oxígeno e hidrógeno líquido");
                listadeNaves.add(nave9);

                do {
                        System.out.println(menu1);
                        option = input.nextInt();
                        switch (option) {
                                case 1:
                                        System.out.println("------ Listado de Naves Registradas ------");
                                        for (int i = 0; i < listadeNaves.size(); i++) {
                                                System.out.println(i + 1 + ") " + listadeNaves.get(i));       
                                        }
                                        Operacion op = new Operacion();
                                        op.listamanual();

                                        break;
                                case 2:
                                        Operacion opc = new Operacion();
                                        opc.registrar();
                                        break;
                                case 3:
                                        System.out.println("Salir");
                                        ;
                                        break;
                                default:
                                        System.out.println("Opcion seleccionada no válida");
                                        break;
                        }
                } while (option != 3);

                System.out.println("nombre: " + nave1.getNombre());
                nave1.encender();
        }
}
