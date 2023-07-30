public class Main {
    public static void main(String[] args) {


    }

    class Solution {
        public int missingNumber(int[] nums) { // suppose nums length = 4
            int n = nums.length, sum = n*(n+1)/2; // 1 added since one value is missing
            // n = 4
            // sum = 4*5/2 = 10.  0 + 1 + 2 + 3 + 4 = 10.
            // this is just a math thing. i'm not quite sure how to explain it but it makes sense
            // could also for-loop the sum for logical answer adding up values at index 0 through leength
            for(int i : nums) sum -= i; //  subtact value from known total
            return sum;
        }
    }
}