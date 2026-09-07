package emailbuilder;

public class EmailDirector {

    public void makeWelcomeEmail(EmailBuilder builder) {
        builder.setRecipient("student@example.com")
                .setSubject("Welcome to our service")
                .setBody("Welcome! Your account is ready to use.")
                .setPriority("Normal");
    }

    public void makeOrderConfirmation(EmailBuilder builder) {
        builder.setRecipient("customer@example.com")
                .setSubject("Your order has been confirmed")
                .setBody("Thank you for your order. "
                        + "We will send tracking details soon.")
                .setPriority("High");
    }
}
