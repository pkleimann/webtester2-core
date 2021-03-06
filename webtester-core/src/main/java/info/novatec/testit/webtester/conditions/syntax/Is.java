package info.novatec.testit.webtester.conditions.syntax;

import lombok.AllArgsConstructor;
import lombok.NonNull;

import info.novatec.testit.webtester.conditions.Condition;


/**
 * {@link Condition} which returns the result of another condition. This is intended to
 * be used to enhance code readability.
 * <p>
 * <b>Example:</b> <code>Waits.waitUntil(checkbox, is(selected()));</code> is
 * more readable then <code>Waits.waitUntil(checkbox, selected());</code>
 *
 * @param <T> type of the object to test against the condition
 * @see Condition
 * @since 2.0
 */
@AllArgsConstructor
public class Is<T> implements Condition<T> {

    @NonNull
    private final Condition<T> condition;

    @Override
    public boolean test(T value) {
        return condition.test(value);
    }

    @Override
    public String toString() {
        return "is(" + condition + ')';
    }

}
