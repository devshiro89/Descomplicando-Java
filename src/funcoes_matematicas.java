
public class funcoes_matematicas {

	public static void main(String[] args) {

		double x, y, z, A, B, C;
		x = 3.0;
		y = 4.0;
		z = -5.0;

		// Função para raiz quadrada
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de " + (int) z + " = " + C);
		System.out.println();

		// Função para potencia
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(z + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado =  " + C);
		System.out.println();

		// Função pra verificar valores absolutos
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		System.out.println();

		// Exemplo com formúla de báskara

		double a, b, c, delta, x1, x2;
		a = 2;
		b = -5;
		c = 3;
		delta = Math.pow(b, 2.0) - 4 * a * c;

		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.println("O valor de x1 = " + x1);
		System.out.println("O valor de x2 = " + x2);

	}

}
