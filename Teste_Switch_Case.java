import java.util.Scanner;
  
public class Teste_Switch_Case {
      
   public static void main ( String [] args) {
      
      System.out.println("Bem Vindo a Calculadora Switch ! Por favor, digite um numero para realizar uma operacao, sendo :"); 
      System.out.println("1 Multiplicacao");       
      System.out.println("2 Divisao");
      System.out.println("3 Soma"); 
      System.out.println("4 Subtracao");
      
      Scanner sc = new Scanner(System.in);
      int operacoes = sc.nextInt();
       
      switch( operacoes){
           
         case 1:
         
            System.out.println("Digite um valor para A");
            double a = sc.nextDouble();
         
            System.out.println("Digite um valor para B");
            double b = sc.nextDouble();
           
            System.out.println("resultado da multplicacao "+ (a*b));
            break;
          
         case 2:
         
            System.out.println("Digite um valor para A");
            double c = sc.nextDouble();
         
            System.out.println("Digite um valor para B");
            double d = sc.nextDouble();
           
            System.out.println("resultado da divisao "+ (c/d));
           
            break;
          
         case 3:
         
            System.out.println("Digite um valor para A");
            double e = sc.nextDouble();
         
            System.out.println("Digite um valor para B");
            double f = sc.nextDouble();
           
            System.out.println("resultado da soma "+ (e+f));
           
            break;
          
         case 4:
             
            System.out.println("Digite um valor para A");
            double g = sc.nextDouble();
         
            System.out.println("Digite um valor para B");
            double h = sc.nextDouble();
           
            System.out.println("resultado da subtracao "+ (g-h));
             
            break;
       
         default:
            
            System.out.println("Operacao Invalida");
          
            break;
       
      }
   }
}          
               
