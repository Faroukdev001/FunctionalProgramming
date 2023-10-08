package functionalinterface;

import java.util.function.BiFunction;

public class _BiFunction {

    public static void main(String[] args) {
        System.out.println(incrementByOneAndMultiply(4, 100));

        // BiFunction takes 2 argument and produces one result
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));

    }

    // Normal Java Function
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

    // BiFunction Functional Interface
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;
}
