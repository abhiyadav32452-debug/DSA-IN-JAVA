class Solution {
    public String destCity(List<List<String>> paths) {

        HashSet<String> from = new HashSet<>();

        for (List<String> path : paths) {
            from.add(path.get(0));
        }

        for (List<String> path : paths) {
            String destination = path.get(1);

            if (!from.contains(destination)) {
                return destination;
            }
        }

        return "";
    }
}