
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int mid=nums.length/2;
        int num=nums[mid];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num){
                count++;
            }
        }
        if(count>nums.length/2){
            return num;
        }
        return 0;
    }
}
