import java.util.Scanner;

// Enum for Days
enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Superclass
class Day {
    protected DayOfWeek day;

    public Day(DayOfWeek day) {
        this.day = day;
    }

    public void showSchedule() {
        System.out.println("General day schedule.");
    }
}

// Subclass for weekdays
class Weekday extends Day {
    public Weekday(DayOfWeek day) {
        super(day);
    }

    @Override
    public void showSchedule() {
        System.out.println("📅 " + day + " Schedule:");
        System.out.println("- Morning workout");
        System.out.println("- Attend Java training");
        System.out.println("- Complete assignments");
        System.out.println("- Team meeting at 3PM");
    }
}

// Subclass for weekends
class Weekend extends Day {
    public Weekend(DayOfWeek day) {
        super(day);
    }

    @Override
    public void showSchedule() {
        System.out.println("🌴 " + day + " Schedule:");
        System.out.println("- Relax and unwind");
        System.out.println("- Read a book or hang out with friends");
        System.out.println("- Prepare for the upcoming week");
    }
}

// Main class
public class DailySchedulerPro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Welcome to DailyScheduler Pro ===");
        System.out.print("Enter a day of the week (e.g. Monday): ");
        String input = scanner.nextLine().trim().toUpperCase();

        try {
            DayOfWeek selectedDay = DayOfWeek.valueOf(input);
            Day dayObject;

            switch(selectedDay) {
                case SATURDAY:
                case SUNDAY:
                    dayObject = new Weekend(selectedDay);
                    break;
                default:
                    dayObject = new Weekday(selectedDay);
            }

            dayObject.showSchedule();
        } catch (IllegalArgumentException e) {
            System.out.println("❌ Invalid day. Please enter a valid day like 'Monday'.");
        }
    }
}
