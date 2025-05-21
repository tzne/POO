package Exercícios.E07;

public class Data {
  private int dia;
  private int mes;
  private int ano;

  public void atualizaDia(int d) {
    this.dia = d;
  }

  public void atualizaMes(int m) {
    this.mes = m;
  }

  public void atualizaAno(int a) {
    this.ano = a;
  }

  public void mostraData() {
    System.out.printf("%02d/%02d/%4d\n", dia, mes, ano);
  }
}
