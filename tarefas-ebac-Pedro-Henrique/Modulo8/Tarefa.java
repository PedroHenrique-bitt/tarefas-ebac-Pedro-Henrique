public class Tarefa {

    private int nota;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    public static void main(String[] args){

        int nota1 = 5;
        int nota2 = 8;
        int nota3 = 7;
        int nota4 = 10;

        int nota6 = nota1 + nota2 + nota3 + nota4;

        int media = nota6 / 4;

        System.out.println("** Media **");
        System.out.println(media);

        boolean isMaior = media > 6;

        System.out.println(isMaior);
    }
}