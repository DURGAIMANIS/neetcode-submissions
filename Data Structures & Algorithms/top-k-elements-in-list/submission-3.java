class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int answer[]=new int[k];
        int index=0;
        while(index<k){
            int freq=0;
            int arrvalue=0;

            for(int key:map.keySet()){
                if(map.get(key)>freq){//get return values for the key-index
                    freq=map.get(key);
                    arrvalue=key;
                }
            }
            answer[index]=arrvalue;
            index++;
            map.remove(arrvalue);
        }
        return answer;
    }
}
/*
Steps:
1. Count frequencies using HashMap.
2. Find the key with the maximum frequency.
3. Store that key in the answer.
4. Remove that key from the HashMap.
5. Repeat until k elements are collected.
*/

