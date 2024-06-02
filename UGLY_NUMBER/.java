class Solution {
    public boolean isUgly(int n) {
        boolean isUgly=false;
        
        for(int i=2;i<6 && n>0 ;i++){
            while(n % i==0){//2,3,5'e bölünüp bölünmediği kontrol ediliyor.
                n=n/i;
            }
            if(n==1){//bölünme sonucu 1'e eşitlenebilirse n 2,3,5'in katı olmuş olur. true döndürürüm.
                isUgly=true;
            }
        }
        
        return isUgly;
    }
}
