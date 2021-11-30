   import java.util.Scanner;
   
   public class Exercicio_Estruturas_Condicionais_Teste{
        
        public static void main( String [] args ){
        
        Scanner sc = new Scanner( System.in );
        
     
        
        System.out.println("Digite um valor para A");
        boolean a = sc.nextBoolean();
        
        System.out.println("Digite um valor para B");
        boolean b = sc.nextBoolean();
        
        if(a != b ){
            System.out.println("a != b" );

        }else{
            System.out.println( "a==b" );
            
        }
   }
}
              
     
      