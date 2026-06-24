import java.util.*;
class Solution {
   public String getHash(String s) {
       StringBuilder hash = new StringBuilder();
       int[] freq = new int[26];


       for (char ch : s.toCharArray()) {
           freq[ch - 'a']++;
       }


       for (int i = 0; i < 26; i++) {
           if (freq[i] != 0) {
               hash.append(freq[i]);
           }
           hash.append("$");
       }


       return hash.toString();
   }


   public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> res = new ArrayList<>();
       HashMap<String, List<String>> mp = new HashMap<>();


       for (int i = 0; i < strs.length; i++) {
           String key = getHash(strs[i]);
           if (!mp.containsKey(key)) {
               mp.put(key, new ArrayList<>());
           }
           mp.get(key).add(strs[i]);
       }


       for (List<String> group : mp.values()) {
           res.add(group);
       }


       return res;
   }
}

/* 
ATLASDB_URL=mongodb+srv://delta-student:<db_password>@cluster0.0fxa0rc.mongodb.net/?appName=Cluster0


awZzD7dNX3zzYk0F 

ATLASDB_URL=mongodb+srv://delta-student:awZzD7dNX3zzYk0F@cluster0.0fxa0rc.mongodb.net/?appName=Cluster0
*/