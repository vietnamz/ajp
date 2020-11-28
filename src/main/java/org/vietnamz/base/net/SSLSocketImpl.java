package org.vietnamz.base.net;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SSLSocketImpl extends SSLSocketFactory {
    @Override
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override
    public Socket createSocket(Socket socket, String s, int i, boolean b) throws IOException {
        return null;
    }

    @Override
    public Socket createSocket(String s, int i) throws IOException, UnknownHostException {
        return null;
    }

    @Override
    public Socket createSocket(String s, int i, InetAddress inetAddress, int i1) throws IOException, UnknownHostException {
        return null;
    }

    @Override
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return null;
    }

    @Override
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress1, int i1) throws IOException {
        return null;
    }
}
