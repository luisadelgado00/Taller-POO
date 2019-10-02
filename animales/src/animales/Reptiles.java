package animales;

import javax.swing.JOptionPane;

public class Reptiles extends Animal {
    boolean toxina, extremidades, colmillos;

    @Override
    public void dieta() {
        //super.dieta();
        JOptionPane.showMessageDialog(null, "Los reptiles pueden ser carnivoros, insectivoros, herbivoros"
        +"o omnivoros");
    }
    
    
    
}
