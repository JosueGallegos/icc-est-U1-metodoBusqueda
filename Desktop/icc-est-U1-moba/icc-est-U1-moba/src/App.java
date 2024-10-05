import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        MetodoOrdenamiento metodoOrdenamiento = new MetodoOrdenamiento();

        Scanner scanner = new Scanner(System.in);

        int tamano = leerEnteroValido(scanner,"Ingrese el tamaño del arrglo: ",false);

        int [] arreglo = new int[tamano];
        
        System.out.println("Ingrese los elementos del arreglo: ");
        for(int i = 0; i < tamano; i++){
            arreglo[i] = leerEnteroValido(scanner, "Elemento "+ (i+1)+ ": ",true);

        }

        System.err.println("Elemento del Arreglo Ingresado: ");
        for(int i : arreglo){
            System.out.print(i);

        }

        scanner.close();
    }

         public static int leerEnteroValido(Scanner scanner, String mensaje, boolean permitirNegativos) {
        int numero;
        do {
            System.out.println(mensaje);
           
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                System.out.println(mensaje);
                scanner.next(); 
            }
            numero = scanner.nextInt();
            
            if (!permitirNegativos && numero < 0) {
                System.out.println("No se permiten números negativos. Por favor, ingrese un número entero positivo.");
            }
        } while (!permitirNegativos && numero < 0); 
        return numero;
    

        /*System.out.println("Ingrese el tamaño de arreglo: ");
        int tamaño = scanner.nextInt();


       do{
            System.out.println("Ingrese el tamaño que sea entero positivo: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Entrada invalida. Porvafor, ingrese un numero entero positivo");
                System.out.println("Ingrese el tamaño del arreglo(Entero positivo). ");
                scanner.next();
            
            }
            tamaño= scanner.nextInt();
            if (tamaño<=0) {
                System.out.println("El tamaño del arreglo debe ser entero positivo mayor que 0. ");
                
            }
       }while(tamaño <=0);
        
       int [] arreglo = new int [tamaño];*/

        

        //int [] arreglo = {1,2,3,4,5};

        //metodoOrdenamiento.sortBubbleAva(arreglo);
        //metodoOrdenamiento.PrintArreglo(arreglo);
        

       
    }
}
