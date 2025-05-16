package app;

import clases.TrianguloRectangulo;


public class Principal {


    public static void main(String[] args) {
       
        int lado1 =(int)(Math.random() *(10+1));
        int lado2 =(int)(Math.random() *(10+1));
       
        TrianguloRectangulo square1;
       
        try {
            square1 = new TrianguloRectangulo(lado1, lado2);
           
            int area1 = square1.area();
            double perimetro1 = square1.perimetro();
           
           
        }catch (IllegalArgumentException e){
            System.out.print(e.getMessage());
   
        }
        TrianguloRectangulo square2 = new TrianguloRectangulo();
       
       
        int area2 = square2.area();
        double perimetro2 = square2.perimetro();


    }


}
