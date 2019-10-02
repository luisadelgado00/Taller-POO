package tiquetes_buses;

import javax.swing.JOptionPane;

public class Tiquetes_buses {
    costoViaje t1, t2, t3;
    public static void main(String[] args) {
        Tiquetes_buses obj = new Tiquetes_buses();
        
    }

    public Tiquetes_buses() {
        t1 = new costoViaje();
        t2 = new costoViaje();
        t3 = new costoViaje();
        
        
        t1.setNúmeroViaje(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de viaje: ")));
        t1.setNombrePasajero(JOptionPane.showInputDialog("Digite el nombre: "));
        t1.setHora(Integer.parseInt(JOptionPane.showInputDialog("Digite la hora: ")));
        t1.setFecha(JOptionPane.showInputDialog("Digite la fecha:"));
        t1.setCosto(Double.parseDouble(JOptionPane.showInputDialog("Digite el costo: ")));
        
        t2.setNúmeroViaje(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de viaje: ")));
        t2.setNombrePasajero(JOptionPane.showInputDialog("Digite el nombre: "));
        t2.setHora(Integer.parseInt(JOptionPane.showInputDialog("Digite la hora: ")));
        t2.setFecha(JOptionPane.showInputDialog("Digite la fecha:"));
        t2.setCosto(Double.parseDouble(JOptionPane.showInputDialog("Digite el costo: ")));
        
        t3.setNúmeroViaje(Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de viaje: ")));
        t3.setNombrePasajero(JOptionPane.showInputDialog("Digite el nombre: "));
        t3.setHora(Integer.parseInt(JOptionPane.showInputDialog("Digite la hora: ")));
        t3.setFecha(JOptionPane.showInputDialog("Digite la fecha:"));
        t3.setCosto(Double.parseDouble(JOptionPane.showInputDialog("Digite el costo: ")));
        
        double costoTotal=t1.getCosto()+t2.getCosto()+t3.getCosto();
        JOptionPane.showMessageDialog(null, "El costo total de los tiquetes es: "+ costoTotal); 
    }
}
