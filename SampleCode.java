import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class SampleCode {
	private static final String BUNDLE_NAME = "SampleCode"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private SampleCode() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
