package plan;

/**
 * 假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
 *
 * 给你一个整数数组  flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。
 * 另有一个数 n ，能否在不打破种植规则的情况下种入 n 朵花？能则返回 true ，不能则返回 false。
 */
public class Code605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length=flowerbed.length;
        if(length==1){
            if(flowerbed[0]==0&&n<=1){
                return true;
            }else if(flowerbed[0]==1&&n<1){
                return true;
            }else {
                return false;
            }
        }
        int count=0;
        for(int i=0;i<length;i++){
            if(flowerbed[i]==0){
                if(i==0){
                    if(flowerbed[i+1]==0){
                        flowerbed[i]=1;
                        count++;
                    }
                }else if(i==length-1){
                    if(flowerbed[i-1]==0){
                        flowerbed[i]=1;
                        count++;
                    }
                }else if(flowerbed[i-1]==0&&flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    count++;
                }
            }else {
                i++;
            }
            if(count>=n){
                return true;
            }
        }
        return false;
    }
}
