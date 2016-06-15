package info.novatec.testit.webtester.events.browser;

import static java.lang.String.format;

import java.io.File;
import java.nio.file.Path;

import lombok.Getter;

import info.novatec.testit.webtester.browser.operations.ScreenshotTaker;
import info.novatec.testit.webtester.events.Event;
import info.novatec.testit.webtester.events.EventListener;
import info.novatec.testit.webtester.events.EventSystem;
import info.novatec.testit.webtester.events.AbstractEvent;


/**
 * This {@link Event event} occurs whenever a screenshot was taken.
 * <p>
 * It includes the file reference to the screenshot as a property.
 *
 * @see Event
 * @see EventListener
 * @see EventSystem
 * @see ScreenshotTaker#takeAndStore()
 * @see ScreenshotTaker#takeAndStore(String)
 * @see ScreenshotTaker#takeAndStore(Path)
 * @see ScreenshotTaker#takeAndStore(File)
 * @see ScreenshotTaker#takeAndStore(String, String)
 * @see ScreenshotTaker#takeAndStore(Path, String)
 * @see ScreenshotTaker#takeAndStore(File, String)
 * @since 2.0
 */
@SuppressWarnings("serial")
@Getter
public class TookScreenshotEvent extends AbstractEvent {

    private final File screenshot;

    public TookScreenshotEvent(File screenshot) {
        this.screenshot = screenshot;
    }

    @Override
    public String describe() {
        return format("took screenshot and saved it as: %s", screenshot);
    }

}
