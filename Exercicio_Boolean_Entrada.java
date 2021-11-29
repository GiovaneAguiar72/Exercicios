   import java.util.Scanner;
   
   public class Exercicio_Boolean_Entrada{
   
      public static void main ( String [] args ){
      
         Scanner sc = new Scanner ( System.in );
         
         System.out.println( "Digite um valor booloean true/false" );
         
         boolean bool = sc.nextBoolean();
         
         System.out.println( "Valor lido True or False = "+bool );
         
   }
}            
    