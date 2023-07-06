
import java.util.Scanner;
class Caesercipher{

    // Function to move string character
    static void encode(String s, int k) {

        // changed string
        String newS = "";

        // iterate for every characters
        for (int i = 0; i < s.length(); ++i) {
            // ASCII value
            int val = s.charAt(i);
            // store the duplicate
            int dup = k;

            // if k-th ahead character exceed 'z'
            if (val + k > 122) {
                k -= (122 - val);
                k = k % 26;

                newS += (char)(96 + k);
            } else {
                newS += (char)(val + k);
            }

            k = dup;
        }

        // print the new string
        System.out.println(newS);
    }

    static void decode(String s, int k) {

        // changed string
        String newS = "";

        // iterate for every characters
        for (int i = 0; i < s.length(); ++i) {
            // ASCII value
            int val = s.charAt(i);
            // store the duplicate
            int dup = k;

            // if k-th ahead character exceed 'z'
            if (val - k < 97) {
                k -= (val - 97);
                k = k % 26;
                newS += (char)(123 - k);
            } else {
                newS += (char)(val - k);
            }


            k = dup;
        }

        // print the new string
        System.out.println(newS);
    }

// Driver Code

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        int k;
        System.out.println("enter 1 for encode and 2 for decode");
        int op=sc.nextInt();

        System.out.println("enter string");
        str=sc.next();
        System.out.println("enter the value of k");
        k=sc.nextInt();

        if(op==1)
        // function call
        {
            encode(str, k);
        }
        else
        {
            decode(str,k);
        }
    }
}





