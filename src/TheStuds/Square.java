package TheStuds;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner usrInput = new Scanner(System.in);

        System.out.println("Enter a number to receive a square with X width & height." + "\n");
        int x = usrInput.nextInt();


        System.out.println("Enter character you'd like to use for your square." + "\n");


        String sign = usrInput.next();
        System.out.println();
        drawSquare(x, sign);

    }

    static void drawSquare(int x, String sign) {


        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= x; j++) {
                System.out.print(sign + " ");
            }
            System.out.println();

        }

    }

}
