package sorting;
import java.io.*;
public class Bubblesort {
	int A[];
	public void input()throws IOException
	{
	InputStreamReader isr= new InputStreamReader(System.in);
	   BufferedReader br= new BufferedReader(isr);
	
	  A= new int[5];
	
	  for(int i=0;i<A.length;i++)
	  {
		System.out.println("Enter elements in array ");
		A[i]=Integer.parseInt(br.readLine());
	}
	}
	
	  public void sort()
	  {
		  int n = A.length; 
	        for (int i = 0; i < n-1; i++)
	        {
	            for (int j = 0; j < n-i-1; j++) 
	            {
	                if (A[j] > A[j+1]) 
	                {  
	                    int temp = A[j]; 
	                    A[j] = A[j+1]; 
	                    A[j+1] = temp; 
	                }
	  }
	  }
	  }
	public static void main(String[] args)throws IOException
	{ 
	   Bubblesort obj= new Bubblesort();
	   obj.input();
	   obj.sort();
	   
		

	}

}
