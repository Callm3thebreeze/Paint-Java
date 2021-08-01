import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("SELECCIONA UNA FIGURA");

        Figura cora = new Corazon();


        System.out.println(cora.getColorBorde());

        System.out.println(cora.getColorFondo());

        cora.setColorBorde("Rojo");

        System.out.println(cora.getColorBorde());

        

        


    }
}
