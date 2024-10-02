package vn.edu.usth.weather;

import android.os.Bundle;
import android.os.Message;

import android.os.Handler;

public class RefreshTay {
    private Handler handler;

    public RefreshTay(Handler handler)
    {
        this.handler = handler;
    }

    public void NetworkRequest() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

                Bundle bundle = new Bundle();
                bundle.putString("server_response", "Hello KQV");

                Message msg = new Message();
                msg.setData(bundle);
                handler.sendMessage(msg);
            }
        });
        t.start();
    }
}