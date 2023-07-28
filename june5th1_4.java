// 4.Write a java program to remove a particular character from a String.

public class june5th1_4 {
    public static void main(String [] args){
        String s1="Abhishek";
        String s2="";
        char rmv ='i';

        for(int i=0; i<s1.length(); i++){
            char idx= s1.charAt(i);
            if(idx==rmv){
                continue;
            }else{
                s2=s2+idx;
            }
        }
        System.out.println(s2);
    }
}
