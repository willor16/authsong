package multimedia;

import Interfaces.InterfaceReproductor;
import Interfaces.LogLike;
import Principals.Titulo;

public class Songs extends Titulo implements LogLike, InterfaceReproductor {
    /*aca ya tenemos los atributos de titulo pero podemos agregar cosas como:
    -genero musical
    -album
    -banda
    */
    private String generoMusical;
    private String album;
    private String banda;
    private int totalLikes;

    //getters
    public String getGeneroMusical(){
        return generoMusical;
    }
    public String getAlbum(){
        return album;
    }
    public String getBanda(){
        return banda;
    }

    //setters
    public void setGeneroMusical(String generoMusical) {
        this.generoMusical=generoMusical;
    }
    public void setAlbum(String album){
        this.album=album;
    }
    public void setBanda (String banda){
        this.banda=banda;
    }

    @Override
    public int setCalificacion(){
        //para practicar el ingles xd

        if (getCantidadDeMegusta() >= 200){
            return 3;
        }else if (getMegustaUsuario() >=100){
            return 2;
        }else {
            return 1;
        }
    }
    @Override
    public int setreproducirAhora(){
        if (getReproducir()==1){
            return  1;
        }else if (getReproducir() !=2){
            return 2;
        }
        else{
            return 2;
        }
    }

}


