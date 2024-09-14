//we are using hashmap and the concept of prefixSum

import java.util.*;

public class ZeroSumSubarrays {
    public static List<int[]> findZeroSumSubarrays(int[] nums) {
        List<int[]> results = new ArrayList<>();
        Map<Long, List<Integer>> sumToIndices = new HashMap<>();
        
        sumToIndices.put(0L, new ArrayList<>(Arrays.asList(-1)));
        
        long sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            if (sumToIndices.containsKey(sum)) {
                List<Integer> starts = sumToIndices.get(sum);
                for (int start : starts) {
                    results.add(new int[]{start + 1, i});
                }
            }
            
            sumToIndices.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
        
        return results;
    }
}
