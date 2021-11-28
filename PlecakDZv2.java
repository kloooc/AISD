public class PlecakDZv2 {
    private static int max(int i, int j)
    {
        return (i > j) ? i : j;
    }

    // Returns the maximum value with knapsack
    // of W capacity
    private static int pakuj(int W, int n,
                                         int[] val, int[] wt)
    {

        // dp[i] is going to store maximum value
        // with knapsack capacity i.
        int dp[] = new int[W + 1];

        // Fill dp[] using above recursive formula
        for(int i = 0; i <= W; i++){
            for(int j = 0; j < n; j++){
                if(wt[j] <= i){
                    dp[i] = max(dp[i], dp[i - wt[j]] +
                            val[j]);
                }
            }
        }
        return dp[W];
    }

    // Driver program
    public static void main(String[] args)
    {
        int W = 23;
        int val[] = {6,4,5,7,10,2};
        int wt[] = {6,2,3,2,3,1};
        int n = val.length;
        System.out.println(pakuj(W, n, val, wt));
    }
}