import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class l2{

    public static void main(String[] args){
        /* List<Product> products = List.of(new Product("Wawa","Cafe",3.12f),new Product("Wiwi","Alcohol",40.2f));
        
        ProccessProduct proccessProduct = p -> "Name: " + p.getProductName() + " | Price " +p.getProductPrice();
        
        List<String> formattedList = proccessProduct.processAll(products);
        formattedList.forEach(System.out::println);
        
        List<String> nombre = List.of("Ana","Pepito","Luis");

        String nombresUnidos = nombre.stream().collect(Collectors.joining(", "));

        System.out.println(nombresUnidos);
        */

        Notas notas = new Notas();
        notas.eliminarSuspensos();

        Product pepito = new Product("Wiwi", "Wawa" , 20.1f);

        Optional<Product> emptyProduct = Optional.empty();

        Product trying = emptyProduct.orElse(new Product("Vacio","wiwi",0));

        System.out.println(emptyProduct);
        System.out.println(trying.getProductName() + trying.getProductType() + trying.getProductPrice());

        Scanner entrada = new Scanner(System.in);

        String value = ((Function<String,String>) s -> s.trim()).andThen(s-> s.toUpperCase()).andThen(s -> s + "!!!").apply(entrada.nextLine());
        System.out.println(value);
    }
}