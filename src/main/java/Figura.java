
import javax.swing.JOptionPane;

public class Figura {
    public void cuadrado(){
        int lado,area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del lado"));
        area = lado*lado;
        JOptionPane.showMessageDialog(null,"El area el cuadrado es:"+area);
    }
    
    public void triangulo (){
       int base, altura, area;
base= Integer.parseInt(JOptionPane.showInputDialog("Ingese la base del Triangulo"));
altura=Integer.parseInt(JOptionPane.showInputDialog("Digite la altura"));
area=(base*altura)/2; 
    }

public void circulo () {
    double radio,pi=3.1416, area;
radio=Double.parseDouble(JOptionPane.showInputDialog("Digiteelradiodeldirculo"));
area=pi*Math.pow(radio,2);
JOptionPane.showMessageDialog(null,"El area del circulo es"+ area);
}


}
