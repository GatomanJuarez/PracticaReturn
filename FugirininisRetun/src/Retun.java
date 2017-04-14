
import javax.swing.JOptionPane;
/**
 * By GatomanJuarez
 */
public class Retun {
    public static void main (String args[]) {
        int area,lado;
        int opcion;
        int base, altura, areac;
        int pi= 3, areaci;
        int radio;
        int base1,altura1,areatri;
        
        System.out.println("\n1.Area de un cuadrado"
                           +"\n2.Area de un rectangulo"  
                           +"\n3.Area de un circulo"
                           +"\n4.Area de un triangulo");
                           
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Que opcion quieres"));
         
        switch (opcion){
             case 1:
               lado = Integer.parseInt(JOptionPane.showInputDialog("Dame el lado"));
               area = sumac(lado);
               System.out.print("El area es" + area);  
                 break;
             case 2:
               base = Integer.parseInt(JOptionPane.showInputDialog("Dame la base"));
               altura = Integer.parseInt(JOptionPane.showInputDialog("Dame la altura"));
               areac = rectangulo(base, altura);
               System.out.print("El area es" + areac);   
                 break;    
            case 3:
               radio = Integer.parseInt(JOptionPane.showInputDialog("Dame el radio"));
               areaci= circulo (pi,radio);
               System.out.print("El area es" + areaci);              
                 break;
                
            case 4:
               base1 = Integer.parseInt(JOptionPane.showInputDialog("Dame la base"));
               altura1 = Integer.parseInt(JOptionPane.showInputDialog("Dame la altura"));
               areatri = triangulo (base1,altura1);
               System.out.print("El area es" + areatri);     
                
                
              break ; 
                default:
                 System.out.print("error");
                 break ; 
                
                
                
                
                
    }
    }
     public static int sumac (int lado){
        int s1;
         s1 = lado * lado;
         return s1; 
          
     }    
 public static int rectangulo (int base, int altura){
        int area;
         area = (base * altura) /2;
         return area;
}
 public static int circulo (int pi, int radio){
     int circuloc;
     circuloc = pi * (radio * radio);
     return circuloc;
 }
public static int triangulo (int base1, int altura1){
     int triangulo;
     triangulo = (base1 * altura1)/2;
     return triangulo;
    
    
}
}    
        
        
        
        

    

