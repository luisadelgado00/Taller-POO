package animales;

import javax.swing.JOptionPane;

public class Aves extends Animal {
    String tamanoPico;
    boolean vuela, puedeCorrer;

    @Override
    public void dieta() {
        //super.dieta(); //To change body of generated methods, choose Tools | Templates.
        JOptionPane.showMessageDialog(null, "La dieta de las aves puede variar, algunas pueden ser insectivoras, carroñeras, carnivoras, omnivoras o en algunos casos herbivoras");
    }
    
}
