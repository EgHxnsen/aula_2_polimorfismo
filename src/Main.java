public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setAgencia("001");
        conta.setNumero("123456");
        conta.saque(100);

        ContaEspecial contaEspecial = new ContaEspecial("001", "123456", 100, 100);
        contaEspecial.saque(200);

        ContaPoupanca contaPoupanca = new ContaPoupanca("001", "123456", 100, 0.1f);
        contaPoupanca.rendimento();


    }
}