class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();

        backtrack(candidates, target, 0, 0, sol, res);
        return res;
    }

    private void backtrack(int[] candidates, int target, int start,
                           int cursum, List<Integer> sol,
                           List<List<Integer>> res) {

        if (cursum == target) {
            res.add(new ArrayList<>(sol));
            return;
        }

        if (cursum > target) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            sol.add(candidates[i]);

            backtrack(candidates, target, i,
                      cursum + candidates[i], sol, res);

            sol.remove(sol.size() - 1);
        }
    }
}

