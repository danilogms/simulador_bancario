package ContaBanco;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeCliente;
        String numeroAgencia;
        int numeroConta;
        double saldo;


        while (true) {
            System.out.println("Por favor, digite seu nome:");
            nomeCliente = scanner.nextLine();

                if (nomeCliente.matches("[a-zA-Z]+")) {
                    System.out.println("Nome Digitado: " + nomeCliente);
                    break;
                } else {
                    System.err.println("Erro: Digite apenas letras.");
                }
        }

        while(true) {
            System.out.println("Por favor, digite sua agência bancária:");
            numeroAgencia = scanner.nextLine();
                if(numeroAgencia.matches("^\\d+$")){
                    System.out.println("Agência digitada: "+ numeroAgencia);
                    break;
                }else {
                    System.err.println("Erro: Digite apenas números.");
                }
        }

        System.out.println("Por favor, digite o numero de sua conta:");
        numeroConta = scanner.nextInt();
                if(numeroConta > 0){
                    System.out.println("Conta digitada: "+ numeroConta);
                }

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
        Random aleatorio = new Random();
        saldo = aleatorio.nextDouble() * 1000;

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + df.format(saldo) + " já está disponível para saque!");

    }


}
