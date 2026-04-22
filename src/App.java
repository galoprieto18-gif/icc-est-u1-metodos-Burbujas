public class App {
        public static void main(String[] args) throws Exception {
           
            //runBubbleSort();
            runBubbleSortAvz();
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
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sort(numeros,asc: true);
        // bubbleSort.printArreglo(numeros);
        // bubbleSort.sort(numeros,asc: false);
        // bubbleSort.printArreglo(numeros);

    }
    public static void runBubbleSortAvz(int []){
        int [] array  = new int[]{9,2,3,0,8,5,10,50,100};
        // int [] array2 = new int []{94,2,3,20,8,5};
        // int [] array 3 = new int[]{}
        
        //Instanciar la clase 
        BubbleSortAvz bSortAvz = new BubbleSortAvz(Array);
        bSortAvz.printArray();
        bSortAvz.sort(asc: true);
        bSortAvz.printArray();
    }
}