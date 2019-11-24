import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class CommChannelClient {
	Socket sock;
	ObjectOutputStream objectOutputStream;
	ObjectInputStream objectInputStream;
	public CommChannelClient(Socket sock) {
		this.sock = sock;
		try {
			OutputStream outputStream = sock.getOutputStream();
			InputStream inputStream = sock.getInputStream();
			objectOutputStream = new ObjectOutputStream(outputStream);
			objectInputStream = new ObjectInputStream(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void send(Object object) {
		try {
			objectOutputStream.writeObject(object);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected Object receive() {
		Object rec = null;
        try {
			rec = objectInputStream.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return rec;
	}
}
