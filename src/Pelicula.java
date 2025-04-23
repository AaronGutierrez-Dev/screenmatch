public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeEvaluaciones;

    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es " + nombre);
        System.out.println("Su fecha de lanzamientoe s: " + fechaDeLanzamiento);
        System.out.println("Y su duración es de: " + duracionEnMinutos);
    }

    void evalua(double nota){
        sumaDeEvaluaciones += nota;
    }

    double calculaMedia(){
        return 
    }

}
