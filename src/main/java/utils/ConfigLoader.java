package utils;

import config.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;

public class ConfigLoader {

    private static ConfigProperties config;

    public static ConfigProperties getConfig() {
        if (config == null) {
            String env = System.getProperty("env", "qa"); // default QA
            ConfigFactory.setProperty("env", env);
            config = ConfigFactory.create(ConfigProperties.class);
        }
        return config;
    }
}
