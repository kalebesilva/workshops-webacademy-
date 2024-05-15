import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entradaDeDados = new Scanner(System.in);

        OperacoesMatematicas operacoes = 
                            new OperacoesMatematicas(retornaUmNumeroDigitado(entradaDeDados), 
                            retornaUmNumeroDigitado(entradaDeDados));

        
        operacoes.mostraOperacoesNaTela();
        entradaDeDados.close();
    }

    public static double retornaUmNumeroDigitado(Scanner entradaDeDados){
        System.out.print("Digite um numero: ");
        double numeroDigitado = entradaDeDados.nextDouble();

        return numeroDigitado;
    }
}
