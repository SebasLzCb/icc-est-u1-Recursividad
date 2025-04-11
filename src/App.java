public class App {
     public static void main(String[] args) throws Exception {
        EjerciciosRecursivos e = new EjerciciosRecursivos();

        int r = e.sumaConsecutivos(5);
        System.out.println(r);
        
        int fibo = e.fibonacci(5);
        System.out.println("Respuesta es " + fibo);

        int potencia = e.getPotencia(2, 3);
        System.out.println("2^3 es: " + potencia);
        
        int suma = e.sumaDigitos(125);
        System.out.println("Resultado: " + suma);
     }
}
