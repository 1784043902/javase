package cc.yys.test;

import java.util.Arrays;
import java.util.Objects;

/**
 * 包名:cc.yys.test
 *
 * @author youyisen
 * 日期:2021-03-09  15-30-40
 */
public class ContinueTest {

    private int age;
    public static void main(String[] args) {

        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));

        String str1 = "he" + new String("ll0");
        System.out.println(str1);

    }

    public static int removeDuplicates(int[] nums) {

        int i = nums.length == 0 ? 0 : 1;

        for(int n : nums){

            if(n > nums[i-1]){

                nums[i++] = n;
            }
        }
        return i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContinueTest that = (ContinueTest) o;
        return age == that.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
