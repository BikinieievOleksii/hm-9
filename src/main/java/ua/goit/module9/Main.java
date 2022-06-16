package ua.goit.module9;

public class Main {
    public static void main(String[] args) {
        MyHashMap<String, String> myHashMap = new MyHashMap<>();
        myHashMap.put("Ukraine", "Kiev");
        System.out.println(myHashMap);
        System.out.println(myHashMap.size());
        System.out.println(myHashMap.get("Ukraine"));
    }
}
