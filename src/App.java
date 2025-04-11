public class App {
   public static void main(String[] args) throws Exception {
       EjerciciosRecursivos e = new EjerciciosRecursivos();

       int r = e.sumaConsecutivos(5);
       System.out.println("- Suma de consecutivos desde 5 hasta 1:");
       System.out.println("Resultado: " + r);
       System.out.println();

       int fibo = e.fibonacci(5);
       System.out.println("-  Fibonacci de 5:");
       System.out.println("Resultado: " + fibo);
       System.out.println();

       int potencia = e.getPotencia(2, 3);
       System.out.println("-  Potencia 2^3:");
       System.out.println("Resultado: " + potencia);
       System.out.println();

       int suma = e.sumaDigitos(125);
       System.out.println("-  Suma de dígitos de 125:");
       System.out.println("Resultado: " + suma);
       System.out.println();

       System.out.println("-  Números descendentes desde 15 hasta 1:");
       e.imprimirDescendente(15);
       System.out.println("\n");

       int invertido = e.reversa(2006);
       System.out.println("-  Número invertido de 2006:");
       System.out.println("Resultado: " + invertido);
       System.out.println();
   }
}
