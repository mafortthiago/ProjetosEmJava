package Perfumes;

import java.util.Scanner;

public class TestaFragrancias {
	public static void main(String args[]) {
		FragranciaUm f1 = new FragranciaUm();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Formulário para preencher os detalhes da fragrancia 1\n");
		System.out.println("Digite o nome do perfume: ");
		f1.setNome(scanner.nextLine());
		System.out.println("Digite a a quantidade de ml: ");
		f1.setCapacidade(Integer.parseInt(scanner.nextLine()));
		System.out.println("Digite o preço de custo: ");
		f1.setPrecoDeCustoPerfume(Double.parseDouble(scanner.nextLine()));
		System.out.println("Digite o igrediente exlusivo dessa fragrancia doce: ");
		f1.setIngredienteDoce(scanner.nextLine());
		System.out.println("Digite o preço de custo de materia prima da embalagem : ");
		f1.setPrecoMateriaPrimaPorMl(Double.parseDouble(scanner.nextLine()));
		
		System.out.println("O preco de venda desse perfume é R$: "+f1.precoDeVenda(f1.getPrecoDeCustoPerfume()));
		scanner.close();
	}
}
