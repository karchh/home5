import java.util.HashMap;
public class HW_5 {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Первый", "Вася");
        hashMap.put("Пятый", "Кеша");
        hashMap.put("Третий", "Петя");
        hashMap.putIfAbsent("Четвертый", "Катя");
        hashMap.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("-".repeat(15));
        for(String v: hashMap.values()){
            System.out.println(v+" ! !");
        }
        System.out.println("-".repeat(15));
        for(String k: hashMap.keySet()){
            System.out.println(k+": "+hashMap.get(k));
    }
    for(String key: hashMap.keySet()) {
        hashMap.compute(key, (k, v) -> "<" + v + ">");
        System.out.println(hashMap.get(key));
    }
    
}