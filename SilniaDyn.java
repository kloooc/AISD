public class SilniaDyn {
    public static void main(String[] args) {
        final int N=5;
        System.out.println(silnia(N));
    }
    static int silnia(int n){
    int[] tab = new int[n+1];
    tab[0] = 1;
    tab[1] = 1;
    for (int i =2; i< tab.length; i++)
        tab[i] = tab[i] * tab[silnia(i-1)];
                return tab[tab.length-1];
    }
}
