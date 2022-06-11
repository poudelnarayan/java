import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Car Class
        Car prosche = new Car();
        prosche.setModels("911");
        System.out.println("Model is " + prosche.getModels());
        // Account Class
        Account bobsAccount = new Account("12333", "Bob Brown", 0.00, "bob@gmail.com", "(+98) 456-4346");

        System.out.println("Enter the amount to deposit");
        double depositAmount = scanner.nextDouble();
        scanner.nextLine();

        bobsAccount.deposit(depositAmount);
        bobsAccount.withDraw(100000);

        VipCustomer person1 = new VipCustomer();

    }
}
