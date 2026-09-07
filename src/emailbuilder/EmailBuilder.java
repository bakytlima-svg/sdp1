package emailbuilder;

public interface EmailBuilder {
    EmailBuilder setRecipient(String recipient);
    EmailBuilder setSubject(String subject);
    EmailBuilder setBody(String body);
    EmailBuilder setPriority(String priority);
}
