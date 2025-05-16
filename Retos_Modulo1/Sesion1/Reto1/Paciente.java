
package paciente;

public class Paciente {
    String Nombre;
    int Edad;
    int Expediente;
    
    void mostrarInformacion(){
        System.out.println("Paciente: "+Nombre);
        System.out.println("Edad: "+Edad);
        System.out.println("Expediente: " +Expediente);
    }
}
