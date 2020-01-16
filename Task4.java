package homework1.task1;

/*public class Task4 {
    public static void main(String[] args){
      String a = "Алексей";
      String b= "Привет,";
        System.out.println(b + a +"!");
    }
}
*/


public class Task4 {
    public static void main(String[] args){
        String name = "Алексей";
        String phrase = method4(name);
                System.out.println(phrase);
    }
    public static String method4(String name){
        return "Привет," + name + "!";
    }
}