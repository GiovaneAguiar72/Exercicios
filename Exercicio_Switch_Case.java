   import java.util.Scanner;
  
    public class Exercicio_Switch_Case {
      
       public static void main ( String [] args) {
       
       Scanner sc = new Scanner(System.in);
       int diaSemana = sc.nextInt();
       
       switch( diaSemana){
          case 1:
            System.out.println("Domingo");
            break;
          case 2:
            System.out.println("Segunda-feira");
            break;
          case 3:
             System.out.println("Terca-feira");
             break;
          case 4:
             System.out.println("Quarta-feira");
             break;
          case 5:
             System.out.println("Quinta-feira");
             break;
          case 6:
             System.out.println("Sexta-feira");
             break;
          case 7:
             System.out.println("Sabado");
             break;
          }
      }
   }          
               
      
      