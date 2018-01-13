package carSimulator;

//inherits from Class Car
public class Tesla extends Car{

    public Tesla(String modelAssigned, String makeAssigned) {
        super(modelAssigned, makeAssigned);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }
    @Override
    public void engineStop() {
        super.engineStop();
    }
    @Override
    public void changeGears() {
        super.changeGears();
    }

    public void activeSelfDriving(){
        System.out.println("Self driving mode activated: Relax and Enjoy the Ride");
    }




}
