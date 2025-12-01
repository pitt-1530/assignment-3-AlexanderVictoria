package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        if (bpms == null || bpms.size() == 0){
            throw new IllegalArgumentException();
        }
        int sum = 0;
        for (Integer bpm: bpms) {
            sum+=bpm;
        }
        float average = sum/bpms.size();

        if (average >= 140){
            return "HIGH";
        }
        if (average < 140 && average >= 100){
            return "MEDIUM";
        }
        return "LOW";
    }

    public static boolean isValidTrackTitle(String title) {
        if (title == null) {
            return false;
        }
        char[] titleArr = title.toCharArray();
        if (titleArr.length > 30 || titleArr.length < 1){
            return false;
        }
        for (char c: titleArr) {
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                return false;
            }
        }
        return true;
    }

    public static int normalizeVolume(int volumeDb) {
        if (volumeDb > 100) {
            return 100;
        }
        if (volumeDb < 0) {
            return 0;
        }
        return volumeDb;
    }
}
