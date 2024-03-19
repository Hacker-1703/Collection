import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

class Main {
    public static void main(String[] args) throws InterruptedException {
        Homework homework = new Homework();
//        Queue<String> a = new ArrayDeque<>();
//        a.add("Vanya");
//        a.add("Petya");
//        a.add("Igor");
//        System.out.println(homework.cashRegister(a));
        String string = "Igor love igor and IGOR to love.";
        homework.countingOccurrences(string);
    }

}