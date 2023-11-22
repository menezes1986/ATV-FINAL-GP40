public class Calculadora {

    // Método para somar os dois números:

    public int somar(int a, int b) {
        return a + b;
    }

    // Método para subtrair os dois números:

    public int subtrair(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dois números
    // iserido por miguel
    public int multiplicar(int a, int b) {
        return a * b;
    }

     // Método para dividir dois números (considere a divisão inteira):

     // Inserido por Maurício Viana 

    public int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero não permitida.");
            return 0; // Valor padrão em caso de divisão por zero
        }
    }

    public static void main(String[] args) {

        // Exemplo de uso da classe:

        Calculadora calculadora = new Calculadora();

        int resultadoSoma = calculadora.somar(5, 3);
        System.out.println("Resultado da soma: " + resultadoSoma);

        int resultadoSubtracao = calculadora.subtrair(10, 4);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);

        int resultadoMultiplicacao = calculadora.multiplicar(2, 6);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
        
        int resultadoDivisao = calculadora.dividir(12, 3);
        System.out.println("Resultado da divisão: " + resultadoDivisao);
    }
}