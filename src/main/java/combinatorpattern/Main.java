package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "farouk",
                "faroukarogundade@gmail.com",
                "+0679845697754",
                LocalDate.of(2016, 1,1)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid we can store customer in db

        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

//        System.out.println(result);
//
//        if (result != ValidationResult.SUCCESS) {
//            throw new IllegalStateException(result.name());
//        }

    }
}
