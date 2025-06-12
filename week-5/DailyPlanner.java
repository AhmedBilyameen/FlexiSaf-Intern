public interface DailyPlanner {
    int calculateRemainingHours(int usedHours);
    void suggestAdjustment(String task, int plannedHours);
}
