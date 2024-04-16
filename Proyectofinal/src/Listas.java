        public class Listas {
        private Nodo head = null; // El primer nodo de la lista
        private int length = 0; // Longitud de la lista

        // Clase interna Nodo que representa los nodos de la lista
        public class Nodo {
            public int data; // Valor almacenado en el nodo
            public Nodo next = null; // Referencia al siguiente nodo

            // Constructor que inicializa el valor del nodo
            public Nodo(int data) {
                this.data = data;
            }
        }

        // Método para verificar si la lista está vacía
        public boolean isEmptyList() {
            return head == null;
        }

        // Método para mostrar la longitud de la lista
        public void contar() {
            System.out.println(length);
        }

        // Método para mostrar todos los nodos de la lista
        public void mostrarNodos() {
            Nodo current = head; // Inicializar un puntero al principio de la lista

            // Recorrer la lista y mostrar el valor de cada nodo
            for (int contador = 0; current != null; ++contador) {
                System.out.println("El elemento del nodo " + (contador + 1) + " es: " + current.data);
                current = current.next; // Avanzar al siguiente nodo
            }
        }

        // Método para insertar un nuevo nodo al inicio de la lista
        public void insertarAlInicio(int valor) {
            Nodo nodo = new Nodo(valor); // Crear un nuevo nodo con el valor especificado
            nodo.next = head; // El siguiente del nuevo nodo es el antiguo primer nodo
            head = nodo; // El nuevo nodo ahora es el primer nodo
            length++; // Incrementar la longitud de la lista
        }

        // Método para insertar un nuevo nodo al final de la lista
        public void insertarAlFinal(int valor) {
            Nodo nodo = new Nodo(valor); // Crear un nuevo nodo con el valor especificado

            // Si la lista está vacía, el nuevo nodo se convierte en el primer nodo
            if (this.isEmptyList()) {
                head = nodo;
            } else {
                Nodo puntero = head;

                // Avanzar al último nodo en la lista
                while (puntero.next != null) {
                    puntero = puntero.next;
                }

                puntero.next = nodo; // Agregar el nuevo nodo al final
            }
            length++; // Incrementar la longitud de la lista
        }

        // Método para insertar un nuevo nodo en una posición específica de la lista
        public void insertarEnPosicion(int posicion, int valor) {
            Nodo nodo = new Nodo(valor); // Crear un nuevo nodo con el valor especificado

            // Si la lista está vacía o la posición es 0, el nuevo nodo se convierte en el primer nodo
            if (head == null || posicion == 0) {
                head = nodo;
            } else {
                Nodo puntero = head;

                // Avanzar al nodo anterior a la posición de inserción
                for (int contador = 0; contador < (posicion - 1) && puntero.next != null; ++contador) {
                    puntero = puntero.next;
                }

                nodo.next = puntero.next; // Enlazar el nuevo nodo con el siguiente nodo
                puntero.next = nodo; // Enlazar el nodo anterior con el nuevo nodo
            }
            length++; // Incrementar la longitud de la lista
        }

        // Método para obtener el valor de un nodo en una posición específica de la lista
        public int obtenerNodo(int posicion) {
            if (isEmptyList()) {
                return 0; // Devolver 0 si la lista está vacía
            } else {
                Nodo puntero = head;

                // Avanzar al nodo en la posición especificada
                for (int contador = 0; contador < posicion && puntero.next != null; ++contador) {
                    puntero = puntero.next;
                }
                return puntero.data; // Devolver el valor del nodo en la posición especificada
            }
        }

        // Método para eliminar el primer nodo de la lista
        public void eliminarAlInicio() {
            if (!isEmptyList()) {
                Nodo first = head; // Almacenar una referencia al primer nodo
                head = head.next; // Actualizar el primer nodo al siguiente nodo
                first.next = null; // Separar el primer nodo de la lista
                length--; // Decrementar la longitud de la lista
            }
        }

        // Método para eliminar el último nodo de la lista
        public void eliminarAlFinal() {
            if (!isEmptyList()) {
                // Si hay solo un nodo en la lista, eliminar ese nodo
                if (head.next == null) {
                    head = null;
                    length--; // Decrementar la longitud de la lista
                } else {
                    Nodo puntero = head;

                    // Avanzar al penúltimo nodo en la lista
                    while (puntero.next.next != null) {
                        puntero = puntero.next;
                    }

                    puntero.next = null; // Eliminar la referencia al último nodo
                    length--; // Decrementar la longitud de la lista
                }
            }
        }

        // Método para eliminar un nodo en una posición específica de la lista
        public void eliminarNodo(int posicion) {
            if (head != null) {
                Nodo puntero;

                // Si la posición es 0, eliminar el primer nodo
                if (posicion == 0) {
                    puntero = head;
                    head = head.next;
                    puntero.next = null; // Separar el primer nodo de la lista
                    length--; // Decrementar la longitud de la lista
                }
                // Si la posición está dentro del rango de la lista
                else if (posicion < length) {
                    puntero = head;

                    // Avanzar al nodo anterior al nodo a eliminar
                    for (int contador = 0; contador < (posicion - 1); ++contador) {
                        puntero = puntero.next;
                    }

                    Nodo temp = puntero.next;
                    puntero.next = temp.next; // Enlazar el nodo anterior con el siguiente nodo
                    temp.next = null; // Separar el nodo a eliminar de la lista
                    length--; // Decrementar la longitud de la lista
                }
            }
        }
    }

