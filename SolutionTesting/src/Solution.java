import java.util.Scanner;

public class Solution {
    public static int counter(int[][] slot,int[][] coin, int numOfSlots,int numOfCoins){
        int count = 0;
        for (int j = 0; j < numOfCoins; j++) {
            for (int i = 0; i < numOfSlots; i++) {
                if(coin[j][0] <= slot[i][0] && coin[j][1] >= slot[i][1]){
                    count += i+1;
                    break;
                
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Initialize a Scanner to read input from standard input (console)
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Read the number of slots (s)
        int s = sc.nextInt();

        // Step 2: Declare an array to store slot dimensions and trigger masses
        // Each slot will have two attributes: width (a) and trigger mass (b)
        int[][] slots = new int[s][2];

        // Step 3: Read the slots information (width and trigger mass)
        for (int i = 0; i < s; i++) {
            slots[i][0] = sc.nextInt(); // Slot width (a)
            slots[i][1] = sc.nextInt(); // Slot trigger mass (b)
        }

        // Step 4: Read the number of coins (c)
        int c = sc.nextInt();

        // Step 5: Declare an array to store coin dimensions and masses
        // Each coin will have two attributes: thickness (u) and mass (v)
        int[][] coins = new int[c][2];

        // Step 6: Read the coins information (thickness and mass)
        for (int j = 0; j < c; j++) {
            coins[j][0] = sc.nextInt(); // Coin thickness (u)
            coins[j][1] = sc.nextInt(); // Coin mass (v)
        }

        // Now you have all the input stored in 'slots' and 'coins'
        // You can proceed to implement the logic for processing these inputs
        
        // Example (optional): Printing the inputs back to ensure correct reading
        System.out.println("Slots: ");
        for (int i = 0; i < s; i++) {
            System.out.println("Width: " + slots[i][0] + ", Trigger Mass: " + slots[i][1]);
        }

        System.out.println("Coins:");
        for (int j = 0; j < c; j++) {
            System.out.println("Thickness: " + coins[j][0] + ", Mass: " + coins[j][1]);
        }
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("OUTPUT: " + counter(slots, coins, s, c));
        System.out.println();
        System.out.println();        
        System.out.println("---------------------------------");

        // Close the scanner
        sc.close();
    
}
}


