import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite seu nome completo: ");
		String nome = sc.nextLine();
		System.out.print("Digite sua idade: ");
		int idade=sc.nextInt();
		System.out.print("Digite sua altura: ");
		double altura = sc.nextDouble();
		System.out.println("Seu sexo: (F para feminino e M para masculino) ");
		char sexo=sc.next().charAt(0);
		
		if(idade >=18 && altura >= 1.60 && sexo == 'm' ) {
			System.out.println("Alistamento aprovado");
			System.out.println("Dados pessoais: ");
			System.out.println("Nome:"+nome);
			System.out.println("Idade:"+idade);
			System.out.printf("Altura:%.2f%n",altura);
			System.out.println("Sexo:"+sexo);
		}else if(idade < 18){
			System.out.print("Idade não permitida: "+idade);
		}else if(sexo == 'f') {
			System.out.print("Não compátivel para carreira.");
		}else if(altura < 1.60) {
			System.out.println("Não aprovado. Altura minima = 1.60");
		}
		
		sc.close();
		

	}

}
