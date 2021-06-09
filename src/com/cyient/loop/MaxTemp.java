package com.cyient.loop;

public class MaxTemp {

	public static void main(String[] args) {
		float f[] = {10.0f, 12.1f,15.4f, 9.3f,18.9f};
		
		float max = f[0];
		float min = f[0];
		for(int i=1; i<f.length;i++)
		{
			if(f[i]>max)
			{
				max = f[i];
			}
		}
		for(int i=1; i<f.length;i++)
		{
			if(f[i]<min)
			{
				min = f[i];
			}
		}
	
     System.out.println(max);
     System.out.println(min);
	}

}
