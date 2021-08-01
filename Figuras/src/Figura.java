public abstract class Figura {

    private String colorBorde = "Negro";
    private String colorFondo = "Blanco";
    // private Rectangulo rectangulo;
    // private Boolean estaSeleccionado = false;

    public Figura() {        
             
    }

    // public void Seleccionar(Puntero puntero, Rectangulo rectangulo){

    //     if(!(puntero.x>=rectangulo.left && puntero.x<=rectangulo.right &&
	// 	    puntero.y>=rectangulo.top && puntero.y<=rectangulo.bottom)) {

    //             System.out.println("Figura no encontrada");
    //           }

    //     this.estaSeleccionado = true;
    //     System.out.println("Figura seleccionada");
    // }



    public String getColorBorde() {

         return  "El borde es color " + colorBorde;
    }


    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
        System.out.println("El color del borde ha cambiado a " + colorBorde);
    }


    public String getColorFondo() {
        return "El fondo es color " + colorFondo;
    }


    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
        System.out.println("El color del fondo ha cambiado a " + colorFondo);
    }

    // public Rectangulo getRectangulo() {
    //     return rectangulo;
    // }



    // public void setRectangulo(Rectangulo rectangulo) {
    //     this.rectangulo = rectangulo;
    // }

}