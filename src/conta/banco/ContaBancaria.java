package conta.banco;
import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numeroConta = 0;
		String agencia;
		String nomeCliente;
		double saldoConta = 0;
		
		System.out.println("Por favor, digite o numero da agência: ");
		agencia = scan.nextLine();
		System.out.println("Digite o número da conta: ");
		numeroConta = scan.nextInt();
		scan.nextLine();
		System.out.println("Digite o nome do propietário da conta: ");
		nomeCliente = scan.nextLine();
		
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! "
				+ "Sua agencia é " + agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldoConta 
				+ " já está disponível para saque!");
		

		scan.close();
	}

}
