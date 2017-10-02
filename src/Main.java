import java.util.*;
public class Main {
//字串字元置換
    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String str;
	char a,b;
    str=in.nextLine();
    a=in.next().charAt(0);
    b=in.next().charAt(0);

    System.out.println(str.replace(a,b));
    }
}
