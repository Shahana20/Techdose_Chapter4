class Solution {
    public int findKthLargest(int[] nums, int k) {
       int val=nums.length-k;
       return findIndex(nums,k,0,nums.length-1);
       
    }

    public int findIndex(int [] nums,int val,int low,int high)
    {
        int pivot=swap(nums,low,high);
        if(pivot==val-1)
        {
            return nums[pivot];
        }
        else if(pivot<val-1)
        {
            return findIndex(nums,val,pivot+1,high);
        }
        else
        {
            return findIndex(nums,val,low,pivot-1);
        }

    }

    public int swap(int [] nums,int low,int high){
        int pivotPoint=nums[high];
        int j=low;
        for(int i=low;i<=high;i++)
        {
            if(nums[i]>pivotPoint)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        int temp=nums[high];
        nums[high]=nums[j];
        nums[j]=temp;
        return j;
    }

}