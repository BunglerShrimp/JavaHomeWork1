package homework1.task1;

public class Task3 {
    public static void main(String[] args) {
        int a = -528;
        boolean b = method3(a);
        System.out.println("Значение=" + b);
    }

    public static boolean method3(int a) {
        boolean b = a >= 0;
        return b;
    }
}


       /*
        if (a >= 0){
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
}
*/
