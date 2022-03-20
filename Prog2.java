/*
2º prog: mostrar todos os múltiplos de 3 e 7 que não são múltiplos de 2
 */
package prog2;
import java.util.Scanner;
public class Prog2{

    public static void main(String args[]) {
        int i;
        Scanner my_scan = new Scanner(System.in);
        
        System.out.println("O programa ira mostrar todos os valores multiplos de 3 e 7 que não sejam multiplos de 2 entre os valores inseridos\n");
        
        System.out.println("\nInsira o valor minimo: ");
        int minimo = my_scan.nextInt(); //Armazena o valor digitado dentro da variável minimo
        
        System.out.println("\nInsira o valor maximo: ");
        int maximo = my_scan.nextInt(); //Armazena o valor digitado dentro da variável maximo
        System.out.println("\n");
        
        for(i=minimo; i<=maximo; i++){ //define o inicio da contagem de i com o valor de minimo; enquanto i for menor ou igual a maximo; i adiciona +1
            if(i%3 == 0 && i%7 == 0){ //Se o resto de i dividido por 3 for 0 ou o resto de i dividido por 7 for 0, passa para o proximo if
                if(i%2!=0){ //Se o resto de i dividido por 2 for 0, mostra na tela o valor de i
                System.out.println(i);
                }
            }
        }
    }
}
