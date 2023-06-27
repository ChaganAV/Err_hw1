public class Main {
    public static void main(String[] args) {

        division(5,0);
    }
    public static void division(int a, int b){
        try {
            System.out.println(a/b);
        }catch (ArithmeticException ae){
            System.out.println("Деление на 0 неразрешено");
            ae.printStackTrace();
        }
    }
}