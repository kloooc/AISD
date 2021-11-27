public class silniaDZ {
    public static void main(String[] args) {
        final int N=5;
        System.out.println(silnia(N));
    }
    static int silnia(int n){
        if (n==1 || n==0){
            return 1;
        } else{
            return n*silnia(n-1);
        }
    }
}
