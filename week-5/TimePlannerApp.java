import java.util.Scanner;

public class TimePlannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimplePlanner planner = new SimplePlanner();

        System.out.println("📆 Welcome to TimePlanner!");

        System.out.print("Enter hours you've already spent today: ");
        int usedHours = scanner.nextInt();
        int remaining = planner.calculateRemainingHours(usedHours);

        if (remaining == -1) {
            return; // Invalid input
        }

        System.out.println("⏳ You have " + remaining + " hour(s) remaining today.");

        System.out.print("Enter a task you want to do: ");
        scanner.nextLine();
        String task = scanner.nextLine();

        System.out.print("Enter how many hours you want to spend on this task: ");
        int taskHours = scanner.nextInt();

        if (taskHours > remaining) {
            planner.suggestAdjustment(task, taskHours);
        } else {
            System.out.println("✅ Great! You have enough time for '" + task + "'. Stay productive!");
        }

        scanner.close();
    }
}
