package Principals;

import org.w3c.dom.ls.LSOutput;

public class Titulo {
    private String titulo;
    private double duracion;
    private int totalDeReproducciones;
    private int cantidadDeMegusta;
    private String clasificacion;
    private String autor;
    private int megustaUsuario;
    private int reproducir;


    // metodo getter
    public String getTitulo(){
        return titulo;
    }
    public double getDuracion(){
        return duracion;
    }
    public int getTotalDeReproducciones(){
        return totalDeReproducciones;
    }
    public int getCantidadDeMegusta(){
        return cantidadDeMegusta;
    }
    public String getClasificacion(){
        return clasificacion;
    }
    public String getAutor(){
        return autor;
    }
    public int getMegustaUsuario(){
        return megustaUsuario;
    }
    public int getReproducir (){
        return reproducir;
    }

    //metodo setter
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setDuracion(double duracion){
        this.duracion=duracion;
    }
    public void setTotalDeReproducciones(int totalDeReproducciones){
        this.totalDeReproducciones=totalDeReproducciones;
    }
    public void setCantidadDeMegusta(int cantidadDeMegusta){
        this.cantidadDeMegusta= cantidadDeMegusta;
    }
    public void  setClasificacion(String clasificacion){
        this.clasificacion=clasificacion;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setMegustaUsuario(int megustaUsuario){
        this.megustaUsuario=megustaUsuario;
    }
    public void setReproducir(int reproducir){
        this.reproducir=reproducir;
    }
    // imprimiendo caracteristicas
    public void mostrarFichaTecnica() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Duracion: " + duracion);
        System.out.println("Total de reproducciones: " + totalDeReproducciones);
        System.out.println("Cantidad de me gusta: " + cantidadDeMegusta);
        System.out.println("Clasificacion: " + clasificacion);
        System.out.printf("Autor: "+ autor);
    }
}
