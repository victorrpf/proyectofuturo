package proyectofuturo;
//V�ctor Ram�n Pardilla Fern�ndez
public class Aplicacion {
    public static void main(String[] args) {
 
        System.out.println("Estudiante " + args[0] + " : ");
        System.out.println(Aplicacion.veredicto(args[1], args[2]));
    }    
    static String veredicto(String valor1, String valor2) {    
    if (valor1.equals(valor2)) {
    return "Bien. Pero una hora de estudio para cada m�dulo puede ser insuficiente.";
    }
    if (Integer.valueOf(valor1) > Integer.valueOf(valor2)){
    return "Poco tiempo de estudio. Debes dedicar m�s tiempo.";
    }
    return "Ideal. Trabajas los contenidos en casa.";
    
    }
}
