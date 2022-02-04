package evaluacionioswaldm;
import java.util.Scanner;
/**
 *
 * @author OSWALD
 */
public class EvaluacionIOswaldM {
    
    Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        EvaluacionIOswaldM llamado = new EvaluacionIOswaldM();
        
        llamado.funcion1();
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
            
            //LLENAR LA TERCERA MATRIZ:
            System.out.println("");
            int M_3[][] = new int[f1][c1];
            for (int i = 0; i < f1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print("Ingrese un elemento de su tercera matriz: ");
                    M_3[i][j] = entrada.nextInt();
                }
            }
            //MOSTRAR TERCERA MATRIZ:
            System.out.println("\nSu tercera matriz es: ");
            for (int i = 0; i < c1; i++) {
                for (int j = 0; j < f1; j++) {
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
