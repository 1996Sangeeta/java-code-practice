import java.util.*;
public class Gstsolution {
    public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		float pencil = sc.nextFloat();
		float pen = sc.nextFloat();
		float eraser = sc.nextFloat();
		float total = pencil+pen+eraser;
		System.out.println("Bill is : " +total);
		//add on-with 18% tax
		float newTotal = total + (0.18F*total);
		System.out.println("Bill with 18% tax:" +newTotal);
	}   
}
