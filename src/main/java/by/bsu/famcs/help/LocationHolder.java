package by.bsu.famcs.help;

import java.net.URL;

/**
 * Created by matvei on 18.02.15.
 */
public class LocationHolder {
    private static String RESOURCES_LOCATION;

    static {
        RESOURCES_LOCATION = LocationHolder.class.getClassLoader().getResource("").getPath();
        RESOURCES_LOCATION = RESOURCES_LOCATION.substring(0, RESOURCES_LOCATION.lastIndexOf('/'));
        RESOURCES_LOCATION = RESOURCES_LOCATION.substring(0, RESOURCES_LOCATION.lastIndexOf('/'));
        RESOURCES_LOCATION = RESOURCES_LOCATION.concat("/resources");
    }

    public static String getResourcesLocation() {
        return RESOURCES_LOCATION;
    }
}
