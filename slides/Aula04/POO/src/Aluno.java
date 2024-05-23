public class Aluno {
    
    int idade;
    private String nome;
   public String dataDeNascimento;
    private String matricula;
    int numeroDaSala;
    String grauDeEscolaridade;
    boolean presenca = true;
    int numeroDeFaltas = 0;
    boolean statusDeReprovacao;
    
    public Aluno(int idade, String nome, String dataDeNascimento){

        this.idade = idade;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;

    }

    public boolean gazetarAAula(){

        this.presenca = false;
        this.numeroDeFaltas +=1;

        return this.presenca;

    }

    public boolean reprovar(boolean eleReprovouOuNao){

        if(eleReprovouOuNao == true){
            this.statusDeReprovacao = eleReprovouOuNao;
            System.out.println("SIM, ele conseguiu reprovar");
            return statusDeReprovacao;
        }

        this.statusDeReprovacao = eleReprovouOuNao;
            System.out.println("NAO, ele nao conseguiu reprovar :(");
            return statusDeReprovacao;
    }

    public String getNome(){
        return this.nome;
    }
   
    public void setNome( String novoNome){
        this.nome = novoNome;
    }

}
