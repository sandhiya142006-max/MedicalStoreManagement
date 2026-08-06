import java.util.ArrayList;
import java.util.Scanner;

public class MedicalStoreManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Medicine> medicines = new ArrayList<>();

        while (true) {
            System.out.println("\n===== MEDICAL STORE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Medicine");
            System.out.println("2. View Medicines");
            System.out.println("3. Search Medicine");
            System.out.println("4. Update Medicine");
            System.out.println("5. Delete Medicine");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Add Medicine (Next Module)
                    break;
                case 2:
                    // View Medicines (Next Module)
                    break;
                case 3:
                    // Search Medicine (Next Module)
                    break;
                case 4:
                    // Update Medicine (Next Module)
                    break;
                case 5:
                    // Delete Medicine (Next Module)
                    break;
                case 6:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}