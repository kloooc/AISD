public class PlecakDZ {
    static int N=6;
    static int Max_objetosc=10;

    static int[] wartosc = {6,4,5,7,10,2};
    static int[] objetosc= {6,2,3,2,3,1};

    static int plecak(int i, int v){
        int w1;
        int w2;

        if (i==0 && v<objetosc[0]){
            return 0;
        }
        if (i==0 && v>=objetosc[0]){
            return wartosc[0];
        }
        w1 = plecak(i-1, v);

        if (i>0 && v<objetosc[i]){
            return w1;
        }

        w2=wartosc[i] + plecak(i-1, v-objetosc[i]);

        if (w2>w1){
            return w2;
        } else{
            return w1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Wartosc przedmiotow: " + plecak(N - 1, Max_objetosc));
    }
}
