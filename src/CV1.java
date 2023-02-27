import java.util.Scanner;

public class CV1 {
    public static void main(String[] args) {
        ul1();

        System.out.println("Uloha 2");
        int x = 0, y = 0, res = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put 1sr number: ");
        x = scanner.nextInt();
        System.out.println("Put 2nd number: ");
        y = scanner.nextInt();
        res = ul2(x, y);
        System.out.println(res);
    }

    public static void ul1() {
        System.out.println("Uloha1\nHello world!\n");
    }

    public static int ul2(int a, int b) {
        if (a > b) {
            return 1;
        }
        else if(a < b) {
            return -1;
        }
        else{
            return 0;
        }
    }

}

