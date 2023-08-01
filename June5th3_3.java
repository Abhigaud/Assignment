/*Q.3. WAP to reverse a sentence while preserving the position
	Input: “Think Twice”
	Output: “knihT eciwT”
 */
public class June5th3_3 {
    public static void main(String[] args ){
        String str ="Think Twice";
        String reverse ="";
        String sarr[] = str.split("");
        for(String elem: sarr){
            for(int i=elem.length()-1; i>0; i--){
                reverse =reverse+elem.charAt(i);
            }
            reverse = reverse+"";
        }
        System.out.println(reverse);
    }   
}
