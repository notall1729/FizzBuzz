import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.*;

public class Main {
    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 1;

    public static void main(String[] args) {
        Map<Integer, String> rules = new HashMap<>();

        rules.put(3, "Fizz");
        rules.put(5, "Buzz");

        for (int i = MIN_VALUE; i <= MAX_VALUE; ++ i){
            StringBuilder output = new StringBuilder();
            
            for(Map.Entry<Integer, String> entry : rules.entrySet()){
                if(i % entry.getKey() == 0)
                    output.append(entry.getValue());
            }
            if (output.length() == 0)
                System.out.println(i);

            else
                System.out.println(output.toString());
        }
    }
}