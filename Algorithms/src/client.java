import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
	public static final int LISTENING_PORT=3007;
	public static void main(String[] args) {
		Socket connection;
		String hostname;
		BufferedReader incoming;
		if(args.length>0)
			hostname=args[0];
		else {
			Scanner in=new Scanner(System.in);
			System.out.println("Please enter the computer name or IP ");
			hostname=in.nextLine();
		}
		try {
			connection=new Socket(hostname,LISTENING_PORT);
			incoming=new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String lineFromServer=incoming.readLine();
			
			if(lineFromServer==null) {
				throw new IOException("Connection was opnned but the server is not sending any data");
			
			}
			System.out.println();
			System.out.println(lineFromServer);
			System.out.println();
			incoming.close();
				
			
		} catch (UnknownHostException e) {
			System.out.println("error "+e);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("error "+e);
			e.printStackTrace();
		}
		
	}

}
