class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> hashSet = new HashSet<Integer>();
        for(int num : nums){
            hashSet.add(num);
        }
        int maxLen = 0;
        for(int num:nums){
            if(!hashSet.contains(num-1)){
                int currNum = num;
                int CurrLen = 1;

                while(hashSet.contains(currNum+1)){
                    currNum+=1;
                    CurrLen+=1;
                }
                maxLen = Math.max(maxLen,CurrLen);
            }
        }
        return maxLen;
    }
}
