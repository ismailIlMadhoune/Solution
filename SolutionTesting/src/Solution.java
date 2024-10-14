import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] tokens = {"2","1","+","3","*"}; // 2+1 * 3
        Solution sol = new Solution();
        sol.generateParenthesis(3);
        System.out.println("----------------------------------");
        System.out.println("OUTPUT: " + (sol.generateParenthesis(3)));
        System.out.println("----------------------------------");
//Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]

    }
    

    Stack<Character> stack = new Stack<>();
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backtrack(0, 0, n);
        return res;
    }

    private void backtrack(int openN, int closedN, int n) {
        if (openN == closedN && closedN == n) {q
            StringBuilder sb = new StringBuilder();
            for (Character c: stack) {
                sb.append(c);
            }
            res.add(sb.toString());
        }
        if (openN < n) {
            stack.push('(');
            backtrack(openN + 1, closedN, n);
            stack.pop();
        }
        if (closedN < openN) {
            stack.push(')');
            backtrack(openN, closedN + 1, n);
            stack.pop();
        }
    }
    public static int[] PrefixAvg(int[] X) { // 1 , O(n^2)
        int length = X.length - 1;
        int[] A = new int[length];
        for (int i = 0; i < length; i++) {
            int s = X[0];
            for (int j = 1; j < length; j++) {
                if(j <= i){
                    s += X[j];
                }
                
            }
            A[i] = s/(i+1);
        }
        return A;
    }
    public static int[] PrefixAvg2(int[] X){ // 2 , O(n)
        int length = X.length - 1;
        int[] A = new int[length];
        int s = 0;
        for (int i = 0; i < length; i++) {
            s += X[i];
            A[i] = s / (i+1);
        }
        return A;
    }
}