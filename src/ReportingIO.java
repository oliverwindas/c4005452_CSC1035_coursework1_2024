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
    }

    private static void listAllManufacturers()
    {

    }

    private static void listCarModelsByManufacturer()
    {

    }

    private static void provideReportingStatistics()
    {

    }


}
