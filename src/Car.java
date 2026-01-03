public class Car extends Vehicle {
    protected int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        return super.getBasePrice() * 0.2;
    }

    @Override
    public void performService() {
        if (getServiceIntervalKm() > 5000) {
            System.out.println("A server is required for the car "+ getId());
        }
    }

    @Override
    public int getServiceIntervalKm() {
        return 10000;
    }

    public String toString() {
        return "Car " + super.toString() + ", number of doors = " + numberOfDoors;
    }
}
