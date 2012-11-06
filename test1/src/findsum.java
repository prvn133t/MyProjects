import java.util.Scanner;
import java.util.Random;
public class findsum {
	public static void main(String[] args) {
//		summer(100);
	//System.out.println(summer(100));
	Scanner sc = new Scanner(System.in);
	System.out.print("Pls enter a new value : ");
	int userinput = sc.nextInt();
	if (userinput > 100) {
		System.out.println("Enter a value less than 100");
	}
	else {
		System.out.print("The random number is : ");
		rndm(userinput);
		}
	}
	
	public static int summer(int n){
		int sum = 0;
		for(int i=0;i<=n;i++){
			sum = sum+i;
		}
		return sum;
	}
	
	public static void rndm(int num){
		int no = (int)(Math.random()*num);
		System.out.println(no);
		//return no;
	}
}


