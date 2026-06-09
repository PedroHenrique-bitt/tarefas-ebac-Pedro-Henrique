import java.sql.Wrapper;

public class Tarefa {

    public static void main(String[] args) {

        int numero = 10;
        System.out.println("Primitivo: " + numero);

        Integer wrapper = Integer.valueOf(numero);
        System.out.println("Wrapper: " + wrapper);

    }

}