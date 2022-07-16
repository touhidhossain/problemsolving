package array.leetcode;

import java.util.TreeSet;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{0, 0}, new int[]{0,0}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Integer[] mergedArray = new Integer[nums1.length + nums2.length];
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        for(Integer i : nums1){
            integerTreeSet.add(i);
        }

        for(Integer i : nums2){
            integerTreeSet.add(i);
        }

        mergedArray = integerTreeSet.toArray(mergedArray);

        if(mergedArray.length < 1){
            return 0.0;
        } else if (mergedArray.length == 1){
            return mergedArray[0];
        } else {
            int midPosition = mergedArray.length / 2;

            if((mergedArray.length ^ 1) == mergedArray.length + 1){
                // Even
                double sumOfMedianValue = ((double) mergedArray[midPosition] + (double)mergedArray[midPosition -1 ]);
                return sumOfMedianValue > 0.0 ? sumOfMedianValue / 2.0 : 0.0;
            } else {
                //Odd
                return (double) mergedArray[midPosition];
            }
        }
    }
}
