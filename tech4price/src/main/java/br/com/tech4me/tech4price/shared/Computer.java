package br.com.tech4me.tech4price.shared;

public class Computer {
    
    private String id;
    private String sistemaOperacional;
    private String marca;
    private String processador;
    private String placaDeVideo;
    private String ram;
    private String placaMae;
    private String cooler;
    private String armazenamento;
    private String fonte;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getProcessador() {
        return processador;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }
    public String getPlacaDeVideo() {
        return placaDeVideo;
    }
    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getPlacaMae() {
        return placaMae;
    }
    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }
    public String getCooler() {
        return cooler;
    }
    public void setCooler(String cooler) {
        this.cooler = cooler;
    }
    public String getArmazenamento() {
        return armazenamento;
    }
    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }
    public String getFonte() {
        return fonte;
    }
    public void setFonte(String fonte) {
        this.fonte = fonte;
    }
}
