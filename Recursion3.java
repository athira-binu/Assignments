package firstAssignment;

public class Recursion3 {

	
		  static int n1=0,n2=1,n3=0;      
		     public static void printFibo(int count){      
		        if(count>0){      
		             n3 = n1 + n2;      
		             n1 = n2;      
		             n2 = n3;      
		             System.out.print(" "+n3);     
		             printFibo(count-1);      
		         }      
		     }        
		  
		public static void main(String[] args) {  
		    int count=5;      
		     System.out.print(n1+" "+n2);//printing 0 and 1      
		      printFibo(count-2);//n-2 because 2 numbers are already printed     
		}  
		

	}
//count =5 print n1  and n2 and then reduce the count to 3 
//count =3 n3=0+1 n1=1 n2=1 print n3=1 count =2
//count =2 n3=1+1 n1= 1 n2=2 print n3=2 count =1
//count =1 n3=1+2 n1=2 n2=3 print n3=3 count =0

