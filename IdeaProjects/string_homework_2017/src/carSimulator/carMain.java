package carSimulator;

public class carMain {

    public static void main(String[] args) {

        Car car1 = new Car("2018", "Lotus Evora");

        Car car2 = new Car("2018", "Tesla");

        //starts the engine of car 1 ("Lotus")
        startEngine(car1);

        //Concatenating two strings
        System.out.println(car1.getMake() + " " + "Have started");

        //Starts car number 2 ( "Tesla" )
        startEngine(car2);
        System.out.println(car2.getMake() + " " + "Have started");


        // displays the car model while running in a loop for 5 times and increasing the value of the speed by +10
        System.out.println("\nSeat belt on please. Accelerating...!!!");
        for (int perSecond = 1; perSecond <= 5; perSecond++) {
            car1.accelerate();
            System.out.println(car1.getModel() + " " + car1.getMake() + "'s speed is " +
                    car1.getSpeed() + " mph");
            if (car1.getSpeed() == 10) {
                System.out.println("You are on 1st gear");
            } else if (car1.getSpeed() == 30) {
                System.out.println("Increasing to 2nd gear");
            } else if (car1.getSpeed() == 40) {
                System.out.println("Increasing to 3rd gear");
            }
        }

        // displays the car model while running in a loop for 5 times and increasing the value of the speed by +10
        System.out.println("\nBraking...");
        for (int perSecond = 1; perSecond <= 5; perSecond++) {
            car1.brake();
            System.out.println(car1.getModel() + " " + car1.getMake() + "'s speed is " +
                    car1.getSpeed() + " mph");

            if (car1.getSpeed() == 10) {
                System.out.println("Decreasing to 1st gear");
            } else if (car1.getSpeed() == 30) {
                System.out.println("Decreasing to 2nd gear");
            } else if (car1.getSpeed() == 40) {
                System.out.println("You are on 3rd gear");
            }

        }
        System.out.println("\nSeat belt on please. Accelerating...!!!");
        for (int perSecond = 1; perSecond <= 5; perSecond++) {
            car2.accelerate();
            System.out.println(car2.getModel() + " " + car2.getMake() + "'s speed is " +
                    car2.getSpeed() + " mph");
            if (car2.getSpeed() == 10) {
                System.out.println("You are on 1st gear");
            } else if (car2.getSpeed() == 30) {
                System.out.println("Increasing to 2nd gear");
            } else if (car2.getSpeed() == 40) {
                System.out.println("Increasing to 3rd gear");
            }
        }
        System.out.println("\nBraking...");
        for (int perSecond = 1; perSecond <= 5; perSecond++) {
            car2.brake();
            System.out.println(car2.getModel() + " " + car2.getMake() + "'s speed is " +
                    car2.getSpeed() + " mph");

            if (car2.getSpeed() == 10) {
                System.out.println("Decreasing to 1st gear");
            } else if (car2.getSpeed() == 30) {
                System.out.println("Decreasing to 2nd gear");
            } else if (car2.getSpeed() == 40) {
                System.out.println("You are on 3rd gear");
            }

        }


    }

    // through polymorphism, assigning a reference to Car object that is a car to a car variable
    public static void startEngine(Car car1) {
        car1.startEngine();
    }

    public static void startEngine2(Car car2) {
        car2.startEngine();

    }
}
























