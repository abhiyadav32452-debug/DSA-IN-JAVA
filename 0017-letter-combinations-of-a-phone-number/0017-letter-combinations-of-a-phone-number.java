class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.isEmpty ())
        return res;
        String[] map = {"","", "abc","def","ghi","jkl",
        "mno","pqrs","tuv","wxyz"};
        backtrack(digits,0,"",map,res);
        return res;
    }
    void backtrack(String digits,int index,String curr, String[] map, List<String> res){
        if(index == digits.length()){
            res.add(curr);
            return;
        }
        String letters = map[digits.charAt(index) -'0'];
        for(char ch: letters.toCharArray()){
            backtrack (digits, index + 1, curr + ch, map, res);
        }
    }
}