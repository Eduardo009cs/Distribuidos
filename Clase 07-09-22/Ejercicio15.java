import java.util.*;
import java.lang.*;
class Ejercicio15{
    private static int var_compartida = 0;
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();
        Thread t1 = new Thread( new Ejercicio15().new Hilos(num,1));
        Thread t2 = new Thread( new Ejercicio15().new Hilos(num,-1));
        try{
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }catch(Exception e){

        }
        System.out.println("Resultado: " + var_compartida);

    }
    private static synchronized void modifica(int suma){
        var_compartida += suma;
    }
    private class Hilos implements Runnable{
        int n, suma;
        public Hilos (int n, int suma){
            this.n = n;
            this.suma = suma;
        }
        public void run(){
            for(int i=0; i<n;i++){
                Ejercicio15.modifica(suma);
            }
            

        }
    }
}

