package Decorator;

import java.io.BufferedReader; 
import java.io.IOException;  
import java.io.InputStreamReader;  
public class DecoratorFood {  
    private static int  choice;  
    public static void main(String args[]) throws NumberFormatException, IOException    {  
       do{        
 System.out.println("Select choice 4 to exit");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
        choice=Integer.parseInt(br.readLine());  
        switch (choice) {  
        case 1:{   
                 VegFood vf=new VegFood();  
              System.out.println(vf.prepareFood());  
              System.out.println( vf.foodPrice());  
            }  
            break;  
              
                case 2:{  
                Food f1=new NonvegFood((Food) new VegFood());  
                    System.out.println(f1.prepareFood());  
                System.out.println( f1.foodPrice());  
        }  
            break;     
              
         default:{    
            System.out.println("Other than these no food available");  
        }         
    return;  
     }
          
}while(choice!=4);  
    }  
}  
