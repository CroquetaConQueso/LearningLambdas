import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

//Establecer esto especifica al compliador para que valide que esta es una interfaz funcional y que solo puede tener un método abstracto
@FunctionalInterface
public interface Traductor {

    //Aunque no se especifique al tener static este tiene visibilidad public
    static Locale obtenLocaleEntorno(){
        return Locale.getDefault();
    }
    String traduccion (Locale locale, String clave);

    default List<String> traduccion(Locale locale, List<String> claves){
        List<String> traducciones = new ArrayList<>();
        for(String clave:claves){
            traducciones.add(traduccion(locale,clave));
        }
        return traducciones;
    }
}

