import java.util.function.Function;

public class Funcionales {
    /* Funciones de alto nivel*/
    /* - Devuelve Otra Funcion  */
    private Function<String, String> toMayus = (x) -> x.toUpperCase();
    private Function<Integer, Integer> sumador = (x) -> x.sum(x,x);

    public void pruebas(){
        System.out.println(toMayus.apply("Big Data"));
        System.out.println(sumador.apply(1));

    };

}
