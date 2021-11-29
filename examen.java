import java.util.Scanner;
public class examen{
    public static void main(final String[] args){
        Scanner scan = new Scanner(System.in);

        String [] codis = {"CBN01","CC01","LC01","P500","P1000","FS","FM","FL","J01","J02","J03","J04","D01","D02","D03","D04"};
        String [] articles = {"Còmic blanc i negre","Còmic color","Llibre color","Puzzle 500 peces","Puzzle 1000 peces","Figura petita","Figura mitjana","Figura gran","Joc Star Trek","Joc Star Wars","Joc Dungeons & Dragons","JOc WOrld of warcraft","Disfressa Battman","Disfressa Super Girl","Disfresa Iron Man","Disfressa Cat Woman"};
        float [] preus =  {16.20,20.50,32.80,8.10,10.30,9.00,12.00,19.00,22.49,27.90,45.40,49.90,28.50,34.60,28.50,24.60};
        float [] iva = {10.00,10.00,10.00,10.00,10.00,21.00,21.00,21.00,21.00,21.00,21.00,21.00,21.00,21.00,21.00,21.00};
        float [] pvp = new float [16];
        int mesBarat = 10000;
        int posicioMesBarat = 10000;
        int mesCar = 0;
        int posicioMesCar = 1;

        for (int i = 0; i < pvp.length; i++){
            pvp [i] = (preus[i]+(iva[i]/100*preus[i]))
        };

        for (int x = 0; x < pvp.length; x++){
            if (pvp[i] < mesBarat){
                mesBarat = pvp[i]
                posicioMesBarat = i;
            }else if ()
        };

        System.out.println();



    }

    
}