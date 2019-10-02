package temperatura;

import javax.swing.JOptionPane;

public class Kelvin implements Imedidas {

    @Override
    public double convertor(double grados) {
        JOptionPane.showMessageDialog(null, "De celcius a Kelvin");
        double cover = grados + 273.15;
        return cover;
    }
    
    
}
