class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        List<StringBuilder> m=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            m.add(new StringBuilder());
        }
        int start=0;
        boolean down=false;
        for( char ch : s.toCharArray()){
            m.get(start).append(ch);
            if(start==0 || start==numRows-1){
                down=!down;
            }
            start+=down?1:-1;
        }
        StringBuilder sb=new StringBuilder();
        for(StringBuilder i:m){
            sb.append(i);
        }
        return sb.toString();
    }
}