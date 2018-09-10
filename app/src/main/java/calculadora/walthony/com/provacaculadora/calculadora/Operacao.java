package calculadora.walthony.com.provacaculadora.calculadora;

public enum Operacao {

    ADICAO(" + "),
    SUBTRACAO(" - "),
    MULTIPLICACAO(" * "),
    DIVISAO(" / ");


    private String texto = "";

    private Operacao(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.texto;
    }
}
