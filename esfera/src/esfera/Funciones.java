package esfera;
public class Funciones {
   
    public double area(double radio){
        double pi=Math.PI; 
        double area=4*pi*Math.pow(radio, 2);
        return area;
    }
    public double volumen(double radio){
        double pi=Math.PI; 
        double volumen=4*pi*(Math.pow(radio, 3))/3;
        return volumen;
    }
}
