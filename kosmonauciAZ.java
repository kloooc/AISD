import java.util.ArrayList;

public class kosmonauciAZ {

    public static void main(String[] args) {
        int[][] kosmoUm = {{1,4}, {2,3,4}, {3,5}, {1,2,5}};
        int[] kosmo ={1,2,3,4,5};

        int ind = 0;

        ArrayList<Integer> naPokladzie = new ArrayList<Integer>();
        while(true)
        {
            if (ind == kosmo.length)
                break;
            System.out.println("Analizowany kosmoanuta: " + kosmo[ind]);

            int Um = 0;
            for (int i=0; i<kosmoUm.length; i++)
            {
                for (int j=0; j<kosmoUm[i].length; j++){
                    if (kosmo[ind] == kosmoUm[i][j]) Um++;
                }
            }

            System.out.println("\t kosmonauta_" + kosmo[ind] + " Z: " + Um + " umiejetnosciami");

            if(Um >= 1) // jesli obsadza min 1 spec to wez na poklad
            {
                naPokladzie.add(kosmo[ind]);
                System.out.println("\tna pokladzie: " + naPokladzie.toString());
            }
            else
            {
                ind++;
                continue;
            }

            int zajete = 0;
            for(int i =0; i<kosmoUm.length; i++)
            {
                for (int j=0; j<kosmoUm[i].length; j++)
                {
                    if (naPokladzie.contains(kosmoUm[i][j]))
                    {
                        zajete++;
                        break;
                    }
                }
            }

            System.out.println("\tobsadzonych dziedzin: "+zajete);

            if (zajete==kosmoUm.length)
                break;
            ind++;



        }
        if(ind == kosmo.length)
            System.out.println("Brak rozwiazania!");
        else
            System.out.println("Moga leciec kosmonauci: " + naPokladzie.toString());
    }
}
