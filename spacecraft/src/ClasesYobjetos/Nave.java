package ClasesYobjetos;
import java.util.Scanner;


public class Nave {
    
    // Atributos
    int ntripulantes;
    boolean estado;
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
    //Setters and Geters
    public int getNtripulantes() {
        return ntripulantes;
    }
    public void setNtripulantes(int ntripulantes) {
        this.ntripulantes = ntripulantes;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getProposito() {
        return proposito;
    }
    public void setProposito(String proposito) {
        this.proposito = proposito;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Double getEmpuje() {
        return empuje;
    }
    public void setEmpuje(Double empuje) {
        this.empuje = empuje;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Double getPotencia() {
        return potencia;
    }
    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }
    public Double getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public String getCombustible() {
        return combustible;
    }
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
    public Double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }
    // Metodos
    public Nave(boolean estado, String tipo, String proposito, String nombre, String pais, double empuje, double peso, double potencia, double capacidad, double altura, String combustible ){
        this.estado=estado;
        this.tipo=tipo;
        this.proposito=proposito;
        this.nombre=nombre;
        this.pais=pais;
        this.empuje=empuje;
        this.peso=peso;
        this.potencia=potencia;
        this.capacidad=capacidad;
        this.altura=altura;
        this.combustible=combustible;
       
    }
    public Nave(boolean estado, String tipo, String proposito, String nombre, String pais, Double empuje, Double peso, String combustible,  Double velocidad ){
        this.estado=estado;
        this.tipo=tipo;
        this.proposito=proposito;
        this.nombre=nombre;
        this.pais=pais;
        this.empuje=empuje;
        this.peso=peso;
        
        
       
        this.combustible=combustible;
        
        this.velocidad=velocidad;
    }
    public Nave(int ntripulantes, boolean estado, String tipo, String proposito, String nombre, String pais, Double peso, Double capacidad,  String combustible ){
        this.ntripulantes=ntripulantes;
        this.estado=estado;
        this.tipo=tipo;
        this.proposito=proposito;
        this.nombre=nombre;
        this.pais=pais;
        
        this.peso=peso;
        
        this.capacidad=capacidad;
        
        this.combustible=combustible;
        
    }

    public void encender() {
        Scanner input = new Scanner(System.in);
        boolean bandera;

        do {
            bandera = false;
            System.out.println("Desea encender la Nave? (S/N)");
            char offon = input.next().charAt(0);

            if (offon == 'S' || offon == 's') {
                estado = true;
                System.out.println("Nave: Encendida ");
            } else {
                if (offon == 'N' || offon == 'n') {
                    estado = false;
                    System.out.println("Nave: Apagada");
                } else {
                    System.out.println("Opción No válida, intente nuevamente");
                    bandera = true;
                    continue;
                }
            }

        } while (bandera != false);

    }

    public void apagar() {

    }

    public void acelerar() {

    }

}
