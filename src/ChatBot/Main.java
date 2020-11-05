package ChatBot;

import com.sun.jdi.connect.TransportTimeoutException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {



    public static void main(String[] args) {

        Chatbot botchat = new Chatbot();

        while(botchat.x)
        {

            Scanner myscann = new Scanner(System.in);

            String sityva = myscann.nextLine();
            botchat.trans(sityva);

        }

    }

}
