import Interfaces.InterfaceReproductor;
import Log.LogLike;
import Log.Reproductor;
import Principals.Titulo;
import multimedia.Podcasts;
import multimedia.Songs;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Titulo titulo = new Titulo();
        Podcasts alanPodcasts=new Podcasts();
        Songs ofMonstersAndManSong = new Songs();
        LogLike loglike = new LogLike();
        Reproductor reproductor = new Reproductor();
        //metodo para ingresar valores con el teclado
        Scanner teclado = new Scanner(System.in);
        ofMonstersAndManSong.setTitulo("Dirty Paws");
        ofMonstersAndManSong.setCantidadDeMegusta(900);
        ofMonstersAndManSong.setDuracion(4.38);
        ofMonstersAndManSong.setTotalDeReproducciones(140);
        ofMonstersAndManSong.setClasificacion("Indie Folk, Indie Pop");
        ofMonstersAndManSong.setAutor("Of Monsters and Men");
        System.out.println("total de me gusta actual: " + ofMonstersAndManSong.getCantidadDeMegusta());
        System.out.println("¿te gsuta: " + ofMonstersAndManSong.getTitulo() + "?");
        System.out.println("1. si");
        System.out.println("2. no");
        System.out.println(ofMonstersAndManSong.getReproducir());
        System.out.println();
        ofMonstersAndManSong.setMegustaUsuario(teclado.nextInt());
        loglike.ingresarLike(ofMonstersAndManSong.getMegustaUsuario(), ofMonstersAndManSong.getTitulo());
        System.out.println("ahora el total de me gusta es: " + ofMonstersAndManSong.getCantidadDeMegusta());
        loglike.calificar(ofMonstersAndManSong);
        //ofMonstersAndManSong.setCantidadDeMegusta();
        ofMonstersAndManSong.mostrarFichaTecnica();
        System.out.println("te gustaria abrir el reproductor?");
        ofMonstersAndManSong.setReproducir(teclado.nextInt());
        reproductor.funcionReproducir(ofMonstersAndManSong);




    }




}