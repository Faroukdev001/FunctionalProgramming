package finalsection;

import java.util.function.Consumer;

public class CallBacks {

    public static void main(String[] args) {

        hello("John", null, value -> {
            System.out.println("no lastname provided for " + value);
        });

    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        }
        else {
            callback.accept(firstName);
        }
    }

//    function hello(firstName, lastName, callback) {
//        console.log(firstName);
//        if(lastname) {
//            console.log(lastName)
//        }
//        else {
//            callback();
//        }
//    }
}
