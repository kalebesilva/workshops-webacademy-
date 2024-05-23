public class FoneDeOuvidoSemFio extends FoneDeOuvidoComCabo {
    
    private String bluetooth;
    private String baseDeCarregamento;



    
    public FoneDeOuvidoSemFio(String bluetooth, String baseDeCarregamento) {
        this.bluetooth = bluetooth;
        this.baseDeCarregamento = baseDeCarregamento;
    }
    public FoneDeOuvidoSemFio(String cor, String tipoDeEntrada, int volumeDoAudio, String modelo, String marca,
            String bluetooth, String baseDeCarregamento) {
        super(cor, tipoDeEntrada, volumeDoAudio, modelo, marca);
        this.bluetooth = bluetooth;
        this.baseDeCarregamento = baseDeCarregamento;
    }

    
    public String getBluetooth() {
        return bluetooth;
    }
    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }
    public String getBaseDeCarregamento() {
        return baseDeCarregamento;
    }
    public void setBaseDeCarregamento(String baseDeCarregamento) {
        this.baseDeCarregamento = baseDeCarregamento;
    }

    
}
