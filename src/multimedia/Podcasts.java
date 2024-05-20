package multimedia;

import Interfaces.LogLike;
import Principals.Titulo;

public class Podcasts extends Titulo implements LogLike {
    /*aca ya tenemos los atributos de titulo pero podemos agregar cosas como:
    -tema
    -invitado
    -serie
    */
    private String tema;
    private String invitado;
    private String serie;
    private int totalLikes;
    //metodo getter
    public String getTema(){
        return tema;
    }
    public String getSerie(){
        return serie;
    }
    public String getInvitado(){
        return invitado;
    }
    //setters
    public void setTema(String tema){
        this.tema=tema;
    }
    public void setSerie(String serie){
        this.serie=serie;
    }
    public void setInvitado(String invitado){
        this.invitado=invitado;
    }

    @Override
    public int setCalificacion(){
        //para practicar el ingles xd

        if (totalLikes >= 200){
            return 3;
        }else if (totalLikes >=100){
            return 2;
        }else {
            return 1;
        }
    }

}
