package newPack;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @version 1.0
 */
public class Complex {

    private String body;
    private LocalDateTime createdTime;

    /**
     *
     * @param body Note body
     * @param createdTime Note creation time
     */
    public Complex(String body, LocalDateTime createdTime) {
        this.body = body;
        this.createdTime = createdTime;
    }

    /**
     *
     * @return Note's content
     */
    public String getBody() {
        return body;
    }

    /**
     *
     * @param body New content for editing note
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     *
     * @return Note's creation time
     */
    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    /**
     *
     * @param createdTime New create/edit time for note
     */
    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    /**
     *
     * @return Information about note(Content,creation time)
     */
    @Override
    public String toString() {
        return "Note: " + this.getBody() + "\n" + "Create time: " + this.getCreatedTime().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
}
