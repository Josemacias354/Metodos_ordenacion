package org.example;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static String[] sortEmotions(boolean order, String[] emotions) {
        Map<String, Integer> emotionLevels = new HashMap<>();
        emotionLevels.put(":D", 4);
        emotionLevels.put(":)", 3);
        emotionLevels.put(":|", 2);
        emotionLevels.put(":(", 1);
        emotionLevels.put("T_T", 0);

        Arrays.sort(emotions, (a, b) -> {
            if (order) {
                return emotionLevels.get(b) - emotionLevels.get(a);
            } else {
                return emotionLevels.get(a) - emotionLevels.get(b);
            }
        });

        return emotions;
    }
}
