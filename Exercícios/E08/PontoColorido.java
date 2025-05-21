package Exercícios.E08;

import static java.lang.System.*;

enum Cor {
  VERMELHA,
  AZUL,
  VERDE
}

public class PontoColorido {
  public double coordX, coordY;
  private Cor cor;

  public void inicializarCoordX(double coordenada) {
    this.coordX = coordenada;
  }

  public void inicializarCoordY(double coordenada) {
    this.coordY = coordenada;
  }

  public void inicializarCor(Cor cor) {
    switch (cor) {
      case VERMELHA:
        this.cor = Cor.VERMELHA;
        break;
      case VERDE:
        this.cor = Cor.VERDE;
        break;
      case AZUL:
        this.cor = Cor.AZUL;
        break;
      default:
        out.println("Cor inválida!");
        return;
    }
  }

  public void criarPonto(double coordX, double coordY, Cor cor) {
    this.inicializarCoordX(coordX);
    this.inicializarCoordY(coordY);
    this.inicializarCor(cor);
  }

  public double retornarCoordX() {
    return this.coordX;
  }

  public double retornarCoordY() {
    return this.coordY;
  }

  public Cor retornarCor() {
    return this.cor;
  }

  public void exibirPonto() {
    String corPrint = "\u001B[0m";

    switch (cor) {
      case VERMELHA:
        corPrint = "\u001B[31m";
        break;
      case VERDE:
        corPrint = "\u001B[32m";
        break;
      case AZUL:
        corPrint = "\u001B[34m";
        break;
      default:
        return;
    }

    out.printf("%sPonto: (%.2f, %.2f): %s\u001B[0m\n", corPrint, this.coordX, this.coordY, this.cor);
  }

}
