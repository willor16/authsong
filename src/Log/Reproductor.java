package Log;

import Interfaces.InterfaceReproductor;
import Principals.Titulo;
import com.sun.tools.javac.Main;
import multimedia.Songs;


import java.util.Scanner;

public class Reproductor {
    public void funcionReproducir(InterfaceReproductor interfaceReproductor, String nombre ) {

        if(interfaceReproductor.setreproducirAhora()==1){
            System.out.println("reproduciendo"+nombre);
            System.out.println("desea reproducir de nuevo? 1.si 2.no");
        }else{
            System.out.println("probablemente te interesaria reproducirla despues, no la peirdas de vista");
        }
    }
}