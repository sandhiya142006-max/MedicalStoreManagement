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
    System.out.print("Enter Medicine ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Medicine Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Category: ");
    String category = sc.nextLine();

    System.out.print("Enter Price: ");
    double price = sc.nextDouble();

    System.out.print("Enter Quantity: ");
    int quantity = sc.nextInt();

    medicines.add(new Medicine(id, name, category, price, quantity));

    System.out.println("Medicine Added Successfully.");
    break;
                case 2:
    if (medicines.isEmpty()) {
        System.out.println("No Medicines Available.");
    } else {
        System.out.println("\nMedicine Details");
        for (Medicine m : medicines) {
            System.out.println("----------------------------");
            System.out.println("ID       : " + m.id);
            System.out.println("Name     : " + m.name);
            System.out.println("Category : " + m.category);
            System.out.println("Price    : " + m.price);
            System.out.println("Quantity : " + m.quantity);
        }
    }
                    break;
                case 3:
    System.out.print("Enter Medicine ID: ");
    int searchId = sc.nextInt();

    boolean found = false;

    for (Medicine m : medicines) {
        if (m.id == searchId) {
            System.out.println("Medicine Found");
            System.out.println("Name     : " + m.name);
            System.out.println("Category : " + m.category);
            System.out.println("Price    : " + m.price);
            System.out.println("Quantity : " + m.quantity);
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Medicine Not Found.");
    }
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