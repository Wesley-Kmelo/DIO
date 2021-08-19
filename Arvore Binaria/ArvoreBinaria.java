//classe responsavel por tratar os payloads(conteudo) da árvore. Na assinatura dessa classe é passado um generic
//e tambem herda da classe Comparable, igual a classe BinNo.Nessa classe tem os métodos para inserir , apagar e imprimir
//os payloads .


package one.digitalinnovation;
public class ArvoreBinaria <T extends Comparable<T>>{

    //declaração de um atributo privado(só pode ser usado nessa classe) e será
    // do tipo BinNo(classe criada previamente) e esse atributo vai se chamar raiz
        private BinNo<T> raiz;


    //esse construtor quer dizer que toda vez que uma instância dessa classe 'ArvoreBinaria' for criada então
    //o valor do atributo raiz será null.
        public ArvoreBinaria() {
           this.raiz = null;
         }

    //para criar o método inserir, deve-se criar um método privado que vai receber dois objetos do tipo BinNo sendo
    //que um desses objetos deve ser um parametro de outra função pública com mesmo nome(sobrecarga) e essa função
    // pública vai chamar o método privado.

        public void inserir(T conteudo){
            BinNo<T> novoNo = new BinNo<>(conteudo);
            raiz = inserir(raiz, novoNo);
        }

    //explicação do método INSERIR abaixo. É um método de sobrecarga do método acima e que retorna um objeto do tipo
    //BinNo de qualquer tipo(Generics T). E na sua assinatura tá sendo exigido que se passem dois parâmetros do tipo
    //objeto BinNo. Acontece que esses dois parametros serão obtidos do método acima na hora que o método inserir com
    //parametros é chamado ao se atribuir o valor da variavel raiz.

        private BinNo<T> inserir (BinNo<T> atual, BinNo<T> novoNo){
            if (atual == null){                                                       //se a var atual(que é a var raiz
                return novoNo;                                                        //criada no inserir acima) for null
            }else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){       //então retorna o valor de novoNo que
                atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));                    //também foi criado no INSERIR acima.
            }else{                                                                    //senão se a comparação do conteúdo de
                atual.setNoDir(inserir(atual.getNoDir(), novoNo));                    //novoNO com o conteudo de atual for
            }                                                                         //menor que 0, então o método de atual
            return atual;                                                             //setNoEsq é chamado e é passado como
        }                                                                             //parametro a propria função INSERIR
                                                                                      //com os parametros que são auto
                                                                                      //explicativos. E fica nisso até chegar
                                                                                      //no null que nesse caso seria a folha
                                                                                      //ou último nó.


    //MÉTODOS PARA EXIBIÇÃO DE CONTEUDO DE FORMA ORGANIZADA

        //EXIBIÇÃO DO MONOR NÓ PARA O MAIOR NÓ
        public void exibirInOrdem(){                                                 //o método exibirINOrdem printa uma frase
            System.out.print("\n Exibição InOrdem \n");                                //e depois chama o metodo privado que tem
            exibirInOrdem(this.raiz);                                                //o mesmo nome mas assinatura diferente e
        }                                                                            //passa o valor da var raiz como parametro

        private void exibirInOrdem(BinNo<T> atual) {                                 //aqui o método recebe o valor da var raiz
            if (atual != null){                                                      //e atribui ela para o objeto atual, que é
                exibirInOrdem(atual.getNoEsq());                                     //instanciado da classe BinNo e recebe todos
                System.out.print(atual.getConteudo() + ", ");                      //métodos e atributos. Se o conteudo de atual
                exibirInOrdem(atual.getNoDir());                                     //for diferente de null, então chama o próprio
            }                                                                        //método passando no valor de atual o conteudo
        }                                                                            //de atual a esquerda. Imprime esse valor e
                                                                                     //chama a função novamente, agora passando no
                                                                                     //atual o conteudo de atual a direita. E vai
                                                                                     //até encontrar o null.

        //EXIBIÇÃO DOS NÓS DA ESQ (FILHOS E PAIS NESSA ORDEM), DEPOIS NÓS DA DIR (FILHOS E PAIS) E DEPOIS NÓ RAIZ
        public void exibirPosOrdem(){
            System.out.print("\n Exibição PosOrdem \n");
            exibirPosOrdem(this.raiz);
        }

        private void exibirPosOrdem(BinNo<T> atual) {
            if (atual != null){
                exibirPosOrdem(atual.getNoEsq());
                exibirPosOrdem(atual.getNoDir());
                System.out.print(atual.getConteudo() + ", ");
            }
        }

        //EXIBIÇÃO DOS NÓ RAIZ , SEGUIDO DOS NÓS DA ESQ (PAIS E FILHOS NESSA ORDEM), DEPOIS NÓS DA DIR (PAIS E FILHOS)
        public void exibirPreOrdem(){
            System.out.print("\n Exibição PreOrdem \n");
            exibirPreOrdem(this.raiz);
        }

         private void exibirPreOrdem(BinNo<T> atual) {                             //Aqui, se o atual(valor de raiz passado
             if (atual != null){                                                   //como parametro acima) for nulo, acontece
                 System.out.print(atual.getConteudo() + ", ");                     //nada. Senão, já imprime direto e
                 exibirPreOrdem(atual.getNoEsq());                                 //ja se chama passando o nó da esq como
                 exibirPreOrdem(atual.getNoDir());                                 //atual. E vai imprimindo até encontrar
            }                                                                      //o null, ocasião que agora se chama
        }                                                                          //passando o no da direita como parametro.
                                                                                   //quando achar o null, tambem ai para tudo



    //MÉTODO PARA REMOÇÃO DE NÓS
    //esse método irá percorrer a árvore detectando se o nó tem a referencia -1(esq) ou 1 (dir)
    //essa detecção é feita atraves do método compareTo que verifica se o conteúdo do nó é menor ou maior que o
    //conteudo de referência

        //através de um bloco Try/catch, o código vai executar sempre o código do TRY. Se acontecer um erro que seja esperado
        //aí o bloco CATCH é acionado.
        //o método remover não retorna nenhum valor(void), mas recebe um valor de entrada que no caso será um generics que
        //se chamará conteudo

        private void remover(T conteudo){

            //o try começa criando as variáveis de controle para navegar entre os nós. Cada variável é um objeto da classe
            //BinNo que vai receber um generics de qualquer tipo(T) e serão inicializadas da seguinte forma

            try{
                BinNo<T> atual = this.raiz;
                BinNo<T> pai = null;
                BinNo<T> filho = null;
                BinNo<T> temp = null;

            //depois da declaração das variáveis, é criado um laço dizendo que enquanto a variável atual for diferente de null
            //e que o conteudo de atual for diferente do valor da variavel conteudo(passada no método), o objeto pai terá o
            //conteudo do objeto atual. Cumprida essa condição, é verificado se a comparação entre o valor do objeto conteudo
            //e o valor do objeto atual é menor que 0. Se for, o objeto 'atual' receberá o valor do nó a esq. Senao, do nó a dir.

            //esse método while basicamente é o algoritmo que vai fazer a procura do conteudo que será apagado.
            //
                while(atual != null && !atual.getConteudo().equals(conteudo)){
                    pai = atual;
                    if(conteudo.compareTo(atual.getConteudo()) < 0){
                        atual = atual.getNoEsq();
                    }else{
                        atual = atual.getNoDir();
                    }
                }

            //se a condição do laço acima não for cumprida , é verificado se o 'atual' está com o valor original, que é atribuida
            //por this.raiz, que é declarada com o valor null.

                if(atual == null){
                    System.out.println("Mensagem do bloco Try. Nó não encontrado.");
                }
            //agora o algoritmo abaixo é para realocar os conteudos depois que o valor passado no método foi encontrado pelo
            //while.Dessa forma após realocar os dados menos o dado passado, o dado em si 'desaparece do sistema'. Basicamente
            //se eu tiver uma arvore com raiz 2 e filhos 1,3,5 e netos 4,6,8 e passar o 3 no parametro desse método, o algoritmo
            //abaixo vai rearranjar os numeros restantes menos o 3 , sendo assim o 3 fica sem nehuma referencia apontando pra ele.

                    if (pai == null){
                        if (atual.getNoDir() == null){
                            this.raiz = atual.getNoEsq();
                        }else if (atual.getNoEsq() == null){
                            this.raiz = atual.getNoDir();
                        }else {
                            for (                                                  //explicação desse for abaixo
                                    temp = atual, filho = atual.getNoEsq();
                                    filho.getNoDir() != null;
                                    temp = filho, filho.getNoEsq()
                            ){
                                if (filho != atual.getNoEsq()) {
                                    temp.setNoDir(filho.getNoEsq());
                                    filho.setNoEsq(raiz.getNoEsq());
                                }
                                filho.setNoDir(raiz.getNoDir());
                                raiz = filho;
                            }
                        }
                    }else if (atual.getNoDir() == null){
                        if (pai.getNoEsq() == atual) {
                            pai.setNoEsq(atual.getNoEsq());
                        }else{
                            pai.setNoDir(atual.getNoEsq());
                        }
                    }else if (atual.getNoEsq() == null){
                        if (pai.getNoEsq() == atual) {
                            pai.setNoEsq(atual.getNoDir());
                        }else{
                            pai.setNoDir(atual.getNoDir());
                        }
                    }else{                                                            //esse for é diferente porque a forma de
                        for (                                                         //ler se faz da seguinte forma:
                                temp = atual, filho = atual.getNoEsq();               //para os parametros tais
                                filho.getNoDir() != null;                             //enquanto esse parametro não for verdade
                                temp = filho, filho = filho.getNoDir()                //atribua tais valores a esses parametros.
                        ){
                            if (filho != atual.getNoEsq()){                           //e a cada iteração desse for verifica se
                                temp.setNoDir(filho.getNoEsq());                      //o objeto filho é diferente do o bjeto atual
                                filho.setNoEsq(atual.getNoEsq());                     //esq. Sendo verdadero, atribui novos valores
                            }                                                         //aos objetos temp e filho a esq. E repete o for
                                                                                      //ate ´objeto filho a dir ser null. Aí para o código

                            filho.setNoDir(atual.getNoDir());
                            if (pai.getNoEsq() == atual) {
                                pai.setNoEsq(filho);
                            }else{
                                pai.setNoDir(filho);
                            }
                        }
                    }

            }catch (NullPointerException erro){
                System.out.println("Mensagem do bloco Catch.Nada encontrado...");
            }
        }
}
