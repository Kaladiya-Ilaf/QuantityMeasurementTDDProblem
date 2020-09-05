package quantitymeasurement;

enum Unit {
    FEET(UnitType.LENGTH, 12.0),
    INCH(UnitType.LENGTH, 1.0),
    YARD(UnitType.LENGTH, 36.0),
    CENTIMETER(UnitType.LENGTH, 0.4),
    GALLON(UnitType.VOLUME, 3.78),
    LITRE(UnitType.VOLUME,1),
    MILLILITRE(UnitType.VOLUME, 0.001),
    KILOGRAM(UnitType.WEIGHT, 1),
    GRAM(UnitType.WEIGHT, 0.001),
    TONNE(UnitType.WEIGHT, 1000),
    CELSIUS(UnitType.TEMPERATURE, 1),
    FAHRENHEIT(UnitType.TEMPERATURE, 0.029);

    public final double baseUnit;
    UnitType unitType;

    Unit(UnitType unitType, double baseUnit) {
        this.unitType = unitType;
        this.baseUnit = baseUnit;
    }

}

