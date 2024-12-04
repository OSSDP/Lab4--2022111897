import org.junit.jupiter.api.Test;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class L2022111897_16_Test {
    @Test
    public void testLargestNumber() {
        Solution16 solution = new Solution16();

        // 测试用例 1
        int[] nums1 = {10, 2};
        String expected1 = "21";
        assertEquals(expected1, solution.largestNumber(nums1));

        // 测试用例 2
        int[] nums2 = {3, 30, 34, 5, 9};
        String expected2 = "9534330";
        assertEquals(expected2, solution.largestNumber(nums2));

        // 测试用例 3 - 所有元素为 0
        int[] nums3 = {0, 0};
        String expected3 = "0";
        assertEquals(expected3, solution.largestNumber(nums3));

        // 测试用例 4 - 单个数字
        int[] nums4 = {1};
        String expected4 = "1";
        assertEquals(expected4, solution.largestNumber(nums4));

        // 测试用例 5 - 两个数字组成回文
        int[] nums5 = {12, 121};
        String expected5 = "12121";
        assertEquals(expected5, solution.largestNumber(nums5));
    }
}
