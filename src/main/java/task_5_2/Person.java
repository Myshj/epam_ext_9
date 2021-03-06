package task_5_2;

public class Person {
    private String name;
    private Gender gender;
    private int age;

    public Person(
            String name,
            Gender gender,
            int age
    ) {

        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean readyToServe() {
        return age >= 18 && age <= 25;
    }

    public enum Gender {
        MALE, FEMALE
    }
}
