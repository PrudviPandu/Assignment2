import java.util.*;
public class Count{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		while(sc.hasNext()){
			String p = sc.nextLine();
			String[] arr = p.split(" ");
			int word = 0;
			for(int i = 0; i<arr.length; i++){
				word++;
			}
			System.out.println(word);
		}
	}
}