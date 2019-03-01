import java.util.Scanner;

public class PrvoCisla {
    public static void main(String[] args) {
        prvocisla1();
    }

    public static void prvocisla1() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Zadejte maximální hodnotu: ");
        int max = scn.nextInt();
        int[] pole = new int[max];



        for(int i = 0; i < pole.length; i++) {

            int pomocnaPromenna = i % 2;

            if(i == 2 || i == 3 || i == 5 || i == 7) {
                System.out.println(i + ": je prvočíslo");

            } else if (i == 1) {
                System.out.println(i + ": není provočíslo");

            } else if ((i % 2 == 0) || (i % 3 == 0) || (i % 4 == 0) || (i % 5 == 0) || (i % 6 == 0) || (i % 7 == 0) || (i % 8 == 0) || (i % 9 == 0)) {
                System.out.println(i + ": není provočíslo");
            } else {
                System.out.println(i + ": je prvočíslo");

            }


        }
    }
}
