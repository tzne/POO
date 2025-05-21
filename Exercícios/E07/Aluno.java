package Exercícios.E07;

import java.util.Scanner;

public class Aluno {
  private int RA;
  private String nome;
  private float n1;
  private float n2;
  private float n3;
  private int presenca;

  public Aluno(int RA, String nome) {
    this.RA = RA;
    this.nome = nome;
  }

  public void assisteAula() {
    this.presenca++;
  }

  public void fazProva(int qual) {
    Scanner entrada = new Scanner(System.in);
    float nota = entrada.nextFloat();
    if (qual < 1 || qual > 3) {
      System.out.println("Prova inserida não existe");
      entrada.close();
      return;
    }

    switch (qual) {
      case 1:
        n1 = nota;
        break;
      case 2:
        n2 = nota;
        break;
      case 3:
        n3 = nota;
        break;
    }

  }

  public void relatorio() {
    System.out.printf("RA: %d\n", RA);
    System.out.printf("Nome: %s\n", nome);
    System.out.printf("n1: %f\n", n1);
    System.out.printf("n2: %f\n", n2);
    System.out.printf("n3: %f\n", n3);
    System.out.printf("Presenca: %d\n", presenca);
  }
}
