package Exercícios.E07;

import java.time.LocalDate;

public class e07 {
  public static void main(String[] args) {
    /*
     * Implementar a classe Aluno e criar 3 alunos específicos no programa
     * principal, testando todas as suas funcionalidades
     * Aluno aluno1 = new Aluno(1, "João");
     * Aluno aluno2 = new Aluno(2, "Maria");
     * Aluno aluno3 = new Aluno(3, "Pedro");
     * 
     * aluno1.assisteAula();
     * aluno1.assisteAula();
     * aluno2.assisteAula();
     * aluno3.assisteAula();
     * aluno3.assisteAula();
     * aluno3.assisteAula();
     * 
     * aluno1.fazProva(1);
     * aluno1.fazProva(2);
     * aluno1.fazProva(3);
     * 
     * aluno2.fazProva(0);
     * aluno2.fazProva(4);
     * aluno2.fazProva(1);
     * aluno2.fazProva(2);
     * 
     * aluno3.fazProva(3);
     * aluno3.fazProva(2);
     * aluno3.fazProva(5);
     * 
     * aluno1.relatorio();
     * aluno2.relatorio();
     * aluno3.relatorio();
     */

    /*
     * Crie a classe Data conforme o diagrama a seguir.
     * No programa principal, crie 3 datas diferentes (d1, d2, d3) e as imprima na
     * tela
     */
    Data d1 = new Data();
    LocalDate hoje = LocalDate.now();
    d1.atualizaDia(hoje.getDayOfMonth());
    d1.atualizaMes(hoje.getMonthValue());
    d1.atualizaAno(hoje.getYear());
    d1.mostraData();

    Data d2 = new Data();
    d2.atualizaDia(4);
    d2.atualizaMes(1);
    d2.atualizaAno(2005);
    d2.mostraData();

    Data d3 = new Data();
    d3.atualizaDia(37);
    d3.atualizaMes(13);
    d3.atualizaAno(1827);
    d3.mostraData();
  }
}
