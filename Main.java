import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        System.out.print("digite o primeiro número: ");
        calc.nmbA = sc.nextDouble();
        System.out.print("digite o segundo número: ");
        calc.nmbB = sc.nextDouble();
        System.out.print("selecione uma das opções: (+ - / *)");
        char resp = sc.next().charAt(0);
        double result;
        if (resp == '+'){
            result = calc.somar();
            System.out.println("Sum: " + result);
        } else if (resp == '-') {
            result = calc.subtrair();
            System.out.println("Sub: " + result);
        } else if (resp == '*'){
            result = calc.multiplicar();
            System.out.println("Mul: " + result);
        } else {
            result = calc.dividir();
            System.out.println("Div: " + result);
        }
        boolean primo = calc.verificarnmrPrimo(sc.nextInt());
        System.out.println(primo);


        sc.close();
    }
}
    

