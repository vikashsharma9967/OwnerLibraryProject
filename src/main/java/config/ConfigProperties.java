package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties",
        "classpath:config.properties"
})
public interface ConfigProperties extends Config {

    @Key("browser")
    String browser();

    @Key("url")
    String url();

    @Key("timeout")
    int timeout();
}
