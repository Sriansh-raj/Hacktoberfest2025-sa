class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] pairs = new int[spells.length];
        for(int i = 0; i < spells.length; i++)
        {
            int l = 0, r = potions.length - 1;
            int num = 0;
            while( l <= r)
            {
                int mid = (l + r)/2;
                long prod = ((long)spells[i]*potions[mid]);
                if(prod >= success)
                {
                    r = mid - 1;
                    num = potions.length-mid;
                }else{
                    l = mid + 1;
                }
            }
            pairs[i] = num;
        }
        return pairs;
    }
}
