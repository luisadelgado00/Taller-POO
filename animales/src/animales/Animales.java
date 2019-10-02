package animales;

import javax.swing.JOptionPane;

public class Animales {
    public static void main(String[] args) {
        Animales ob = new Animales();
    }

    public Animales() {
        Aves ob1 = new Aves();
        Mamiferos ob2 = new Mamiferos();
        Reptiles ob3 = new Reptiles();
        int patas=Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de patas: "));
        ob1.numeroPatas=patas;
        ob2.numeroPatas=patas;
        ob3.numeroPatas=patas;
        
        //
        int ojos=Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de ojos: "));
        ob1.numeroOjos=ojos;
        ob2.numeroOjos=ojos;
        ob3.numeroOjos=ojos;
        
        //
        int tiempoVida=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad tiempo de vida en años de la especie: "));
        ob1.tiempoVida=tiempoVida;
        ob2.tiempoVida=tiempoVida;
        ob3.tiempoVida=tiempoVida;
        
        int cantTiempoAmamantado=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de tiempo amamantando: "));
        ob2.cantTiempoAmamantado=cantTiempoAmamantado;
        int periodoGestiacion=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad tiempo de gestacion: "));
        ob2.periodoGestiacion=periodoGestiacion;
        
        boolean pelo=Boolean.parseBoolean(JOptionPane.showInputDialog("¿Tiene pelo? (true/false) "));
        ob2.pelo=pelo;
        
        //
        boolean toxina=Boolean.parseBoolean(JOptionPane.showInputDialog("¿Tiene toxina? (true/false) "));
        ob3.toxina=toxina;
        boolean colmillos=Boolean.parseBoolean(JOptionPane.showInputDialog("¿Tiene colmillos? (true/false) "));
        ob3.colmillos=colmillos;
        boolean extremidades=Boolean.parseBoolean(JOptionPane.showInputDialog("¿Tiene extremidades? (true/false) "));
        ob3.extremidades=extremidades;
        
        //
        String tamanoPico=JOptionPane.showInputDialog("Digite tamaño de pico: ");
        ob1.tamanoPico=tamanoPico;
        boolean vuela=Boolean.parseBoolean(JOptionPane.showInputDialog("¿Puede volar? (true/false) "));
        ob1.vuela=vuela;
        boolean puedeCorrer=Boolean.parseBoolean(JOptionPane.showInputDialog("¿Puede Correr? (true/false) "));
        ob1.puedeCorrer=puedeCorrer;
        
        String desea=JOptionPane.showInputDialog("Digite el tipo de animal (aves, reptiles, mamiferos): ");
        switch(desea){
            case "aves":
            ob1.dieta();
            break;
            case "mamiferos":
                ob2.dieta();
            break;
            case "reptiles":
                ob3.dieta();
        }
    }
    
    
}
