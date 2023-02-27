public class CalculadoraTest01 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double testRaizQuadrada01 = calculadora.calcular(25,"RA");
        System.out.println(testRaizQuadrada01);

        double calcularPorcentagem = calculadora.calcular(1,"%");
        System.out.println(calcularPorcentagem);

        double test01 = calculadora.calcular(23,"*",calcularPorcentagem);
        System.out.println(test01);
    }
}
