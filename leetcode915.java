public class leetcode915 {
    public static int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int i, max = nums[0], pos = 0;
        for (i = 0; i < n; i++) {
            if (nums[i] < max)
                pos = i;
        }
        for (i = 0; i < pos; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        for (i = 0; i < n; i++) {
            if (nums[i] < max)
                pos = i;
        }
        return pos + 1;
    }
}