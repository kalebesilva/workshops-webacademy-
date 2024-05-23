public class FoneDeOuvidoComCabo{

    private String cor;
    private String tipoDeEntrada;
    private int volumeDoAudio;
    private String modelo;
    private String marca;

        

    public FoneDeOuvidoComCabo() {
    }


    public FoneDeOuvidoComCabo(String cor, String tipoDeEntrada, int volumeDoAudio, String modelo, String marca) {
        this.cor = cor;
        this.tipoDeEntrada = tipoDeEntrada;
        this.volumeDoAudio = volumeDoAudio;
        this.modelo = modelo;
        this.marca = marca;
    }

    public void aumentarVolume(int novoVolume){
        this.setVolumeDoAudio(novoVolume);
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getTipoDeEntrada() {
        return tipoDeEntrada;
    }


    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }


    public int getVolumeDoAudio() {
        return volumeDoAudio;
    }


    public void setVolumeDoAudio(int volumeDoAudio) {
        this.volumeDoAudio = volumeDoAudio;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


   
}