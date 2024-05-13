import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner entradaDeDados = new Scanner(System.in);

        OperacoesMatematicas minhasOperacoes = new OperacoesMatematicas(retornaUmNumero(entradaDeDados), retornaUmNumero(entradaDeDados));

        minhasOperacoes.mostraOperacoes();

        entradaDeDados.close();
        

    }

    public static double retornaUmNumero(Scanner entradaDeDados){
        
        System.out.print("Digite um numero: ");
        double numeroDigitado = entradaDeDados.nextDouble();
        return numeroDigitado;
    }


}
