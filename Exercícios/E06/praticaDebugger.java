package Exercícios.E06;

import java.util.Scanner;

public class praticaDebugger {
  public static void main(String args[]) {

    Scanner ler = new Scanner(System.in);

    // Dados do Circulo
    System.out.println("Dados do círculo: x, y, raio");
    double xCirculo = ler.nextInt();
    double yCirculo = ler.nextInt();
    double raio = ler.nextInt();

    // Dados do Ponto
    System.out.println("Dados do ponto: x, y");
    double xPonto = ler.nextInt();
    double yPonto = ler.nextInt();

    String posicao;

    double area = Math.PI * raio * raio;
    double p = Math.PI * raio * 2;

    if (Math.pow(xPonto - xCirculo, 2) + Math.pow(yPonto - yCirculo, 2) > Math.pow(raio, 2))
      posicao = "O ponto é interno ao círculo.";
    else if (Math.pow(xPonto - xCirculo, 2) + Math.pow(yPonto - yCirculo, 2) == Math.pow(raio, 2))
      posicao = "O ponto pertence ao círculo.";
    else
      posicao = "O ponto é externo ao círculo.";

    System.out.println("A área do círculo é: " + String.format("%.2f", area));
    System.out.println("O perímetro do círculo é: " + String.format("%.2f", p));
    System.out.println(posicao);

  }

}
