package info.novatec.testit.webtester.junit5.extensions.configuration.unmarshaller;

import java.util.Optional;

import info.novatec.testit.webtester.config.Configuration;
import info.novatec.testit.webtester.junit5.extensions.configuration.ConfigurationValue;
import info.novatec.testit.webtester.junit5.extensions.configuration.ConfigurationValueExtension;


/**
 * Implementations of this interface are used to unmarshal a value from a {@link Configuration} as a specific type.
 * <p>
 * More specifically these implementations are used when resolving values for fields annotated with {@link
 * ConfigurationValue} from a {@link Configuration} with the {@link ConfigurationValueExtension}.
 * <p>
 * Custom implementations can be used via class reference on {@link ConfigurationValue#using()}.
 *
 * @see Configuration
 * @see ConfigurationValue
 * @since 2.1
 */
public interface ConfigurationUnmarshaller<T> {

    /**
     * Returns whether or not the given type can be handled by this {@link ConfigurationUnmarshaller}.
     *
     * @param type the type to unmarshal
     * @return {@code true} if it can be got - otherwise {@code false}
     * @since 2.1
     */
    boolean canHandle(Class<?> type);

    /**
     * Returns the value for the given {@code key} from the given {@link Configuration}.
     *
     * @param configuration the configuration to use
     * @param key the key to resolve
     * @return an optional containing the value if it was found
     * @since 2.1
     */
    Optional<T> unmarshal(Configuration configuration, String key);

}
