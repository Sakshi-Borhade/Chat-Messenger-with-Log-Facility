Marvellous Chat Messenger
--------------------------------------------------------------------------------

Project Type   : Java Console Application  
Modules        : ChatServerX.java, ChatClientX.java   
Author         : Sakshi Pankaj Borhade  

Project Description:
--------------------------------------------------------------------------------
This is a Java-based Chat Messenger application that enables two-way text 
communication between a server and a client over a network using TCP/IP.

The application includes:
  1. ChatServerX.java - Acts as the server, waits for and responds to client messages.
  2. ChatClientX.java - Acts as the client, connects to the server and initiates the conversation.

Files Included:
--------------------------------------------------------------------------------
| File Name       | Description                                               |
|-----------------|-----------------------------------------------------------|
| ChatServerX.java| Java class for the chat server functionality              |
| ChatClientX.java| Java class for the chat client functionality              |

How to Compile and Run:
--------------------------------------------------------------------------------

1. Compile the Java source files using terminal/command prompt:

       javac ChatServerX.java
       javac ChatClientX.java

2. Open two separate terminal windows:

   - In the first terminal, run the server:

         java ChatServerX

   - In the second terminal, run the client:

         java ChatClientX

3. Start chatting:
   - The client sends the first message.
   - The server responds to the message.
   - To end the conversation, type "end" in the client terminal.

Sample Output:
--------------------------------------------------------------------------------

Server Terminal:
----------------
Marvellous Server is waiting at port number 5151  
Marvellous Server successfully connected with the client  
------ Marvellous Chat Messenger is Ready to Use ------  
Client says: Hello  
Enter the message for client: Hi, welcome!

Client Terminal:
----------------
Client is ready to connect with server  
Marvellous client is successfully connected with server  
------ Marvellous Chat Messenger is Ready to Use ------  
Hello  
Server says: Hi, welcome!  
Enter message for server: 

Protocol Used:
--------------------------------------------------------------------------------
- TCP/IP socket communication
- Port: 5151
- Communication: Synchronous (one message at a time)

================================================================================
Features:
--------------------------------------------------------------------------------
- Real-time one-to-one chat functionality  
- Simple command-line interface  
- Clean and modular Java socket implementation  
- No external dependencies required

Termination:
--------------------------------------------------------------------------------
- To end the session, type "end" from the client side.
- The server will stop interaction when client exits.
