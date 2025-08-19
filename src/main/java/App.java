import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MemberDAO dao = new MemberDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Club Membership Manager ===");
            System.out.println("1. Add Member");
            System.out.println("2. View Members");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    dao.addMember(name, email);
                    break;
                case 2:
                    List<Member> members = dao.getAllMembers();
                    System.out.println("\n--- Members ---");
                    for (Member m : members) {
                        System.out.println(m);
                    }
                    break;
                case 3:
                    System.out.println("👋 Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}
