package plan;

public class Code724 {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int left=0;
        int right=sum;
        for(int i=0;i<nums.length;i++){
            right-=nums[i];
            if(i>0) {
                left += nums[i - 1];
            }
            if(right==left){
                return i;
            }
        }
        return -1;
    }
}
