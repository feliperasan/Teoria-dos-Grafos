public class Propriedades {
    int aresta;
    int vertice;
    int[][] adjacencia;
    int[] grau;

    public Propriedades(int v, int a) {
        vertice = v;
        aresta = a;
        adjacencia = new int[vertice][vertice];
        grau = new int[vertice];
    }

    public void inserirAdjacencia(int verticeInicial, int verticeFinal, int quantAresta) {
        adjacencia[verticeInicial][verticeFinal] = quantAresta;
        aresta -= quantAresta;
    }

    public void mostrarG() {
        for (int i = 0; i < vertice; i++) {
            System.out.print("\t" + i + "U");
        }

        System.out.println();

        for (int i = 0; i < vertice; i++) {
            System.out.print(i + "U");
            for (int j = 0; j < vertice; j++) {
                System.out.print("\t" + adjacencia[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void verificarAresta(int vertice1, int vertice2) {
        if (adjacencia[vertice1][vertice2] >= vertice) {
            System.out.println("Sim, existe!");
        } else {
            System.out.println("Não há, arestas entre os vertices!");
        }
        System.out.println();
    }

    public void verticeVizinho(int v) {
        System.out.print("Vizinhos do vertice " + v + "U: ");
        for (int i = 0; i < vertice; i++) {
            if (adjacencia[v][i] >= 1) {
                System.out.print(i + "U ");
            }
        }
        System.out.println("\n");
    }

    public void grafoEuleriano() {
        int contador = 0;
        for(int i = 0; i < vertice; i++) {
           for (int j = 0; j < vertice; j++) {
               grau[i] += adjacencia[i][j];
           }
        }

        for (int i = 0; i < vertice; i++) {
            if (grau[i] % 2 != 0) {
                contador++;
            }
        }

        if (contador != 0) {
            System.out.println("Não é um grafo Euleriano!");
        } else {
            System.out.println("É um grafo Euleriano!");
        }

        System.out.println();
    }

    public void caminhoEuleriano() {
        int impar = 0;
        for(int i = 0; i < vertice; i++) {
            if (grau[i] % 2 == 1) {
                impar++;
            }
        }

        if (impar > 2) {
            System.out.println("Não existe um trilho Euleriano!");
        } else {
            System.out.println("Existe um trilho Euleriano!");
        }
        System.out.println();
    }

    public void condicaoDeOre() {
        int[] soma = new int[vertice];
        int contador = 0;
        for (int i = 0; i < vertice; i++) {
            for (int j = 0; j < vertice; j++) {
                if (adjacencia[i][j] == 0) {
                    soma[i] = grau[i] + grau[j];
                    //mostra a soma dos vertices i e j da matriz sendo i = linha e j = coluna
                    //System.out.println("i:" + i +" j:" + j + " soma:" + soma[i]);
                }
            }
            if(soma[i] < vertice) {
                contador++;
            }
        }

        if (contador != 0) {
            System.out.println("Não satisfez a condição de Ore!");
        } else {
            System.out.println("Satisfez a condição de Ore!");
        }
    }
}
