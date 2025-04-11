public class EjerciciosRecursivos {
    public int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int sumaConsecutivos(int n){
        if (n ==1){
            return 1;
        }
        int resultadoParcial = sumaConsecutivos(n - 1);
        int resultado = n + resultadoParcial;
        return resultado;
    }

    public int getPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * getPotencia(base, exponente - 1);
    }

    public int sumaDigitos(int numero){
        if (numero < 10){
            return numero;
        }
        int resto = numero % 10;
        int digitos = numero / 10;
        return resto + sumaDigitos(digitos); 
    }

    public void imprimirDescendente(int n) {
        if (n <= 0) return;
        System.out.print(n + " ");
        imprimirDescendente(n - 1);
    }

    public int reversa(int n) {
        return reversaHelper(n, 0);
    }
    private int reversaHelper(int n, int resultado) {
        if (n == 0) return resultado;
        return reversaHelper(n / 10, resultado * 10 + n % 10);
    }
}


