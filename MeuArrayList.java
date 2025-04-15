public class MeuArrayList {
    private Object[] elementos;
    private int tamanho = 0;

    public MeuArrayList(int capacidadeInicial) {
        elementos = new Object[capacidadeInicial];
    }

    public void adicionar(Object elemento) {
        if (tamanho == elementos.length) {
            // Aumenta a capacidade do array
            Object[] novoArray = new Object[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                novoArray[i] = elementos[i];
            }
            elementos = novoArray;
        }
        elementos[tamanho++] = elemento;
    }

    public Object pegar(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites");
        }
        return elementos[indice];
    }

    public int tamanho() {
        return tamanho;
    }

    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            throw new IndexOutOfBoundsException("Índice fora dos limites");
        }
        for (int i = indice; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        elementos[tamanho] = null; // Limpa o espaço
    }

    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i]);
        }
    }
}
