
public class Main {

	public static void main(String[] args) {
		Cliente leonardo = new Cliente();
		leonardo.setNome("Léo");
		
		Conta cc = new ContaCorrente(leonardo);
		Conta poupanca = new ContaPoupanca(leonardo);

		System.out.println("*EXTRATOS NA CRIACAO DA CONTA*");
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
		cc.depositar(1000);
		cc.transferir(200, poupanca);
		poupanca.atualizarRendimento(1.1);
		poupanca.render();
		
		System.out.println("\n");
		System.out.println("*EXTRATOS APÓS AS TRANSAÇÕES*");
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
