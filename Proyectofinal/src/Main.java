//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        // Mostrar el menú al usuario
        System.out.println("Selecciona un programa:");
        System.out.println("1. Operaciones con Listas");
        System.out.println("2. Operaciones con Colas");
        System.out.println("3. Operaciones con Pilas");
        System.out.println("4. Operaciones con Arboles binarios");
        System.out.print("Ingresa el número del programa: ");

        int opcion = scanner.nextInt(); // Leer la opción ingresada por el usuario

        switch (opcion) {
            case 1:
                ejecutarPrograma1(); // Si la opción es 1, llamar al método para ejecutar el primer programa
                break;
            case 2:
                ejecutarPrograma2(); // Si la opción es 2, llamar al método para ejecutar el segundo programa
                break;
            case 3:
                ejecutarPrograma3(); // Si la opción es 3, llamar al método para ejecutar el tercer programa
                break;
            case 4:
                ejecutarPrograma4(); // Si la opción es 3, llamar al método para ejecutar el tercer programa
                break;
            default:
                System.out.println("Opción no válida"); // Si la opción no es válida, mostrar un mensaje de error
                break;
        }
    }

    // Método para ejecutar el primer programa
    public static void ejecutarPrograma1()  {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        Listas lista = new Listas(); // Crear un objeto de la clase Listas para trabajar con una lista

        System.out.print("Ingrese la cantidad de nodos que desea: "); // Solicitar al usuario que ingrese la cantidad de nodos
        int numNodos = scanner.nextInt(); // Leer la cantidad de nodos ingresada por el usuario

        // Leer los valores de los nodos y agregarlos al inicio de la lista
        for (int i = 0; i < numNodos; i++) {
            System.out.print("Ingrese el valor del nodo " + (i + 1) + ": "); // Solicitar al usuario que ingrese el valor del nodo
            int valorNodo = scanner.nextInt(); // Leer el valor del nodo ingresado por el usuario
            lista.insertarAlInicio(valorNodo); // Insertar el valor del nodo al inicio de la lista
        }

        boolean continuar = true; // Variable booleana para controlar el bucle del menú

        // Bucle principal para mostrar el menú y realizar operaciones en la lista
        while (continuar) {
            System.out.println("\nOpciones:"); // Mostrar las opciones del menú
            System.out.println("1. Mostrar nodos");
            System.out.println("2. Insertar nodo al final");
            System.out.println("3. Contar nodos");
            System.out.println("4. Insertar nodo en posición");
            System.out.println("5. Obtener valor de un nodo");
            System.out.println("6. Eliminar nodo al inicio");
            System.out.println("7. Eliminar nodo al final");
            System.out.println("8. Eliminar nodo en posición");
            System.out.println("9. Salir");

            System.out.print("\nIngrese el número de la opción que desea realizar: ");
            int opcion = scanner.nextInt(); // Leer la opción ingresada por el usuario

            switch (opcion) {
                case 1:
                    // Mostrar los nodos de la lista
                    System.out.println();
                    lista.mostrarNodos();
                    break;
                case 2:
                    // Insertar un nodo al final de la lista
                    System.out.print("\nIngrese el valor del nodo a insertar al final: ");
                    int valorFinal = scanner.nextInt(); // Leer el valor del nodo ingresado por el usuario
                    lista.insertarAlFinal(valorFinal); // Insertar el valor del nodo al final de la lista
                    break;
                case 3:
                    // Contar el número de nodos en la lista
                    System.out.print("\nNúmero de nodos en la lista: ");
                    lista.contar();
                    break;
                case 4:
                    // Insertar un nodo en una posición específica de la lista
                    System.out.print("\nIngrese la posición donde desea insertar el nodo: ");
                    int posicion = scanner.nextInt(); // Leer la posición ingresada por el usuario
                    System.out.print("Ingrese el valor del nodo a insertar: ");
                    int valorInsertar = scanner.nextInt(); // Leer el valor del nodo ingresado por el usuario
                    lista.insertarEnPosicion(posicion, valorInsertar); // Insertar el valor del nodo en la posición especificada de la lista
                    break;
                case 5:
                    // Obtener el valor de un nodo en una posición específica de la lista
                    System.out.print("\nIngrese la posición del nodo del que desea obtener el valor: ");
                    int posObtener = scanner.nextInt(); // Leer la posición del nodo ingresada por el usuario
                    System.out.println("El valor del nodo en la posición " + posObtener + " es: " + lista.obtenerNodo(posObtener)); // Mostrar el valor del nodo en la posición especificada
                    break;
                case 6:
                    // Eliminar el nodo al inicio de la lista
                    lista.eliminarAlInicio();
                    break;
                case 7:
                    // Eliminar el nodo al final de la lista
                    lista.eliminarAlFinal();
                    break;
                case 8:
                    // Eliminar un nodo en una posición específica de la lista
                    System.out.print("\nIngrese la posición del nodo que desea eliminar: ");
                    int posEliminar = scanner.nextInt(); // Leer la posición del nodo ingresada por el usuario
                    lista.eliminarNodo(posEliminar); // Eliminar el nodo en la posición especificada de la lista
                    break;
                case 9:
                    // Salir del programa
                    continuar = false;
                    break;
                default:
                    // Mostrar un mensaje de error si la opción ingresada no es válida
                    System.out.println("\nOpción no válida");
            }

            System.out.println("\nLista después de la operación:"); // Mostrar la lista después de realizar la operación
            lista.mostrarNodos();
        }

        scanner.close(); // Cerrar el objeto Scanner para liberar recursos
    }



    // Método para ejecutar el segundo programa
    public static void ejecutarPrograma2() {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        ColaPedidos cola = new ColaPedidos(); // Crear un objeto de la clase ColaPedidos para trabajar con una cola de pedidos
        boolean continuar = true; // Variable booleana para controlar el bucle del menú

        // Bucle principal para mostrar el menú y realizar operaciones en la cola de pedidos
        while (continuar) {
            System.out.println("\nOpciones:"); // Mostrar las opciones del menú
            System.out.println("1. Agregar pedido a la cola");
            System.out.println("2. Eliminar pedido de la cola");
            System.out.println("3. Mostrar pedido en la cabeza de la cola");
            System.out.println("4. Mostrar siguiente pedido");
            System.out.println("5. Mostrar todos los pedidos en la cola");
            System.out.println("6. Salir");

            System.out.print("\nIngrese el número de la opción que desea realizar: ");
            int opcion = scanner.nextInt(); // Leer la opción ingresada por el usuario

            switch (opcion) {
                case 1:
                    // Agregar un pedido a la cola
                    System.out.print("\nIngrese el número de pedido: ");
                    int numPedido = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();
                    cola.agregarCola(numPedido, nombreCliente);
                    break;
                case 2:
                    // Eliminar un pedido de la cola
                    cola.eliminar();
                    break;
                case 3:
                    // Mostrar el pedido en la cabeza de la cola
                    cola.obtener();
                    break;
                case 4:
                    // Mostrar el siguiente pedido en la cola
                    cola.obtenerSiguiente();
                    break;
                case 5:
                    // Mostrar todos los pedidos en la cola
                    cola.mostrarCola();
                    break;
                case 6:
                    // Salir del programa
                    continuar = false;
                    break;
                default:
                    // Mostrar un mensaje de error si la opción ingresada no es válida
                    System.out.println("\nOpción no válida");
            }
        }

        scanner.close(); // Cerrar el objeto Scanner para liberar recursos
    }

    // Método para ejecutar el tercer programa
    public static void ejecutarPrograma3() {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        Pilas pila = new Pilas(); // Crear un objeto de la clase Pilas para trabajar con una pila de libros

        boolean continuar = true; // Variable booleana para controlar el bucle del menú

        // Bucle principal para mostrar el menú y realizar operaciones en la pila
        while (continuar) {
            System.out.println("\nOpciones:"); // Mostrar las opciones del menú
            System.out.println("1. Apilar libro");
            System.out.println("2. Desapilar libro");
            System.out.println("3. Mostrar tope de la pila");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Eliminar todos los libros de la pila");
            System.out.println("6. Terminar programa");

            System.out.print("\nIngrese el número de la opción que desea realizar: ");
            int opcion = scanner.nextInt(); // Leer la opción ingresada por el usuario

            switch (opcion) {
                case 1:
                    // Apilar un libro en la pila
                    System.out.print("\nIngrese el identificador del libro: ");
                    int isbn = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    pila.apilar(isbn, autor, titulo);
                    break;
                case 2:
                    // Desapilar un libro de la pila
                    pila.desapilar();
                    break;
                case 3:
                    // Mostrar el tope de la pila
                    pila.obtenerTope();
                    break;
                case 4:
                    // Mostrar todos los libros en la pila
                    pila.mostrarPila();
                    break;
                case 5:
                    // Eliminar todos los libros de la pila
                    pila.destructor();
                    System.out.println("Se han eliminado todos los libros de la pila.");
                    break;
                case 6:
                    // Terminar el programa
                    continuar = false;
                    break;
                default:
                    // Mostrar un mensaje de error si la opción ingresada no es válida
                    System.out.println("\nOpción no válida");
            }
        }

        scanner.close(); // Cerrar el objeto Scanner para liberar recursos
    }

    public static void ejecutarPrograma4() {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario
        ArbolBinario arbol = new ArbolBinario(); // Crear un objeto ArbolBinario para almacenar los números ingresados

        // Solicitar al usuario la cantidad de números que desea ingresar para el árbol
        System.out.print("Ingrese la cantidad de números que desea ingresar para el árbol: ");
        int cantidadNumeros = scanner.nextInt();

        // Ciclo para ingresar los números al árbol
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            arbol.insertar(numero); // Insertar el número en el árbol
        }

        boolean continuar = true;

        // Ciclo para mostrar el menú de opciones y realizar operaciones en el árbol
        while (continuar) {
            System.out.println("\nOpciones:");
            System.out.println("1. Mostrar recorrido en orden del árbol");
            System.out.println("2. Mostrar recorrido en preorden del árbol");
            System.out.println("3. Mostrar recorrido en postorden del árbol");
            System.out.println("4. Buscar un valor en el árbol");
            System.out.println("5. Eliminar un valor del árbol");
            System.out.println("6. Calcular el número de nodos en el árbol");
            System.out.println("7. Calcular la altura del árbol");
            System.out.println("8. Calcular el número de hojas en el árbol");
            System.out.println("9. Encontrar el valor mínimo y máximo en el árbol");
            System.out.println("10. Terminar programa");

            System.out.print("\nIngrese el número de la opción que desea realizar: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar recorrido en orden del árbol
                    System.out.println("Recorrido en orden del árbol:");
                    arbol.inOrden(arbol.raiz);
                    System.out.println();
                    break;
                case 2:
                    // Mostrar recorrido en preorden del árbol
                    System.out.println("Recorrido en preorden del árbol:");
                    arbol.prePorden(arbol.raiz);
                    System.out.println();
                    break;
                case 3:
                    // Mostrar recorrido en postorden del árbol
                    System.out.println("Recorrido en postorden del árbol:");
                    arbol.postOrden(arbol.raiz);
                    System.out.println();
                    break;
                case 4:
                    // Buscar un valor en el árbol
                    System.out.print("Ingrese el valor que desea buscar: ");
                    int valorBuscado = scanner.nextInt();
                    ArbolBinario.Nodo nodoBuscado = arbol.buscar(valorBuscado);
                    if (nodoBuscado != null) {
                        System.out.println("El valor " + valorBuscado + " se encontró en el árbol.");
                    } else {
                        System.out.println("El valor " + valorBuscado + " no se encontró en el árbol.");
                    }
                    break;
                case 5:
                    // Eliminar un valor del árbol
                    System.out.print("Ingrese el valor que desea eliminar: ");
                    int valorEliminar = scanner.nextInt();
                    arbol.eliminar(valorEliminar);
                    System.out.println("Después de eliminar " + valorEliminar + ", el árbol en orden es:");
                    arbol.inOrden(arbol.raiz);
                    System.out.println();
                    break;
                case 6:
                    // Calcular el número de nodos en el árbol
                    int numNodos = arbol.contarNodos();
                    System.out.println("El árbol tiene " + numNodos + " nodos.");
                    break;
                case 7:
                    // Calcular la altura del árbol
                    int altura = arbol.alturaArbol();
                    System.out.println("La altura del árbol es " + altura + ".");
                    break;
                case 8:
                    // Calcular el número de hojas en el árbol
                    int numHojas = arbol.contarHojas();
                    System.out.println("El árbol tiene " + numHojas + " hojas.");
                    break;
                case 9:
                    // Encontrar el valor mínimo y máximo en el árbol
                    int minimo = arbol.valorMinimo(arbol.raiz);
                    int maximo = arbol.valorMaximo(arbol.raiz);
                    System.out.println("El valor mínimo del árbol es " + minimo + ".");
                    System.out.println("El valor máximo del árbol es " + maximo + ".");
                    break;
                case 10:
                    // Terminar el programa
                    continuar = false;
                    break;
                default:
                    // Mostrar mensaje si la opción ingresada no es válida
                    System.out.println("\nOpción no válida");
            }
        }

        scanner.close(); // Cerrar el objeto Scanner para liberar recursos
    }
}

