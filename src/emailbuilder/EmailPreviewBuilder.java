package emailbuilder;

public class EmailPreviewBuilder implements EmailBuilder {
    private String recipient;
    private String subject;
    private String body;
    private String priority;

    @Override
    public EmailPreviewBuilder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    @Override
    public EmailPreviewBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public EmailPreviewBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public EmailPreviewBuilder setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    public String getResult() {
        if (recipient == null || subject == null || body == null) {
            throw new IllegalStateException(
                    "Recipient, subject and body are required");
        }
        return "=== Email Preview ===\n"
                + "To: " + recipient + "\n"
                + "Subject: " + subject + "\n"
                + "Priority: " + priority + "\n\n"
                + body;
    }
}
