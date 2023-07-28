// 5.Write a java program to find the index of a substring.
public class June5th1_5 {
    public static void main(String[] args) {
        String strOrig = "my name is Abhishek";
        int intIndex = strOrig.indexOf("name");
        
        if(intIndex == - 1) {
           System.out.println("Not found");
        } else {
           System.out.println("Found at index " + intIndex);
        }
    }
}