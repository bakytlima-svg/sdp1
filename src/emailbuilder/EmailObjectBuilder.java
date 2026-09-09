package emailbuilder;

public class EmailObjectBuilder implements EmailBuilder {
    private String recipient;
    private String subject;
    private String body;
    private String priority;

    @Override
    public EmailObjectBuilder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    @Override
    public EmailObjectBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    @Override
    public EmailObjectBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public EmailObjectBuilder setPriority(String priority) {
        this.priority = priority;
        return this;
    }

    public Email build() {
        if (recipient == null || subject == null
                || body == null || priority == null) {
            throw new IllegalStateException(
                    "Recipient, subject, body and priority are required");
        }

        return new Email(recipient, subject, body, priority);
    }
}
