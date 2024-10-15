import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        MetodosBusqueda metodos = new MetodosBusqueda();
        int [] arreglo =  {10,20,30,40,50,60,70,80,90,100};

        metodos.printArreglo(arreglo);
        int posicion = metodos.BusquedaSecuencial(arreglo, 20);
        if (posicion !=-1) {
            System.out.println(" \n El valor de la posicion es: "+ posicion);

            
        }else{
            System.out.println(" \n Valor no encontrado. ");

        }

        

        //int[] arreglo2 = new int[100000];
        for(int i = 0; i <=100000 ;i++){
            System.out.print(i+" ");

        }

        int[]arreglo2 = new int[100000];
        for(int i= 0; i < arreglo2.length; i++){
            arreglo2[i]= i+1;

        }
        metodos.printArreglo(arreglo2);

        long starTimeSecuencial = System.nanoTime();
        int pos1= metodos.BusquedaSecuencial(arreglo2, 50108);
        long endTimeSecuencial = System.nanoTime();
        System.out.println("\n Tiempo de ejecucion de ls busqueda Secuencial "+ (endTimeSecuencial - starTimeSecuencial)+" Nanosegundos. ");

        //int pos1 = metodos.BusquedaSecuencial(arreglo2, 50108);
        if (pos1 !=-1) {
            System.out.println(" \n El valor de la posicion es : "+ pos1);

            
        }else{
            System.out.println("\n Valor no encontrado. ");

        }
        System.out.println();

        long starTimeBinaria = System.nanoTime();
        int pos = metodos.BusquedaBinaria(arreglo2, 50108);
        long endTimeBinaria = System.nanoTime();
        System.out.println(" \n Tiempo de ejecucion de la busqueda binaria " + (endTimeBinaria - starTimeBinaria)+ " Nanosegundo. ");

        //int pos = metodos.BusquedaBinaria(arreglo2, 50108);
        if (pos !=-1) {
            System.out.println(" \n El valor de la posicion es : "+ pos);

            
        }else{
            System.out.println("\n Valor no encontrado. ");

        }


       

    }
}
