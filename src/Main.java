import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Podaj do którego miejsca chcesz wykonać: ");
        n=in.nextInt();
        long startIt=System.nanoTime();
        for (int i = 0; i < 100; i++) {
            System.out.println(n+" liczba ciagu fibonaciego to: "+Fibonaci.fib_it(n));
        }
        long finishIt=System.nanoTime();
        long startRek=System.nanoTime();
        for (int i = 0; i < 100; i++) {
            System.out.println(n+" liczba ciagu fibonaciego to: "+Fibonaci.fib_rek(n, 0));
        }
        long finishRek=System.nanoTime();
        long startIt2=System.nanoTime();
        for (int i = 0; i < 100; i++) {
            System.out.println("Silnia od liczby "+n+" to: "+Silnia.sil_it(n));
        }
        long finishIt2=System.nanoTime();
        long startRek2=System.nanoTime();
        for (int i = 0; i < 100; i++) {
            System.out.println("Silnia od liczby "+n+" to: "+Silnia.sil_rek(n,1));
        }
        long finishRek2=System.nanoTime();
        System.out.println("czas fibonaci it:  "+(finishIt-startIt));
        System.out.println("czas fibonaci rek: "+(finishRek-startRek));
        System.out.println("czas silnia it:  "+(finishIt2-startIt2));
        System.out.println("czas silnia rek: "+(finishRek2-startRek2));

        for (int i = 0; i < 100; i++) {

        }

    }
}