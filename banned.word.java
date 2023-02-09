class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        if (paragraph == null || paragraph.length() == 0) {
            return paragraph;
        }

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> count = new HashMap<>();
        String[] words = paragraph.replaceAll("[!?',;.]", "").toLowerCase().split(" ");
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                count.put(word, count.getOrDefault(word, 0) + 1);
            }
        }

        String rst = "";
        int countMax = 0;
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            if (entry.getValue() > countMax) {
                rst = entry.getKey();
                countMax = entry.getValue();
            }
        }
        return rst;
    }
}
