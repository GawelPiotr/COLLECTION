import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    static List<Integer> numbers = new LinkedList<>();

   static String[]tabString = {"Ala ", "ma ","Kota "};
    static List<String> captions = Arrays.asList(tabString);
    static String [] captionOut = (String[]) captions.toArray();

    static List<String> wiredCaptions = new LinkedList<String>(){{
        add("Ola ");
        add("ma ");
        add("pieska ");
    }};


    public static void main(String[] args) {
        numbers.add(3);
        numbers.add(new Integer(44));
        numbers.add(Integer.parseInt("123"));
        //numbers.add("Ala");
        addString(numbers,"ala");

        Printer(numbers);
        Printer(captions);
        Printer(wiredCaptions);
    }

    private static void Printer(List lista) {
        for (Object value : lista){
            System.out.println(value);
        }
    }

    static void addString(List lista,String value){
        lista.add(value);
    }
}
