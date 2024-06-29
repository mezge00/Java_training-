import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class server {
	public static final int LISTENING_PORT=32007;
	
	public static void main(String[] args) {
		 
		ServerSocket listner;
		Socket connection;
		
		try {
			listner=new ServerSocket(LISTENING_PORT);
			System.out.println("Listning on port "+LISTENING_PORT);
			while(true) {
				connection=listner.accept();
				sendDate(connection);
				
				
			}
		} catch (IOException e) {
			System.out.println("The server has shutdon..!");
			System.out.println("error "+e);
			e.printStackTrace();
		}
		
		
	}

	public static void sendDate(Socket clin) {
		System.out.println("Connection from "+clin.getInetAddress().toString());
		Date now =new Date();
		try {
			PrintWriter outgoing=new PrintWriter(clin.getOutputStream());
			outgoing.println(now.toString());
			outgoing.flush();
			outgoing.close();
		} catch (IOException e) {
			System.out.println("Error "+e);
			e.printStackTrace();
		}
		
	}

}
