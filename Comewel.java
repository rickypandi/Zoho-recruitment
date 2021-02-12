package com.zoho.Ans;

public class Comewel {
	
	public static void main(String[] args) 
	{
		
		String var ="WELCOME";
		char temp;
		String res="";
		
		int length =var.length()/2;
		System.out.println("lenghth is "+length);
		for(int i=0;i<length;i++) 
		{
			temp=var.charAt(i);
			res=res+temp;
			
		}
		System.out.println("res is "+res);
		String come="";
		for(int i=length;i<var.length();i++) 
		{
			
			temp=var.charAt(i);
			come=come+temp;
			
		}
		String lastval =come+res;
		System.out.println("final is "+lastval);
		for(int i=1;i<lastval.length();i++) 
		{
			for(int k=0;k<=i;k++) 
			{
				
				System.out.print(lastval.charAt(k));
				
				
			}
			System.out.println();
		}
		
	}

	

}
