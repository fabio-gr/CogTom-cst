package br.unicamp.multimodal_ai.cogtom_cst;

import java.io.InputStream;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class SallyAnneTest {

    // Folder names for test csv files
    public static final String folder = "sally-anne";

    private ClassLoader loader;
    private InputStream entitiesStream;
    private InputStream intentionsStream;
    private InputStream affordancesStream;
    private InputStream eyeDirectionsStream;

    public SallyAnneTest() {
        loader = getClass().getClassLoader();
    }

    @Test
    public void cogTomCstTest() throws InterruptedException {
        System.out.println("Sally-Anne test case");

        entitiesStream = loader.getResourceAsStream(folder + "/entities.csv");
        intentionsStream = loader.getResourceAsStream(folder + "/intentions.csv");
        affordancesStream = loader.getResourceAsStream(folder + "/affordances.csv");
        eyeDirectionsStream = loader.getResourceAsStream(folder + "/eye_directions.csv");

        // Main Class test
        ArrayList<InputStream> inputStreams = new ArrayList<>();
        inputStreams.add(entitiesStream);
        inputStreams.add(intentionsStream);
        inputStreams.add(affordancesStream);
        inputStreams.add(eyeDirectionsStream);

        CogTomCst cogTom = new CogTomCst();
        cogTom.run(inputStreams);

        // Wait for the test to finish - this could be of course much better.
        Thread.sleep(5000);
    }
}
