package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name1 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life1 = sc.nextInt();
		System.out.print("Dano: ");
		int damage1 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor1 = sc.nextInt();
		
		Champion champion1 = new Champion(name1, life1, damage1, armor1);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		String name2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Dano: ");
		int damage2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();

		Champion champion2 = new Champion(name2, life2, damage2, armor2);
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int rounds = sc.nextInt();
		
		for (int i = 0; i < rounds; i++) {
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);		
			
			System.out.println();
			System.out.println("Resultado do turno " + (i+1) + ":");
			System.out.println(champion1.status());
			System.out.println(champion2.status());
			
			if (champion1.getLife() == 0 || champion1.getLife() == 0) break;
		}
		
		System.out.println();
		System.out.println("FIM DO COMBATE");
		
		sc.close();
	}
}
