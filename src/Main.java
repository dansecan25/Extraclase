import javax.swing.*;
import javax.swing.JOptionPane;
public class Main {
    public static void enviar(){
        String n;
        String z;
        n=JOptionPane.showInputDialog("Ingrese el primer numero de la suma:");
        z=JOptionPane.showInputDialog("Ingrese el segundo numero de la suma:");
        if(!Comp.comprobarInt(n) || !Comp.comprobarInt(z)){
            throw new IllegalArgumentException();
        }else{
            int num1;
            int num2;
            num1=Integer.parseInt(n);
            num2=Integer.parseInt(z);
            System.out.println(throwable.suma(num1, num2));
        }
    }
    public static void divisionSend(){
        String n;
        String z;
        n=JOptionPane.showInputDialog("Ingrese el primer numero de la division:");
        z=JOptionPane.showInputDialog("Ingrese el segundo numero de la division:");
        if(!Comp.comprobarInt(n) || !Comp.comprobarInt(z)){
            throw new IllegalArgumentException();
        }else{
            int num1;
            int num2;
            num1=Integer.parseInt(n);
            num2=Integer.parseInt(z);
            System.out.println(DivisionFinEj.dividir(num1, num2));
        }
    }
    public static void main(String[] args){
        JFrame f = new JFrame();
        JButton b = new JButton("Sumar");
        b.setBounds(10,10,100,50);
        b.addActionListener(e->enviar());
        JButton divi = new JButton("Dividir");
        divi.setBounds(10, 70, 100,50);
        divi.addActionListener(e->divisionSend());
        f.add(divi);

        f.add(b);
        f.setSize(500,400);
        f.setLayout(null);
        f.setVisible(true);
        //par de ejemplos
        System.out.println("Ejemplo con try, catch, throw,finally y mi propia excepcion");
        System.out.println("Se le manda una a a comprobarInt que debería tirar una excepcion si el valor no es un entero");
        Comp.comprobarInt("a");
        System.out.println("Ejemplo con try y finally");
        System.out.println("Se le manda una division entre 0 a dividir que debería tirar una excepcion por la division");
        DivisionFinEj.dividir(15,0);


    }
}
