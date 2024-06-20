class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int out = 0;
        
        for(int i=nums.length-1; i>1; i--){
            for(int j=i-1; j>0; j--){
                for(int k=j-1; k>=0; k--){
                    int a = nums[i];
                    int b = nums[j];
                    int c = nums[k];
                    if((c >= a+b) || (b >= a+c) || (a >= c+b)){
                        break;
                    }
                    if((a < b+c) && (b < a+c) && (c < a+b)){
                        out = a+b+c;
                        return out;
                    }
                }
            }
        }

        return out;
        
    }
}
