import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many machines do you want to create? ");
        int numOfMachines = scanner.nextInt();

        for(int i = 0; i < numOfMachines; i++) {
        System.out.println("Enter the details for machine " + (i+1) + ":");

        System.out.print("Make: ");
        String make = scanner.next();

        System.out.print("Model: ");
        String model = scanner.next();

        System.out.print("Year: ");
        int year = scanner.nextInt();

        Car car = new Car(make, model, year);
        car.displayInfo();
        }
        }
        }