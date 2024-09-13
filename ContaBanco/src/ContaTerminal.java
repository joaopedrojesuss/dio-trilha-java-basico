import java.util.Locale;
import java.util.Scanner;



public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite o número da conta: ");
		int numeroConta = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Por favor, digite o número da agência: ");
		String agencia = sc.nextLine();

		System.out.println("Por favor, digite o nome: ");
		String nomeCliente = sc.nextLine();
		
		System.out.println("Por favor, digite o saldo: ");
		double saldo = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Olá " + nomeCliente 
					+ ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia 
					+ " conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
		
		sc.close();
	}

}
