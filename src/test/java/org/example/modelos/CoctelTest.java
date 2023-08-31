package org.example.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CoctelTest {

    //Para una unitaria debo crear ina instancia de la clase que voy a probar
    private Coctel coctel;

    //preparo el ambiente para CADA UNA DE LAS PRUEBAS
    @BeforeEach
    public void configurarPruebas(){
        this.coctel=new Coctel();
    }

    //pruebas
    @Test
    public void calcularDiferenciaFechasCorrectamente(){
        //1. Preparar
        this.coctel.setFechaPreparacion(LocalDate.of(2023,8,20));
        this.coctel.setFechaVenta(LocalDate.of(2023,8,22));

        //2. Probar/ejecutar
        Long resultado=this.coctel.calcularDiferenciaFechas();

        //3. Verificar
        Assertions.assertEquals(2,resultado);

    }

    @Test
    public void calcularDiferenciaFechasIncorrectamente(){
        //1. Preparar
        this.coctel.setFechaPreparacion(null);
        this.coctel.setFechaVenta(null);

        //2. Probar/ejecutar
        Long resultado=this.coctel.calcularDiferenciaFechas();

        //3. Verificar
        Assertions.assertEquals(3,resultado);

    }


}