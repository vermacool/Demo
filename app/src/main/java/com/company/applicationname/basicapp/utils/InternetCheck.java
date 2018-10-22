package com.company.applicationname.basicapp.utils;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by Manish on 2/3/2018.
 * All rights reserved by skedsoft
 */

public class InternetCheck extends AsyncTask<Void,Void,Boolean> {

    private Consumer mConsumer;
    public  interface Consumer { void accept(Boolean internet); }

    public  InternetCheck(Consumer consumer) { mConsumer = consumer; execute(); }

    @Override protected Boolean doInBackground(Void... voids) { try {
        Socket sock = new Socket();
        sock.connect(new InetSocketAddress("8.8.8.8", 53), 1500);
        sock.close();
        return true;
    } catch (IOException e) { return false; } }

    @Override protected void onPostExecute(Boolean internet) { mConsumer.accept(internet); }
}

