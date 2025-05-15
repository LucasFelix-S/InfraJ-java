package controller;
import view.TelaMonitoramentoSo;
import view.TelaComandos;

public class InicialController {
	
	public static void validaOpcao(String opcao) {
		TelaMonitoramentoSo monitor = new TelaMonitoramentoSo();
		TelaComandos comandos = new TelaComandos();
		
		// prints genéricos apenas para validar testes internos do sistema.
		
		switch(opcao) {
			case "1":
				monitor.monitoramento();
				break;
			case "2":
				System.out.println("\nOpção 2");
				break;
			case "3":
				System.out.println("\nOpção 3");
				break;
			case "4":
				System.out.println("\nOpção 4");
				break;
			case "5":
				System.out.println("\nOpção 5");
				break;
			case "6":
				System.out.println("\nAté breve...");
				System.exit(0);
				break;
			case "/comandos":
				comandos.comandos();
				break;
			default:
				System.err.println("Opção inválida!");
				
		}
	}
}