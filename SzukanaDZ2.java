import java.util.Scanner;

public class SzukanaDZ2 {
    static int iloscprob=0;
    static int liczba;
    public static void main(String[] args) {

        System.out.println("Podaj liczbe z przedzialu od 0 do 1000");
        Scanner scan = new Scanner(System.in);
        liczba = scan.nextInt();
        if (liczba < 0 || liczba > 1000) {
            System.out.println("podales liczbe spoza dozwolonego przedzialu");
            System.exit(0);
        }

        szukaj(0, 1000);

    }
    static void szukaj(int a, int b){
        iloscprob++;
        int srodek = (a+b)/2;
        if (srodek==liczba){
            System.out.println("Twoja liczba to: " + srodek + " po " + iloscprob + " probach");
        } else if (srodek > liczba){
            System.out.println("zaproponowano: " + srodek +"\n za duza");
            szukaj(a, srodek-1);
        } else if (srodek < liczba){
            System.out.println("Zaproponowano: " + srodek + "\n za mala");
            szukaj(srodek+1, b);
        }
    }
}
