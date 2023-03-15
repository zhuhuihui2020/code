package cyc2018.shuang_zhi_zhen;

/**
 * 给你一个字符数组 letters，该数组按非递减顺序排序，以及一个字符 target。letters 里至少有两个不同的字符。
 *
 * 返回 letters 中大于 target 的最小的字符。如果不存在这样的字符，则返回 letters 的第一个字符。
 */
public class Code744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length-1;
        int c=0;
        while (left<=right){
            int middle=left+(right-left)/2;
            if(letters[middle]<=target){
                left=middle+1;
            }else {
                c=middle;
                right=middle-1;
            }
        }
        return letters[c];
    }
}
