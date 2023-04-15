import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        int n=s.length(),i,j;
        // StringBuilder st=new StringBuilder(s);
       Set<Character> v=new HashSet<>();
       v.add('a');v.add('e'); v.add('i'); v.add('o'); v.add('u'); v.add('A'); v.add('E'); v.add('I'); v.add('O'); v.add('U');
       i=0;
       j=n-1;
       char ch[] = s.toCharArray();
        System.out.println(v);
      while(i<j){
        if(!v.contains(s.charAt(i)))
        i++;
        if(!v.contains(s.charAt(j)))
        j--;
        if(v.contains(s.charAt(i))&&v.contains(s.charAt(j))){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        i++;
        j--;
        }
      }
      return String.valueOf(ch);
    }
}