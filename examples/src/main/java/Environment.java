import com.telekom.m2m.cot.restsdk.CloudOfThingsPlatform;
import com.telekom.m2m.cot.restsdk.devicecontrol.CotCredentials;

/**
 * Helper class that is used by the examples and contains the boring infrastructure code.
 */
class Environment {

    /**
     * Reads an option from environment variables.
     *
     * Fails if the required variable is not available.
     *
     * @param name The name of the environment variable (without prefix, case does not matter).
     * @return The value.
     */
    static String read(String name) {
        final String environmentVariableName = "COT_REST_CLIENT_" + name.toUpperCase();
        String value = System.getenv(environmentVariableName);
        if (value == null) {
            throw new RuntimeException("Cloud of Things " + name + " missing. Provide it via environment variable '" + environmentVariableName + "'.");
        }
        return value;
    }
}
