import java.util.ArrayList;
import java.util.List;



public class Lienzo {

    private List<Figura> lienzo = new ArrayList<Figura>();

    public void Dibujar(Figura figura){
        
        this.lienzo.add(figura);

    }

    public List<Figura> getFiguras(){
        return this.lienzo;
    }

    
}
