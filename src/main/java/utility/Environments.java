package utility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by msiles on 4/11/15.
 */
public final class Environments {
    private static Map<String, String> envs = new HashMap<>();
    private static String environment;

    static {
        envs.put("dev", "http://changethisurl");
        envs.put("qa", "http://changethisurl");
        envs.put("qa2", "http://changethisurl");
    }

    private Environments() {
    }

    public static String get() {
        environment = System.getenv("server");
        System.out.println("Server Environment Value: " + System.getenv("server"));
        String lowerEnv = (environment == null ? Utils.getProperty("api.environment") : environment).toLowerCase();
        return envs.get(lowerEnv);
    }

    public static String get(String environment) {
        return envs.get(environment);
    }

    public static void set(String environment) {
        Environments.environment = environment;
    }
}
