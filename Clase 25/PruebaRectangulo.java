import java.util.Random;

public class PruebaRectangulo {

    public static void main (String[] args) {
        double c1, c2;
        Random r = new Random();
        Coordenada [] cs = new Coordenada [5];
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
        //System.out.println(p);
    }
}