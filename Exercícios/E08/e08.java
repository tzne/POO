package Exercícios.E08;

import static java.lang.System.*;
import static java.util.Arrays.*;

import java.util.Comparator;

public class e08 {
  public static void main(String[] args) {
    /*
     * Criar um ponto e um círculo e usá-los para testar cada um dos métodos dessas
     * classes. (testar com vários valores diferentes)
     */
    PontoColorido pontoTeste = new PontoColorido();
    pontoTeste.inicializarCoordX(2);
    pontoTeste.inicializarCoordY(3);
    pontoTeste.inicializarCor(Cor.VERMELHA);
    out.println(pontoTeste.retornarCoordX());
    out.println(pontoTeste.retornarCoordY());
    out.println(pontoTeste.retornarCor());
    pontoTeste.exibirPonto();

    Circulo circTeste = new Circulo();
    circTeste.inicializarCoordX(0);
    circTeste.inicializarCoordY(0);
    circTeste.inicializarRaio(12);
    out.println(circTeste.area());
    out.println(circTeste.perimetro());

    /*
     * Criar 3 pontos diferentes e escrevê-los na tela na ordem crescente dos seus
     * valores de x.
     */
    PontoColorido pontos[] = new PontoColorido[3];
    for (int i = 0; i <= 2; i++) // inicilizar vetor
      pontos[i] = new PontoColorido();
    pontos[0].criarPonto(4, 3, Cor.AZUL);
    pontos[1].criarPonto(-1, 3, Cor.VERMELHA);
    pontos[2].criarPonto(2, 3, Cor.VERDE);
    sort(pontos, Comparator.comparingDouble(PontoColorido::retornarCoordX)); // não sei ao certo como isso funciona,
                                                                             // achei no StackOverflow
    for (PontoColorido ponto : pontos) {
      ponto.exibirPonto();
    }

    /*
     * Criar 3 círculos e escrever os círculos na tela em ordem crescente de suas
     * áreas
     */
    Circulo circs[] = new Circulo[3];
    for (int i = 0; i <= 2; i++) // inicilizar vetor
      circs[i] = new Circulo();
    circs[0].criarCirc(4, 3, 3);
    circs[1].criarCirc(-1, 3, 5);
    circs[2].criarCirc(2, 3, 9);
    sort(circs, Comparator.comparingDouble(Circulo::area));
    for (Circulo circulo : circs) {
      circulo.exibirCirculo();
    }

    out.println(); // Após a impressão da última linha contendo a resposta deve-se imprimir uma
                   // linha em branco.

  }
}