import java.util.*;

class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        int[] counts = new int[n];
        int[] indices = new int[n];
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        mergeSort(nums, indices, temp, counts, 0, n - 1);

        List<Integer> result = new ArrayList<>();
        for (int count : counts) {
            result.add(count);
        }
        return result;
    }

    private void mergeSort(int[] nums, int[] indices, int[] temp,
                           int[] counts, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;
        mergeSort(nums, indices, temp, counts, left, mid);
        mergeSort(nums, indices, temp, counts, mid + 1, right);

        int i = left, j = mid + 1, k = left;
        int rightSmaller = 0;

        while (i <= mid && j <= right) {
            if (nums[indices[j]] < nums[indices[i]]) {
                temp[k++] = indices[j++];
                rightSmaller++;
            } else {
                counts[indices[i]] += rightSmaller;
                temp[k++] = indices[i++];
            }
        }

        while (i <= mid) {
            counts[indices[i]] += rightSmaller;
            temp[k++] = indices[i++];
        }

        while (j <= right) {
            temp[k++] = indices[j++];
        }

        for (i = left; i <= right; i++) {
            indices[i] = temp[i];
        }
    }
}