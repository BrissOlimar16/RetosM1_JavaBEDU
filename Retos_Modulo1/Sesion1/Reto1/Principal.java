
package paciente;

import java.util.Scanner;

public class Principal {
  public static void main(String [] args){
      Paciente paciente=new Paciente();
      Scanner s=new Scanner (System.in);
      System.out.println("Ingrese el nombre del paciente:");
      paciente.Nombre=s.nextLine();
      System.out.println("Ingrese la edad del paciente:");
      paciente.Edad=s.nextInt();
      System.out.println("Ingrese el numero de expediente del paciente:");
      paciente.Expediente=s.nextInt();
      System.out.println("\nInformación del paciente:");
      paciente.mostrarInformacion();
      
  }  
}
