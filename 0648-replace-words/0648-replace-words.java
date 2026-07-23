class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set <String>set = new HashSet<>(dictionary);

        String[]arr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String a: arr){
            String replace = a;

            for(int j=1;j<= replace.length();j++){
                String newword = replace.substring(0,j);
                if(set.contains(newword)){
                    replace = newword;
                    break;
                }
            }
            sb.append(replace).append(" ");
        }
        return sb.toString().trim();
    }
}