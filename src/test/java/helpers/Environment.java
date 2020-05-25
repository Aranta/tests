package helpers;


public class Environment {
// COMMON CONFIG
    public final static String
        url = System.getProperty("url", "http://facebook.com"),
        email = System.getProperty("email", "dminibaeva@gmail.com"),
        password = System.getProperty("password", "AstroGnome1993"),
        yandexMarketUrl = System.getProperty("yandexMarketUrl", "https://market.yandex.ru/"),
        yandexMarketItemName = System.getProperty("yandexMarketItem", "redmi note");
}
