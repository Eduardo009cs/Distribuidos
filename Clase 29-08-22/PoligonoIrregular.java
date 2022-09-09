public class PoligonoIrregular{
  private Coordenada [] vertices;

  public PoligonoIrregular(Coordenada [] vertices){
      this.vertices = vertices;
  }

  public void anadeVertice(Coordenada coordenada,int index){
    this.vertices[index] = coordenada;
  }

  @Override
  public String toString(){
    String salida = "";
    for(int i = 0; i < this.vertices.length; i++){
      salida += this.vertices[i]+"\n";
    }
    return salida;
  }
}
