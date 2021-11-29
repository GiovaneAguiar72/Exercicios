   import java.util.Scanner;
   
   public class Exercicio_String_Entradas_Multiplas1{
   
      public static void main( String [] args ){
      
         Scanner sc = new Scanner( System.in );
         
         System.out.println("Digite uma String com espaco");
        
         String str1 = sc.nextLine(); 
         
         
             
         System.out.println("Digite outro valor String"); 
        
         String str2 = sc.nextLine();
         
         System.out.println( "Valores lidos: "+str1+" "+str2); 
         
         System.out.println("Digite uma String com espaco");
        
         String str3 = sc.nextLine();
         
         
         
         System.out.println("Digite outro valor String");
         
         String str4 = sc.nextLine();
         
        
         
         System.out.println( "Valores lidos: "+str3+" "+str4);      
   
   }
}