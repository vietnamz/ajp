package org.vietnamz.base.net;

import org.vietnamz.base.exception.NetException;
import org.vietnamz.base.type.KSInfo;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Optional;

public class SSLStream {

    public boolean createSSL() {
        return true;
    }

    /**
     * To Generate keystore objects.
     *
     *
     * @param filePath: the key store location.
     * @param keyPass: the key store password.
     * @return KsInfo
     * @throws NetException
     */
    public Optional<KSInfo> createKeyStore(final String filePath, final String keyPass) {
        KSInfo info = new KSInfo();
        try {
            // default of java 8 is jks.
            KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
        } catch (KeyStoreException kse) {
            return Optional.empty();
        }
        return Optional.of(info);
    }
}
