import java.util.ArrayList;

public class Entrada {
    private String autor;
    private String momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;

    public Entrada(String autor) {
       this.autor = autor;
       this.momentoPublicacion = "10 segundos.";
       cantidadMeGusta = 0;
       comentarios = new ArrayList<>();
    }

    public void meGusta() {
        cantidadMeGusta += 1;
    }

    public String getAutor(){
        return autor;
    }

    public int getCantidadMeGusta(){
        return cantidadMeGusta;
    }

    public String getMomentoPublicacion() {
        return momentoPublicacion;
    }

    public void addComentario(String textoComentario) {
        comentarios.add(textoComentario);
    }

    @Override
    public String toString(){
        String aDevolver = "";
        aDevolver += "Usuario: " + getAutor() + "\n";
        aDevolver += "Likes: " + getCantidadMeGusta() + "\n";
        aDevolver += "Escrito hace " + getMomentoPublicacion();
        return aDevolver;
    }
}
