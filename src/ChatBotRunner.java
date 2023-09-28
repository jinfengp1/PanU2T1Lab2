import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("Hello, let's make a Bot you can talk to. Enter it's name: ");
String name = input.nextLine();
System.out.println("What about its favourite integer number? Enter it here: ");
int num = input.nextInt();
System.out.println("What's your name? The Bot will need to know: ");
String username = input.nextLine();

ChatBot t = new ChatBot(name,num);
t.greeting(username);
    }

}
