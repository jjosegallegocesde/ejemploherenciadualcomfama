package org.example.modelos;

public abstract class Bebida {

    private Integer referencia;
    private  String nombre;
    private  String marca;
    private  Double porcentajeAlcohol;
    private Integer presentacion;
    private Double costoCompra;
    private Double costoVenta;

    public Bebida() {
    }

    public Bebida(Integer referencia, String nombre, String marca, Double porcentajeAlcohol, Integer presentacion, Double costoCompra, Double costoVenta) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.marca = marca;
        this.porcentajeAlcohol = porcentajeAlcohol;
        this.presentacion = presentacion;
        this.costoCompra = costoCompra;
        this.costoVenta = costoVenta;
    }

    public Integer getReferencia() {
        return referencia;
    }

    public void setReferencia(Integer referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }

    public void setPorcentajeAlcohol(Double porcentajeAlcohol) {
        this.porcentajeAlcohol = porcentajeAlcohol;
    }

    public Integer getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(Integer presentacion) {
        this.presentacion = presentacion;
    }

    public Double getCostoCompra() {
        return costoCompra;
    }

    public void setCostoCompra(Double costoCompra) {
        this.costoCompra = costoCompra;
    }

    public Double getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(Double costoVenta) {
        this.costoVenta = costoVenta;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "referencia=" + referencia +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", porcentajeAlcohol=" + porcentajeAlcohol +
                ", presentacion=" + presentacion +
                ", costoCompra=" + costoCompra +
                ", costoVenta=" + costoVenta +
                '}';
    }

    public abstract Double calcularCostoVenta();
}
