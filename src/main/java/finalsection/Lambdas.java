package finalsection;

import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Function<String, String> upperCaseName = name -> {
            // logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

//        [LG] webOS TV UN7340pvs
    }
}
