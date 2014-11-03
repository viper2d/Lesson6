package Lesson6;


public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.showInfo();

        Car blueCar = new Car("blue");
        blueCar.showInfo();

        Person person = new Person("Igor");
        person.showPerson();

        Car blackCarWithDriver = new Car("black", person);
        blackCarWithDriver.showInfo();

    }

}
