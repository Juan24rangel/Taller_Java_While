package Punto4.eject;
import javax.swing.JOptionPane;
public class Cuatro 
{
    public static void main(String[] args)  
    {
        int N, aux, inverso = 0, cifra;
        N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        
        while (N < 10);
       
        //le damos la vuelta al número
        aux = N;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
    
        if(N == inverso){
            JOptionPane.showMessageDialog(null,"Es capicua");
        }else{
            JOptionPane.showMessageDialog(null,"No es capicua");
        }
    
  
    }
}
