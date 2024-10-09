public class Conta {

    private String agencia;
    private String Numero;
    private float saldo;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void saque(float valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
        }
        System.out.println("Saldo atual: " + saldo);
    }

    public void setNumero(String number) {
        this.Numero = number;
    }
}
