package Entities;

public class Colaborador {

    int id,imgId;
    String nom,cel,cor,pro;

    public Colaborador(int id, int imgId, String nom, String cel, String cor, String pro) {
        this.id = id;
        this.imgId = imgId;
        this.nom = nom;
        this.cel = cel;
        this.cor = cor;
        this.pro = pro;
    }

    public Colaborador() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }
}
