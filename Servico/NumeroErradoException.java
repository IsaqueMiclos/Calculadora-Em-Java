public class NumeroErradoException  extends Exception{
    public NumeroErradoException() {
        super("Numero inválido para o método solicitado.");
    }

    public NumeroErradoException(String message) {
        super(message);
    }
}
