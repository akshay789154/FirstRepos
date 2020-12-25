package sample;

public class sortingArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int li=0;
		int hi=a.length-1;
		int search=6;
		int min=(li+hi)/2;
		
		while(li<=hi)
		{
			if(a[min]==search) 
			{
				System.out.println(a[min]);
			}
		else if(a[min]<search) 
		     {
				li=min+1;
				
			}
			else 
			{
				hi=min-1;
			}
			min=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println("element not found");
		}
		
		
	}

}
