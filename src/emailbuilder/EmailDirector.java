package emailbuilder;

public class EmailDirector {

    private static final String ORDER_RECIPIENT = "customer@example.com";
    private static final String ORDER_SUBJECT = "Your order has been confirmed";
    private static final String ORDER_BODY =
            "Thank you for your order. We will send tracking details soon.";
    private static final String HIGH_PRIORITY = "High";

    private static final String WELCOME_RECIPIENT = "student@example.com";
    private static final String WELCOME_SUBJECT = "Welcome to our service";
    private static final String WELCOME_BODY =
            "Welcome! Your account is ready to use.";
    private static final String NORMAL_PRIORITY = "Normal";

    public void makeWelcomeEmail(EmailBuilder builder) {
        builder.setRecipient(WELCOME_RECIPIENT)
                .setSubject(WELCOME_SUBJECT)
                .setBody(WELCOME_BODY)
                .setPriority(NORMAL_PRIORITY);
    }

    public void makeOrderConfirmation(EmailBuilder builder) {
        builder.setRecipient(ORDER_RECIPIENT)
                .setSubject(ORDER_SUBJECT)
                .setBody(ORDER_BODY)
                .setPriority(HIGH_PRIORITY);
    }
}
