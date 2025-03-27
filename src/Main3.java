import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        /*
        int b =7;
        int a =25;
        b++;
        b+=15;
        System.out.println(b < a && b> a);
    }
         */
        /*
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        System.out.println(b);
        if (95  <b && b < 100) {
            System.out.println("Note 5");
        }else if (80< b && 89>b){
            System.out.println("Note 4");
        }else {
            System.out.println("error");
        }
        scanner.close();
         */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("calculator ");

        for (int i = 0; i <= 10; i++) {
            System.out.println(a + "*" + i + "=" + (a * i));
        }
        scanner.close();
    }

}

