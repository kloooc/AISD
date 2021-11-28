import java.util.Random;

public class kosmonauciMC {
    static final int LOS = 10;
    public static void main(String[] args) {

        int[][] kosmoUm = {{1,4}, {2,3,4}, {3,5}, {1,2,5}};
        int[] kosmo ={1,2,3,4,5};
        int N = kosmo.length;

        String optKonfig = new String();
        int optKosmoLicz = N;

        Random los = new Random();
        for (int i= 0; i < LOS; i++){
            System.out.println("Rozwiaznie nr " + (i+1));
            for (int j = 0; j<kosmo.length;j++)
            {
                int rndIndex = los.nextInt(N);
                if (rndIndex != j)
                {
                    int pom = kosmo[j]; // zamiana elementow
                    kosmo[j] = kosmo[rndIndex];
                    kosmo[rndIndex] = pom;
                }
            }
            System.out.print("\tkolejnosc astro po przemieszaniu:\n\t");
            for (int j : kosmo)
                System.out.print(j+"\t");
            System.out.println("");

            String locKonfig = new String();
            int kosmoLicz = 0;
            int[] specStatus = new int[kosmoUm.length];
            int j = 0;
            int sumSpec=0;

            while (sumSpec < kosmoUm.length)
            {
                for (int k=0; k<kosmoUm.length; k++)
                {
                    for (int l=0; l<kosmoUm[k].length; l++)
                    {
                        if (kosmoUm[k][l] == kosmo[j])
                            specStatus[k]++;
                    }
                }
                locKonfig = locKonfig + " " + kosmo[j]; // wsadz na poklad
                kosmoLicz++; // zlicz astro
                j++;
                sumSpec=0;
                for (int specStat : specStatus) // oblicz ile teraz spec obsadzonych
                    if(specStat>=1)
                        sumSpec++;

                System.out.println("\tastro zabrani: "+locKonfig);
                System.out.print("\tobsadzone specjalnosci:\t"+sumSpec+" :\t");
                for (int specStat : specStatus)
                    System.out.print(specStat+" ");
                System.out.println();
            }
            if (kosmoLicz < optKosmoLicz)
            {
                optKonfig = locKonfig;
                optKosmoLicz = kosmoLicz;
            }
        }
        System.out.println("//////////////////////////////////");
        System.out.println("Moga leciec: "+optKonfig);
    }
}
