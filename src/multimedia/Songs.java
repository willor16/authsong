package multimedia;

import Principals.Titulo;

public class Songs extends Titulo {
    /*aca ya tenemos los atributos de titulo pero podemos agregar cosas como:
    -genero musical
    -album
    -banda
    */
    private String generoMusical;
    private String album;
    private String banda;

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
}
