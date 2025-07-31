public interface Procesador {
    void procesa (String cadena);

    default void procesa(String[] cadenas){
        for(String cadena: cadenas){
            procesa(cadena);
        }
    }
}
