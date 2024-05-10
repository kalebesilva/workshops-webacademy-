## Questão 01

```java
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Escolha um dos sabores de sorvete");
        System.out.println("---------------------------");

        System.out.println("1 - Morango\n");
        System.out.println("2 - Chocolate\n");
        System.out.println("3 - Melancia\n");

        Scanner entradaDeDados =  new Scanner(System.in);

        System.out.print("Digite qual o sabor desejado: ");
        int escolha = entradaDeDados.nextInt();

        if(escolha == 1) {
            System.out.println("Voce escolheu " + escolha +" Morando");
        } else if(escolha == 2) {
            System.out.println("Voce escolheu " + escolha +" Chocolate");
        } else if(escolha == 3){
            System.out.println("Voce escolheu " + escolha +" Melancia");
        }else {
            System.out.println("Sabor nao identificado");
        }

        entradaDeDados.close();

        
    }

    
}


```

## Questão 02

```Java

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        System.out.println("Bem vindo a loja de penhores");

        float actionFigure = (float) 25.60; 
        double aviao = 10.56;
        float mario = (float) 14.58;

        System.out.printf("1 - Action figure: R$%.2f\n", actionFigure);
        System.out.printf("2 - Aviao, R$%.2f\n", aviao);
        System.out.printf("3 - Mario, R$%.2f\n", mario);

        Scanner entradaDeDados = new Scanner(System.in);

        System.out.print("Escolha um item: ");
        int escolha = entradaDeDados.nextInt();

        System.out.print("Informe o seu saldo: ");

        double saldo = entradaDeDados.nextDouble();

        double valorTotal;

        switch (escolha) {
            case 1:
                 valorTotal = saldo - actionFigure;

                if(valorTotal < 0) 
                    System.out.println("Valor insuficiente");
                else 
                    System.out.println("Item vendido" + " Action figure " + actionFigure);
                
                break;
            case 2:
                valorTotal = saldo - aviao;
                if (valorTotal < 0) {
                    System.out.println("Valor insuficiente");
                } 
                else{
                    System.out.printf("Item vendido Aviao %.2f", aviao);
                }
                break;
            case 3:
                valorTotal = saldo - mario;
                if (valorTotal < 0) {
                    System.out.println("Valor insuficiente");
                } 
                else{
                    System.out.printf("Item vendido Mario %.2f", mario);
                }
                break;
                
                default:
                break;

        }

        entradaDeDados.close();

    }
}



```