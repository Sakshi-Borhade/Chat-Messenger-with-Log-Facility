import java.io.*;
import java.net.*;

////////////////////////////////////////////////////////////////////////
//
//  Class Name     : ChatServerX
//  Description    : This class implements a simple server-side chat 
//                   application using Java Sockets. The server listens 
//                   on port 5151 and communicates with a single client.
//  Author         : Sakshi Pankaj Borhade
//  Date           : 21/05/2025
//
////////////////////////////////////////////////////////////////////////

class ChatServerX
{
    ///////////////////////////////////////////////////////////////////////
    //
    //  Function Name : main
    //  Description   : Entry point for the server-side chat application.
    //                  It waits for client connection, then exchanges
    //                  messages with the connected client.
    //  Input         : Command-line arguments (not used here)
    //  Output        : None (console interaction)
    //  Author         : Sakshi Pankaj Borhade
    //  Date           : 21/05/2025
    //
    ///////////////////////////////////////////////////////////////////////

    public static void main(String A[]) throws Exception
    {
        // Create a server socket listening on port 5151
        ServerSocket ssobj = new ServerSocket(5151);
        System.out.println("Marvellous Server is waiting at port number 5151");

        // Accept the incoming client connection
        Socket sobj = ssobj.accept();
        System.out.println("Marvellous Server successfully connected with the client");

        // Create a PrintStream to send data to the client
        PrintStream pobj = new PrintStream(sobj.getOutputStream());

        // Create BufferedReader to receive data from client
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        // Create BufferedReader to read input from server's console
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("------------------------------------------------------");
        System.out.println("------ Marvellous Chat Messenger is Ready to Use -----");
        System.out.println("------------------------------------------------------");

        String str1 = null;  // To store client messages
        String str2 = null;  // To store server responses

        // Infinite loop to read from client and respond from server
        while ((str1 = bobj1.readLine()) != null)
        {
            // Display client's message
            System.out.println("Client says: " + str1);

            // Prompt server user for input
            System.out.print("Enter the message for client: ");
            str2 = bobj2.readLine();

            // Send message to client
            pobj.println(str2);
        }// End of While
    }// end of main
}// end of main class
