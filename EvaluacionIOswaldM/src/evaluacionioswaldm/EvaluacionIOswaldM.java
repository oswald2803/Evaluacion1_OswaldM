package evaluacionioswaldm;
import java.util.Scanner;
/**
 *
 * @author OSWALD
 */
public class EvaluacionIOswaldM {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        EvaluacionIOswaldM llamado = new EvaluacionIOswaldM();
        
        int opcion;
        //INVOCACION DE LOS MÉTODOS A TRAVÉS DE UN MENU BASADO EN CICLO DO WHILE Y SENTENCIA SWITCH
        do{
        System.out.println("\nBienvenido al Menu de Funciones, por favor escoja una");
        System.out.println("1: Funcion 1");
        System.out.println("2: Funcion 2");
        System.out.println("3: Funcion 3");
        System.out.println("4: Funcion 4");
        System.out.println("0: Salir");
        opcion = entrada.nextInt();
        
        switch(opcion){
            
            case 1:
                llamado.funcion1();
            break;
            
            case 2:
                llamado.funcion2();
            break;
            
            case 3:
                llamado.funcion3();
            break;
            
            case 4:
                llamado.funcion4();
            break;  
            
            case 0:
                break;
                
            default:
                System.out.println("Opcion incorrecta");
        }
        }while(opcion != 0);
    }
    //PRIMER EJERCICIO
    public void funcion1(){
        
        System.out.println("*** PRIMERA FUNCION ***");
                       
        System.out.print("Ingrese el numero de filas de su primera matriz: ");
        int f1 = entrada.nextInt();
        System.out.print("Ingrese el numero de columnas de su primera matriz: ");
        int c1 = entrada.nextInt();
        
        System.out.print("\nIngrese el numero de filas de su segunda matriz: ");
        int f2 = entrada.nextInt();
        System.out.print("Ingrese el numero de columnas de su segunda matriz: ");
        int c2 = entrada.nextInt();
        
        int M_1[][] = new int [f1][c1];
        int M_2[][] = new int [f2][c2];
        
        if (M_1.length != M_2.length){
            System.out.println("\nLas dimensiones de las matrices son distintas, por lo que no se pueden sumar");
        }
        
        else{
            //LLENAR PRIMERA MATRIZ:
            System.out.println(" ");
            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print("Ingrese un elemento de su primera matriz: ");
                    M_1[i][j] = entrada.nextInt();
                }
            }
            //MOSTRAR PRIMERA MATRIZ:
            System.out.println("\nSu primera matriz es: ");
            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(M_1[i][j] + " ");
                }
                System.out.println(" ");
            }
            
            //LLENAR SEGUNDA MATRIZ: 
            System.out.println("");
            for (int i = 0; i < f2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print("Ingrese un elemento de su segunda matriz: ");
                    M_2[i][j] = entrada.nextInt();
                }
            }
            //MOSTRAR SEGUNDA MATRIZ:
            System.out.println("\nSu segunda matriz es: ");
            for (int i = 0; i < f2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(M_2[i][j] + " ");
                }
                System.out.println(" ");
            }
            
            //SUMA DE M_1 Y M_2            
            int sum[][] = new int[f1][c1];
            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c1; j++) {
                    sum[i][j] = M_1[i][j] + M_2[i][j];
                }
            }
            //IMPRIMIR LA SUMA:
            System.out.println("\nLa suma de ambas matrices es: ");
            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println(" ");
            }
            
            //NUMERO DE FILAS Y COLUMNAS DE LA TERCERA MATRIZ:
            System.out.print("\nIngrese el numero de filas de su tercera matriz:");
            int f3 = entrada.nextInt();
            System.out.print("Ingrese el numero de columnas de su tercera matriz: ");
            int c3 = entrada.nextInt();
            
            //VERIFICAR SI ES DE LA MISMA DIMENSION DE LAS OTRAS:
            int M_3[][] = new int[f3][c3];
            //SI NO COINCIDEN:
            if(M_3.length != sum.length){
                System.out.println("Las matrices no se pueden multiplicar porque su numero de filas y/o columnas no coinciden");
            }     
            //SI COINCIDEN:
            else{
            //LLENAR LA TERCERA MATRIZ:
            System.out.println("");
            for (int i = 0; i < f3; i++) {
                for (int j = 0; j < c3; j++) {
                    System.out.print("Ingrese un elemento de su tercera matriz: ");
                    M_3[i][j] = entrada.nextInt();
                }
            }
            //MOSTRAR TERCERA MATRIZ:
            System.out.println("\nSu tercera matriz es: ");
            for (int i = 0; i < f3; i++) {
                for (int j = 0; j < c3; j++) {
                    System.out.print(M_3[i][j] + " ");
                }
                System.out.println(" ");
            }
            
            //MULTIPLICAR LAS MATRICES:
            int M_RESULTADO [][] = new int[f1][c1];
            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c1; j++) {
                    for (int k = 0; k < f1; k++) {
                    M_RESULTADO[i][j] += (sum[i][k] * M_3[k][j]);    
                    }
                }
            }
            //IMPRIMIR LA MATRIZ RESULTADO:
            System.out.println("\nLa matriz resultante es: ");
            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(M_RESULTADO[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
        }    
    }
    //SEGUNDO EJERCICIO:
    public void funcion2(){
    
           System.out.println("\n*** SEGUNDA FUNCION ***");
           
           System.out.print("Ingrese el numero de filas de su matriz: ");
           int filas = entrada.nextInt();
           System.out.print("Ingrese el numero de columnas de su matriz: ");
           int columnas = entrada.nextInt();
           
           int matriz [][] = new int[filas][columnas]; 
           
           //LLENAR LA MATRIZ:
           for (int X = 0; X < filas; X++) {
               for (int Y = 0; Y < columnas; Y++) {
                   matriz[X][Y] = (int) (23 * (Math.pow(X,4)) + 20 * (Math.pow(Y,3)) - 3);
               }
            }
           
            //IMPRIMIR LA MATRIZ:
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println(" ");
        }                          
    }
    
    //TERCER EJECICIO:
    public void funcion3(){
        
           System.out.println("\n*** TERCERA FUNCION ***");
           
           System.out.print("Ingrese el numero de filas de su matriz: ");
           int filas = entrada.nextInt();
           System.out.print("Ingrese el numero de columnas de su matriz: ");
           int columnas = entrada.nextInt();
           
           //VARIABLES PARA COMPROBAR SI LA MATRIZ ES IDENTIDAD:
           int ceros = 0, unos = 0;
           boolean identidad = true;
           
           int matriz[][] = new int[filas][columnas];
           
           //LLENADO DE LA MATRIZ:
           for (int i = 0; i < filas; i++) {
               for (int j = 0; j < columnas; j++) {
                   System.out.print("Ingrese un elemento de su matriz: ");
                   matriz[i][j] = entrada.nextInt();
               }
            }
           
           //IMPRIMIR LA MATRIZ:
           System.out.println("\nSu matriz es: ");
           for (int i = 0; i < filas; i++) {
               for (int j = 0; j < columnas; j++) {
                   System.out.print( matriz [i][j]+ " ");
               }
               System.out.println(" ");   
            }
           
           //RECORRIDO DE LA MATRIZ PARA COMPROBAR LOS ELEMENTOS:
           for (int i = 0; i < filas; i++) {
               for (int j = 0; j < columnas; j++) {
                   //IDENTIFICANDO LOS CEROS Y SUMANDOLOS EN VARIABLE ACUMULADORA:
                   if(matriz[i][j] == 0){
                   ceros++;
                   }
                   //IDENTIFICANDO LOS UNOS Y SUMANDOLOS EN VARIABLE ACUMULADORA:
                   else if(matriz[i][j] == 1){
                   unos++;
                   }
               }
               //SI LA CANTIDAD DE CEROS ES DIFERENTE AL NUMERO DE COLUMNAS MENOS 1 (LUGAR QUE OCUPA EL NÚMERO 1) O SI LA CANTIDAD DE UNOS ES DIFERENTE A 1
               if(ceros != (columnas-1)|| unos != 1){
                   identidad = false;
               } 
               //REINICIANDO VALORES:
               ceros = 0;
               unos = 0;
           }
           //SI SE CUMPLE QUE IDENTIDAD ES VERDADERO ENTONCES MOSTRAR MENSAJE
           if (identidad == true){
               System.out.println("La matriz es identidad");
           }
           //SI NO SE CUMPLE, ENTONCES MOSNTRAR MENSAJE
           else{
               System.out.println("La matriz no es identidad");
           }
    }
    //CUARTO EJERCICIO
    
    public void funcion4(){
        
        System.out.println("\n*** CUARTA FUNCION ***");
        
        System.out.print("\nIngrese la dimension de su matriz: ");
        int dimension = entrada.nextInt();
        int matriz [][] = new int [dimension][dimension];
        
        //LLENADO DE MATRIZ
        System.out.println(" ");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print("Ingrese un elemento de su matriz: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        //IMPRIMIR MATRIZ
        System.out.println("\nSu matriz es: ");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        //VARIABLE PARA COMPROBAR SI LA MATRIZ ES TRIANGULAR SUPERIOR
        boolean triangular = true;
        
        //EVALUANDO LA MATRIZ PARA COMPROBAR SI ES TRIANGULAR SUPERIOR
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(i > j && matriz[i][j] != 0){
                    triangular = false;
                }
                if(i <= j && matriz[i][j] == 0){
                    triangular = false;
                }
            }
        }     
        if (triangular == true){
            System.out.println("\nLa matriz es triangular superior");
        }
        else if (triangular == false){
            System.out.println("\nLa matriz no es triangular superior");
        }
    }
}
