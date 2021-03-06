package com.soygul.organizer.data;

/**
 * NBusy Web API client.
 */
public class ApiClient {
    private final String apiUri = "https://nbusy.herokuapp.com/api";
    private final String wsUri = "wss://nbusy.herokuapp.com";
    private final JsonClient jsonClient;

    public ApiClient(JsonClient jsonClient) {
        this.jsonClient = jsonClient;
    }
}
