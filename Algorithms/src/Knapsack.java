public class Knapsack { 
 
 
  public int solve(int[] profits, int[] weights, int capacity) { 
    Integer[][] dp = new Integer[profits.length][capacity + 1]; 
    return this.knapsackRecursive(dp, profits, weights, capacity, 0); 
  } 
 
 
  private int knapsackRecursive(Integer[][] dp, int[] profits, int[] weights, int capacity, 
      int currentIndex) { 
 
 
    // base checks 
    if (capacity <= 0 || currentIndex >= profits.length) 
      return 0; 
 
 
    // if we have already solved a similar problem, return the result from memory 
    if(dp[currentIndex][capacity] != null) 
      return dp[currentIndex][capacity]; 
 
 
    // recursive call after choosing the element at the currentIndex 
    // if the weight of the element at currentIndex exceeds the capacity, we shouldn't process this 
    int profit1 = 0; 
    if( weights[currentIndex] <= capacity ) 
        profit1 = profits[currentIndex] + knapsackRecursive(dp, profits, weights, 
                capacity - weights[currentIndex], currentIndex + 1); 
 
 
    // recursive call after excluding the element at the currentIndex 
    int profit2 = knapsackRecursive(dp, profits, weights, capacity, currentIndex + 1); 
 
 
    dp[currentIndex][capacity] = Math.max(profit1, profit2); 
    return dp[currentIndex][capacity]; 
  } 
 
 
  public static void main(String[] args) { 
    Knapsack ks = new Knapsack(); 
    int[] values = { 10, 5, 30, 8, 12, 30, 50, 10, 2, 10, 40, 80, 100, 25, 10, 5}; 
    int[] weights = { 1, 4, 6, 2, 5, 10, 8, 3, 9, 1, 4, 2, 5, 8, 9, 1}; 
    int maxProfit = ks.solve(values, weights, 7); 
    System.out.println("Total knapsack profit ---> " + maxProfit); 
    maxProfit = ks.solve(values, weights, 6); 
    System.out.println("Total knapsack profit ---> " + maxProfit); 
  } 
}