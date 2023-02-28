import java.util.Arrays;
import java.util.Scanner;

public class CV2 {
    public static void main(String[] args) {
        ul2();
        ul4();
    }

    public static void ul2() {
        int[] pole;
        pole = new int[10];

        //scan to array

        Scanner scanner = new Scanner(System.in);
        int x = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Put number here: ");
            x = scanner.nextInt();
            pole[i] = x;
        }

        //println array

        for (int j : pole) {
            System.out.println(j);
        }

    }

    public static void ul4(){
        int[] array;
        array = new int[10];

        //scan to array

        Scanner scanner = new Scanner(System.in);
        int y = 0;
        for (int k = 0; k < 10; k++) {
            System.out.println("Put number here: ");
            y = scanner.nextInt();
            array[k] = y;
        }

        //println array

        for (int o : array) {
            System.out.println(o);
        }

        //sort array

        Arrays.sort(array);
        for (int p : array) {
            System.out.println(p);
        }
    }

}


