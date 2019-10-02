
package esfera;

import javax.swing.JOptionPane;


public class Esfera {
    
    public static void main(String[] args) {
       Esfera obj = new Esfera();
       obj.esfera();
       
    }

    public void esfera() {
        Funciones ob= new Funciones();
        double radio =Double.parseDouble(JOptionPane.showInputDialog("Digita el radio de la esfera: "));
        double area=ob.area(radio);
        double volumen= ob.volumen(radio);
        JOptionPane.showMessageDialog(null, "\n El area de la esfera es: "+area+"\nEl Volumen de la esfera es: "
                + volumen );
    }
    
}
