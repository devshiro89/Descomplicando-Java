
public class Processamento_casting {
	public static void main(String[] args) {
		System.out.printf("Processamento \n");
		double b, B, h, area;
		/*
		 * Sempre indique o tipo do número, se a expressão for de ponto flutuante (não
		 * inteiro) Para double use: .0 (p.e. 6.0) Para float use: f (p.e. 6f)
		 */

		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;

		System.out.println(area);
		System.out.printf("\n\nCasting \n");

		int a, y;
		double resultado;

		a = 5;
		y = 2;

		// Casting é uma conversão explicita do tipo de dado
		resultado = (double) a / y;
		System.out.println(resultado);

	}
}
