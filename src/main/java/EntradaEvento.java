public class EntradaEvento extends Entrada {
    String mensaje;

    public EntradaEvento(String autor, String mensaje){
        super(autor);
        this.mensaje = mensaje;
    }

    public String getMensaje(){
        return mensaje;
    }

    @Override
    public String toString(){
        String aDevolver = getMensaje() + "\n" + super.toString();
        return aDevolver;
    }

}