public class App {
     Run/Debug
     
        public static void main(String[] args) throws Exception {
            int [] numeros = {-5,10,2,0,7};
            runBubbleSort();
    }

    public static void runBubbleSort(){
        System.out.println("Metodo Burbuja");
        int [] numeros = {-5,10,2,0,7};
        //Instancia de la clase;
        // BubbleSort bubbleSort  = new BubbleSort();
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sortAscendente(numeros);
        // bubbleSort.sortDescendente(numeros);
        // bubbleSort.printArreglo(numeros);
        bubbleSort.printArreglo(numeros);
        bubbleSort.sort(numeros,asc: true);
        bubbleSort.printArreglo(numeros);
        bubbleSort.sort(numeros,asc: false);
        bubbleSort.printArreglo(numeros);

    }
}