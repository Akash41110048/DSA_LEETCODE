class Solution {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for(int i =0;i<n;i++){
            nums[i]=Integer.parseInt(br.readLine());
        }
        int target = Integer.parseInt(br.readLine());
        Solution sol = new Solution();
        int[] result = sol.twoSum(nums, target);
        System.out.println(result);
        
    }
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int compliment = target - nums[i];
            if(hmap.containsKey(compliment)){
                return new int[]{hmap.get(compliment),i};
            }
            hmap.put(nums[i],i);
        }
        return new int[0];
    }
}        