import java.util.ArrayList;

public class Entrada {
    protected String autor;
    protected String momentoPublicacion;
    protected int cantidadMeGusta;
    protected ArrayList<String> comentarios;

    public Entrada(String autor) {
       this.autor = autor;
       this.momentoPublicacion = "10 segundos";
       cantidadMeGusta = 0;
       comentarios = new ArrayList<>();
    }

    public void meGusta() {
        cantidadMeGusta += 1;
    }


    public String getMomentoPublicacion() {
        return momentoPublicacion;
    }

    public void addComentario(String textoComentario) {
        comentarios.add(textoComentario);
    }

    @Override
    public String toString(){
        return "";
    }
}
