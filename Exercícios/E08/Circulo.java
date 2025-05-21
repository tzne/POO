package Exercícios.E08;

import static java.lang.Math.*;
import static java.lang.System.*;

enum posicaoPonto {
  INTERNO,
  PERTENCE_CIRCULO,
  EXTERNO
}

public class Circulo {
  private double coordXCentro, coordYCentro, raio;

  public void inicializarCoordX(double coordenada) {
    this.coordXCentro = coordenada;
  }

  public void inicializarCoordY(double coordenada) {
    this.coordYCentro = coordenada;
  }

  public void inicializarRaio(double raio) {
    this.raio = raio;
  }

  public void criarCirc(double coordX, double coordY, double raio) {
    this.inicializarCoordX(coordX);
    this.inicializarCoordY(coordY);
    this.inicializarRaio(raio);
  }

  public double area() {
    double medidaArea = PI * pow(this.raio, 2);
    return medidaArea;
  }

  public double perimetro() {
    double medidaPerimetro = 2 * PI * this.raio;
    return medidaPerimetro;
  }

  public void exibirCirculo() {
    out.printf("Círculo: (%f, %f), %f\n", this.coordXCentro, this.coordYCentro, this.raio);
  }

  public void pontoNoCirc(PontoColorido ponto) {
    double diferencaQuadrados = pow((ponto.coordX - this.coordXCentro), 2) - pow((ponto.coordY - this.coordYCentro), 2);

    if (diferencaQuadrados < pow(this.raio, 2))
      out.println("O ponto é interno ao círculo");
    else if (diferencaQuadrados == pow(this.raio, 2))
      out.println("O ponto pertence ao círculo");
    else
      out.println("O ponto é externo ao círculo");

  }

}
