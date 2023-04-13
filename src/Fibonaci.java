public class Fibonaci {
    public static int fib_it(int n){
        int liczba_startowa=1;
        int liczba_koncowa=0;
        for(int i=1;i<=n;i++){
            liczba_koncowa=liczba_koncowa+liczba_startowa;
            liczba_startowa=liczba_koncowa-liczba_startowa;
        }
        return liczba_koncowa;
    }

}
