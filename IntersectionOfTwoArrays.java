/*
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        
        for(int i : nums1) 
            set1.add(i);
        for(int i : nums2) 
            set2.add(i);
        
        set1.retainAll(set2);
        int[] array = set1.stream().mapToInt(Number::intValue).toArray();
        
        return array;
    }
}
