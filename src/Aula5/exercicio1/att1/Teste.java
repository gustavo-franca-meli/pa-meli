package Aula5.exercicio1.att1;

public class Teste {

    public static void main(String[] args) {
        var pessoa1 = new Pessoa("Pedro","111");
        var pessoa2 = new Pessoa("Pedro1","111");
        var pessoa3 = new Pessoa("Pedro2","111");
        var pessoa4 = new Pessoa("Pedro3","111");
        var pessoa5 = new Pessoa("Pedro4","111");
        var pessoa6 = new Pessoa("Pedro5","111");

        Pessoa[] array = new Pessoa[6];
        array[0] = pessoa6;
        array[1] = pessoa5;
        array[2] = pessoa4;
        array[3] = pessoa3;
        array[4] = pessoa2;
        array[5] = pessoa1;

        Pessoa[] arraySorted =  SortUtil.sort(array);

        for (Pessoa pessoa: arraySorted) {
            System.out.println(pessoa.getNome());
        }



    }
}
