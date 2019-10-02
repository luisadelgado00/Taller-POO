package temperatura;

import javax.swing.JOptionPane;

public class Celcius implements Imedidas {

    @Override
    public double convertor(double grados) {
        JOptionPane.showMessageDialog(null, "De Fahrenheit a Celcius ");
        double cover = (grados - 32) * 5/9;
        return cover;
    }
    
}
