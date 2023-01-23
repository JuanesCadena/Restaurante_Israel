package Israel;

import Israel.RestauranteIsrael;

public class RestauranteIsrael {
	private int patatas;
	// Numero de patatas que hay

	private int calamares;
	// Numero de calamares que hay

	private static RestauranteIsrael miRestaurante;

	public RestauranteIsrael(int a, int b) {
		this.setPatatas(a);
		this.setCalamares(b);
	}

	int cantP() { // Calcula numero de comensales: por cada patata comen 3 personas

		int a = this.getPatatas() * 3;
		return a;
	}

	int cantC() {
		int ch = this.getCalamares() * 6; // Calcula numero de comensales: por cada calamar comen 6 personas
		return ch;
	}

	public void addCalamares(int c) {
		this.setCalamares(this.getCalamares() + c);
	}

	public void addPatatas(int d) {
		this.setPatatas(this.getPatatas() + d);
	}

	public static void main(String[] args) {
		miRestaurante = new RestauranteIsrael(50, 60);
		System.out.println("Cantidad de calamares: " + miRestaurante.getCalamares());
		System.out.println("Cantidad de patatas: " + miRestaurante.getPatatas());
		calculaComensales(miRestaurante);
		miRestaurante.addCalamares(1);
		miRestaurante.addPatatas(80);
		System.out.println("\nPedido Recibido!! Stock actual: ");
		System.out.println(miRestaurante.getPatatas() + " patatas.\n" + miRestaurante.getCalamares() + " calamares");
		calculaComensales(miRestaurante);
	}

	private static void calculaComensales(RestauranteIsrael r1) {

		if (r1.cantP() <= r1.cantC()) {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantP() + " personas con raciones de patatas máximo");
		} else {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantC() + " personas con raciones de calamares máximo");
		}
	}

	public int getPatatas() {
		return patatas;
	}

	public void setPatatas(int patatas) {
		this.patatas = patatas;
	}

	public int getCalamares() {
		return calamares;
	}

	public void setCalamares(int calamares) {
		this.calamares = calamares;
	}
}