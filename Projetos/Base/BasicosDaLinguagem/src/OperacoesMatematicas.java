public class OperacoesMatematicas {

    double firstNumber;
    double secondNumber;

    public OperacoesMatematicas (double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void mostraOperacoes(){
        System.out.println("Digite o número referente a operacao matematica");
        System.out.println("\n");
        System.out.printf("Soma: %.2f + %.2f =  %.2f\n", this.firstNumber, this.secondNumber, soma());
        System.out.printf("Subtracao: %.2f - %.2f =  %.2f\n", this.firstNumber, this.secondNumber, subtracao());
        System.out.printf("Multiplicacao: %.2f * %.2f =  %.2f\n", this.firstNumber, this.secondNumber, multiplicacao());
        System.out.printf("Divisao: %.2f / %.2f =  %.2f\n", this.firstNumber, this.secondNumber, divisao());
        System.out.printf("Resto da divisao:%.2f %% %.2f =  %.2f\n", this.firstNumber, this.secondNumber, restoDaDivisao());


    }

    public double soma(){

        return (this.firstNumber + this.secondNumber);

    }

    public double subtracao(){
        return (this.firstNumber - this.secondNumber);
    }

    public double multiplicacao(){

        double multiplicacao = this.firstNumber * this.secondNumber;

        return multiplicacao;
    }

    public double divisao(){
        return (this.firstNumber / this.secondNumber);
    }

    public double restoDaDivisao(){
        return (this.firstNumber % this.secondNumber);
    }
    
}
