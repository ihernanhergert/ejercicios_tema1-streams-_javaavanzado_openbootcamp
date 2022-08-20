import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //Funcionales f = new Funcionales();
        //f.pruebas();

        ArrayList<String> nombres = new ArrayList();
        nombres.add("Paco");
        nombres.add("Pepe");
        nombres.add("Juan");

        Stream<String> valores = nombres.stream()
                .map(x -> x.toUpperCase())
                .filter(x -> x.startsWith("P"));

        valores.forEach(System.out::println);

        int [] arrayInt = {1,2,3,4,5,6,7,8,9,10};
        var stNumeros = Arrays.stream(arrayInt);

        var resultado = stNumeros.filter(x -> x % 2 == 0).reduce(0, (x,y) -> {
            System.out.println("X es " + x + " Y es " + y);

            return x + y;
        } );
        //stNumeros.forEach(x -> System.out.println(x));
        //resultado.forEach(x -> System.out.println(x));


    }


}