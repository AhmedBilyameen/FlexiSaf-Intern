import java.util.Scanner;

public class TextConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to TextConverter Pro!");
        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Convert Number to String");
            System.out.println("2. Convert String to Number");
            System.out.println("3. Reverse a String");
            System.out.println("4. Show ASCII codes of characters");
            System.out.println("5. Math Operation on Numeric Strings");
            System.out.println("6. Exit");
            System.out.print("Enter option: ");

            String option = input.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Enter a number: ");
                    int number = Integer.parseInt(input.nextLine());
                    String numToStr = String.valueOf(number);
                    System.out.println("Converted to string: \"" + numToStr + "\"");
                    break;

                case "2":
                    System.out.print("Enter a numeric string: ");
                    String str = input.nextLine().trim();

                    if (str.matches("-?\\d+(\\.\\d+)?")) { // supports integers & decimals
                        try {
                            double converted = Double.parseDouble(str);
                            System.out.println("Converted to number: " + converted);
                        } catch (NumberFormatException e) {
                            System.out.println("Number is too large or invalid.");
                        }
                    } else {
                        System.out.println("Input is not a valid numeric string.");
                    }
                    break;

                case "3":
                    System.out.print("Enter a string to reverse: ");
                    String original = input.nextLine();
                    String reversed = new StringBuilder(original).reverse().toString();
                    System.out.println("Reversed: " + reversed);
                    break;

                case "4":
                    System.out.print("Enter a word: ");
                    String word = input.nextLine();
                    System.out.println("Character : ASCII");
                    for (char ch : word.toCharArray()) {
                        System.out.println("   " + ch + "     :  " + (int) ch);
                    }
                    break;

                case "5":
                    System.out.print("Enter a number (as string): ");
                    String mathStr = input.nextLine();
                    try {
                        double value = Double.parseDouble(mathStr);
                        System.out.println("Square root: " + Math.sqrt(value));
                        System.out.println("Rounded: " + Math.round(value));
                        System.out.println("Absolute: " + Math.abs(value));
                    } catch (NumberFormatException e) {
                        System.out.println("Not a valid number.");
                    }
                    break;

                case "6":
                    System.out.println("Exiting... Thank you for using TextConverter Pro.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }

        input.close();
    }
}
