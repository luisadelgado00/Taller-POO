package temperatura;

import javax.swing.JOptionPane;

public class Temperatura {
    public static void main(String[] args) {
       Temperatura ob = new Temperatura();
    }

    public Temperatura() {
        Celcius ob3= new Celcius();
        Fahrenheit ob1 = new Fahrenheit();
        Kelvin ob2 = new Kelvin();
        double grados=Double.parseDouble(JOptionPane.showInputDialog("Digite los grados celcius a convertir: "));
        double conver1=ob1.convertor(grados);
        JOptionPane.showMessageDialog(null, conver1);
        double conver2=ob2.convertor(grados);
        JOptionPane.showMessageDialog(null, conver2);
        double grados2=Double.parseDouble(JOptionPane.showInputDialog("Digite los grados Fahrenheit a convertir: "));
        double conver3= ob3.convertor(grados2);
        JOptionPane.showMessageDialog(null, conver3);
    }
    
}
