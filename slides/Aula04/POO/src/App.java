public class App {
    public static void main(String[] args) throws Exception {
        
        Pincel pincelAzul = new Pincel();
       
        pincelAzul.cor = "vermelho";
        pincelAzul.estaCarregado = false;
        pincelAzul.estaTampado = true;

        Matricula jose = new Matricula(20, "jose", "01/01/1800");
        
        System.out.println(jose.idade);

        Aluno carlos = new Aluno(20, "Carlos danone", "01/12/1900");

        carlos.reprovar(false);
    

 


        
    }
}

/* 
 Coisa material ou abstrata que pode ser percebida pelos sentidos
 e descrita por meio das suas caracteristicas,
comportamento  e estado atual.

*/