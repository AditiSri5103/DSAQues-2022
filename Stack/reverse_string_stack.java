package Stack;

import java.util.Stack;
class reverse_string_stack {
    
    public String reverse(String S){
        String s="";
      Stack<Character> st=new Stack<>();
      for (int i=0;i<S.length();i++){
          st.push(S.charAt(i));
      }
      while(!st.isEmpty()){
          s+=st.pop();
      }
      return s;
          }

}