package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Serie titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }


    public void incluye(Pelicula otraPelicula) {
    }
}
