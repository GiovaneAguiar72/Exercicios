public class Teste_Bo {
   public static void main (String[] args) {
   // Declarar variáveis
boolean var1, var2;
boolean r1, r2, r3, r4;

var1 = true;
var2 = false;

// And( e )
r1 = var2 && var1;

System.out.println( " E "+ r1);

// Or( ou )
r2 = var1 || var2;

// Not( nao )
r3 = !var1;
r4 = !var2;
   
   }
}