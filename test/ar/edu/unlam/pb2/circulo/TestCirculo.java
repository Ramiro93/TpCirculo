package ar.edu.unlam.pb2.circulo;

import org.junit.Assert;
import org.junit.Test;

public class TestCirculo {

	@Test

	public void testSuperficie() {

		Double radioInterior = 1.0;
		Double radioExterior = 2.0;
		Double valorEsperado = 9.42;

		Circulo miCirculo = new Circulo(radioInterior, radioExterior);

		Double superficieObtenida = miCirculo.calcularSuperficie();

		Assert.assertEquals(valorEsperado, superficieObtenida, 0.1);

	}

	@Test

	public void testPerimetroInterior() {

		Double radioInterior = 1.0;
		Double radioExterior = 2.0;
		Double valorEsperado = 6.28;

		Circulo miCirculo = new Circulo(radioInterior, radioExterior);

		Double valorObtenido = miCirculo.calcularPerimetroInterior();

		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	public void testPerimetroExterior() {

		Double radioInterior = 1.0;
		Double radioExterior = 2.0;
		Double valorEsperado = 12.56;

		Circulo miCirculo = new Circulo(radioInterior, radioExterior);

		Double valorObtenido = miCirculo.calcularPerimetroExterior();

		Assert.assertEquals(valorEsperado, valorObtenido, 0.1);
	}

	@Test

	public void testQueSePuedaSetearElRadioInterior() {

		Double radioInterior = 0.0;
		Double radioExterior = 3.0;
		Double valorEsperado = 4.5;

		Circulo miCirculo = new Circulo(radioInterior, radioExterior);

		miCirculo.setRadioInterior(4.5);
		Double radioObtenido = miCirculo.getRadioInterior();

		Assert.assertEquals(valorEsperado, radioObtenido);

	}
}
