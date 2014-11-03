package Lesson6;

/**
 * Created by prov on 10/30/14.
 */
public class Car {

    private String color;
    public Person person;

    public Car() {

        this.color = "silver";
    }

    public Car(String color) {

        this.color = color;
    }

    public Car(String color, Person person) {

        this.color = color;
        this.person = person;

    }

    public void showInfo() {

        System.out.println("Car color is " + color);

    }

}
