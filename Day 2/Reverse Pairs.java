class Solution {
    public int reversePairs(int[] nums) {
        return mergeCount(nums,0,nums.length-1);
    }
    static int mergeCount(int[] nums,int low,int high){
        if(low >= high) return 0;
        int mid = (low+high)/2;
        int count = mergeCount(nums,low,mid);
        count += mergeCount(nums,mid+1,high);
        count += merge(nums,low,mid,high);
        return count;
    }
    static int merge(int[] nums,int low,int mid,int high){
        int count = 0,j=mid+1;
        for(int i=low;i<=mid;i++){
            while(j <= high && nums[i] > (2*(long) nums[j])){
                j++;
            }
            count += (j-(mid+1));
        }
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int lft = low, rgt = mid+1;
        while(lft <= mid && rgt <= high){
            if(nums[lft] <= nums[rgt]){
                temp.add(nums[lft++]);
            }else{
                temp.add(nums[rgt++]);
            }
        }
        while(lft <= mid){
            temp.add(nums[lft++]);
        }
        while(rgt <= high){
            temp.add(nums[rgt++]);
        }
        for(int i = low;i <= high;i++){
            nums[i] = temp.get(i-low);
        }
        return count;
    }
}
