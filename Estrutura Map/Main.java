//a estrutura de dados Map é uma forma de ordenar os dados em uma lista , mas sendo que cada dado tem
//uma chave(Key) e um valor(Value). Dessa forma fica mais fácil de encontrar e/ou filtrar o dado através da
//sua chave.

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //ao instanciar um objeto da classe Map é necessário passar no parametro que tipo de informação é esperada
        //nesse caso o objeto aluno vai receber duas Strings(K e V respectivamente) e essa instaãncia será do tipo
        //Hash, ou seja, uma matriz que armazena os dados de forma aleatória mas com indices unicos e especificados
        Map<String,String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "38");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "J");

        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());


    }
}
