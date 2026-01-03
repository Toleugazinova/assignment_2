import java.util.ArrayList;
import java.util.Scanner;

public class FleetApp {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private Scanner s = new Scanner(System.in);
    public void run() {
        while (true) {
            System.out.println();
            System.out.println("Fleet Management System");
            System.out.println("1.Print all vehicles");
            System.out.println("2.Add new car");
            System.out.println("3.Add new bus");
            System.out.println("4.Show total yearly insurance fees");
            System.out.println("5.Show vehicles older than N years");
            System.out.println("6.Perform service for all vehicles");
            System.out.println("7.Quit");
            System.out.print("Enter choice: ");
            int choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1:
                    if (vehicles.isEmpty())
                        System.out.println("No vehicles in the fleet");
                    else vehicles.forEach(System.out::println);
                    break;

                case 2:
                    System.out.println("Enter car model: ");
                    String model = s.nextLine();
                    System.out.println("Enter car year: ");
                    int year = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter car base price: ");
                    double basePrice = s.nextDouble();
                    s.nextLine();
                    System.out.println("Number of doors: ");
                    int doors = s.nextInt();
                    s.nextLine();
                    vehicles.add(new Car(model,year,basePrice,doors));
                    break;

                case 3:
                    System.out.println("Enter bus model: ");
                    model = s.nextLine();
                    System.out.println("Enter bus year: ");
                    year = s.nextInt();
                    s.nextLine();
                    System.out.println("Enter bus base price: ");
                    basePrice = s.nextDouble();
                    s.nextLine();
                    System.out.println("Enter bus passenger capacity: ");
                    int passengerCapacity = s.nextInt();
                    s.nextLine();
                    vehicles.add(new Bus(model,year,basePrice,passengerCapacity));
                    break;

                case 4:
                    double t=0;
                    for(Vehicle v : vehicles)
                        t+=v.calculateInsuranceFee();
                    System.out.println("Total yearly insurance fees: " + t);
                    break;

                case 5:
                    System.out.print("Current year: ");
                    int currentYear = s.nextInt();
                    System.out.println("N: ");
                    int n = s.nextInt();
                    s.nextLine();
                    for(Vehicle v : vehicles) {
                        if(v.getAge(currentYear) > n)
                            System.out.println(v.toString());
                    }
                    break;

                case 6:
                    for (Vehicle v : vehicles) {
                        Servicable s = v;
                        s.performService();
                    }
                    break;

                case 7:
                    return;
            }
        }
    }
}
