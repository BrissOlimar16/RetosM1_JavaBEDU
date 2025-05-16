
package entrada;

public class Principal {
    public static void main(String []args){
        Entrada entrada1=new Entrada("Función Cinematografica", 100);
        Entrada entrada2=new Entrada("Concierto de Shawn Mendes", 1800);
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
//        Entrada_Record entrada= new Entrada_Record("Recorrido Turistico", 1200.00);
//        entrada.mostrarInformacion();
    }
}
