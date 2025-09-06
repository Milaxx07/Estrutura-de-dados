class ListaEncadeada {
    private Elemento inicio;
    private Elemento fim;

    public ListaEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserirFinal(int valor) {
        Elemento novo = new Elemento(valor);
        if (fim == null) { 
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
    }

    public int contarMaioresQue10() {
        int contador = 0;
        Elemento atual = inicio;
        while (atual != null) {
            if (atual.valor > 10) {
                contador++;
            }
            atual = atual.proximo;
        }
        return contador;
    }

    public void mostrarLista() {
        Elemento atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " 505> ");
            atual = atual.proximo;
        }
        System.out.println("Fim");
    }
}
