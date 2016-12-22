public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int first = 0;
        int second = 0;
        int len = nums.length;
        int [] copyNums = new int[len];
        int k = 0;
        for (int i = 0; i < len; ++i){
            copyNums[k++] = nums[i];
        }

        Arrays.sort(copyNums);

        for (int i = 0; i < len - 1; ++i){
            int _first = copyNums[i];
            int _second = Arrays.binarySearch(copyNums, i + 1, len, target - _first);
            if (_second > 0){
                first = _first;
                second = copyNums[_second];

                for (int j = 0; j < len; ++j){
                    if (nums[j] == first) {
                        res[0] = j;
                        break;
                    }
                }
                for (int j = 0; (j < len)   ; ++j){
                    if ((nums[j] == second) &&(res[0] != j)) {
                        res[1] = j;
                        break;
                    }
                }
                break;
            }
        }
        return res;
    }
}
