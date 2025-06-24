import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class User extends Person {
    protected Messenger messenger;

    public User(String name) {
        super(name);
        this.messenger = new Messenger(this);
    }

    public Messenger getMessenger() {
        return messenger;
    }

    @Override
    public String getName() {
        return this.name;
    }

    // Inner class (Nested)
    class Messenger {
        private final User owner;
        private final List<String> inbox;

        public Messenger(User owner) {
            this.owner = owner;
            this.inbox = new ArrayList<>();
        }

        public void sendMessage(User receiver, String message) {
            String timestamp = getCurrentTime();
            System.out.println("📤 [" + timestamp + "] " + owner.getName() + " sends to " + receiver.getName() + ": " + message);
            receiver.getMessenger().receiveMessage(owner.getName(), message, timestamp);
        }

        private void receiveMessage(String sender, String message, String time) {
            inbox.add("[" + time + "] From " + sender + ": " + message);
        }

        public void viewInbox() {
            if (inbox.isEmpty()) {
                System.out.println("📭 Inbox is empty.");
            } else {
                inbox.forEach(System.out::println);
            }
        }

        private String getCurrentTime() {
            return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        }
    }
}