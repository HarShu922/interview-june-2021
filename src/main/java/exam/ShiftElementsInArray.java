package exam;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
             
        int [] arr = new int [] {1, 2, 3, 4, 5};              
        int n = 3;                 
        System.out.println("Original Array: ");    
        for (int i = 0; i < arr.length; i++) 
        {     
            System.out.print(arr[i] + " ");     
        }      
                   
        for(int i = 0; i < n; i++)
        {    
            int j, last;               
            last = arr[arr.length-1];                
            for(j = arr.length-1; j > 0; j--)
            {                     
                arr[j] = arr[j-1];    
            }             
            arr[0] = last;    
        }          
        System.out.println();                          
        System.out.println("Array After Right Rotation: ");    
        for(int i = 0; i< arr.length; i++)
        {    
            System.out.print(arr[i] + " ");    
        }        
    
  }

}
