package Punto3.iniciar;
import javax.swing.JOptionPane;
public class Tres 
{
    public static void main(String[] args) 
    {
        int x;
        int con;
        int i;

        x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero el cual quieres saber si es primo :"));
        con=0;
        for(i=1;x>=i;i++)
        {
            if((x%i)==0)
            {

                con=con+1;

            }

        }
        if(con<=2)
        {
            JOptionPane.showMessageDialog(null,"El numero es primo");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El numero no es primo");
        }
    }
}

