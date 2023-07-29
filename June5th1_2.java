// 2.Write a java program to know whether the given string is palindrome
public class June5th1_2 {
    public static void main(String args[]){
        String sb=new String("abcba");
        String reverse =new String("");

        for(int i=sb.length()-1; i>=0; i--){
            char atindx = sb.charAt(i);
            reverse = reverse+atindx; 
        }
        if(reverse.equals(sb)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}