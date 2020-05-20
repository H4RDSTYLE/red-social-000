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
        EntradaTexto entrada02 = new EntradaTexto("Kim", "Llueve fuera...");
        EntradaFoto entrada03 = new EntradaFoto("Luis", "https://bit.ly/2W1dO09", "Gracias");
        EntradaFoto entrada04 = new EntradaFoto("Cristina", "https://bit.ly/3cY9vtD", "Una foto de mi nevera");
        EntradaEvento entrada05 = new EntradaEvento("Hugo", "Ha seguido a Lucia.");
        EntradaEvento entrada06 = new EntradaEvento("Mulder", "Ha seguido a Scully.");

        muro.addEntrada(entrada01);
        muro.addEntrada(entrada02);
        muro.addEntrada(entrada03);
        muro.addEntrada(entrada04);
        muro.addEntrada(entrada05);
        muro.addEntrada(entrada06);

        System.out.println(muro);
        String resultado = "Usuario: Pepe\nLikes: 0\nHawai!\nEscrito hace 10 segundos.\nNo hay comentarios\n\n\n";
        resultado += "Usuario: Kim\nLikes: 0\nLlueve fuera...\nEscrito hace 10 segundos.\nNo hay comentarios\n\n\n";
        resultado += "Usuario: Luis\nLikes: 0\nUrl: https://bit.ly/2W1dO09\nTitulo: Gracias\nEscrito hace 10 segundos.\nNo hay comentarios\n\n\n";
        resultado += "Usuario: Cristina\nLikes: 0\nUrl: https://bit.ly/3cY9vtD\nTitulo: Una foto de mi nevera\nEscrito hace 10 segundos.\nNo hay comentarios\n\n\n";
        resultado += "Hugo Ha seguido a Lucia.\n" + "Escrito hace 10 segundos.\n\n";
        resultado += "Mulder Ha seguido a Scully.\n" + "Escrito hace 10 segundos.\n\n";
        assertEquals(resultado, muro.toString());
    }

}
