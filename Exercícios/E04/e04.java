package Exercícios.E04;
/* Para este exercício, ainda não devem ser considerados os conceitos da 
  orientação a objetos, apenas o conhecimento básico da programação
  estruturada e os elementos básicos do java. Desenvolva um programa em
  Java que lê os dados de um círculo (coordenadas x, y e raio) e de um
  ponto (coordenadas x e y), calcula a área e o perímetro do círculo e 
  verifica se o ponto é interno, externo ou pertence ao círculo */

import java.util.Scanner;

public class e04 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double coordXCirc, coordYCirc, raio, coordXPonto, coordYPonto;

    System.out.print("Insira a coordenada x do círculo: ");
    coordXCirc = entrada.nextFloat();
    System.out.print("Insira a coordenada y do círculo: ");
    coordYCirc = entrada.nextFloat();
    System.out.print("Insira o raio do círculo: ");
    raio = entrada.nextFloat();

    double area = Math.PI * raio * raio;
    System.out.printf("Área: %f\n", area);
    double perimetro = 2 * Math.PI * raio;
    System.out.printf("Perímetro: %f\n", perimetro);

    System.out.print("Insira a coordenada x do ponto: ");
    coordXPonto = entrada.nextFloat();
    System.out.print("Insira a coordenada y do ponto: ");
    coordYPonto = entrada.nextFloat();

    if (Math.pow((coordXPonto - coordXCirc), 2) + Math.pow((coordYPonto - coordYCirc), 2) < raio * raio)
      System.out.println("O ponto é interno ao círculo");
    else if (Math.pow((coordXPonto - coordXCirc), 2) + Math.pow((coordYPonto - coordYCirc), 2) == raio * raio)
      System.out.println("O ponto pertence ao círculo");
    else if (Math.pow((coordXPonto - coordXCirc), 2) + Math.pow((coordYPonto - coordYCirc), 2) < raio * raio)
      System.out.println("O ponto é externo ao círculo");
  }
}