public class bakterie {
        static int k=2;
    public static void main(String[] args) {
        final int N=15;
        System.out.println(rozwoj(N));


    }
    static int rozwoj(int n){
        int[] tab = new int[n+1];
        tab[0] =1;
        for (int i =1; i<tab.length; i++) {
            tab[i] = tab[i - 1] * 3;
            System.out.println("czas " + 2*i + " min bakterie " + tab[i]);

        }
        return tab[tab.length - 1];
    }
}
