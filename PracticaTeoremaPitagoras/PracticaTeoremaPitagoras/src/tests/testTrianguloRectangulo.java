package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {
	static TrianguloRectangulo triangulo1;
	static TrianguloRectangulo triangulo2;
	
	@BeforeAll
	static void setup(){
		triangulo1 = new TrianguloRectangulo(){};
		triangulo2 = new TrianguloRectangulo(2, 2){};
	}
	@Test
	void testAreaDefecto() {
		double areaEsperada = 0.5;
		double areaObtenida = triangulo1.area();
		assertEquals(areaEsperada, areaObtenida);
	}
	
	@Test
	void testAreaOtro() {
		double areaEsperada = 2;
		double areaObtenida = triangulo2.area();
		assertEquals(areaEsperada, areaObtenida);
	}
	
	
	@Test
	void testHipotenusaDefecto() {
		double hipotenusaEsperada = 1.41;
		double hipotenusaObtenida = triangulo1.hipotenusa();
		assertEquals(hipotenusaEsperada, hipotenusaObtenida);
	}
	
	@Test
	void testHipotenusaOtro() {
		double hipotenusaEsperada = 2.83;
		double hipotenusaObtenida = triangulo2.hipotenusa();
		assertEquals(hipotenusaEsperada, hipotenusaObtenida);
	}

	@Test
	void testPerimetroDefecto() {
		double perimetroEsperado = 3.41;
		double perimetroObtenido = triangulo1.perimetro();
		assertEquals(perimetroEsperado, perimetroObtenido);
	}
	
	@Test
	void testPerimetroOtro() {
		double perimetroEsperado = 6.83;
		double perimetroObtenido = triangulo1.perimetro();
		assertEquals(perimetroEsperado, perimetroObtenido);
	}
	
	
	
	
	

}
