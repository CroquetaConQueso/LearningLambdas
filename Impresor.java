import java.util.List;
import java.util.Locale;

public class Impresor implements Procesador,Traductor {
    
    
    @Override
    public void procesa(String cadena) {
        System.out.println("Procesando: " + cadena);
    }

    @Override
    public String traduccion(Locale locale, String clave) {
        return "Traduccion simulada de " + clave + " para locale " +locale;
    }
    public static void main(String[] args) {
        Impresor impresor = new Impresor();


        String[] cadenas = {"Wendy", "Missy", "Daisy"};
        impresor.procesa(cadenas);
        
        Locale locale = Traductor.obtenLocaleEntorno();

        List<String> claves= List.of("first", "second", "third");
        

        try{
            List<String> traducciones = impresor.traduccion(locale, claves);
            traducciones.forEach(System.out::println);
        }catch(UnsupportedOperationException e){
            System.out.println(e);
        }
    }
}
