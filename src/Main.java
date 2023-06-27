public class Main {
    public static void main(String[] args) {

        // division(5,0); // 1) деление на 0

        int[] arr = {1,3,5,6};
        //printArray(arr); // 2) выход за пределы массива

        String[] stringNumber = new String[]{"1", "3", "5", "rr", "6"};
        //getStringNumber(stringNumber); // 3) преобразование типов

        int[] num1 = {8,4,6};
        int[] num2 = {2,3};
        Integer[] num3 = divisionArray(num1,num2); // 4) выбрасывание своего исключения
    }

    /**
     * @apiNote деление на Ноль
     * @param a int
     * @param b int
     */
    public static void division(int a, int b){
        try {
            System.out.println(a/b);
        }catch (ArithmeticException ae){
            System.out.println("Деление на 0 неразрешено");
            ae.printStackTrace();
        }
    }

    /**
     * @apiNote печать массива с выходом за пределы массива
     * @param arr массив чисел
     */
    public static void printArray(int[] arr){
        try {
            for (int i = 0; i <= arr.length; i++) {// выйдем за пределы массива
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException arrEx){
            System.out.println("Выход за пределы массива");
            arrEx.printStackTrace();
        }
    }

    /**
     * @apiNote выдача исключения с неверным преобразованием типов
     * @param arrStringOfNumber массив строковых чисел
     */
    public static void getStringNumber(String[] arrStringOfNumber){
        try {
            for (int i = 0; i < arrStringOfNumber.length; i++) {
                int a = Integer.parseInt(arrStringOfNumber[i]);
            }
        }catch (NumberFormatException numEx){
            System.out.println("Неверное преобразование типов");
            numEx.printStackTrace();
        }
    }

    /**
     * @apiNote выбрасывание собственного исключения
     * @param arrNum1 массив чисел
     * @param arrNum2 массив чисел
     * @return массив чисел
     */
    public static Integer[] divisionArray(int[] arrNum1, int[] arrNum2){
        Integer[] result = new Integer[arrNum1.length];
        if(arrNum1.length != arrNum2.length){
            throw new RuntimeException("Размеры массивов не равны!");
        }else{
            for (int i = 0; i < arrNum1.length; i++) {
                result[i] = arrNum1[i]/arrNum2[i];
            }
        }
        return result;
    }
}