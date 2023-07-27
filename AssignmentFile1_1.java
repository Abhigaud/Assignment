// 1.Write a java program to Reverse a string without using the inbuilt method.
public class AssignmentFile1_1{
    public static void main(String[] args ){
        String sb=new String("abcdef");
        String reverse =new String("");

        for(int i=sb.length()-1; i>=0; i--){
            char atindx = sb.charAt(i);
            reverse = reverse+atindx; 
        }
        System.out.println(reverse);
    }
}