import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="hello";
        String d="world";
        s=s+d;
        d=s.substring(0,(s.length()-d.length()));
        s=s.substring(d.length());
        System.out.println(s);
        System.out.println(d);
    }
}
