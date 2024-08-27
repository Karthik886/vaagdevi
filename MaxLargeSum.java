// Sum of all max sum elements.
// Max sum
public class MaxLargeSum {
    public static void main(String[] args) {
        Calc c=new Calc();
        int result=c.subArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
        System.out.print("Largest sum in the array: "+result);
    }
}
class Calc {
    public int subArray(int nums[]) {
        int sum=0,max=0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            max=Math.max(max,sum);
            if(sum<0)
                sum=0;
        }
        return max;
    }
}
