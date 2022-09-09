import java.text.*;
public class Coordenada {

    private double x, y;
    private double magnitud;

    public Coordenada(double x, double y) {

        this.x = x;

        this.y = y;
        this.magnitud = calculateMagnitud();

    }

    //Metodo getter de x

    public double abcisa( ) { 
        return x; 
    }
    //Metodo getter de y
    public double ordenada( ) { 
        return y; 
    }

    public void setX( double x) { 
        this.x=x; 
    }
    //Metodo getter de y
    public void setY( double y) { 
        this.y = y; 
    }
    public double calculateMagnitud(){
        magnitud = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        return magnitud;
    }

    public double getMagnitud(){
        return this.magnitud;
    }
    public void setMagnitud(double magnitud){
        this.magnitud = magnitud;
    }
    //Sobreescritura del método de la superclase objeto para imprimir con System.out.println( )

    @Override
    public String toString( ) {
        DecimalFormat df = new DecimalFormat("#.000");
        return "[" + df.format(x) + "," + df.format(y) + "]" + df.format(magnitud);

    }

}