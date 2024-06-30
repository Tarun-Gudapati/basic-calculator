import java.util.Scanner;

public class calculate {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("enter a number :");
            int a = sc.nextInt();
            System.out.println();
            System.out.print("enter another number: ");
            int b = sc.nextInt();
            System.out.println(" enter the operation you would like to perform \n");
            System.out.println(" 1)addition \n 2)subtraction \n 3)multiplication \n 4)division \n 5)exit  \n");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    add(a, b);
                    break;
                case 2:
                    sub(a, b);
                    break;
                case 3:
                    mul(a, b);
                    break;
                case 4:
                    div(a, b);

                default:
                    break;
            }

        }

    }

    public static void add(int a, int b) {
        int sum = a + b;

        System.out.printf("the sum of %d + %d is : %d \n\n", a, b, sum);
    }

    public static void sub(int a, int b) {
        int sub = a - b;

        System.out.printf("the remains of %d - %d is : %d \n\n", a, b, sub);
    }

    public static void div(int a, int b) {
        int div = a / b;

        System.out.printf("the return of %d / %d is : %d \n\n\n", a, b, div);
    }

    public static void mul(int a, int b) {
        int mul = a * b;

        System.out.printf("the mul of %d * %d is : %d \n\n", a, b, mul);
    }

}
