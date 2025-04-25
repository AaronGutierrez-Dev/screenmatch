package com.aluracursos.screenmatch.modelos;

public class Pelicula {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeEvaluaciones;
    private int totalEvaluaciones;

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es " + nombre);
        System.out.println("Su fecha de lanzamientoe s: " + fechaDeLanzamiento);
        System.out.println("Y su duración es de: " + duracionEnMinutos);
    }

    public void evalua(double nota){
        sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeEvaluaciones/totalEvaluaciones;
    }

}
