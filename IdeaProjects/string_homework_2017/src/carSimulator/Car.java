package carSimulator;

/**
 Homework #1.
 Start with a Car class as base class.
 Finally, create another class, a specific type of Car that inherits
 from the Car class. You should be able to hand steering, changing gears,
 and moving (speed in other words).You will want to decide where to
 put the appropriate state and behaviors (fields and methods).As mentioned
 above, changing gears, increasing/decreasing speed should be included.
 For you specific type of vehicle you will want to add something
 specific for that type of car.


 Homework #2
 Now create 3 sub classes for your favorite vehicles.
 Override the appropriate methods to demonstrate polymorphism in use.
 put all classes in the one java file.


 *** Created By Mohammad Shahin


 */

public class Car implements EngineControl{

    private String make;
    private String model;
    private char gears;
    private double speed;



    //Accessors which will help us  indirectly access the private field variables.



    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public double getSpeed() {
        return speed;

    }

    //Accelerate method will increase the speed of the car by 10 mph
    public void accelerate() {

        speed += 10;

    }



    // Break method once called it will decrease the speed by 10 mph
    public void brake () {

        speed-=10;

    }



    //Constructor of the class Car
    public Car( String modelAssigned, String makeAssigned){
        model = modelAssigned;
        make = makeAssigned;
        speed = 0;
    }


    // Method overrides from EngineControl Class. Doesnt return anything
    @Override
    public void startEngine() {

    }
    @Override
    public void changeGears() {


    }
    @Override
    public void engineStop() {

    }


    public void setGears(int gears) {

    }

    public void getGears(int gears){

    }
}

