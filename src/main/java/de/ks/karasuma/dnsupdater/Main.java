package de.ks.karasuma.dnsupdater;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        System.getProperties().setProperty("java.net.preferIPv6Addresses",
                "true");

        if (args[0] == null) {
            System.err.println("Please provide url as input argument");
            return;
        }

        updateDDNS(args[0]);
    }

    private static void updateDDNS(String arg) {
        try {
            URL url = new URL(arg);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            urlConnection.setRequestProperty("User-Agent","Chrome/70.0.3538.77");
            urlConnection.connect();
            System.out.println(urlConnection.getResponseCode());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
