import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class StudentGradeEvaluator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("results.txt");
            System.out.print("How many students do you want to evaluate? ");
            int numStudents = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline

            for (int i = 1; i <= numStudents; i++) {
                System.out.println("\n--- Student " + i + " ---");

                // Input name and course
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();

                System.out.print("Enter course name: ");
                String course = scanner.nextLine();

                int score = -1;
                while (score < 0 || score > 100) {
                    System.out.print("Enter score (0-100): ");
                    score = scanner.nextInt();
                    if (score < 0 || score > 100) {
                        System.out.println("Invalid score! Please enter a value between 0 and 100.");
                    }
                }
                scanner.nextLine(); // Consume newline

                // Determine grade
                String grade;
                if (score >= 90) grade = "A";
                else if (score >= 80) grade = "B";
                else if (score >= 70) grade = "C";
                else if (score >= 60) grade = "D";
                else grade = "F";

                // Display result
                System.out.println("\n=== Student Grade Report ===");
                System.out.println("Name   : " + name);
                System.out.println("Course : " + course);
                System.out.println("Score  : " + score);
                System.out.println("Grade  : " + grade);

                // Write to file
                writer.write("Student " + i + ":\n");
                writer.write("Name   : " + name + "\n");
                writer.write("Course : " + course + "\n");
                writer.write("Score  : " + score + "\n");
                writer.write("Grade  : " + grade + "\n");
                writer.write("------------------------\n");
            }

            writer.close();
            System.out.println("\n All results saved to 'results.txt'");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }

        scanner.close();
    }
}
