public class Bus extends Vehicle {
    protected int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee(){
        return getBasePrice()*0.4;
    }

    @Override
    public void performService() {
        if (getServiceIntervalKm()>5000){
            System.out.println("A server is required for the bus "+ getId());
        }
    }

    @Override
    public int getServiceIntervalKm() {
        return 1500;
    }

    public String toString() {
        return "Bus " + super.toString() + ", capacity = " + passengerCapacity;
    }
}
