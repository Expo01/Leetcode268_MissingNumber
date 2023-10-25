public class Main {
    public static void main(String[] args) {
    }
}

// optimized use of XOR ^
class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}

// this is combined where we can think of it like
// missing = 0
// missing ^= (i ^ numd[i])

// say the expected set and actual set is
// 0,1,2,3,4
// 0,1,2, ,4
// missing will have been flippped on and off for all items except 3
// since 0 XOR any digit just that digit, we are left with 3




class Solution {
    public int missingNumber(int[] nums) {
        int expectedXor = 0;
        for(int i = 0; i <= nums.length; i++){
            expectedXor ^= i;
        }

        int actualXor = 0;
        for(int num:nums){
            actualXor ^= num;
        }

        return expectedXor ^ actualXor;
    }
}


// concept that comparing expected binary to actual binary after XORs will result in missing binary
// 0,1,2,3 = expected in sequential range with no missing numbers
// 0,1,3,4 = actual is range with 1 missing number

// expected as binaries for 0-nums.length (5 items for 0-5)
// 000
// 001
// 010
// 011
// 100
// XOR all = 100

// actual as binaries for 0-nums.length-1 (4 items for 0-5, missing number 2)
// 000
// 001
// 011
// 100
// XOR all = 110

// 100 XOR 110 = 010 = 2






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