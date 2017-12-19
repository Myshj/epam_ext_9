package task_5_2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(
                        "John",
                        Person.Gender.MALE,
                        17
                ),
                new Person(
                        "Jack",
                        Person.Gender.MALE,
                        20
                ),
                new Person(
                        "George",
                        Person.Gender.MALE,
                        30
                ),
                new Person(
                        "Alice",
                        Person.Gender.FEMALE,
                        10
                ),
                new Person(
                        "Ann",
                        Person.Gender.FEMALE,
                        15
                )
        );
        people.forEach(System.out::println);
        System.out.println("Enlist: ");

        //System.out.println(
                /*"Enlist them: " +*/
        people.stream()
                .filter(Person::readyToServe)
                .forEach(System.out::println);
        //);

        System.out.println("Average age of females: " + people.stream()
                .filter(p -> p.getGender() == Person.Gender.FEMALE)
                .mapToDouble(Person::getAge)
                .average()
        );
    }
}
