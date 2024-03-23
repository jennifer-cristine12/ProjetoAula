package pck_git.Controle;

import java.util.Scanner;

import pck_git.Modelo.Modelo;

public class Controle {
	public static void controlePessoa() {
		Scanner Scn = new Scanner(System.in);
		String cadastro = null;
		Modelo pessoa = new Modelo();
		int i = 0;
		pessoa.setCodigo(i++);
		
		System.out.println("Escreva o nome");
		pessoa.setNome(Scn.nextLine());
		
		System.out.println("Escreva o email");
		pessoa.setEmail(Scn.nextLine());
		
		System.out.println("Escreva a senha");
		pessoa.setSenha(Scn.nextLine());
		
		System.out.println("Login completo\n");
		
		System.out.println("Deseja ver seu cadastro? s/n");
		cadastro = Scn.next();
		cadastro.toLowerCase();
		if(cadastro.equals("s")) {
			pessoa.toString();
		}
	}
	

}
