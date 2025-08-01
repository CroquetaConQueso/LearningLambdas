import java.util.List;
import java.util.stream.Collectors;

public class l2{

    public static void main(String[] args){
        List<Product> products = List.of(new Product("Wawa","Cafe",3.12f),new Product("Wiwi","Alcohol",40.2f));
        
        ProccessProduct proccessProduct = p -> "Name: " + p.getProductName() + " | Price " +p.getProductPrice();
        
        List<String> formattedList = proccessProduct.processAll(products);
        formattedList.forEach(System.out::println);
        
        List<String> nombre = List.of("Ana","Pepito","Luis");

        String nombresUnidos = nombre.stream().collect(Collectors.joining(", "));

        System.out.println(nombresUnidos);
    }
}