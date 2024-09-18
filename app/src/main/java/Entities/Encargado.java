package Entities;

public class Encargado {

    int idEnc,imgIdEnc;
    String nomEnc,corEnc,edEnc,enc;

    public Encargado(int idEnc, int imgIdEnc, String nomEnc, String corEnc, String edEnc, String enc) {
        this.idEnc = idEnc;
        this.imgIdEnc = imgIdEnc;
        this.nomEnc = nomEnc;
        this.corEnc = corEnc;
        this.edEnc = edEnc;
        this.enc = enc;
    }

    public Encargado() {

    }

    public int getIdEnc() {
        return idEnc;
    }

    public void setIdEnc(int idEnc) {
        this.idEnc = idEnc;
    }

    public int getImgIdEnc() {
        return imgIdEnc;
    }

    public void setImgIdEnc(int imgIdEnc) {
        this.imgIdEnc = imgIdEnc;
    }

    public String getNomEnc() {
        return nomEnc;
    }

    public void setNomEnc(String nomEnc) {
        this.nomEnc = nomEnc;
    }

    public String getCorEnc() {
        return corEnc;
    }

    public void setCorEnc(String corEnc) {
        this.corEnc = corEnc;
    }

    public String getEdEnc() {
        return edEnc;
    }

    public void setEdEnc(String edEnc) {
        this.edEnc = edEnc;
    }

    public String getEnc() {
        return enc;
    }

    public void setEnc(String enc) {
        this.enc = enc;
    }
}
