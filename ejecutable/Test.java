package ejecutable;

import Modelo.coordenada;

public class Test 
{
        public static void main(String[] args) 
        {
            
            coordenada c1 = new coordenada();
            c1.setX(0);
            c1.setY(0);

            System.out.println("C1: " + c1);

            coordenada c2 = new coordenada(1.3,1.5);

            System.out.println("C2: "+ c2);
            
            coordenada c3 = c1;

            System.out.println("C3: "+ c3);
            
            coordenada c4 = c2;

            System.out.println("C4: "+ c4);

        
        if (c1.equals(c3))
        {
             System.out.println("las coordenadas son iguales. ");
        }
        else
        {
            System.out.println("Las coordenadas son diferentes.");
        } 
        
            System.out.println("La distancia entre los puntos es: "  );
            
        }


}
