package Entities;

import java.io.Serializable;

public class Pedido implements Serializable {

    private int idFoto;
    private String cli, prod, fecEnt, lugEnt, horEnt, ruc, cant;

    public Pedido(int idFoto, String cli, String prod, String fecEnt, String lugEnt, String horEnt, String ruc, String cant) {
        this.idFoto = idFoto;
        this.cli = cli;
        this.prod = prod;
        this.fecEnt = fecEnt;
        this.lugEnt = lugEnt;
        this.horEnt = horEnt;
        this.ruc = ruc;
        this.cant = cant;
    }

    public Pedido() {
    }

    public String getCli() {
        return cli;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public void setCli(String cli) {
        this.cli = cli;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public String getFecEnt() {
        return fecEnt;
    }

    public void setFecEnt(String fecEnt) {
        this.fecEnt = fecEnt;
    }

    public String getLugEnt() {
        return lugEnt;
    }

    public void setLugEnt(String lugEnt) {
        this.lugEnt = lugEnt;
    }

    public String getHorEnt() {
        return horEnt;
    }

    public void setHorEnt(String horEnt) {
        this.horEnt = horEnt;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }
}
