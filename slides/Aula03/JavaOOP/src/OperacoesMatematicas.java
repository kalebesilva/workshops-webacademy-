
public class OperacoesMatematicas {

   public double numero1;
   public double numero2;

    public OperacoesMatematicas(double numero1, double numero2){

        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public OperacoesMatematicas(){
        
    }

    public void mostraOperacoesNaTela(){
        System.out.printf("Soma: %.2f + %.2f = %.2f \n", this.numero1,
        this.numero2, soma());
        System.out.printf("Subtracao: %.2f - %.2f =  %.2f\n", this.numero1, 
        this.numero2, subtracao());
        System.out.printf("Multiplicacao: %.2f * %.2f = %.2f\n", this.numero1,
        this.numero2, multiplicao());
        System.out.printf("Divisao:  %.2f / %.2f = %.2f\n", this.numero1, this.numero2,
        divisao());
        System.out.printf("Resto da divisao:  %.2f * %.2f = %.2f \n", this.numero1, this.numero2,
        restoDaDivisao());
        

    }

    public double soma(){
        double soma = this.numero1 + this.numero2;
        return soma;
    }

    public double subtracao(){
        return (this.numero1 - this.numero2);
    }

    public double multiplicao(){
        return (this.numero1 * this.numero2);
    }
    
    public double divisao(){
        double divisao = this.numero1 / this.numero2;
        return divisao;
    }

    public double restoDaDivisao(){
        double resto = this.numero1 % this.numero2;
        return resto;
    }

}
