package controller;
import view.MenuLogin;
import view.MenuSobre;

public class MenuController {
	MenuLogin login = new MenuLogin();
	MenuSobre sobre = new MenuSobre();
	
	public void processarOpcoes(byte entrada) {
		switch(entrada) {
			case 1:
				login.login();
				break;
			case 2:
				sobre.Sobre();
				break;	
			case 3:
				System.out.println("Saindo...");
				break;
			default:
				System.err.println("Opção inválida. Saindo do sistema!");			
		}
	}
}