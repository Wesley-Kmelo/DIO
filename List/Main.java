//a classe List permite que sejam criadas listas dinâmicas. Ao contrário das ArraysLists que tem seu
//tamanho definido na hora da sua criação. Essa classe também tem métodos que permitem ver se um item existe
//(contains) e até ver o conteúdo de um índice especifico. As listas permitem que qualquer dado pode ser acessado
//e trabalhado de acordo com a necessidade. Diferente da pilha , onde só podem ser acessados ou o topo da pilha
//ou a base da pilha


package one.digitalinnovation;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //criação de uma instância da classe List, cujo conteúdo serão objetos do tipo Carro. Essa instância
        //será uma lista (pq foi definida pelo método ArrayList) e será chamada listaCarros
        List<Carro> listaCarros = new ArrayList<>();


        listaCarros.add(new Carro("Peugeot"));
        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Volks"));
        listaCarros.add(new Carro("Chevroelrt"));


        //esse método apenas retorna um boolean dizendo se o objeto criado e passado no parâmetro existe
        //na instância criada
        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(listaCarros.contains(new Carro("Fiat")));


        //esse método retorna o índice do objeto passado no parametro , na listaCarros
        System.out.println(listaCarros.indexOf(new Carro("Volks")));
        System.out.println(listaCarros.indexOf(new Carro("Fiat")));
        System.out.println(listaCarros.indexOf(new Carro("Ford")));


        //método remove é autoexplicativo
        System.out.println(listaCarros.remove(2));
        System.out.println(listaCarros);


    }
}
