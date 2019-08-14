package client;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {
    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private int age;

    private Request(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Builder create(String name, int age) {
        return new Builder().setName(name).setAge(age);
    }

    public static class Builder {

        private String name;
        private int age;

        public Builder setName(final String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(final int age) {
            this.age = age;
            return this;
        }

        public Request build() {
            return new Request(name, age);
        }
    }
}
