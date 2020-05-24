public class EntradaEvento extends Entrada {
    String mensaje;

    public EntradaEvento(String autor, String mensaje){
        super(autor);
        this.mensaje = mensaje;
    }

    public String getMensaje(){
        return mensaje;
    }

    public void mostrarDetallesPorPantalla(){
        System.out.print(toString());
    }

    @Override
    public String toString(){
        String aDevolver = getMensaje() + "\n" + super.toString() + "\n";
        return aDevolver;
    }

}