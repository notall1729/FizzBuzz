import java.util.*;

public class Main {
    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 1;

    public static void main(String[] args) {
        Map<Integer, String> rules = new HashMap<>();

        rules.put(3, "Fizz");
        rules.put(5, "Buzz");

        for (int i = MIN_VALUE; i <= MAX_VALUE; ++ i){
          if(i % 3 == 0 && i % 5 == 0)
              System.out.println(rules.get(3) + rules.get(5));

          else if(i % 3 == 0)
              System.out.println(rules.get(3));

          else if(i % 5 == 0)
              System.out.println(rules.get(5));

          else System.out.println(i);
        }
    }
}