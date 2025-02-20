import java.util.Scanner;

public class ReportingIO
{
    private static Reporting reporting = new Reporting();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
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
        }
    }
}
