import javax.swing.JOptionPane;
public class Ingenieria {
    
double promedio, parciall, parcial2, examenfinal;
int prueba;
public void programacion (){
parciall=Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del primer parcial:"));
parcial2=Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del segundo parcial:"));
examenfinal=Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del examen final:"));
promedio=(parciall+parcial2+examenfinal)/3;
JOptionPane.showMessageDialog(null,"el promedio es "+ promedio);
}
public void calculo (){
parciall=Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del primer parcial"));
parcial2=Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
examenfinal=Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del examen final"));
promedio=(parciall+parcial2+examenfinal)/3;
JOptionPane.showMessageDialog(null,"el promedio es "+ promedio);
}
public void ingles (){
parciall=Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del primer parcial"));
parcial2=Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
examenfinal=Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del examen final"));
promedio=(parciall+parcial2+examenfinal)/3;
JOptionPane.showMessageDialog(null,"el promedio es "+ promedio);
}
public void algebra (){
parciall=Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del primer parcial"));
parcial2=Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
examenfinal=Double.parseDouble(JOptionPane.showInputDialog("Digite la nota del examen final"));
promedio=(parciall+parcial2+examenfinal)/3;
JOptionPane.showMessageDialog(null,"el promedio es"+ promedio);
}
public static void main(String[] args){
   
  Ingenieria notas = new Ingenieria();
int menu;
do
{
 menu=Integer.parseInt(JOptionPane.showInputDialog("Digite el promedio segun corresponda"
+ "\n 1) Programación" 
+ "\n 2) calculo" 
+ "\n 3) ingles" 
+ "\n 4) algebra" 
+ "\n 0) Salir" ));
         
 switch (menu){
     case 1:
         notas.programacion();
         break;
          case 2:
              notas.calculo();
         break;
          case 3:
              notas.ingles();
         break;
          case 4:
         notas.algebra();
 }
 
}while (menu!=0);
    

}



}
