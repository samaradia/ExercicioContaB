import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(364, 298.99);
        ContaBancaria conta2 = new ContaBancaria(346, 876.90);
        ContaBancaria conta3 = new ContaBancaria(253, 2345.65);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaDeContas.get(0);
        for (ContaBancaria conta : listaDeContas){
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }

        }
        System.out.println("Conta com maior saldo - Número: "
                + contaMaiorSaldo.getNumeroDaConta() + ", saldo: "
                + contaMaiorSaldo.getSaldo());



    }
}