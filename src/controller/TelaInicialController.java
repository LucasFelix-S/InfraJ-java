package controller;

public class TelaInicialController {
	public static void validaOpcao(int opcao) {
		
		// prints genéricos apenas para validar testes internos do sistema.
		
		switch(opcao) {
			case 1:
				System.out.println("Opção 1");
				break;
			case 2:
				System.out.println("Opção 2");
				break;
			case 3:
				System.out.println("Opção 3");
				break;
			case 4:
				System.out.println("Opção 4");
				break;
			case 5:
				System.out.println("Opção 5");
				break;
			case 6:
				System.out.println("Opção 6");
				break;
			case 7:
				System.out.println("Opção 7");
				break;
			case 8:
				System.out.println("Opção 8");
				break;
			default:
				System.err.println("Opção inválida!");
				
		}
	}
}