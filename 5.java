import java.util.*;
public class Count{
    public String reverse(String []arr){
        int x;
        StringBuilder s = new StringBuilder("");
		for(int i=0;i<arr.length;i++)
		{
			x=arr[i].length()-1;
			for (int j=0;j<=x;j++)
			{
			  	s.append(arr[i].charAt(x-j));
			}
			s.append(" ");
		}
		return s.toString();
    }
    public String revrev(String []arr){
        int x;
        StringBuilder s = new StringBuilder("");
		for(int i=0;i<arr.length;i++)
		{
			x=arr[i].length()-1;
			for (int j=0;j<=x;j++)
			{
			    s.append(arr[i].charAt(x-j));
			}
			s.append(" ");
		}
		return s.toString();
    }
    public String rev(String []arr){
        int x;
        StringBuilder s = new StringBuilder("");
		x=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			s.append(arr[x-i]);
			s.append(" ");
		}
		return s.toString();
    }
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Sentence");
		while(sc.hasNext()){
			String p=sc.nextLine();
			String[] arr=p.split(" ");
			
			String m = new String("");
			int x,h;
			int word=0;
			Count a=new Count();
			    m=a.rev(arr);
			 System.out.print(m+"\n");
			 System.out.print(a.reverse(arr)+"\n");
			  
			 String ar[] = m.split(" ");
			 System.out.print( a.revrev(ar));
		}
	}
}