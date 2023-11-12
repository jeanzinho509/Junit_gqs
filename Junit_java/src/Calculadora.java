public class Calculadora {

    public int subtraInteiros(int a, int b) {
        return a - b;
    }

    public int multiplicaInteiros(int a, int b) {
        return a * b;
    }

    public int dividiInteiros(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Divisão por zero não permitida");
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso dos métodos
        Calculadora calculadora = new Calculadora();
        System.out.println("Subtração: " + calculadora.subtraInteiros(5, 3));
        System.out.println("Multiplicação: " + calculadora.multiplicaInteiros(4, 6));
        System.out.println("Divisão: " + calculadora.dividiInteiros(8, 2));
    }
}
