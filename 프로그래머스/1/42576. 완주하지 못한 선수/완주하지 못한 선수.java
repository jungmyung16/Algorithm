import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        // 이름별 참가자 수를 저장할 HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 수를 비교해가며 이름별 참가자 수를 1씩 증가
        for(String name : participant) {
            map.put(name, map.getOrDefault(name,0) + 1);
        }
        
        // 완주자 수를 비교해가며 기존 해시맵에 완주자가 있다면 1씩 차감
        for(String name : completion) {
            map.put(name, map.get(name) - 1);
        } 
        // 참가자 수에서 완주자 수를 뺀 결과를 확인
        // 완주자는 count가 0이기 때문에 0이 아닌 참가자가 완주하지 못한 선수
        for(String name : map.keySet()) {
            if(map.get(name) != 0) {
                return name;
            }
        }
        return "";
    }
}