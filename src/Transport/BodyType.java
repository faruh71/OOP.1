package Transport;

public enum BodyType {
    SEDAN("седан"),
    HATCHBACK("хэтчбек"),
    COUPE("купе"),
    STATION_WAGON("универсал"),
    SUV("внедорожние"),
    CROSSOVER("кроссовер"),
    PICKUR_TUCK("пикап"),
    VAN("фургон"),
    MINIVAN("минивен");
    private String bodyType;

    public String getBodyType() {
        return bodyType;
    }

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return "кузов автомобиля " + bodyType;
    }
}
