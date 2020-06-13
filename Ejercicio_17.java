/*
Implemente un algoritmo que le permita ingresar por teclado:
Objeto, clase de objeto, y los respectivos atributos
y le deplegue los servicios
 */
package ejercicio_17;
/**
 *
 * @author Gabriel Alexander Díaz Vera
 */
import java.util.Scanner;
public class Ejercicio_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner objeto=new Scanner (System.in);
    System.out.println("\t\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
    System.out.println("Nombre: Díaz Vera Gabriel Alexander");
    System.out.println("Asignatura: Programación");
    System.out.println("Nrc: 7450");
    System.out.println("Tema del Paper:");
    System.out.println("Transferencia de Aprendizaje Mediante Redes Neuronales Convolucionales para el Reconocimiento de Conductores Distraídos\n");
    System.out.println("\t\t\tIMPLEMENTACION DE CLASES\n");
    System.out.println("Ingrese el Objeto: ");
    String objeto1=objeto.nextLine();
    System.out.println("Ingrese la clase de objeto: ");
    String clase=objeto.nextLine();
    System.out.println("Ingrese los atributos de la clase de objeto: ");
    String atributo1=objeto.nextLine();
    String atributo2=objeto.nextLine();
    String atributo3=objeto.nextLine();
    String atributo4=objeto.nextLine();
    System.out.println("Los servicios son los siguientes: ");
    System.out.println("Determinar " +atributo1);
    System.out.println("Especificar " +atributo2);
    System.out.println("Concretar " +atributo3);
    System.out.println("Identificar " +atributo4);
    }

}
