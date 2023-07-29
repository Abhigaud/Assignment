public class june5th3_2 {
    public static void main(String[] args ){
        String sb=new String("PWSKILLS");
        String reverse =new String("");

        for(int i=sb.length()-1; i>=0; i--){
            char atindx = sb.charAt(i);
            reverse = reverse+atindx; 
        }
        System.out.println(reverse);
    }   
}