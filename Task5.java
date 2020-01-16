package homework1.task1;

public class Task5 {
    public static void main(String[] args) {
        int a = 100;
        boolean b = a % 4 == 0 && a % 100 != 0 || a % 400 == 0;
        if (b){
            System.out.println("Високосный");
        }else{
            System.out.println("Невисокосный");
        }
        }
    }