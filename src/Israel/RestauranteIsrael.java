package Israel;

import Israel.RestauranteIsrael;

/**
 * La clase RestauranteIsrael gestiona el stock de comida y numero de comensales
 * a los que puede servir
 * 
 * @author Juan Esteban Cadena
 * @version 1.0
 */
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

	/**
	 * Metodo que añade una cantidad de calamares al stock base
	 * 
	 * @param c cantidad de calamares que añade al stock
	 * 
	 */
	public void addCalamares(int c) {
		this.setCalamares(this.getCalamares() + c);
	}

	/**
	 * Metodo que añade una cantidad de patatas al stock base
	 * 
	 * @param d cantidad de calamares que añade al stock
	 */
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

	/**
	 * 
	 * @return
	 */
	public int getPatatas() {
		return patatas;
	}

	/**
	 * 
	 * @param patatas
	 */
	public void setPatatas(int patatas) {
		this.patatas = patatas;
	}

	/**
	 * 
	 * @return
	 */
	public int getCalamares() {
		return calamares;
	}

	/**
	 * 
	 * @param calamares
	 */
	public void setCalamares(int calamares) {
		this.calamares = calamares;
	}
}