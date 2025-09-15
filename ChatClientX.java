import java.io.*;
import java.net.*;

////////////////////////////////////////////////////////////////////////
//
//  Class Name     : ChatClientX
//  Description    : This class implements a simple client-side chat 
//                   application using Java Sockets. It connects to 
//                   the server on port 5151 and communicates in real time.
//  Author         : Sakshi Pankaj Borhade
//  Date           : 21/05/2025
//
////////////////////////////////////////////////////////////////////////

class ChatClientX
{
    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name : main
    //  Description   : Entry point of the client-side chat application.
    //                  It connects to the server, sends messages typed by
    //                  the user, and displays responses from the server.
    //  Input         : Command-line arguments (not used here)
    //  Output        : Messages displayed in console
    //  Author        : Sakshi Pankaj Borhade
    //  Date          : 21/05/2025
    //
    ///////////////////////////////////////////////////////////////////////

    public static void main(String A[]) throws Exception
    {
        // Notify user that client is about to connect
        System.out.println("Client is ready to connect with server...");

        // Connect to the server at localhost on port 5151
        Socket sobj = new Socket("localhost", 5151);
        System.out.println("Marvellous Client successfully connected with server");

        // Create a PrintStream to send messages to the server
        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        // Create BufferedReader to receive messages from the server
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        // Create BufferedReader to read input from the user (console)
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("------------------------------------------------------");
        System.out.println("------ Marvellous Chat Messenger is Ready to Use -----");
        System.out.println("------------------------------------------------------");

        String str1 = null;  // Client message
        String str2 = null;  // Server reply

        // Loop until the client types "end"
        while (!(str1 = bobj2.readLine()).equalsIgnoreCase("end"))
        {
            // Send client message to server
            pobj.println(str1);

            // Read server reply
            str2 = bobj1.readLine();

            // Display server message
            System.out.println("Server says: " + str2);
            System.out.print("Enter message for server: ");
        }

        System.out.println("Chat session ended. Thank you for using Marvellous Chat Messenger.");
    }
}
