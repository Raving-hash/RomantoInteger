class Solution {
    public int romanToInt(String s) {
        int res = 0;
        char[] ch = s.toCharArray();
        int len = s.length();
        int curr ;
        int next = 0;
        if(len == 1) return getVal(ch[0]);
        for(int i=0;i<len-1;i++){
            curr = getVal(ch[i]);
            next = getVal(ch[i+1]);
            if(curr < next){
                res -= curr;
            }else{
                res += curr;
            }
        }
        res += next;
        return res;
    }
    //罗马字符转数字util方法
    public  int getVal(char c){
        switch (c){
            case 'I':return 1;
            case 'V' :return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int vi = solution.romanToInt("VI");
        System.out.println("vi = " + vi);
    }
}
