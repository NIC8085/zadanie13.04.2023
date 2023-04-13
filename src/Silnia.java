public class Silnia {
    public static int sil_it(int n){
        int wynik=1;
        for(int i=1;i<=n;i++){
            wynik=wynik*i;
        }
        return wynik;
    }
    private static int i=0;
    private static int koniec=1;
    public static int sil_rek(int n, int wynik){
        if(i<n){
            i++;
            koniec=koniec*wynik;
            return sil_rek(n, wynik+1);
        }
        return koniec;
    }

}
