package Punto2.read;
import javax.swing.JOptionPane;
public class Dos 
{
    public static void main(String[] args) 
    {
        int x;
        int factorial;
        
        

        x = Integer.parseInt(JOptionPane.showInputDialog("Inserte el numero: "));
        factorial=1;
    
        for(int i=1;x>=i;i++){
            factorial=factorial*i;
        }
        JOptionPane.showMessageDialog(null,"El numero es: "+ x +"\n Siendo su factorial es: " +factorial);
    }
}

