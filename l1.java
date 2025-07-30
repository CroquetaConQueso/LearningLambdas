import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class l1 {

    public static void main(String[] args) {
        // Cuando estamos intentando analizar como podriamos o que lambda tendriamos que
        // utilizar, tendremos que analizar el tipo para ver que funciones este
        // implementa. En este caso, al ser de tipo String este utiliza Serializable y
        // Comparable, lo que nos permite utilizar Collections
        List<String> nombres = Arrays.asList("Juan", "Antonia", "Pedro");

        //En vez de tener que realizar esto de aquí abajo para luego añadir en Collections.sort (nombres,comparadorLongitud) podemos hacer
        // Comparator<String> comparadorLongitud = (o1, o2) -> o1.length() - o2.length();

        //Podemos hacer esto:
        Collections.sort(nombres, (a,b) -> a.length() - b.length());

        //Tambien se podría hacer
        Collections.sort(nombres, Comparator.comparing(String::length));
        //Al realizar :: siempre estamos hablando de una referencia a un metodo en el cual permite pasar esto como un argumento
        System.out.println(nombres);
        
    }
}
