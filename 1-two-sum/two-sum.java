class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map <Integer,Integer> mp = new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
          Integer ind=mp.get(nums[i]);
          if(ind!=null)
          {
              return new int[]{i,ind};
          }
          mp.put(target-nums[i],i);
      }
      return nums;
    }
}