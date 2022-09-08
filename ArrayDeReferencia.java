package Arrays;

public class ArrayDeReferencia {

	public static void main(String[] args) {
		
		        Conta[] contas = new Conta[5];

		        Conta cc1 = new ContaCorrente(22, 11);
		        Conta cc2 = new ContaPoupanca(22, 22);

		        contas[0] = cc1;
		        contas[1] = cc2;

		        System.out.println(contas[0].getNumero());

	}

}
