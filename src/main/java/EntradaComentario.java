import java.util.ArrayList;

public class EntradaComentario extends Entrada {
    private ArrayList<String> comentarios;
    public EntradaComentario(String autor){
        super(autor);
        comentarios = new ArrayList<String>();
    }

    public void addComentario(String comentario){
        comentarios.add(comentario);
    }

    public ArrayList<String> getComentarios(){
        return comentarios;
    }
}
