
import java.util.*;


public class PruebaRectangulo  {

    public static void main (String[] args) {
        double c1, c2;
        Random r = new Random();
        /*Coordenada [] cs = new Coordenada [5];
        PoligonoIrregular p = new PoligonoIrregular(cs);
        long start = System.nanoTime();
        //Coordenada c = new Coordenada(0,0);
        for(int i=0; i<5;i++){
            c1 = r.nextDouble()*100 + 1;
            c2 = r.nextDouble()*100 + 1;
            Coordenada c = new Coordenada(c1,c2);
            //c.setX(r.nextDouble()*100 + 1);
            //c.setY(r.nextDouble()*100 + 1);
            p.anadeVertice(c,i);
        }
        long end = System.nanoTime() - start;
        System.out.println(end);
        //System.out.println(p);*/
        /*Rectangulo r = new Rectangulo(0,3,4,0);

        System.out.println("Rectangulo\n"  + "\nArea: " + r.area());
        Coordenada c1 = new Coordenada(0,5);
        Coordenada c2 = new Coordenada(5,5);
        Cuadrado c = new Cuadrado(c1,c2);
        System.out.println("Cuadrado\n" + "\nArea: " + c.area());*/
        //ArrayList <Coordenada> l = new ArrayList <Coordenada>();
        PoligonoIrregular p = new PoligonoIrregular();
         for(int i=0; i<10;i++){
            c1 = r.nextDouble()*100 + 1 ;
            c2 = r.nextDouble()*100 + 1;
            int aux = r.nextInt(2);
            if(aux==0){
                c1 *= -1; 
            }
            aux = r.nextInt(2) ;
            if(aux==0){
                c2 *= -1; 
            }
            Coordenada c = new Coordenada(c1,c2);
            p.anadeVertice(c);
        }
        
        System.out.println(p);
        Collections.sort(p.vertices, p);
        System.out.println(p);
    }
}