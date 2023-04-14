package LinkedList;

import java.util.ArrayList;
import java.util.List;

 class Person {
     String name;
     int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class PersonAss {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Gautam",30));
        people.add(new Person("Sourav",40));
        people.add(new Person("Manish",20));
        people.add(new Person("Himanshu",15));
        people.add(new Person("Mukul;",25));
        people.add(new Person("gourav",33));
        people.add(new Person("Riya",33));
        people.add(new Person("pallabi",33));
        people.add(new Person("tuhsar",33));
        people.add(new Person("sneha",33));
		
        for (Person person : people) {
            System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        }
    }
}