package printer;

public class ConsolePrinter implements Printer {

    public static class Message {
        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {
        boolean textEmpty = message.getText() == null || message.getText().isEmpty();
        boolean senderEmpty = message.getSender() == null || message.getSender().isEmpty();

        if (textEmpty && senderEmpty) {
            Runnable emptyHandler = new Runnable() {
                @Override
                public void run() {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            emptyHandler.run();
        } else if (senderEmpty) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender()
                    + " відправив повідомлення: " + message.getText());
        }
    }
}