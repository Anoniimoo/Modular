package ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int dia, mes, ano;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia");
        dia = sc.nextInt();
        System.out.println("Digite o m�s(Digite apenas o n�mero)");
        mes = sc.nextInt();
        System.out.println("Digite o ano");
        ano = sc.nextInt();
        Data d = new Data(dia, mes, ano);
        System.out.println("Hoje � " + d.diaDaSemana() + ", nesse m�s tem " + d.diasNoMes() + " dias");
        System.out.println("Digite quantos dias voc� deseja adicionar (Digite apenas o n�mero)");
        d.adicionaDias(sc.nextInt());
        System.out.println("Ser� " + d.diaDaSemana() + " dia: " + d.getDia());
    }
}