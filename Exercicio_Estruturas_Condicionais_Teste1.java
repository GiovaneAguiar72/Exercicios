import java.util.Scanner;
   
public class Exercicio_Estruturas_Condicionais_Teste1{
       
   public static void main( String [] args ){
      
      Scanner sc = new Scanner( System.in );
      
   
      
      System.out.println("Digite um valor para A");
      boolean a = sc.nextBoolean();
      
      System.out.println("Digite um valor para B");
      boolean b = sc.nextBoolean();
      
      System.out.println("Digite um valor para C");
      boolean c = sc.nextBoolean();
      
      if ((a == b ) && ( b == c )) {
         System.out.println((a == b ) && ( b == c ));
      }
   
   }
}
              
     
