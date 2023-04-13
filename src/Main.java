import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Podaj do którego miejsca chcesz wykonać: ");
        n=in.nextInt();
        long start=System.nanoTime();
        System.out.println(n+" liczba ciagu fibonaciego to: "+Fibonaci.fib_it(n));
        long finish=System.nanoTime();
        long start1=System.nanoTime();
        System.out.println("Silnia od liczby "+n+" to: "+Silnia.sil_it(n));
        long finish2=System.nanoTime();
        System.out.println("czas fibonaci: "+(finish-start));
        System.out.println("czas fibonaci: "+(finish-start));
        System.out.println("czas silnia: "+(finish2-start1));
        System.out.println("czas silnia: "+(finish2-start1));


    }
}