import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Add some default data
        library.addBook(new Book(1, "Java Basics", "James Gosling"));
        library.addBook(new Book(2, "Data Structures", "Robert Lafore"));
        library.addBook(new Book(3, "Algorithms", "Thomas Cormen"));
        library.addUser(new User(1, "Aryan"));
        library.addUser(new User(2, "Sidhu"));
        library.addUser(new User(3, "Kritika"));

        int choice;
        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Show All Books");
            System.out.println("2. Add Book");
            System.out.println("3. Add User");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.showAllBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(bid, title, author));
                    break;
                case 3:
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Name: ");
                    String uname = sc.nextLine();
                    library.addUser(new User(uid, uname));
                    break;
                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    int ibid = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int iuid = sc.nextInt();
                    library.issueBook(ibid, iuid);
                    break;
                case 5:
                    System.out.print("Enter Book ID to return: ");
                    int rid = sc.nextInt();
                    library.returnBook(rid);
                    break;
                case 0:
                    System.out.println("👋 Exiting system...");
                    break;
                default:
                    System.out.println("❌ Invalid choice, try again!");
            }
        } while (choice != 0);

        sc.close();
    }
}

