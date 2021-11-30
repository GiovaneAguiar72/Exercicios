   import java.util.Scanner;
   
   public class Exercicio_Calculadora_Condicionais{
   
        public static void main( String [] args ){
        
        Scanner sc = new Scanner( System.in );
        
        System.out.println("Digite um valor para A");
        double a = sc.nextDouble();
        
        System.out.println("Digite um valor para B");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite o valor da operacao");
        char operacao = sc.nextLine().charAt(0);
        
        if( operacao == '*' ){
            System.out.println("valor da multiplicacao "+ (a*b));
        
        }else if (operacao == '/' ){
            System.out.println("valor da divisao "+ (a/b));  
        
        }else if (operacao == '-' ){
            System.out.println("valor da subtracao"+ (a-b));
        
        }else if (operacao == '+' ){
            System.out.println("valor da soma"+ (a+b));
        
        }else{
            System.out.println("operacao invalida");
        }
   }
}
              
     
      