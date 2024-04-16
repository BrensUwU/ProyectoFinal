// Clase que representa una pila de libros
public class Pilas {
    private Nodo tope = null; // Referencia al nodo superior (tope) de la pila
    private int longitud = 0; // Longitud de la pila (cantidad de elementos)

    // Clase interna que representa un nodo en la pila de libros
    public class Nodo {
        public int isbn; // Número de ISBN del libro
        public String autor; // Nombre del autor del libro
        public String titulo; // Título del libro
        public Nodo next = null; // Referencia al siguiente nodo en la pila

        // Constructor de la clase Nodo
        public Nodo(int isbn, String autor, String titulo) {
            this.isbn = isbn;
            this.autor = autor;
            this.titulo = titulo;
        }
    }

    // Método para verificar si la pila está vacía
    public boolean isEmptyStack() {
        return tope == null;
    }

    // Método para agregar un libro a la pila (apilar)
    public void apilar(int isbn, String autor, String titulo) {
        Nodo nodoPush = new Nodo(isbn, autor, titulo); // Crear un nuevo nodo con los datos del libro
        nodoPush.next = tope; // El siguiente del nuevo nodo apunta al tope actual
        tope = nodoPush; // Actualizar el tope para que apunte al nuevo nodo
        longitud++; // Incrementar la longitud de la pila
    }

    // Método para eliminar el libro en la cima de la pila (desapilar)
    public void desapilar() {
        if (tope != null) { // Verificar si la pila no está vacía
            Nodo nodoPop = tope; // Guardar una referencia al nodo a desapilar
            tope = tope.next; // El tope actual pasa a ser el siguiente nodo en la pila
            nodoPop = null; // Eliminar la referencia al nodo desapilado
            longitud--; // Decrementar la longitud de la pila
        }
    }

    // Método para obtener el libro en la cima de la pila (tope)
    public void obtenerTope() {
        if (!isEmptyStack()) { // Verificar si la pila no está vacía
            Nodo nodoCima = tope; // Obtener una referencia al nodo en la cima de la pila
            // Imprimir los datos del libro en la cima de la pila
            System.out.println("El libro actual es: [" + nodoCima.isbn + ", " + nodoCima.autor + ", " + nodoCima.titulo + "]");
        } else {
            System.out.println("No hay libros en la pila."); // Mensaje si la pila está vacía
        }
    }

    // Método para eliminar todos los libros de la pila (destructor)
    public void destructor() {
        while (!isEmptyStack()) { // Mientras la pila no esté vacía
            desapilar(); // Desapilar un libro de la pila
        }
    }

    // Método para mostrar todos los libros en la pila
    public void mostrarPila() {
        if (!isEmptyStack()) { // Verificar si la pila no está vacía
            Nodo temp = tope; // Obtener una referencia al nodo superior (tope) de la pila
            System.out.println("\nPila de libros:");
            while (temp != null) { // Recorrer la pila mientras haya nodos
                // Imprimir los datos del libro en el nodo actual
                System.out.println("[" + temp.isbn + ", " + temp.autor + ", " + temp.titulo + "]");
                temp = temp.next; // Avanzar al siguiente nodo en la pila
            }
        } else {
            System.out.println("La pila está vacía."); // Mensaje si la pila está vacía
        }
    }
}

