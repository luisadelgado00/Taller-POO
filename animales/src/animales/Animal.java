package animales;

import javax.swing.JOptionPane;

public class Animal {
    int numeroPatas, numeroOjos, tiempoVida;
    
    public void dieta(){
        JOptionPane.showMessageDialog(null, "La dieta de los animales, en su mayoria depende de su crianza");
    }
}
