package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;

public class PlaylistRecommenderTest {

    @Test
    public void placeholder() {
        assertTrue(true);
    }

    @Test
    public void highEnergyTest() {
        List<Integer> bpms = new ArrayList<>();
        bpms.add(140);
        bpms.add(150);
        bpms.add(160);

        Assertions.assertEquals("HIGH", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void validTrackTest() {
        Assertions.assertEquals(true, PlaylistRecommender.isValidTrackTitle("This is a test"));
    }

    @Test
    private void normalizeVolumeTest() {
        Assertions.assertEquals(100, PlaylistRecommender.normalizeVolume(150));
    }
}
