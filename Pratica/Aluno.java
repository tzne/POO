package Pratica;

import java.util.Scanner;
import static java.lang.System.*;

public class Aluno {
  private int ra, presenca;
  private String nome;
  private double n1, n2, n3;

  public void assisteAula() {
    presenca++;
  }

  public void fazProva(int prova) {
    Scanner entrada = new Scanner(System.in);

    out.printf("Insira a nota %d: ", prova);
    double nota = entrada.nextDouble();

    switch (prova) {
      case 1:
        this.n1 = nota;
        break;
      case 2:
        this.n2 = nota;
        break;
      case 3:
        this.n3 = nota;
        break;
      default:
        return;
    }

  }

  public void relatorio() {
    out.printf("Nome: %s\n", nome);
    out.printf("RA: %d\n", ra);
    out.printf("Presença: %d\n", presenca);
    out.printf("N1: %f\n", n1);
    out.printf("N2: %f\n", n2);
    out.printf("N3: %f\n", n3);
  }

}
