public class Main {

    public static void main(String args[]) {

        ContaBancaria conta = new ContaBancaria();
        conta.setSaldo(Double.valueOf("200"));

        conta.deposito("200");
        System.out.println("SALDO APÓS DEPOSITO: " + conta.getSaldo());

        conta.saque("200");
        System.out.println("SALDO APÓS SAQUE: " + conta.getSaldo());
    }

}
