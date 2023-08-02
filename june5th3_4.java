import java.util.Arrays;
public class june5th3_4 {
    static void sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
    public static void main(String[] args) {
        String s = "aabbzzncedt";
        sortString(s);
    }
}

// public class june5th3_4 {
//     public static void main(String[] args){

//     }
// }
