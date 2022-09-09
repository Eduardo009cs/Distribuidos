public class ejercicio1{
  public static void main(String[] args){
    int n = 0;
    n = Integer.parseInt(args[0]);
    StringBuilder cadenota =new StringBuilder();
    int max = 90,min=65;
    for(int i =0;i<n*4 ;i+=4){
      cadenota.append((char)(int)((Math.random()*((max-min)+1))+min)+"");
      cadenota.append((char)(int)((Math.random()*((max-min)+1))+min)+"");
      cadenota.append((char)(int)((Math.random()*((max-min)+1))+min)+"");
      cadenota.append(" ");
    }
    int index = 0;
    int contador = 0;
    long start = System.nanoTime();
    do{
      index = cadenota.indexOf("IPN");
      if(index != -1){
        cadenota.delete(0,index+4);
        contador ++;
      }
    }while( index !=  -1);
    long end = System.nanoTime() - start;
    System.out.println("La palabra IPN se encontro "+contador);
    System.out.println("Se tardo "+end);
  }
}
