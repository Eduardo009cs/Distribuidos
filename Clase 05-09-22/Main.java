import java.util.*;
class Main{

    public static void main(String[] args){                   
        List <String> curps = new ArrayList<String>();
        int numCurps = 0, oldState=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos CURPS quieres imprimir?");
        
        numCurps = sc.nextInt();
        for(int i=0;i<numCurps;i++){
            String newCurp = getCURP();
            if(i==0){
                curps.add(newCurp);
            }else{
                for(int j=0;j<curps.size();j++){
                    String s = curps.get(j);
                    
                    int aux = s.substring(0,3).compareTo(newCurp.substring(0,3));
                    if(aux>=0){
                        curps.add(j,newCurp);
                        break;
                    }
                    
                    if((aux<0) && (j==curps.size()-1)){
                        
                         curps.add(curps.size(),newCurp);
                        break;
                    }
                    
                }
            }
            
        }
        for(int i=0;i<curps.size();i++){
            System.out.println(curps.get(i));
        }
    }

    // Función para generar una CURP aleatoria

    static String getCURP(){
        String Letra = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Numero = "0123456789";
        String Sexo = "HM";
        String Entidad[] = {"AS", "BC", "BS", "CC", "CS", "CH", "CL", "CM", "DF", "DG", "GT", "GR", "HG", "JC", "MC", "MN", "MS", "NT", "NL", "OC", "PL", "QT", "QR", "SP", "SL", "SR", "TC", "TL", "TS", "VZ", "YN", "ZS"};
        int indice;
        StringBuilder sb = new StringBuilder(18);
        for (int i = 1; i < 5; i++) {
            indice = (int) (Letra.length()* Math.random());
            sb.append(Letra.charAt(indice));        
        }
        for (int i = 5; i < 11; i++) {
            indice = (int) (Numero.length()* Math.random());
            sb.append(Numero.charAt(indice));        
        }
        indice = (int) (Sexo.length()* Math.random());
        sb.append(Sexo.charAt(indice));        
        sb.append(Entidad[(int)(Math.random()*32)]);
        for (int i = 14; i < 17; i++) {
            indice = (int) (Letra.length()* Math.random());
            sb.append(Letra.charAt(indice));        
        }
        for (int i = 17; i < 19; i++) {
            indice = (int) (Numero.length()* Math.random());
            sb.append(Numero.charAt(indice));        
        }
        return sb.toString();
    }           

}