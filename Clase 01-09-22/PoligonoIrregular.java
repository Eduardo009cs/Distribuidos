import java.util.*;
public class PoligonoIrregular implements Comparator<Coordenada>{
  List <Coordenada> vertices;

  public PoligonoIrregular(){
      this.vertices = new ArrayList<Coordenada>();
  }

  public void anadeVertice(Coordenada coordenada){
    vertices.add(coordenada);
  }

  public int compare(Coordenada c1, Coordenada c2){
    return (int)(c1.getMagnitud()-c2.getMagnitud());
  }

  @Override
  public String toString(){
    String salida = "";
    for(Coordenada i: vertices){
       salida += i + "\n";
    }
    return salida;
  }
}
