package clases;

/**
* int a y b son catetos, c es hipotenusa
*/
public class TrianguloRectangulo {
	private int a, b;
	private double c;
	
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}
	
	public TrianguloRectangulo(int prim, int seg) {
		if(prim <= 0 || seg <= 0) {
			throw new IllegalArgumentException("Parametro igual o inferior a 0");
		}
		this.a = prim;
		this.b = seg;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	
	
	/**
	 * Metodo que calcula y devuelve el area de un triangulo rectangulo
	 * @return		area del triangulo rectangulo
	 */
	public int area() {
		int res = (this.a * this.b) / 2;
		
		return res;
	}
	
	
	/**
	 * Metodo que calcula y devuelve la hipotenusa de un triangulo rectangulo
	 * @return		hipotenusa de un triangulo rectangulo
	 */
	public double hipotenusa(){
		this.c = Math.sqrt((this.a * this.a) + (this.b * this.b));
		
		return c;
	}
	
	
	/**
	 * Metodo que calcula y devuelve el perimetro de un triangulo rectangulo
	 * @return		perimetro de un triangulo rectangulo
	 */
	public double perimetro() {
		double res = this.a + this.b + this.hipotenusa();
		
		return res;
	}
	
	
	
	public String toString() {
		String res = "Cateto 1: " + this.a;
		res += "Cateto 2: " + this.b;
		res += "Hipotenusa: " + this.c;
		
		return res;
	}

}
