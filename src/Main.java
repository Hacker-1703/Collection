public class Main {
    public static void main(String[] args) throws Exception {
        Date date1 = new Date();
        date1.setDate(1, 1, 2025);
        date1.showDate();
        System.out.println(date1.translationInDays());
    }
}
