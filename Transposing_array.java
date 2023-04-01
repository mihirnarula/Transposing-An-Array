/*
Transposing an array
*/

package transposing_array;
import java.util.*;
public class Transposing_array {

    int arr[][] = new int [4][4];
    int arr_tra[][] = new int [4][4];
    
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 16 elements: ");
        int a,b;
        
        for(a = 0; a < 4; a++){
            for(b = 0; b < 4; b++){
                arr[a][b] = sc.nextInt();
            }
        }        
                System.out.println("ARRAY");

        for(a = 0; a < 4; a++){
            for(b = 0; b < 4; b++){
                System.out.print(arr[a][b]+"  ");
            }
            System.out.println("");
            }
    
    }
    
    void transpose(){
       
        int a,b;
        for(a = 0; a < 4; a++){
            for(b = 0; b < 4; b++){
                arr_tra[a][b] = arr[b][a];
            }
        }
        System.out.println("");
    }
    
    void display(){
        int a,b;
        System.out.println("TRANSPOSE");
        for(a = 0; a < 4; a++){
            for(b = 0; b < 4; b++){
                System.out.print(arr_tra[a][b]+"  ");
            }
            System.out.println("");
            }
    }
    
    
    public static void main(String[] args) {
        
    Transposing_array ob = new Transposing_array();
    
    ob.input();
    ob.transpose();
    ob.display();
    }
    
}
