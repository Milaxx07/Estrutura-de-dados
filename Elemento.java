//2. Crie uma lista encadeada de números. Insira vários números no final da lista. Conte quantos números são maiores que 10.

class Elemento{
    int valor;
    Elemento proximo;

    public Elemento(int valor){
        this.valor = valor;
        this.proximo = null;
    }

    public Elemento() {
    }
}