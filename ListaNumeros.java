//4. Para a lista da questão anterior, conte quantos números são pares
class ListaNumeros {
    private Node cabeca;
    private Node cauda;

    public ListaNumeros() {
        this.cabeca = null;
        this.cauda = null;
    }

    public void adicionarNoFim(int valor) {
        Node novo = new Node(valor);
        if (cauda == null) { 
            cabeca = cauda = novo;
        } else {
            cauda.seguinte = novo;
            cauda = novo;
        }
    }

    public void exibirLista() {
        Node atual = cabeca;
        while (atual != null) {
            System.out.print(atual.numero + " > ");
            atual = atual.seguinte;
        }
        System.out.println("Fim");
    }

    public void somarMaioresEMenoresQue10() {
        int somaMaiores = 0;
        int somaMenoresOuIguais = 0;
        Node atual = cabeca;

        while (atual != null) {
            if (atual.numero > 10) {
                somaMaiores += atual.numero;
            } else {
                somaMenoresOuIguais += atual.numero;
            }
            atual = atual.seguinte;
        }

        System.out.println("Soma dos maiores que 10: " + somaMaiores);
        System.out.println("Soma dos menores ou iguais a 10: " + somaMenoresOuIguais);
    }

    public int contarPares() {
        int contador = 0;
        Node atual = cabeca;

        while (atual != null) {
            if (atual.numero % 2 == 0) {
                contador++;
            }
            atual = atual.seguinte;
        }

        return contador;
    }
}
