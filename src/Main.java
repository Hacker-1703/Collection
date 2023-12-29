public class Main {
    public static void main(String[] args) throws Exception {
        Date date1 = new Date(1, 1, 2024);
        Date date2 = new Date(29, 12, 2023);
        System.out.println("До нового года " + date1.comparisonOfDatesWithoutOutput(date2) + " дня!");
    }
}
