//1. Crie uma lista encadeada para exibir uma fila de nomes clientes. Adicione clientes no final da lista e remova do início para testar.
class No{
    String nome;
    No proximo;

    public No(String nome){
        this.nome = nome;
        this.proximo = null;
    }
}

class FilaClientes{
    private No inicio;
    private No fim;

    public FilaClientes(){
        this.inicio = null;
        this.fim = null;
    }

    public void enfileirar(String nome){
        No novo = new No(nome);
        if (fim == null){
            inicio = fim = novo;
        }else{
            fim.proximo = novo;
            fim = novo;
        }
        System.out.println(nome + " entrou na fila");
    }

    public void desenfileirar(){
        if (inicio == null){
            System.out.println("A fila está vazia");
            return;
        }
        System.out.println(inicio.nome + " foi atendido e saiu da fila");
        inicio = inicio.proximo;

        if (inicio == null){
            fim = null;
        }
    }

    public void mostrarFila(){
        if (inicio == null){
            System.out.println("Fila vazia");
            return;
        }
        System.out.println("Fila atual: ");
        No atual = inicio;
        while (atual != null){
            System.out.print(atual.nome + " > ");
            atual = atual.proximo;
        }
        System.out.println("Fim");
    }
}