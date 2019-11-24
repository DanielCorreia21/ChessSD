
import java.net.ServerSocket;

public class Server extends Thread {

	private final int port = 5025;

	public void run() {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("Servidor aberto na IP/Porta: " + serverSocket.getInetAddress() + " " + port);

			for (;;) {
				new CommChannelServer(serverSocket.accept()).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		Server s = new Server();
		s.start();
	}
}
