package emailbuilder;

public class Main {

    public static void main(String[] args) {
        EmailDirector director = new EmailDirector();

        EmailObjectBuilder objectBuilder = new EmailObjectBuilder();
        director.makeOrderConfirmation(objectBuilder);
        Email email = objectBuilder.build();

        System.out.println(email);
        System.out.println();

        EmailPreviewBuilder previewBuilder = new EmailPreviewBuilder();
        director.makeOrderConfirmation(previewBuilder);
        String preview = previewBuilder.getResult();

        System.out.println(preview);
    }
}
