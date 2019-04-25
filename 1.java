import java.util.*;
public class Count{
    public int res(int x){
        int sum = 0;
        for(int i = 0; i < x+1; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum+= i;
            }  
        }
    return sum;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of Number");
		int sum;
		int n = sc.nextInt();
		Count s = new Count();
	    sum = s.res(n);
	    System.out.println(sum);
	}
}