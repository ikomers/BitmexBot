package roman.kalinin.bitmexbot.util;

import org.apache.logging.log4j.util.StringBuilders;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Signature {

    public String  getSignature(String secretKey, String message) throws NoSuchAlgorithmException,
            InvalidKeyException {
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
        sha256_HMAC.init(secretKeySpec);

        byte[] hashedBytes = sha256_HMAC.doFinal(message.getBytes(StandardCharsets.UTF_8));

        StringBuilder hexSringBuilder = new StringBuilder();

        for (byte b : hashedBytes) {
            hexSringBuilder.append(String.format("%02x", b));
        }

        return hexSringBuilder.toString();
    }

}
