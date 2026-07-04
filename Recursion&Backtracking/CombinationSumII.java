import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(0, candidates, target, new ArrayList<>(), res);
        return res;
        
    }
    static void backtrack(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> res)
    {
        if(target == 0)
        {
            res.add(new ArrayList<>(current));
            return;
        }
        if(target < 0)
        {
            return;
        }
        for(int i = index; i < candidates.length; i ++)
        {
            if(i > index && candidates[i] == candidates[i - 1])
            {
                continue;
            }
            if(candidates[i] > target)
            {
                break;
            }
            current.add(candidates[i]);
            backtrack(i + 1, candidates, target - candidates[i], current, res);
            current.remove(current.size() - 1);
        }
    }
}