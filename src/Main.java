import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number > 7) {
            System.out.println("Hello");
        }


        // Task 2
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        if ("John".equalsIgnoreCase(name)) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }


        // Task 3
        System.out.print("Enter numbers (separated by space or comma): ");
        String input = scanner.nextLine();

        System.out.println("Multiples of 3:");

        for (String str : input.trim().split("[,\\s]+")) {
            int num = Integer.parseInt(str);
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
