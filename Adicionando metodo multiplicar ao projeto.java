public class Calculadora {

    //Método para somar os dois números:
    
       public int somar(int a, int b) {
           return a + b;
       }
    
    //Método para subtrair os dois números:
    
       public int subtrair(int a, int b) {
           return a - b;
       }
       
       //Adicionando o metodo multiplicar ao projeto
    //Adicionado por Mauricio Viana
    public int multiplicar(int a, int b){
        return a * b;
    }
    
       public static void main(String[] args) {

    //Exemplo de uso da classe:
    
           Calculadora calculadora = new Calculadora();

           int resultadoSoma = calculadora.somar(5, 3);
           System.out.println("Resultado da soma: " + resultadoSoma);
    
           int resultadoSubtracao = calculadora.subtrair(10, 4);
           System.out.println("Resultado da subtração: " + resultadoSubtracao);
           
           // uso do metodo multiplicar adicionado na Classe Calculadora
           int resultadoMultiplicacao = calculadora.multiplicar(3,5);
           System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);

       }
    }