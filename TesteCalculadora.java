import javax.swing.JOptionPane;

public class TesteCalculadora {
    public static void main(String[] args) {
        float f = Float.parseFloat(JOptionPane.showInputDialog("Digite um float"));
        Calculadora calc = new Calculadora();
       
        int operando1 = 2, operando2 = 3;
        float f1 = 2.5f, f2 = (float) 5.7;
        //isso é a chamada (call) de um método
        int r = calc.somar(operando1, operando2);
        System.out.println(r);

        float rFloat = calc.somar(f1, f2);
        System.out.println(rFloat);

        int rTresInts = calc.somar(operando1, operando2, 5);

        int rStrInt = calc.somar ("5", 2);

        int rIntStr = calc.somar(2, "5");

        int teste = calc.somar(2, 3);
        teste = calc.somar(2, 3, 4);
        teste = calc.somar(2, 3, 4, 5);
        teste = calc.somar(2, 3, 4, 5, 1);

        int x = calc.somar(2, 3);
        
        double y = calc.somar(2, 3);

        System.out.println(calc.somar(2, 3));

       
    }
}
