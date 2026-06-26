public class Main {
    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactory();

        Notification notification1 = factory.createNotification("EMAIL");
        notification1.send();

        Notification notification2 = factory.createNotification("SMS");
        notification2.send();

        Notification notification3 = factory.createNotification("PUSH");
        notification3.send();
    }
    
}
