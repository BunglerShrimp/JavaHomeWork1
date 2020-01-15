package homework1.task1;

public class Task2 {
   static boolean value(int a, int b){
        boolean result = (a+b) >= 10 && (a+b) <= 20;
        return result;
    }



    public static void main(String[] args) {
        int a = 12;
        int b = 3;
        boolean something = value(a, b);
if ((a+b) >= 10 && (a+b) <= 20){
    System.out.println("True");
}else{
    System.out.println("False");
}
    }
}



