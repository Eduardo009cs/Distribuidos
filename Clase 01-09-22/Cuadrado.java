public class Cuadrado extends Figura implements Perimetro {
  Coordenada verticeSuperiorIzq, verticeSuperiorDer;
  public Cuadrado(Coordenada verticeSuperiorIzq , Coordenada verticeSuperiorDer){
    this.verticeSuperiorIzq = verticeSuperiorIzq;
    this.verticeSuperiorDer = verticeSuperiorDer;
  }

  @Override
  public float area(){
    double distancia  = Math.sqrt( Math.pow(( this.verticeSuperiorDer.abcisa() - this.verticeSuperiorIzq.abcisa()),2) + Math.pow((this.verticeSuperiorDer.ordenada() - this.verticeSuperiorIzq.ordenada()),2));
    return (float)Math.pow(distancia,2);
  }

  @Override
  public float imprimePerimetro(){
    double distancia  = Math.sqrt( Math.pow(( this.verticeSuperiorDer.abcisa() - this.verticeSuperiorIzq.abcisa()),2) + Math.pow((this.verticeSuperiorDer.ordenada() - this.verticeSuperiorIzq.ordenada()),2));
    return (float) ((double)4*distancia);
  }
}
