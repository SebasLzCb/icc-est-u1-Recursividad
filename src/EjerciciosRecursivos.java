public class EjerciciosRecursivos {
    public int fibonacci(int n){
        if(n<=1){
            return n;
        // } //else if (n==1){
            // return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    /**
     * Metodo que devuelve la suma de los numeros
     * que contienen n
     * n = 5
     * 5 + 4 + 3 + 2 + 1 = 15
     * @param n numero a ser sumado
     * @return retorna cada suma. para n = 5 retorna 15
     */
    public int sumaConsecutivos(int n){
        // if (n == 1) return 1;
        // return n + sumaConsecutivos(n -1);
        if (n ==1){
            return 1;
        }
        int resultadoParcial = sumaConsecutivos(n - 1);
        int resultado = n + resultadoParcial;
        return resultado;
    }

    /**
     * Escribe una funcion recursiva que calcue la potencia
     * de un numero base elevado a un exponente.
     * Por ejemplo, si base es 2 y exponente es 3.
     * La funcion debe devolver 2elevado a 3 = 8
     */
    public int getPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * getPotencia(base, exponente - 1);
    }

    /**
     * SUMA DE DIGITOS DE UN NUMERO 
     * si el numero es menor que 10, lo cual significa que solo tiene
     * un digito, se devuelve el numero mismo. En caso contrario, se extrae el ultimo digito utilizando el operador
     * modulo % y se calcula los digitos menos el ultimo utilizando la division entera /10. Luego, se realiza una llamada 
     * recursiva a sumaDigitos con el resto y se suma el ultimo digito
     */
    public int sumaDigitos(int numero){
        if (numero < 10){
            return numero;
        }
        int resto = numero % 10;
        int digitos = numero / 10;
        return resto + sumaDigitos(digitos); 
    }
    
}

