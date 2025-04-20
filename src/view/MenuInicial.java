package view;
import java.util.Scanner;
import controller.MenuController;

public class MenuInicial {
	Scanner sc = new Scanner(System.in);
	MenuController menuController = new MenuController();
	
	public void inicio() {
		System.out.println("[+] ==INICIO==");
		System.out.println(" | ");
		System.out.println(" | Seja bem-vindo(a) ao Controle de T.I \n");
		opcoes();
	}
	
	public void opcoes() {
		System.out.println("[+] ==OPCOES==");
		System.out.println(" | ");
		System.out.println(" | Escolha uma opção: ");
		System.out.println(" | 1 - Login.");
		System.out.println(" | 2 - Sobre.");
		System.out.println(" | 3 - Sair. \n");
		System.out.print(">> ");
		byte opcaoEscolhida = sc.nextByte();
		
		menuController.processarOpcoes(opcaoEscolhida);
	}
}