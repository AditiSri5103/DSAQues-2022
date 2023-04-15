package Stack;

import java.util.*;
class valid_parenthesis {
    public boolean isValid(String str) 
    {
    int i,n=str.length();
        char ch;
        Stack<Character> s=new Stack<>();
        for(i=0;i<n;i++){
            ch=str.charAt(i);
            if(ch=='{'||ch=='['||ch=='(')
             s.push(ch);
            else if(ch=='}'||ch==']'||ch==')')
            {
                if(s.isEmpty())// condition when input has only closing brackets
                    return false;
                if((ch=='}'&&s.peek()=='{')||(ch==']'&&s.peek()=='[')||(ch==')'&&s.peek()=='('))  //checking existence of pairs
                    s.pop();
                else
                    return false;
            }
            
            }
        if(s.isEmpty())
       return true;
        else
            return false;
        
        
    }
}