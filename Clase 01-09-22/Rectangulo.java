public class Rectangulo extends Figura implements Perimetro{

    private Coordenada superiorIzq, inferiorDer;
    double ladoSup, ladoIzq;

    public Rectangulo(){
        superiorIzq = new Coordenada(0,0);
        inferiorDer = new Coordenada(0,0);

    }
    public Rectangulo(double xSupIzq, double ySupIzq, double xInfDer, double yInfDer){
        superiorIzq = new Coordenada(xSupIzq, ySupIzq);
        inferiorDer = new Coordenada(xInfDer, yInfDer);        
    }
    public Rectangulo(Coordenada c1,Coordenada c2){
        superiorIzq = c1;
        inferiorDer = c2;
    }
    //Metodo getter de la coordenada superior izquierda

    public Coordenada superiorIzquierda( ) { return superiorIzq; }
    //Metodo getter de la coordenada inferior derecha

    public Coordenada inferiorDerecha( ) { return inferiorDer; }
    //Sobreescritura del método de la superclase objeto para imprimir con System.out.println( )

    public void lados(){
        double x1 = superiorIzq.abcisa();
        double y1 = superiorIzq.ordenada();
        double x2 = inferiorDer.abcisa();
        double y2 = inferiorDer.ordenada();
        double x3,y3;
        x3 = x2; y3 = y1;

        this.ladoSup= Math.sqrt( Math.pow((x3-x1),2) + Math.pow((y3-y1),2) );
        
        this.ladoIzq = Math.sqrt(Math.pow((x3 - x2),2) + Math.pow((y3-y2),2));
       
       
    }
    
    @Override
    public float area(){
        lados();
        return (float)(ladoIzq*ladoSup);
    }
    @Override
    public float imprimePerimetro(){
        lados();
        return (float)(ladoIzq*2 + ladoSup*2);
    }

    @Override
    public String toString( ) {
        return "Esquina superior izquierda: " + superiorIzq + "\tEsquina superior derecha:" + inferiorDer + "\n";
    }
}