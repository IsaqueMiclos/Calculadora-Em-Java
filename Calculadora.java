public class Calculadora {
    //Jesus é o caminho, a verdade e a vida!!!

    static {
        System.out.println("Olá bem vindo, para usar a calculadora escolha entre 5 operações, somar(+), porcentagem(%), subtrair(-), dividir(/), multiplicar(*) ou RaizQuadrada(RA)!");
    }

    public double calcular(double numero01, String operacao, double numero02) {
        if (operacao == null || operacao == " ") {
            System.out.println("[ERRO] Identifique a operação desejada");
            return 0;
        }

        switch (operacao) {
            case "-":
                return numero01 - numero02;
            case "+":
                return numero01 + numero02;
            case "/":
                if (numero02 == 0) {
                    System.out.println("[ERRO] Impossível dividir por 0!");
                    return 0;
                }
                return numero01 / numero02;
            case "*":
                return numero01 * numero02;
            default:
                System.out.println("[ERRO] ERRO AO CALCULAR VERIFIQUE AS INFORMAÇÕES COLOCADAS!");
                return 0;
        }
    }

    public double calcular(double numero, String operacao) {
        if (operacao == null || operacao == " ") {
            System.out.println("[ERRO] Informações incorretas, verificar..");
            return 0;
        }
        if (operacao == "RA") {
            return calcularARaizQuadrada(numero);
        } else if (operacao == "%") {
            return porcentagem(numero);
        } else {
            System.out.println("[ERRO] Informações incorretas, verificar..");
            return 0;
        }
    }

    private double porcentagem(double numero) {
        return numero / 100;
    }

    private double calcularARaizQuadrada(double valor) {
        double resultado = 0;
        for (int i = 0; i < valor; i++) {
            if (i * i == valor) {
                resultado = i;
                return resultado;
            }
        }
        System.out.println("O número não possui raiz quadrada!");
        return resultado;
    }
}
