import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        LinkedHashMap<String, Integer> pmap=new LinkedHashMap<>();
        LinkedHashMap<String, Integer> cmap=new LinkedHashMap<>();
        
        for(int i=0;i<participant.length;i++){
            if(!pmap.containsKey(participant[i])){
            pmap.put(participant[i],1);
            }
            else{
            pmap.put(participant[i],pmap.get(participant[i])+1);
            } 
        }
        
          for(int i=0;i<completion.length;i++){
            if(!cmap.containsKey(completion[i])){
            cmap.put(completion[i],1);
          }
            else{
            cmap.put(completion[i],cmap.get(completion[i])+1);
          }
        }
        
        for(int i=0;i<completion.length;i++){
            if(pmap.containsKey(completion[i])){
               pmap.put(completion[i],pmap.get(completion[i])-1); 
            }
            
        }
        
      for(int i=0;i<participant.length;i++){
        if(pmap.get(participant[i])==1){
        answer=participant[i];
        break; 
      }
        
    }
        return answer;
}
}