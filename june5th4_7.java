/* 7. Write a program to delete all consonants from the string "Hello, have a good day". */
public class june5th4_7 {
    public static void main(String args[]){
        StringBuilder str =new StringBuilder("Hello, have a good day");
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                str.deleteCharAt(i);
            }
        }
        System.out.println(str);
    }
}
