package homework1.task1;

public class Task1 {
    public static void main (String[] args){
int a = 2;
int b = 5;
float c = 2;
int d = 9;
float e = method1(a, b, c, d);
        System.out.println("g = " + e);

    }
    public static float method1 (int a, int b, float c, int d){
        float e =a*(b+c/d);

        return e;
    }
}

