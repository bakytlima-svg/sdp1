# Email Builder

This project demonstrates the Builder Design Pattern in Java.

## Product

The product is an Email with:
- recipient
- subject
- body
- priority

## Builders

There are two concrete builders:

- `EmailObjectBuilder` - creates an Email object.
- `EmailPreviewBuilder` - creates a text preview of the email.

Both builders use the same construction steps.

## Director

`EmailDirector` provides two ready email configurations:

- Welcome email
- Order confirmation

The Director works with the `EmailBuilder` interface.

## How to Run

Run `Main.java` in IntelliJ IDEA.

The program creates an Email object and an Email preview using the same Director configuration.
