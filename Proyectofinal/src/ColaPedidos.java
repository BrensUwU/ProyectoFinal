public class ColaPedidos {
    private NodoPedido cabeza, cola;

    // Clase que representa un nodo de la cola de pedidos
    public class NodoPedido {
        public int numeroPedido; // Número de pedido
        public String nombreCliente; // Nombre del cliente
        public NodoPedido next = null; // Referencia al siguiente nodo en la cola

        // Constructor de la clase NodoPedido
        public NodoPedido(int numPedido, String nombreCliente) {
            this.numeroPedido = numPedido;
            this.nombreCliente = nombreCliente;
        }
    }

        // Método para verificar si la cola está vacía
        public boolean isEmptyTail() {
            return cabeza == null && cola == null;
        }

        // Método para agregar un nuevo pedido a la cola
        public void agregarCola(int pedido, String cliente) {
            NodoPedido nuevoPedido = new NodoPedido(pedido, cliente);
            if (cabeza == null && cola == null) {
                cabeza = nuevoPedido;
            } else {
                cola.next = nuevoPedido;
            }
            cola = nuevoPedido;
        }

        // Método para eliminar el primer pedido de la cola
        public void eliminar() {
            if (cabeza != null) {
                NodoPedido eliminar = cabeza;
                cabeza = cabeza.next;
                eliminar.next = null;
                if (cabeza == null) {
                    cola = null;
                }
            }
        }

        // Método para mostrar el primer pedido de la cola
        public void obtener() {
            if (cabeza == null) {
                System.out.println("No hay elementos en la cola");
            } else {
                System.out.println("Los datos del primer pedido son: {id: " + cabeza.numeroPedido + ", cliente: " + cabeza.nombreCliente + "}");
            }
        }

        // Método para mostrar el siguiente pedido en la cola
        public void obtenerSiguiente() {
            if (cabeza == null) {
                System.out.println("La cola está vacía");
            } else if (cabeza.next == null) {
                System.out.println("La cola solo tiene un elemento");
            } else {
                NodoPedido pedidoNext = cabeza.next;
                System.out.println("Los datos del siguiente pedido son: {id: " + pedidoNext.numeroPedido + ", cliente: " + pedidoNext.nombreCliente + "}");
            }
        }

        // Método para mostrar todos los pedidos en la cola
        public void mostrarCola() {
            if (cabeza == null) {
                System.out.println("La cola está vacía");
            } else {
                System.out.println("Pedidos en la cola:");
                NodoPedido temp = cabeza;
                while (temp != null) {
                    System.out.println("{id: " + temp.numeroPedido + ", cliente: " + temp.nombreCliente + "}");
                    temp = temp.next;
                }
            }
        }
    }

