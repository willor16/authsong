package multimedia;

import Principals.Titulo;

public class Podcasts extends Titulo {
    /*aca ya tenemos los atributos de titulo pero podemos agregar cosas como:
    -tema
    -invitado
    -serie
    */
    private String tema;
    private String invitado;
    private String serie;

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

}
