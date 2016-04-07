import java.util.Scanner;

/**
 *
 * @author ABDULQM
 */
public class Highest_Lowest_Grade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] A;
        A = new int [10];
        int grade;
        Scanner in = new Scanner(System.in);
        
        System.out.println ("Enter 10 test grades between 0 and 100.");
        
        
        
        for (int i=0 ; i<A.length; i++) {
        A[i] = in.nextInt();
        if (A[i] < 0 || A[i] > 100)
            {throw new IllegalArgumentException("Your grade must be between 0 and 100");
           
           }
        
        }
            
	int min = A[0];
	int max = A[0];
 
	for (int j = 1; j <= A.length - 1; j++) {
		if (max < A[j]) {
			max = A[j];
		}
 
		if (min > A[j]) {
			min = A[j];
		}
	
         
        
        }
	System.out.println("Your Lowest Grade is : " + min + "\nYour Highest Grade is: " + max);
        }
        
        
   
    }
