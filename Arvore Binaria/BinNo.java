
//classe responsavel por criar o objeto com atributos e métodos que serão manipulados principalmente pela classe
// ArvoreBinaria. É preciso herdar a classe comparable passando um parametro generic pois essa classe tem o método
//comparableTo.

package one.digitalinnovation;
public class BinNo <T extends Comparable<T>>{   //usando o Generic T(recebe qualquer tipo de dado)


    private T conteudo;             //cria var conteudo do tipo T pra receber qualquer tipo de dado
    private BinNo<T> noEsq;         //chama a própria classe BinNo e cria o objeto noEsq
    private BinNo<T> noDir;

    public BinNo(T conteudo) {      //construtor que vai receber algo do tipo T e vai passar esse algo
        this.conteudo = conteudo;   //para a var conteudo através dessa linha.
        noDir = noEsq = null;       //nessa linha chama os dois objetos criados e atribui o valor 'null' a cada um
    }

    public BinNo() {                //construtor simples
    }

    public T getConteudo() {        //método que vai informar o que tem dentro do objeto conteudo.
        return conteudo;
    }

    public void setConteudo(T conteudo) {  //método que vai passar o que tem dentro do () para o objeto conteudo

        this.conteudo = conteudo;
    }

    public BinNo<T> getNoEsq() {      //auto explicativo. Por ser get retorna o que tem dentro do objeto.

        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) {    //Por ser set uso o que for escrito no lugar de 'noEsq' e passo pro objeto
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    @Override
    public String toString() {            //o que vai sair no sysout quando for invocado.
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
