public class ArbolBinario {
    public class Nodo {
        int valor;
        Nodo izquierdo;
        Nodo derecho;

        public Nodo(int valor) {
            this.valor = valor;
            this.izquierdo = null;
            this.derecho = null;
        }

    }

    Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarNodo(raiz, valor);
    }

    private Nodo insertarNodo(Nodo currentRoot, int valor) {
        if (currentRoot == null)//raiz actual
            return new Nodo(valor);
        if (valor < currentRoot.valor) {
            currentRoot.izquierdo = insertarNodo(currentRoot.izquierdo, valor);
        } else if (valor > currentRoot.valor) {
            currentRoot.derecho = insertarNodo(currentRoot.derecho, valor);
        }
        return currentRoot;
    }

    public void inOrden(Nodo nodo) {
        if (nodo != null) {
            inOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inOrden(nodo.derecho);
        }
    }

    public void prePorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            prePorden(nodo.izquierdo);
            prePorden(nodo.derecho);
        }
    }

    public void postOrden(Nodo nodo) {
        if (nodo != null) {
            postOrden(nodo.izquierdo);
            postOrden(nodo.derecho);
            System.out.print(nodo.valor);
        }
    }

    public void eliminar(int valor) {
        raiz = eliminarNodo(raiz, valor);
    }

    private Nodo eliminarNodo(Nodo currentRoot, int valor) {
        if (currentRoot == null)
            return currentRoot;
        if (valor < currentRoot.valor) {
            currentRoot.izquierdo = eliminarNodo(currentRoot.izquierdo, valor);
        } else if (valor > currentRoot.valor) {
            currentRoot.derecho = eliminarNodo(currentRoot.derecho, valor);
        } else {
            if (currentRoot.izquierdo == null) {
                return currentRoot.derecho;
            } else if (currentRoot.derecho == null) {
                return currentRoot.izquierdo;
            }
            Nodo sucesor = encontrarSucesor(currentRoot.derecho);
            currentRoot.valor = sucesor.valor;
            currentRoot.derecho = eliminarNodo(currentRoot.derecho, sucesor.valor);
        }
        return currentRoot;
    }
    private Nodo encontrarSucesor(Nodo nodo){
        Nodo actual = nodo;
        while (actual.izquierdo != null){
            actual = actual.izquierdo;
        }
        return actual;
    }
    public Nodo buscar(int valor){
        return buscarNodo(raiz, valor);
    }
    private Nodo buscarNodo(Nodo currentRoot, int valor){
        if(currentRoot == null || currentRoot.valor == valor)
            return currentRoot;
        if (valor < currentRoot.valor){
            return buscarNodo(currentRoot.izquierdo, valor);
        }else {
            return buscarNodo(currentRoot.derecho, valor);
        }
    }
    public int contarNodos(){
        return contarNodosR(raiz);
    }
    public int contarNodosR(Nodo nodo){
        if (nodo == null)
            return 0;
        return  1 + contarNodosR(nodo.izquierdo) + contarNodosR(nodo.derecho);
    }
    public int alturaArbol(){
        return alturaArbolR(raiz);
    }
    private int alturaArbolR(Nodo nodo){
        if(nodo == null)
            return 0;

        return 1 + Math.max(alturaArbolR(nodo.izquierdo) , alturaArbolR(nodo.derecho));
    }
    public int contarHojas(){
        return contarHojasR(raiz);
    }
    private int contarHojasR(Nodo nodo){
        if (nodo == null)
            return 0;
        if (nodo.izquierdo == null && nodo.derecho==null)
            return 1;

        return contarHojasR(nodo.izquierdo) + contarHojasR(nodo.derecho);
    }

    public int valorMinimo(Nodo nodo){
        if (nodo == null)
            throw new NullPointerException("Está vacío");
        if (nodo.izquierdo==null)
            return nodo.valor;

        return valorMinimo(nodo.izquierdo);
    }
    public int valorMaximo(Nodo nodo){
        if (nodo == null)
            throw new NullPointerException("Está vacío");
        if (nodo.derecho==null)
            return nodo.valor;

        return valorMaximo(nodo.derecho);
    }
}
