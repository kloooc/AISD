
public class SzukanaDZ {


    public static void main(String[] args) {
        final int N=546;
        int zakresgorny=1000;
        int zakresdolny=0;
        boolean nieznaleziono=true;
        int iloscprob=0;
        do {
            int srodek = (zakresgorny+zakresdolny)/2;
            System.out.println("czy towja liczba to: "+ srodek);
            iloscprob++;
            if (N==srodek){
                System.out.println("Twoja liczba to:"+ srodek);
                nieznaleziono=false;
            } else if (N>srodek){
                System.out.println("za mała");
                zakresdolny=srodek;
            } else if (N<srodek){
                System.out.println("za duza");
                zakresgorny=srodek;
            }

        }while(nieznaleziono);
        System.out.println("Liczbę znaleziono po "+iloscprob);


    }
}
