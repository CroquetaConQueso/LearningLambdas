public class LambdasFactory {
    public Constante devuelve5() {
        return () -> 5;
    }

    public Operador obtenSumador() {
        return (a, b) -> (a + b);
    }

    /*
     * Devuelve un inicializador de un array de strings
     * El metodo inicializa recibe el array ya creado. Su tarea ees que todas las
     * posiciones queden inicializadas con el valor indicado en el segundo parametro
     * del metodo inicializa
     */
    public InicializadorArrays obtenInicializador() {
        
        return (array, valor) -> {
            for (String valore : array) {
                valore = valor;
            }
        };
    }

    interface Constante {
        int valor();
    }

    interface Operador {
        int opera(int a, int b);
    }

    interface InicializadorArrays{
        void inicializa(String[] array, String valor);
    }
}
