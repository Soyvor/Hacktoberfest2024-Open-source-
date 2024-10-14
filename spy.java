import java.util.*; 
  
class GFG  
{ 
      
    // boolean function to  
    // check Spy number 
    static boolean checkSpy(int input) 
    { 
  
        int digit, sum = 0,  
               product = 1; 
        while (input > 0) 
        { 
            digit = input % 10; 
              
            // getting the 
            // sum of digits 
            sum += digit;  
              
            // getting the product 
            // of digits 
            product *= digit;  
            input = input / 10; 
        } 
          
        // Comparing the  
        // sum and product 
        if (sum == product) 
            return true; 
        else
            return false; 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int input = 1412; 
        if (checkSpy(input)) 
            System.out.println("The number is "+ 
                                "a Spy number"); 
        else
            System.out.println("The number is "+ 
                            "NOT a Spy number"); 
    } 
} 
