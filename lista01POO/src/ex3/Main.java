package ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean desejaSair;
        int entrada;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o n�mero da sua conta: ");
        Conta conta = new Conta(sc.nextInt());
        do {
            System.out.println("Escolha uma op��o:");
            System.out.println("Deposito - [1]");
            System.out.println("Sacar - [2]");
            System.out.println("Ver saldo - [3]");
            entrada = sc.nextInt();
            switch (entrada){
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    conta.depositar(sc.nextInt());
                    System.out.println("Seu novo saldo �: " + conta.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    if (conta.sacar(sc.nextInt())){
                        System.out.println("Seu novo saldo �: " + conta.getSaldo());
                    }else{
                        System.out.println("Voc� n�o possui saldo suficiente para sacar essa quantia");
                    }
                    break;
                case 3:
                    System.out.println("Seu saldo �: " + conta.getSaldo());
                    break;
            }
            System.out.println("Deseja sair?(Sim[1]/N�o[2])");
            desejaSair = sc.nextInt() == 1;
            System.out.println(conta.getId());
        }while(!desejaSair);
    }
}