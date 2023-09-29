import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("[Hello, let's make a Bot you can talk to. Enter it's name]: ");
String name = input.nextLine();
System.out.println("[What about its favourite integer number? Enter it here]: ");
int num = input.nextInt();
input.nextLine();
System.out.println("[What's your name? The Bot will need to know]: ");
String username = input.nextLine();

ChatBot botObject = new ChatBot(name,num);
botObject.greeting(username);
System.out.println("[Let's ask " + name + " what the weather is like today.]");
botObject.weather();
System.out.println("[Hey, enter an integer number]: ");
int usernum = input.nextInt();
botObject.favoriteNumber(usernum);
System.out.println("[This Bot is useless. Let's have it convert feet to meters. Enter an integer]: ");
int feet = input.nextInt();
System.out.println(botObject.convertFeetToMeters(feet) + " Meters! Wow, I am so useful.");
System.out.println("[Nice. Let's have it add some numbers now. Enter your first integer]: ");
int int1 = input.nextInt();
System.out.println("[Enter your second integer]: ");
int int2 = input.nextInt();
System.out.println("[Enter your third integer]: ");
int int3 = input.nextInt();
System.out.println(botObject.addNumbers(int1,int2,int3));
System.out.println("[Okay. Let's say goodbye to " + name + "]");
System.out.println(botObject.goodbye());

botObject.clown();
botObject.squared(5);
    }

}
