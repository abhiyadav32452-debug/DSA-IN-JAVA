class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> map = new HashMap<>();
            for (String str: strs){
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String Key = new String(chars);
                if(!map.containsKey(Key)){
                    map.put (Key,new ArrayList<>());
                }
                map.get(Key).add(str);
            }
            return new ArrayList<>(map.values());
    }
}