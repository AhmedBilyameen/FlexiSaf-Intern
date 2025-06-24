import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MessengerPro {

    public static void main(String[] args) {
        User bilyaminu = new User("Bilyaminu");
        User amina = new User("Amina");

        // Sending messages
        bilyaminu.getMessenger().sendMessage(amina, "Hey Amina, are you joining the FlexiSAF call?");
        amina.getMessenger().sendMessage(bilyaminu, "Yes! Just give me 5 minutes.");

        // Anonymous class for auto-reply
        MessageListener autoResponder = new MessageListener() {
            @Override
            public void onMessageReceived(String sender, String message) {
                System.out.println("🤖 Auto-Reply: Thank you, " + sender + ". I’ve received your message: \"" + message + "\"");
            }
        };
        autoResponder.onMessageReceived("Musa", "Are you available this weekend?");

        // Display inboxes
        System.out.println("\n📥 INBOX for " + bilyaminu.getName() + ":");
        bilyaminu.getMessenger().viewInbox();

        System.out.println("\n📥 INBOX for " + amina.getName() + ":");
        amina.getMessenger().viewInbox();
    }
}

