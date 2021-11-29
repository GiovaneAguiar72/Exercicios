   import java.util.Scanner;
   
   public class Exercicio_Char_Entrada{
   
      public static void main( String [] args ){
         
         Scanner sc = new Scanner ( System.in );
         
         System.out.println( "Digite um Char" );
         
         char valor = sc.nextLine().charAt (0);
         
         System.out.println("Valor do Char = "+valor );
   }
}