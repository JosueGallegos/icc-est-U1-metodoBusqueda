public class MetodosBusqueda {

    public int BusquedaSecuencial(int[] arreglo,int valorBuscado){

        //int pos = -1;
        for(int i = 0; i < arreglo.length; i++){
            if (arreglo[i] == valorBuscado) {
                return i;
                
            }

        }
        return -1;
        //return pos;

    }

    public int BusquedaBinaria(int[]arreglo, int Buscar){
        int inicio = 0;
        int fin = arreglo.length-1;

        while (inicio <= fin) {
            int medio = (inicio + fin-inicio)/2;

            if (arreglo[medio]==Buscar) {
                return medio;
                
            }
            if (arreglo[medio]< Buscar) {
                inicio = medio + 1;// Buscar en la mitad de la derecha 
                
            }else{
                fin = medio - 1; //buscar en la mitad de la izquierda

            }
            
        }
        return -1;

    }

    public void printArreglo(int[]arreglo){
        for(int elem : arreglo){
            System.out.print(elem+ " ");

        }

    }

    
}
