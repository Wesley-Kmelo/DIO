//esta classe contém os atributos e construtores necessários que vão ser utilizados na classe Main
//alguns dos métodos aqui tambem usam métodos de coleções de classes como a Objects que fornece métodos
//como o getclass.

package one.digitalinnovation;

import java.util.Objects;

public class Carro {

    //criação do atributo
    String marca;

    //criação do construtor...Quando essa classe for instanciada, ela vai exigir que se passe um
    //atributo do tipo String que vai ser atribuido á variavel marca
    public Carro(String marca) {
        this.marca = marca;
    }

    //criação dos getters e setters. Sempre devem ser feitos
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    @Override
    public boolean equals(Object o) {                                   //criado um método equals do tipo boolean
        if (o == this) return true;                                     //que vai receber um objeto qualquer. Se esse
        if (o == null || getClass() != o.getClass()) return false;      //objeto for igual ao objeto que tá no atributo
        Carro carro = (Carro) o;                                        //marca, então o método retorna true e executa o
        return Objects.equals(marca, carro.marca);                      //resto do método. Senão já retorna falso e abandona
    }                                                                   //o método. No caso de executar o resto do método
                                                                        //se o valor do objeto passado for igual a null
                                                                        //e o valor hashcode da classe obtido por meio do
                                                                        //do método getclass for diferente do hashcode do
                                                                        //objeto passado, aí retorna falso. Se verdadeiro,
                                                                        //abandona o método retornando true. Se nenhum dos ifs
                                                                        //retornar o esperado então através da
                                                                        //recursividade cria um obj carro e chama a classe
                                                                        //Objects com o método equals retornando se a comparação
                                                                        //entre essa instancia (carro) e o atributo (marca)
                                                                        //são verdadeiros.

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

    @Override
    public int hashCode() {                                             //aqui simplesmente o método retorna um valor
        return Objects.hash(marca);                                     //numérico atribuido ao atributo passado.Esse valor
                                                                        //é unico.

    }
}
