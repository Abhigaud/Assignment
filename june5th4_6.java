/*
6. Write a program to check if the letter 'e' is present in the word 'Umbrella'.
 */
public class june5th4_6 {
    public static void main(String args[]){
        String str="Umbrella";
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(ch=='e'){
                System.out.println("Present");
                break;
            }
        }
    }
}
