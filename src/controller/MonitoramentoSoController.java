package controller;
import java.util.Properties;

public class MonitoramentoSoController {
	
	Properties infos = new Properties();
	
	public void soController(String opcaoSo) {	
		switch (opcaoSo) {
			case "/infoso":
				System.out.println("\nSistema Operacional: " + System.getProperty("os.name"));
				System.out.println("Arquitetura do Sistema Operacional: " + System.getProperty("os.arch"));
				System.out.println("Versão do Sistema Operacional: " + System.getProperty("os.version"));
				break;
			case "/infoso -u":
				System.out.println("\nnome do usuário que executa o programa: " + System.getProperty("user.name"));
				System.out.println("Diterório home do usuário: " + System.getProperty("user.name"));
				break;	
			case "/exit":
				System.exit(0);
				break;
			default:
				System.err.println("comando inexistente!");
		}
	}
}