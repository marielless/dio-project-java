public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Santander");

        Cliente marielle = new Cliente();
        marielle.setNome("Marielle");

        Conta cc = new ContaCorrente(marielle);
        Conta poupanca = new ContaPoupanca(marielle);

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        cc.depositar(200);
        cc.transferir(200, poupanca);

        try {
            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}