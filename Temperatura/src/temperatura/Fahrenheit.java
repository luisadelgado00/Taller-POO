package temperatura;

import javax.swing.JOptionPane;

public class Fahrenheit implements Imedidas {

    @Override
    public double convertor(double grados) {
        JOptionPane.showMessageDialog(null, "De celcius a Fahrenheit ");
        double cover = (grados * 9/5) + 32;
        return cover;
    }
    
}
