class Solution {
    public boolean isAlienSorted(String[] words, String order) {

        // Store each character ka position
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        for (int i = 0; i < words.length - 1; i++) {

            String word1 = words[i];
            String word2 = words[i + 1];

            int j = 0;
            while (j < word1.length() && j < word2.length()) {

                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);

                if (c1 != c2) {

                    if (map.get(c1) > map.get(c2)) {
                        return false;
                    }

                    break;
                }

                j++;
            }
            if (j == word2.length() && word1.length() > word2.length()) {
                return false;
            }
        }

        return true;
    }
}