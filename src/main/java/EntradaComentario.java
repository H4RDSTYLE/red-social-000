import java.util.ArrayList;

public class EntradaComentario extends Entrada {
    private ArrayList comentarios;
    public EntradaComentario(String autor){
        super(autor);
        comentarios = new ArrayList<>();
    }

    public void addComentario(String comentario){
        comentarios.add(comentario);
    }

    public String getComentarios(){
        String comentario = "";
        if(!comentarios.isEmpty()) {
            comentario = "Comentarios:\n";
            for (int i = 0; i < comentarios.size(); i++) {
                comentario += comentarios.get(i) + "\n";
            }
        }
        else{
            comentario = "No hay comentarios\n";
        }
        return comentario;
    }

    @Override
    public String toString() {
        String aDevolver = super.toString() + "\n";
        aDevolver += getComentarios();
        return aDevolver;
    }
}
