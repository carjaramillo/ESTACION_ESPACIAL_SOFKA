package ClasesYobjetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Operacion {
    ArrayList<Nave> listadeNavesplus = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    int ntripulantes;
    boolean estado = false;
    String tipo;
    String proposito;
    String nombre;
    String pais;
    Double empuje;
    Double peso;
    Double potencia;
    Double capacidad;
    Double altura;
    String combustible;
    Double velocidad;

    public void registrar() {

        int opt;
        String menu2 = "====== Selecciones el Tipo de Nave ======\n 1) Lanzadera\n 2) No Tripulada\n 3) Tripulada\n 4) Salir";

        do {
            System.out.println(menu2);

            opt = input.nextInt();

            switch (opt) {
                case 1:

                    String tp = "Lanzadera";
                    llenardatos(tp);

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Salir");

                    break;

                default:
                    System.out.println("Opcion seleccionada no válida");
                    break;
            }
        } while (opt != 4);
    }

    public void llenardatos(String tp) {

        input.nextLine();
        tipo = tp;
        System.out.println("Ingrese el proposito de la Nave: ");
        proposito = input.nextLine();
        System.out.println("Ingrese el Nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese el Empuje: ");
        empuje = input.nextDouble();
        System.out.println("Ingrese el peso: ");
        peso = input.nextDouble();
        System.out.println("Ingrese el potencia: ");
        potencia = input.nextDouble();
        System.out.println("Ingrese el capacidad: ");
        capacidad = input.nextDouble();
        System.out.println("Ingrese el altura: ");
        altura = input.nextDouble();
        System.out.println("Ingrese el combustible: ");
        combustible = input.nextLine();

        Nave nv = new Nave(estado, tipo, proposito, nombre, pais, empuje, peso, potencia, capacidad, altura,
                combustible);

        listadeNavesplus.add(nv);
    }
    public String toString(){
        return "Nave [Nombre: "+nombre+ " - Tipo: "+tipo+"]";
    }

    public void listamanual() {

        for (int i = 0; i < listadeNavesplus.size(); i++) {
            System.out.println(i + 1 + ") " + listadeNavesplus.get(i));

        }
    }
}
