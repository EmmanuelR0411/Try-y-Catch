
public class Principal {
	static int numerador =0;
	static Integer denominador = null;
	static float division= 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Antes de la division");
		try {
			division = numerador / denominador;
		} catch(ArithmeticException ex) {
			division = 0;
			System.out.println("Error: "+ex.getMessage());
		} catch(NullPointerException ex) {
			division = 0;
			System.out.println("Error: "+ex.getMessage());
		}
			System.out.println("Despues de la division");
	}

}
