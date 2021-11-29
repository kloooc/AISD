import java.util.Scanner;

public class bakterieDZ {
    static int iloscokresow=-1;
    static int bakteria;
    public static void main(String[] args) {

        System.out.println("Ile razy bakteria ma sie zwiekszyc 1000, 10000, 100000, 1000000");
        Scanner scan = new Scanner(System.in);
        bakteria = scan.nextInt();
        final int b =1;

        rozwoj (b);

    }
    static void rozwoj(int a){
        iloscokresow++;
        int bak = a;
        if (bak >= bakteria){

            System.out.println("Bakteria powiekszy sie o " + bakteria + " po " + iloscokresow*2 + " minutach i wyniesie " + bak);
        } else {
            System.out.println("okres " + iloscokresow*2 + " minut," + bak);
            rozwoj(a*3);
        }
    }
}
