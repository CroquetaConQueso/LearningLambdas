import java.util.List;

@FunctionalInterface
public interface ProccessProduct{
    String process(Product product);

    default List<String> processAll(List<Product> products){
        return products.stream().map(this::process).toList();
    }
}