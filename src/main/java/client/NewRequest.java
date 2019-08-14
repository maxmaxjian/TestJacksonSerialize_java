package client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NewRequest {
    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private int age;

    public NewRequest(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
