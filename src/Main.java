import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Cliente Mario = new Cliente();
		Mario.setNome("Mario");
		
		Conta cc = new ContaCorrente(Mario);
		Conta poupanca = new ContaPoupanca(Mario);

		cc.depositar(600);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
    }

