import java.util.HashMap;
import java.util.Scanner;

public class MedicalStoreManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Medicine> medicines = new HashMap<>();

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

                    if (medicines.containsKey(id)) {
                        System.out.println("Medicine ID already exists.");
                        break;
                    }

                    System.out.print("Enter Medicine Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    Medicine medicine =
                        new Medicine(id, name, category, price, quantity);

                    medicines.put(id, medicine);

                    System.out.println("Medicine Added Successfully.");
                    break;

                case 2:
                    if (medicines.isEmpty()) {
                        System.out.println("No Medicines Available.");
                    } else {
                        System.out.println("\n===== MEDICINE DETAILS =====");

                        for (Medicine m : medicines.values()) {
                            System.out.println("---------------------------");
                            System.out.println("ID       : " + m.id);
                            System.out.println("Name     : " + m.name);
                            System.out.println("Category : " + m.category);
                            System.out.println("Price    : " + m.price);
                            System.out.println("Quantity : " + m.quantity);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Medicine ID to Search: ");
                    int searchId = sc.nextInt();

                    Medicine found = medicines.get(searchId);

                    if (found != null) {
                        System.out.println("\nMedicine Found!");
                        System.out.println("ID       : " + found.id);
                        System.out.println("Name     : " + found.name);
                        System.out.println("Category : " + found.category);
                        System.out.println("Price    : " + found.price);
                        System.out.println("Quantity : " + found.quantity);
                    } else {
                        System.out.println("Medicine Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Medicine ID to Update: ");
                    int updateId = sc.nextInt();

                    Medicine update = medicines.get(updateId);

                    if (update != null) {

                        System.out.print("Enter New Price: ");
                        update.price = sc.nextDouble();

                        System.out.print("Enter New Quantity: ");
                        update.quantity = sc.nextInt();

                        System.out.println("Medicine Updated Successfully.");

                    } else {
                        System.out.println("Medicine Not Found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Medicine ID to Delete: ");
                    int deleteId = sc.nextInt();

                    if (medicines.containsKey(deleteId)) {
                        medicines.remove(deleteId);
                        System.out.println("Medicine Deleted Successfully.");
                    } else {
                        System.out.println("Medicine Not Found.");
                    }
                    break;

                case 6:
                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}