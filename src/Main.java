import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tamsayi giriniz: ");
        int a = input.nextInt();

        System.out.print("Ondalikli bir sayi giriniz: ");
        double b = input.nextDouble();

        double aDouble = a;
        int bInt = (int) b;

        System.out.println(a + " degeri: " + aDouble );
        System.out.println(b + " degeri: " + bInt );


    }
}