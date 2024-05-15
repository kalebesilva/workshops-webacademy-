public class Pincel{

    String cor = "Azul";
    int tamanho = 7;
    boolean estaTampado = true;
    boolean estaCarregado = true;

    public Pincel(){

    }

    public Pincel(String cor){
        this.cor = cor;
    }
    void riscar(){
        System.out.println("Riscou");
    }

    void abrirTampa(){
        System.out.println("Tirou a tampa, " + this.cor);
        this.estaTampado = false;
    }

    void fechaTampa(){
        System.out.println("Tampei");
        this.estaTampado = true;
    }

    void recarga(){
        this.estaCarregado = true;
    }

    void descarregar(){
        this.estaCarregado = false;
    }

}