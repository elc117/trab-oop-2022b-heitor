package com.example.trabalhobio;

public class SerVivo {
    private String reino;
    private String filo;
    private String classe;
    private String ordem;
    private String familia;
    private String genero;
    private String especie;

    public SerVivo(String reino, String filo, String classe, String ordem, String familia, String genero, String especie) {
        this.reino = reino;
        this.filo = filo;
        this.classe = classe;
        this.ordem = ordem;
        this.familia = familia;
        this.genero = genero;
        this.especie = especie;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getFilo() {
        return filo;
    }

    public void setFilo(String filo) {
        this.filo = filo;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "{" +
                " reino='" + getReino() + "'" +
                ", filo='" + getFilo() + "'" +
                ", classe='" + getClasse() + "'" +
                ", ordem='" + getOrdem() + "'" +
                ", familia=" + getFamilia() + "'" +
                ", genero='" + getGenero() + "'" +
                ", especie='" + getEspecie() + "'" +
                "}";
    }
}

