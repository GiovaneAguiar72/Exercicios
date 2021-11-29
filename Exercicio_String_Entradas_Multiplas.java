   import java.util.Scanner;
   
   public class Exercicio_String_Entradas_Multiplas{
   
      public static void main( String [] args ){
      
         Scanner sc = new Scanner( System.in );
         
         System.out.println("Digite uma String com espaco");
        
         String str1 = sc.next(); 
             
         System.out.println("Digite outro valor String"); 
        
         sc.nextLine();
         
         String str2 = sc.next();
         
         System.out.println( "Valores lidos: "+str1+" "+str2); 
         
         sc.nextLine();
         
         System.out.println("Digite uma String com espaco");
        
         String str3 = sc.next();
         
         sc.nextLine();
         
         System.out.println("Digite outro valor String");
         
         String str4 = sc.next();
         
         sc.nextLine();
         
         System.out.println( "Valores lidos: "+str3+" "+str4);      
   
   }
}