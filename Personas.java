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

     segundoNombre.add("Antoño");
     segundoNombre.add("René");
     segundoNombre.add("Pablo");
     segundoNombre.add("Maria"); 
     segundoNombre.add("");

     List <String> apellido = new ArrayList<>();

     apellido.add("Gómez");
     apellido.add("Medina");
     apellido.add("Pérez");
     apellido.add("Carbajal");
     apellido.add("Laviano");
     apellido.add("Sosa");

     List <String> segundoApellido = new ArrayList<>();

     segundoApellido.add("Gómez");
     segundoApellido.add("Umpierrez");
     segundoApellido.add("Pérez");
     segundoApellido.add("Carbajal");
     segundoApellido.add("Gimenez");
     segundoApellido.add("Gonzalez");
     segundoApellido.add("");


     nombre.forEach(nombreCompleto -> {
         System.out.println("El nombre completo es:  " + nombreCompleto );



     } );
     
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
