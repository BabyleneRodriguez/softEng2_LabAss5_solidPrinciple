package solidPrinciple;

public class Email implements EmailNotification
{
    public void sendEmailNotification(String email)
    {
        // Simulate sending email notification
        System.out.println("Email notification sent to: " + email);
    }
}


