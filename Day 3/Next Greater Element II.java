class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int N = nums.length;
        int arr[] = new int[N];
        Stack<Integer> st = new Stack<>();
        for(int i=2*N-1;i>=0;i--){
            while(st.isEmpty() == false && st.peek() <= nums[i%N]){
                st.pop();
            }
            if(i<N){
                if(st.isEmpty() == false)
                   arr[i] = st.peek();
                else
                   arr[i] = -1;   
            }
            st.push(nums[i%N]);
        }
        return arr;
    }
}
