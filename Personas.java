package e2.gente;
import java.util.ArrayList;
import java.util.List;


public class Personas {

    public static void main(String[] args) {
        
     List<String> nombre = new ArrayList<>();

     nombre.add("Carlos");
     nombre.add("Julio");
     nombre.add("Lilian");
     nombre.add("Pedro");
     nombre.add("Elena");

     List <String> segundoNombre = new ArrayList<>();

     segundoNombre.add("Antonio");
     segundoNombre.add("René");
     segundoNombre.add("");
     segundoNombre.add("Maria"); 
     segundoNombre.add("");

     List <String> apellido = new ArrayList<>();

     apellido.add("Gómez");
     apellido.add("Medina");
     apellido.add("Pérez");
     apellido.add("Carbajal");
     apellido.add("Laviano");
     

     List <String> segundoApellido = new ArrayList<>();

     segundoApellido.add("Alvarez");
     segundoApellido.add("Umpierrez");
     segundoApellido.add("Sosa");
     segundoApellido.add("");
     segundoApellido.add("");


     nombre.forEach(nombreCompleto -> {
         System.out.println("El nombre completo es:  " + nombreCompleto);
        });

     

     
     
     segundoNombre.forEach(sN -> {
       System.out.println("El segundoNombre es: " + sN);
     });
     apellido.forEach(ap -> {
        System.out.println("Su primer apellido es: " + ap);
     });
     segundoApellido.forEach(sA -> {
       
        System.out.println("Su segundo apellido es: " + sA);
       
     });  
    }
    
}
