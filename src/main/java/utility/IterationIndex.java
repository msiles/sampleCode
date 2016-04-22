package utility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by msiles on 4/11/15.
 */
public final class IterationIndex {
    private static Map<String, String> itetarionIndexList = new HashMap<>();
    private static String iterationIndex;

    static {
        itetarionIndexList.put("0", "0");
        itetarionIndexList.put("1", "1");
        itetarionIndexList.put("2", "2");
        itetarionIndexList.put("3", "3");
    }

    private IterationIndex() {
    }

    public static String get() {
        iterationIndex = System.getenv("iterationIndex");
        String lowerBrowser = (iterationIndex == null ? Utils.getProperty("api.iterationIndex") : iterationIndex).toLowerCase();
        return itetarionIndexList.get(lowerBrowser);
    }

    public static String get(String iterationIndex) {
        return itetarionIndexList.get(iterationIndex);
    }

    public static void set(String iterationIndex) {
        IterationIndex.iterationIndex = iterationIndex;
    }
}
