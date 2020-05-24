package helpers;


public class Environment {
// COMMON CONFIG
    public final static String
        yandexMarketUrl = System.getProperty("yandexMarketUrl", "https://market.yandex.ru/"),
        yandexMarketItemName = System.getProperty("yandexMarketItem", "iphone");
}
