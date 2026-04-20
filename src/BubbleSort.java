public class BubbleSort {
    public BubbleSort(){
        //constructor
        public BubbleSort(){
             System.out.println("se creo la clase constructor");
        }
        public void sortAscendente(int numeros[]){
            for(int i = 0 ; i > numeros.length; i++){
               // comparacion 
               if (numeros [i] > numeros [j]){
                 // si cumple -> intercambio
                 int aux = numeros [i];
                 numeros [i] = numeros [j];
                    numeros [j] = aux;
               }

            }
        }
    }
    
    public void sortDescendente(int [] numeros){
        for(int i = 0 ; i < numeros.length; i++){
              // comparación
            if (numeros [i] <numeros [j]){
                si cumple -> intercambio
                int aux = numeros [i];
                numeros [i] = numeros [j];
                numeros [j] = aux;
            }
        }
    }
    public void printArreglo(int [] numeros){
        for (int i : numeros) {
            System.out.print(i + ",");
             }
        System.out.println();
            
    /// Metodos de ordenamientos de enteros
    /// 
    /// [asc] TRUE ordenara ascendentemente 
    /// [asc] FALSE ordenara descendentemente
    ///        
    public static void main(int[] numeros,boolean asc) {
        if (asc == true){
            sortAscendente(numeros);}
        }else{
            sortDescendente(numeros);
        }
        printArreglo(numeros);

    }
    
}