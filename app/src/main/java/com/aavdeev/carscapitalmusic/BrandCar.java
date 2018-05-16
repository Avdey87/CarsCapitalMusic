package com.aavdeev.carscapitalmusic;

public class BrandCar {
    private String name;
    private String description;

    public static final BrandCar[] brandList = {
            new BrandCar("BMW AG", "немецкий производитель автомобилей, мотоциклов, двигателей, а также велосипедов. Председателем компании на сегодняшний день является Норберт Райтхофер, а главным дизайнером — Йозеф Кабан"),
            new BrandCar("Mercedes-Benz ", "торговая марка и одноимённая компания-производитель легковых автомобилей премиального класса, грузовых автомобилей, автобусов и других транспортных средств, входящая в состав немецкого концерна «Daimler AG»"),
            new BrandCar("Audi AG", "немецкая автомобилестроительная компания в составе концерна Volkswagen Group, специализирующаяся на выпуске автомобилей под маркой Audi. Штаб-квартира расположена в Ингольштадте. Девиз — Vorsprung durch Technik.")
    };

    public BrandCar(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
