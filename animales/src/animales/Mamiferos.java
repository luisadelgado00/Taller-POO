package animales;

import javax.swing.JOptionPane;

public class Mamiferos extends Animal {
    int cantTiempoAmamantado, periodoGestiacion;
    boolean pelo;

    @Override
    public void dieta() {
        //super.dieta();
        JOptionPane.showMessageDialog(null, "Los mamiferos en su primera etapa de vida se alimenta de leche materna");
    }
}
