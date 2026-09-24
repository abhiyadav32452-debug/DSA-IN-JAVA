class LRUCache {

    private LinkedHashMap<Integer, Integer> map;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;

        map = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public int get(int key) {

        if (!map.containsKey(key)) {
            return -1;
        }

        return map.get(key);
    }

    public void put(int key, int value) {

        map.put(key, value);

        if (map.size() > capacity) {
            int firstKey = map.keySet().iterator().next();
            map.remove(firstKey);
        }
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */