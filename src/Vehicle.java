public abstract class Vehicle implements Servicable {
    private int id;
    private static int idGen;
    private String model;
    private int year;
    private double basePrice;
    public Vehicle(String model, int year, double basePrice) {
        id=idGen++;
        setModel(model);
        setYear(year);
        setBasePrice(basePrice);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if (model == null || model.isEmpty())
            throw new IllegalArgumentException();
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year< 1885 || year > 2025)
            throw new IllegalArgumentException();
        this.year = year;
    }

    public double getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(double basePrice) {
        if (basePrice < 0)
            throw new IllegalArgumentException();
        this.basePrice = basePrice;
    }

    public int getAge(int currentYear){
        return currentYear-year;
    }

    public abstract double calculateInsuranceFee();

    public String toString() {
        return "id = " + id + ", model = " + model + ", year = " + year + ", basePrice = " + basePrice;
    }

}
