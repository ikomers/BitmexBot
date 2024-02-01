package roman.kalinin.bitmexbot.service;

import roman.kalinin.bitmexbot.util.Endpoints;

public class BitmexClientFactory {
    public BitmexClient newTestnetBitmexClient(String apiKey) {
        return new BitmexClient(apiKey, Endpoints.BASE_TEST_URL, false);
    }

    public BitmexClient newRealBitmexClient(String apiKey) {
        return new BitmexClient(apiKey, Endpoints.BASE_REAL_URL, true);    }
}