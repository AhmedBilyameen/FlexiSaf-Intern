public class SimplePlanner implements DailyPlanner {
    private final int TOTAL_HOURS_IN_DAY = 24;

    @Override
    public int calculateRemainingHours(int usedHours) {
        if (usedHours < 0 || usedHours > TOTAL_HOURS_IN_DAY) {
            System.out.println("❌ Invalid number of hours. Please enter between 0 and 24.");
            return -1;
        }
        return TOTAL_HOURS_IN_DAY - usedHours;
    }

    @Override
    public void suggestAdjustment(String task, int plannedHours) {
        if (plannedHours <= 0) {
            System.out.println("❌ Invalid planned hours for the task.");
            return;
        }

        System.out.println("⚠️ Not enough time left for this task.");
        System.out.println("💡 Suggestion: Reduce '" + task + "' to fit into your available time or schedule it for tomorrow.");
    }
}
