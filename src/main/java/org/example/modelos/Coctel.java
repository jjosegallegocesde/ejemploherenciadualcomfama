package org.example.modelos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Coctel extends Bebida {

    private Boolean contieneAlcohol;
    private Boolean contieneJugo;
    private Integer cantidadVendida;

    private LocalDate fechaPreparacion;

    private LocalDate fechaVenta;


    public Coctel() {
    }

    public Coctel(Integer referencia, String nombre, String marca, Double porcentajeAlcohol, Integer presentacion, Double costoCompra, Double costoVenta, Boolean contieneAlcohol, Boolean contieneJugo, Integer cantidadVendida, LocalDate fechaPreparacion, LocalDate fechaVenta) {
        super(referencia, nombre, marca, porcentajeAlcohol, presentacion, costoCompra, costoVenta);
        this.contieneAlcohol = contieneAlcohol;
        this.contieneJugo = contieneJugo;
        this.cantidadVendida = cantidadVendida;
        this.fechaPreparacion = fechaPreparacion;
        this.fechaVenta = fechaVenta;
    }

    public LocalDate getFechaPreparacion() {
        return fechaPreparacion;
    }

    public void setFechaPreparacion(LocalDate fechaPreparacion) {
        this.fechaPreparacion = fechaPreparacion;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Boolean getContieneAlcohol() {
        return contieneAlcohol;
    }

    public void setContieneAlcohol(Boolean contieneAlcohol) {
        this.contieneAlcohol = contieneAlcohol;
    }

    public Boolean getContieneJugo() {
        return contieneJugo;
    }

    public void setContieneJugo(Boolean contieneJugo) {
        this.contieneJugo = contieneJugo;
    }

    public Integer getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(Integer cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    @Override
    public String toString() {
        return "Coctel{" +
                "contieneAlcohol=" + contieneAlcohol +
                ", contieneJugo=" + contieneJugo +
                ", cantidadVendida=" + cantidadVendida +
                ", fechaPreparacion=" + fechaPreparacion +
                ", fechaVenta=" + fechaVenta +
                '}';
    }

    @Override
    public Double calcularCostoVenta() {

        Double precioVenta=null;

        //pasos logicos para calcular el costo venta de un coctel
        if(this.contieneJugo==true){
            //verificamos dias de preparado
            Long diasFermentado=this.calcularDiferenciaFechas();
            if(diasFermentado==1){
                precioVenta=this.getCostoCompra()+15000;
            }else if(diasFermentado==2){
                precioVenta=(this.getCostoCompra()+15000)*0.8;
            }else{
                precioVenta=0.0;
                System.out.println("No se vende este producto");
            }
        }else{
            precioVenta=this.getCostoCompra()+10000;
        }

        return precioVenta;

    }

    public Long calcularDiferenciaFechas(){
        //tomar 2 localdate y obtener la duferencia en dias entre ellos
        return ChronoUnit.DAYS.between(this.fechaPreparacion,this.fechaVenta);

    }

}
