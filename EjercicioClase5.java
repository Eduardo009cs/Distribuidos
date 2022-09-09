import java.util.Scanner;
import java.util.Random;

public class EjercicioClase5{
    public static void main (String[] args){
        Random r = new Random();
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        char [] cadenota = new char[n*4];
        for(int i = 1;i<=n*4;i++){
            if(i%4==0){
                cadenota[i-1] = ' ';    
            }else{
                cadenota[i-1] = (char)(r.nextInt(26) + 'A');    
            }
        } 
        boolean fin = false;
        int count =0;
        int i =0;
        while (fin == false){
            if(cadenota[i]=='I'){
                i++;
                if(cadenota[i]=='P'){
                    i++;
                    if(cadenota[i]=='N'){
                        count++;
                    }
                }
            }
            i++;
            if(i == n*4-1){
                fin = true;
            }
        }
        System.out.println("Se encontro " + count + " veces la palabra IPN");
    }
}