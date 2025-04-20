package view;
import java.util.Scanner;
import controller.LoginController;

public class MenuLogin {
	Scanner sc = new Scanner(System.in);
	LoginController loginController = new LoginController();
	
	public void login() {
		System.out.println("\n[+] ==LOGIN==");
		System.out.println(" | ");
		System.out.println(" | Digite seu usuário e sua senha.\n");
		
		System.out.print("usuário: ");
		String usuario = sc.nextLine();
		
		System.out.print("senha: ");
		String senha = sc.nextLine();
		
		loginController.validacaoLogin(usuario, senha);
	}
}