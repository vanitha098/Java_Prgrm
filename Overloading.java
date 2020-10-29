class Sum { 
 
	int sum(int x, int y) 
	{ 
		return (x + y); 
	} 

	int sum(int x, int y, int z) 
	{ 
		return (x + y + z); 
	} 
    float sum(float x, float y, float z) 
	{ 
		return (x + y + z); 
	} 

	double sum(double x, double y) 
	{ 
		return (x + y); 
	} 
}
public class Overloading{ 
	public static void main(String args[]) 
	{ 
		Sum s = new Sum(); 
		System.out.println(s.sum(10, 20)); 
		System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.0f, 20.0f, 30.0f));  
		System.out.println(s.sum(10.5, 20.5)); 
	} 
} 
