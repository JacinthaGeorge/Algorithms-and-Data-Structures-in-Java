package rampatra.arrays;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: ramswaroop
 * @date: 9/19/15
 * @time: 11:33 PM
 */
public class CountSmallerElementsOnRHS {

    public static int[] getSmallerElementsCountOnRHSNaive(int[] a) {
        // TODO
        return null;
    }

    public static void main(String a[]) {
        System.out.println(Arrays.toString(getSmallerElementsCountOnRHSNaive(new int[]{12, 1, 2, 3, 0, 11, 4})));
        System.out.println(Arrays.toString(getSmallerElementsCountOnRHSNaive(new int[]{5, 4, 3, 2, 1})));
        System.out.println(Arrays.toString(getSmallerElementsCountOnRHSNaive(new int[]{1, 2, 3, 4, 5})));
    }
}