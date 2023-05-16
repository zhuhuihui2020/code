package plan;

/**
 * 给你字符串 s 和整数 k 。
 *
 * 请返回字符串 s 中长度为 k 的单个子字符串中可能包含的最大元音字母数。
 *
 * 英文中的 元音字母 为（a, e, i, o, u）。
 */
//超出时间限制
public class Code1456 {
    public static int maxVowels(String s, int k) {
        int length=s.length();
        if(length<=k){
            return getCount(s,0,length-1);
        }
        int left=0;
        int right=k-1;
        int res=0;
        while (right<length){
            res=Math.max(getCount(s,left,right),res);
            left++;
            right++;
        }
        return res;
    }

    public static int getCount(String s,int left,int right){
        int count=0;
        for(int i=left;i<=right;i++){
            if("aeiouAEIOU".indexOf(s.charAt(i))>=0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s="tryhard";
        int k=4;
        System.out.println(maxVowels(s,4));
    }

}
