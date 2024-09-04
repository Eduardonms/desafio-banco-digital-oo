package diome.banco.desafio;
import diome.banco.cliente.Cliente;
import diome.banco.conta.Conta;
import diome.banco.conta.ContaCorrente;
import diome.banco.conta.ContaPoupanca;

public class DesafioBancoDigital {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta cp = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
