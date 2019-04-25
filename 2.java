import java.util.*;
public class Count{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Sentence");
		StringBuilder s = new StringBuilder("");
		while(sc.hasNext()){
			String p=sc.nextLine();
			String[] arr=p.split(" ");
			int x,h;
			for(int i=0;i<arr.length;i++){
			   	x=arr[i].length()-1;
			   	for (int j=0;j<=x;j++){
			   		s.append(arr[i].charAt(x-j));
			   	}
               	s.append(" ");
			}
			String as = s.toString();
		System.out.println(as);		
		}
	}
}