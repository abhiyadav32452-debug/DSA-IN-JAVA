class Solution {
    public List<String> commonChars(String[] words) {

        int[] count = new int[26];

        for (char ch : words[0].toCharArray()) {
            count[ch - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {

            int[] temp = new int[26];

            for (char ch : words[i].toCharArray()) {
                temp[ch - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                count[j] = Math.min(count[j], temp[j]);
            }
        }

        List<String> ans = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                ans.add("" + (char)(i + 'a'));
                count[i]--;
            }
        }

        return ans;
    }
}