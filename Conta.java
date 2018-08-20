class Conta {

    // atributos
    private int numero;
    private String titular;
    private double saldo;
    private double limite;

    // construtor
    Conta(int numero, String titular, double saldo, double limite)
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

void extrato() {
    System.out.println("Saldo de " + this.saldo)
}

    public boolean podeSacar(double valor_a_sacar) {
        double valorDisponivelASacar = this.saldo + this.limite;
        return valor_a_sacar <= valorDisponivelASacar;
    }

    boolean saca(double valor) {
        if (this.podeSacar(valor)) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("O valor passou o limite");
        }
    }

    void transfere(double valor, Conta conta) {
        this.saca(valor);
        conta.deposita(valor);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getNumero() {
        return numero;
    }

    public void getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

public static String codigo() {
    return "001"
}

    public static Map codigos() {
        return Map.of("BB", "001", "Caixa", "104", "Bradesco", "237");
    }
}