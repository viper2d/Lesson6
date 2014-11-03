package Lesson6;


public class Car {

    private String color;
    Person person;

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
        
        if (person != null) {

            System.out.println("Car color is " + color + ". Drivers name is " + person);

        }

        else if (person == null) {

            System.out.println("Car color is " + color);

        }

    }

}
