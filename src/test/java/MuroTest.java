import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase de test para el muro de la red social
 *
 *  @author DAM
 *  @version 1.0
 */
public class MuroTest {
    @Test
    public void test01() {

        Muro muro = new Muro();

        EntradaTexto entrada01 = new EntradaTexto("Pepe", "Hawai!");
        EntradaFoto entrada02 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
        EntradaTexto entrada03 = new EntradaTexto("Kim", "Llueve fuera...");
        EntradaFoto entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");

        muro.addEntradaTexto(entrada01);
        muro.addEntradaFoto(entrada02);
        muro.addEntradaTexto(entrada03);
        muro.addEntradaFoto(entrada04);

        System.out.println(muro);
        String resultado = "Usuario: Pepe\nLikes: 0\nHawai!\nEscrito hace 10 segundos\nNo hay comentarios\n\n\n";
        resultado += "Usuario: Kim\nLikes: 0\nLlueve fuera...\nEscrito hace 10 segundos\nNo hay comentarios\n\n\n";
        resultado += "Usuario: Luis\nLikes: 0\nUrl: https://bit.ly/2W1dO09\nTitulo: Gracias\nEscrito hace 10 segundos\nNo hay comentarios\n\n\n";
        resultado += "Usuario: Cristina\nLikes: 0\nUrl: https://bit.ly/3cY9vtD\nTitulo: Una foto de mi nevera\nEscrito hace 10 segundos\nNo hay comentarios\n\n\n";

        assertEquals(resultado, muro.toString());
    }

    @Test
    public void test02() {
        EntradaTexto entradaTexto = new EntradaTexto("Hugo", "Hola bro.");
        assertEquals("Autor: Hugo\nMensaje: Hola bro.", entradaTexto.getAutorYMensaje());
    }

}
