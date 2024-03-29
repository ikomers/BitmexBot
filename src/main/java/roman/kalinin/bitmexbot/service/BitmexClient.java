package roman.kalinin.bitmexbot.service;

import lombok.RequiredArgsConstructor;
import roman.kalinin.bitmexbot.model.AuthenticationHeaders;
import roman.kalinin.bitmexbot.model.Order;
import roman.kalinin.bitmexbot.util.Signature;

import java.net.http.HttpClient;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@RequiredArgsConstructor
public class BitmexClient {
    private HttpClient httpClient = HttpClient.newBuilder().build();
    private final Signature signature = new Signature();
    private final String apiSecretKey;
    private final String apiKey;
    private final String baseUrl;
    private final boolean isReal;
    private final int EXPIRES_DELAY = 5;

    public void sendOrder() {

    }

    public void cancelOrder() {

    }

    private AuthenticationHeaders getAuthenticationHeaders(String httpMethod, String data, String path) throws NoSuchAlgorithmException, InvalidKeyException {
        long expires = System.currentTimeMillis() / 1000 + EXPIRES_DELAY;

        String signatureStr = signature.getSignature(apiSecretKey, httpMethod + path + expires + data);

        return AuthenticationHeaders.builder()
                .apiKey(apiKey)
                .signature(signatureStr)
                .expires(Long.toString(expires))
                .build();
    }
}
