package streams;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;


public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Amina", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

//        people.stream()
//                .map(person -> person.name)// convert everything into a list of genders
//                .mapToInt(String::length)
////                .collect(Collectors.toSet())// collect to a set removing duplicates
//                .forEach(System.out::println);

        Predicate<Person> personPredicate = person -> PREFER_NOT_TO_SAY.equals(person.gender);

        boolean containsOnlyFemales = people.stream()
                .noneMatch(personPredicate);

        System.out.println(containsOnlyFemales);


    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
        // what is a toString() method
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
