/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author macstudent
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        Project2 p = new Project2();
        p.pattern(5);
     p.starpattern(4);
             p.printTriangle(5);
             double a = 1_000__00.00;
             System.out.println(a);
             String s1 = "Hello";
                     String s2 = s1;
                     String s3 = new String();
                      s3 = "Hello";
                      String s4 = new String ("Hello");
                      int aop[] = {10,20,30};
                            int b[] = new int[]{1,2,3,4};
                            int []c = new int [10];
                            int d[];
                            d = new int[10];
                            d[0] = 100;
                            for(int i = 1; i<= 10; i++)
                                
                            {
                            d[i-1] = i*100;
                            }
                     
                             if (s4.equals(s3))
                             {
                                 System.out.println("print");
                                 
                             }
                             else 
                             {
                                System.out.println("not printed");

                             }
                            
                             
                             
    }
                        
                            
    public void pattern(int n) {
        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
        System.out.println();

    }

    public void starpattern(int n) 
    {
        int i, j;
        for(i=1; i<=n; i++)
        {
        for(j=1; j<=i; j++)
        {
        System.out.print("*");
        }
         System.out.println();
         
        }
            System.out.println();
         

    }

    private static void printTriangle(int n)
   {
       
       for(int i = 1; i <= n; i++)
       {
           for(int j = 1; j <= n - i; j++)
           {
               System.out.print("  ");
           }
           
           for(int k = 1; k <= i; k++)
           {
               System.out.print("*   ");
           }
           
           System.out.println();
       }
   }
    
    
    public static void main(int a, int b)
    {
        System.out.println(a+b);
    }
    
}
