public class Main {
    public static void main(String[] args) {

        Propriedades G = new Propriedades(7,13);

        G.inserirAdjacencia(0, 1, 1);
        G.inserirAdjacencia(0, 2, 1);
        G.inserirAdjacencia(0, 5, 1);
        G.inserirAdjacencia(0, 6, 1);

        G.inserirAdjacencia(1, 0, 1);
        G.inserirAdjacencia(1, 2, 1);
        G.inserirAdjacencia(1, 5, 1);
        G.inserirAdjacencia(1, 6, 1);

        G.inserirAdjacencia(2, 0, 1);
        G.inserirAdjacencia(2, 1, 1);
        G.inserirAdjacencia(2, 3, 1);
        G.inserirAdjacencia(2, 4, 1);
        G.inserirAdjacencia(2, 5, 1);
        G.inserirAdjacencia(2, 6, 1);

        G.inserirAdjacencia(3, 2, 1);
        G.inserirAdjacencia(3, 4, 1);

        G.inserirAdjacencia(4, 2, 1);
        G.inserirAdjacencia(4, 3, 1);

        G.inserirAdjacencia(5, 0, 1);
        G.inserirAdjacencia(5, 1, 1);
        G.inserirAdjacencia(5, 2, 1);
        G.inserirAdjacencia(5, 6, 1);

        G.inserirAdjacencia(6, 0, 1);
        G.inserirAdjacencia(6, 1, 1);
        G.inserirAdjacencia(6, 2, 1);
        G.inserirAdjacencia(6, 5, 1);

        G.mostrarG();
        G.verificarAresta(1, 2);
        G.verticeVizinho(1);
        G.grafoEuleriano();
        G.caminhoEuleriano();
        G.condicaoDeOre();
    }
}
