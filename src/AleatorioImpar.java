import java.util.Random;

public class AleatorioImpar {


    /*

     */


    public int aleatorioImpar(int primer, int segun){

        int aleatorio = -1;

        Random rd = new Random();

        if ((primer >= 0 && segun >0) && (primer + 10 <= segun)){

            do {

                aleatorio = rd.nextInt(segun - primer) + primer ;

            }while (aleatorio %2 != 0);

        }


        return aleatorio;
    }



}
