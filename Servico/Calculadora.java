public class Calculadora {
    //Jesus é o caminho, a verdade e a vida!!!

    static {
        System.out.println("Olá bem vindo, para usar a calculadora escolha entre 6 operadores, somar(+), porcentagem(%), subtrair(-), dividir(/), multiplicar(*) ou RaizQuadrada(RA)!");
    }

    public void calcular(double numero01, String operacao, double numero02) {
        if (operacao == null || operacao == " ") {
            System.out.println("[ERRO] Identifique a operação desejada");
            return;
        }

        switch (operacao) {
            case "%":
                try {
                    double resultado = porcentagem(numero01,numero02);
                    System.out.println("Resultado: " + numero01 + "% de " + numero02 + " é " + resultado + ".");
                } catch(NumeroErradoException e) {
                    e.printStackTrace();
                }
                return;
            case "-":
                System.out.println("Resultado: " + (numero01 - numero02));
                return;
            case "+":
                System.out.println("Resultado: " + (numero01 + numero02));
                return;
            case "/":
                if (numero02 == 0) {
                    System.out.println("[ERRO] Impossível dividir por 0!");
                    return;
                }
                System.out.println("Resultado: " + (numero01 / numero02));
                return;
            case "*":
                System.out.println("Resultado: " + (numero01 * numero02));
                return;
            default:
                System.out.println("[ERRO] ERRO AO CALCULAR VERIFIQUE AS INFORMAÇÕES COLOCADAS!");
        }
    }

    public void calcular(double numero, String operacao) {
        if (operacao == null || operacao == " ") {
            System.out.println("[ERRO] Informações incorretas, verificar...");
            return;
        }

        try {
            double resultado = calcularARaizQuadrada(numero);
            System.out.println("Resultado: " + resultado);
            return;
        } catch (NumeroErradoException e) {
            e.printStackTrace();
        }
    }

    private double porcentagem(double numero01, double numero02) throws NumeroErradoException{
        if (numero01 < 0 || numero02 < 0) {
            throw new NumeroErradoException("Não é possível números negativos");
        }
        double resultado = numero02 * (numero01 / 100);
        return resultado;
    }

    private double calcularARaizQuadrada(double valor) throws NumeroErradoException {
        if (valor < 0) {
            throw new NumeroErradoException("Impossível raiz de numero negativo!");
        }
        int resultado = 0;
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
