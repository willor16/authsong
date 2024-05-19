package Principals;

public class Titulo {
    private String titulo;
    private double duracion;
    private int totalDeReproducciones;
    private int cantidadDeMegusta;
    private String clasificacion;
    private String autor;

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
}
