//a estrutura de dados queue ou fila é parecida com a stack(pilha). A diferença é que os dados ficam
// em uma fila e o primeiro dado da fila é o primeiro dado que foi inserido. Tambem tem métodos próprios
//alguns deles escritos abaixo, mas com funcionamento parecidos com os métodos da classe stack

package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

    //criação de uma instância da classe queue e essa instância será um objeto do tipo carro e vai ser uma
    //nova lista linkada
        Queue<Carro> filaCarro = new LinkedList<>();


    //usando o método add da classe queue e passando como parâmetro uma instância da classe carro e que seu
    //construtor exige que seja passada uma string qualquer
        filaCarro.add(new Carro("Renault"));
        filaCarro.add(new Carro("Fiat"));
        filaCarro.add(new Carro("Volks"));
        filaCarro.add(new Carro("Chevy"));


    //imprimindo o objeto filaCarro, com tudo o que tem dentro dele.
        System.out.println(filaCarro);

    //através do método offer retorna se conseguiu adicionar um novo dado na filaCarro e depois imprime o obj.
        System.out.println(filaCarro.offer(new Carro("Peugeot")));
        System.out.println(filaCarro);

    //imprime o primeiro da fila que no caso é o primeiro dado inserido
        System.out.println(filaCarro.peek());
        System.out.println(filaCarro);

    //imprime o primeiro dado da fila MAS RETIRA ESSE DADO da fila também
        System.out.println(filaCarro.poll());
        System.out.println(filaCarro);

    }
}
