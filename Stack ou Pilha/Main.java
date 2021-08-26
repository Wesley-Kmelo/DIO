//a classe Stack do pacote java.util já tem vários métodos prontos para serem usados. Alguns usados
//abaixo são mais comumente usados em estruturas de dados desse tipo. As stacks são listas de dados
//encadeadas simples cujo acesso se dá pelo topo da pilha (ultimo dado inserido). Para se trabalhar
//com a base da pilha (primeiro dado inserido) é preciso retirar cada dado de cima da pilha.

package one.digitalinnovation;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    //criação de uma instância da classe Stack, que será um objeto do tipo carro. Por usar a classe stack
    //essa instância será um tipo de lista encadeada simples.
        Stack<Carro> stackCarros = new Stack<>();


        stackCarros.push(new Carro("Renault"));                 //método que já existe na classe stack e que
        stackCarros.push(new Carro("Fiat"));                    //adiciona o dado em cima do dado anterior.
        stackCarros.push(new Carro("Honda"));                   //fazendo uma pilha onde o 1 dado é a base e
        stackCarros.push(new Carro("Volks"));                   //o ultimo dado é o topo da pilha.

    //saída de dados da pilha instanciada
        System.out.println(stackCarros);

    //método pop exibe o dado que tá no topo da pilha e ao mesmo tempo retira esse dado da pilha
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

    //o método peek exibe o dado que tá no topo da pilha MAS NÃO RETIRA esse dado da pilha.
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

    }
}
