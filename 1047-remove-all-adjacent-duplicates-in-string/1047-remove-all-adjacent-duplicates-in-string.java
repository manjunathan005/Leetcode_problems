class Solution {
    public String removeDuplicates(String s) {
        Stack<String> st=new Stack<>();
        String[] arr=s.split("");
        for(String a:arr){
            if(!st.isEmpty()&&a.equals(st.peek())){
                st.pop();
            }
            else{
                st.push(a);
            }
        }
        StringBuilder b=new StringBuilder();
        for(String a:st){
            b.append(a);
        }
        return b.toString();
    }
}