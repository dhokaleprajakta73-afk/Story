import java.util.Scanner;

public class Blood donor Finder {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("===== Blood Donor Finder System =====");

        login();

        sc.close();
    }

    // Login Method
    static void login() {

        System.out.println("\n--- Login / Register ---");

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (username.equals("admin") && password.equals("1234")) {

            System.out.println("Login Successful!");
            mainMenu();

        } else {

            System.out.println("Invalid Login!");
            System.out.println("Please try again.");

            login();   // Method Call
        }
    }

    // Main Menu Method
    static void mainMenu() {

        System.out.println("\n--- Main Menu ---");
        System.out.println("1. Search Donor");
        System.out.println("2. Request Blood");
        System.out.println("3. View Profile");
        System.out.println("4. Logout");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                searchDonor();       // Method Call
                break;

            case 2:
                bloodRequest();      // Method Call
                break;

            case 3:
                profile();           // Method Call
                break;

            case 4:
                logout();            // Method Call
                break;

            default:
                System.out.println("Invalid Choice!");
                mainMenu();         // Method Call
        }
    }

    // Search Donor Method
    static void searchDonor() {

        System.out.println("\n--- Search Donor ---");

        System.out.print("Enter Blood Group: ");
        String bloodGroup = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.println("\nSearching Donors...");
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("City: " + city);

        donorList();     // Method Call
    }

    // Donor List Method
    static void donorList() {

        System.out.println("\n--- Donor List ---");
        System.out.println("1. Donor A - Available");
        System.out.println("2. Donor B - Available");

        System.out.print("Select Donor: ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Donor Selected Successfully!");

        mainMenu();      // Method Call
    }

    // Blood Request Method
    static void bloodRequest() {

        System.out.println("\n--- Blood Request ---");

        System.out.print("Enter Required Blood Group: ");
        String group = sc.nextLine();

        System.out.println("Blood Request Submitted!");
        System.out.println("Blood Group: " + group);

        requestConfirmed();    // Method Call
    }

    // Request Confirmation Method
    static void requestConfirmed() {

        System.out.println("\n--- Request Confirmed ---");
        System.out.println("Your blood request is confirmed.");

        mainMenu();      // Method Call
    }

    // Profile Method
    static void profile() {

        System.out.println("\n--- Profile ---");
        System.out.println("Name: User");
        System.out.println("Blood Group: A+");
        System.out.println("City: Kolhapur");

        System.out.print("\nDo you want to update profile? (yes/no): ");
        String answer = sc.nextLine();

        if (answer.equalsIgnoreCase("yes")) {

            profileUpdated();     // Method Call

        } else {

            mainMenu();           // Method Call
        }
    }

    // Profile Updated Method
    static void profileUpdated() {

        System.out.println("\n--- Profile Updated ---");
        System.out.println("Profile updated successfully.");

        mainMenu();      // Method Call
    }

    // Logout Method
    static void logout() {

        System.out.println("\n--- Logout ---");
        System.out.println("You have successfully logged out.");

        System.out.println("\n===== End =====");
        System.out.println("Thank you for using Blood Donor Finder System!");
    }
}