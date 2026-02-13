import java.util.Scanner;

class Evenodd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char ch = sc.next().charAt(0);

        if (ch == 'E' || ch == 'e') {
            if (a % 2 == 0)
                System.out.println("even");
            else
                System.out.println("not even");
        }
        else if (ch == 'O' || ch == 'o') {
            if (a % 2 != 0)
                System.out.println("odd");
            else
                System.out.println("not odd");
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
