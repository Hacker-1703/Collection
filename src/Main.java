import java.lang.reflect.Array;

public class Main {
    public static <T> T[] merge(Class<T> clazz, T[] a, T[] b) {
        T[] newArray;
        newArray = (T[]) Array.newInstance(clazz, a.length + b.length);
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            newArray[i + a.length] = b[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        String[] a = {"Я", "хочу"};
        String[] b = {"жестко", "пукнуть"};
        String[] c = merge(String.class, a, b);
        for (String i : c){
            System.out.println(i);
        }
    }
}
