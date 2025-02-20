import java.util.Scanner;

public class ReportingIO
{
    private static Reporting reporting = new Reporting();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Enter Manufacturer Data");
            System.out.println("2. Enter Car Model Data");
            System.out.println("3. List All Manufacturers");
            System.out.println("4. List All Car Models by Manufacturer");
            System.out.println("5. Provide Reporting Statistics");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    enterManufacturerData();
                    break;
                case 2:
                    enterCarModelData();
                    break;
                case 3:
                    listAllManufacturers();
                    break;
                case 4:
                    listCarModelsByManufacturer();
                    break;
                case 5:
                    provideReportingStatistics();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            scanner.close();

        }
    }

    private static void enterManufacturerData()
    {
        System.out.print("Enter manufacturer name: ");
        String name = scanner.nextLine();
        Manufacturer manufacturer = new Manufacturer(name);
        reporting.addManufacturer(manufacturer);
        System.out.println("Added Manufacturer.");
    }

    private static void enterCarModelData()
    {
        System.out.print("Enter manufacturer name: ");
        String manufacturerName = scanner.nextLine();
        Manufacturer manufacturer = findManufacturer(manufacturerName);

        if (manufacturer != null)
        {
            System.out.print("Enter car model name: ");
            String modelName = scanner.nextLine();
            System.out.print("Enter weight (in kg): ");
            double weight = scanner.nextDouble();
            System.out.print("Enter sales price (in pounds): ");
            double salesPrice = scanner.nextDouble();
            System.out.print("Enter number sold: ");
            int numberSold = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter type (hatchback, saloon, estate): ");
            String type = scanner.nextLine();

            CarModel carModel = new CarModel(modelName, weight, salesPrice, numberSold, type);
            manufacturer.addCarModel(carModel);
            System.out.println("Car model added to manufacturer.");
        }
        else
        {
            System.out.println("Manufacturer not found.");
        }
    }

    private static void listAllManufacturers()
    {
        System.out.println("List of Manufacturers:");
        for (Manufacturer manufacturer : reporting.getManufacturers())
        {
            System.out.println(manufacturer.getName());
        }
    }

    private static void listCarModelsByManufacturer()
    {
        System.out.print("Enter manufacturer name: ");
        String manufacturerName = scanner.nextLine();
        Manufacturer manufacturer = findManufacturer(manufacturerName);
    }

    private static void provideReportingStatistics()
    {

    }

    private static Manufacturer findManufacturer(String name)
    {
        for (Manufacturer manufacturer : reporting.getManufacturers()) {
            if (manufacturer.getName().equalsIgnoreCase(name)) {
                return manufacturer;
            }
        }
        return null;
    }

}
