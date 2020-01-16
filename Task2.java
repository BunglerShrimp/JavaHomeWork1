package homework1.task1;

public class Task2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;
        boolean c = method2(a, b);
        System.out.println("Результат=" + c);
    }

    public static boolean method2(int a, int b) {
        boolean c = (a + b) >= 10 && (a + b) <= 20;
        return c;
    }
}






