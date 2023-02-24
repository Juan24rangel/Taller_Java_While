package Punto1.ejecutable;
import javax.swing.JOptionPane;
public class Uno 
{
   public static void main(String[] args) {

    double c1;
    double c2;
    double c3;

    
        c1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el capital de Pedro: "));
        
        c2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el capital de Juan: "));
        
        c3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la inversión requerida: "));
        

        // Calcular el número de meses necesarios
        double capital_total = c1 + c2;
        int meses = 0;
        while (capital_total < c3) {
            capital_total = capital_total + (capital_total * 0.03) + (c2 * 0.04);
            meses = meses + 1;
        }

        
        JOptionPane.showMessageDialog(null,"Se necesitan " + meses + " meses para hacer el negocio", "Capital", JOptionPane.PLAIN_MESSAGE);
    
   } 
}
