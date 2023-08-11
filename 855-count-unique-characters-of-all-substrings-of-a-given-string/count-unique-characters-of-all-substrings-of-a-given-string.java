class Solution {
    public int uniqueLetterString(String s) {
        HashMap<Character,List<Integer>> all_index=new HashMap();
        for(int i=0;i<s.length();i++)
        {
            all_index.computeIfAbsent(s.charAt(i),key->new ArrayList<>()).add(i);
        } 
        int sum=0;
        for(List <Integer> index : all_index.values())
        {
            for(int i=0;i<index.size();i++)
            {
                int left=i==0?index.get(i)+1:index.get(i)-index.get(i-1);
                int right=i==index.size()-1?s.length()-index.get(i):index.get(i+1)-index.get(i);
                sum+=(left*right);
            }
        }
        return sum;
        
    }
}