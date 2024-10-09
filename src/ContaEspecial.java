public class ContaEspecial extends Conta {

    private float limite;

    public void saque(float valor) {
        if (saldo + limite < valor) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= valor;
        }
        System.out.println("Saque efetuado com sucesso");
    }
}
