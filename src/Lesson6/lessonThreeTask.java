package Lesson6;

public class lessonThreeTask {

    public static void main(String[] args) {

        Car car = new Car();
        car.showInfo();

        Car blueCar = new Car("blue");
        blueCar.showInfo();

        Person person = new Person("Igor");

        Car blackCarWithDriver = new Car("black", person);
        System.out.println("Ping!");
        blackCarWithDriver.showInfo();

    }

}

