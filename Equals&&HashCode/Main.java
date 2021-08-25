package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //criação de uma lista chamada ListadeCarros que vai receber objetos do tipo carro(classe criada antes)
        List<Carro> ListaDeCarros = new ArrayList<>();

        //AO instanciar um objeto da classe List, se recebe vários métodos e um deles é o add, que adiciona os
        //dados na lista na sequência em que são criados.No caso o objeto criado é uma instância da classe carro
        //cujo construtor exige que se passe um parametro String.
        ListaDeCarros.add(new Carro("Renault"));
        ListaDeCarros.add(new Carro("Ford"));
        ListaDeCarros.add(new Carro("Volks"));

        //Nessa linha a saída verifica se a listaDeCarros contem um objeto igual a uma nova instância de carro
        //que tá sendo criado na hora.
        System.out.println(ListaDeCarros.contains(new Carro("Honda")));
        System.out.println(ListaDeCarros.contains(new Carro("Renault")));

        //aqui a saída verifica se a ListaDeCarros é igual ao hashcode(valor numérico unico gerado na hora que o método
        // hashcode é chamado) da instância criada.
        System.out.println(ListaDeCarros.equals(new Carro("Ford").hashCode()));

    }
}
