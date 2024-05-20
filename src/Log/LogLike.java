package Log;

import multimedia.Songs;

public class LogLike {
    public void calificar(Interfaces.LogLike loglike){
            if(loglike.setCalificacion()==1){
                System.out.println("no muchos escuchan esto, pero ser de los primeros en encontrar un futuro exito");
            }else if(loglike.setCalificacion()==2){
                System.out.println("es un top regional ");
            } else if (loglike.setCalificacion()==3) {
                System.out.println("es un top global, tienes buenos gustos");
            }
    }

    public void ingresarLike(int addLike, String nombreValor){
        Songs songVariable = new Songs();
        int temporalLogLogic= 0;
        if (addLike == 1){
            temporalLogLogic = songVariable.getCantidadDeMegusta();
            songVariable.setCantidadDeMegusta(temporalLogLogic+1);
            System.out.println("cantidad de megusta; "+songVariable.getCantidadDeMegusta() +" add like"+addLike);
        } else{
            System.out.println("lamentamos escuchar eso, hechale un vistazo a su informacion si no te convence pasala");//aca hay oportunidad de mejora se puede poner codigo para agregar feedback al artista por ejemplo... decir por que no te gusta
        }
    }

}
