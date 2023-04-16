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
    private static int i=0;
    private static int wynik=0;
    public static int fib_rek(int n, int liczba_startowa){
        if(i<n){
            i++;
            wynik=wynik+liczba_startowa;
            liczba_startowa=wynik-liczba_startowa;
            return fib_rek(n, liczba_startowa);
        }
        return wynik;
    }
    //nie wiem dlaczego tu trzeba robić zmienną poza funkcją(wynik) a nie może być podane jako argument funkcji bo nie działa
}
