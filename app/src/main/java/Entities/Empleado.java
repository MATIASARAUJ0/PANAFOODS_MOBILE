package Entities;

import java.io.Serializable;

public class Empleado implements Serializable {

    private int idFoto2;
    private String nom, ape, dni, mail, fecNac, cel, cont;

    public Empleado(int idFoto2, String nom, String ape, String dni, String mail, String fecNac, String cel, String cont) {
        this.idFoto2 = idFoto2;
        this.nom = nom;
        this.ape = ape;
        this.dni = dni;
        this.mail = mail;
        this.fecNac = fecNac;
        this.cel = cel;
        this.cont = cont;
    }

    public Empleado() {
    }

    public int getIdFoto2() {
        return idFoto2;
    }

    public void setIdFoto2(int idFoto) {
        this.idFoto2 = idFoto;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFecNac() {
        return fecNac;
    }

    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }
}
