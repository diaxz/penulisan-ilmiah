package id.ac.gunadarma.tugasku.account;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class TaskAuthenticatorService extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		return new TaskAuthenticator(this).getIBinder();
	}

}
