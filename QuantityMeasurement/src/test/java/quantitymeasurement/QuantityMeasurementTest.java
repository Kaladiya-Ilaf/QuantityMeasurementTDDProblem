package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class QuantityMeasurementTest {

    @Test
    public void given2Lengths_whenOfTypeFeetAndBothHasValueZero_shouldBeEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given2Lengths_whenOfTypeFeetAndBothHasValueZeroAndOne_shouldBeUnequal() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void  given2Lengths_whenOfTypeFeetAndBothHasValueZeroAndNull_shouldBeUnequal() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement feet2 =null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void  given1Length_whenOfTypeFeetAndHasValueNull_shouldReturnTrue() {
        QuantityMeasurement feet1 = null;
        boolean nullCheck = Objects.isNull(feet1);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given1Length_whenOfTypeFeetAndHasValueNotNull_shouldReturnTrue() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        boolean nullCheck = Objects.nonNull(feet1);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given2Lengths_whenOfTypeFeetAndBothHasSameReference_shouldBeEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement feet2 = feet1;
        Assert.assertSame(feet1, feet2);
    }

    @Test
    public void  given2Lengths_whenOfTypeFeetAndBothHasDifferentReference_shouldBeUnequal() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET, 1.0);
        Assert.assertNotSame(feet1, feet2);
    }

    @Test
    public void given2Lengths_whenHasSameTypes_shouldBeEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET, 1.0);
        Assert.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    public void given2Lengths_whenHasDifferentTypes_shouldBeUnequal() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 0.0);
        Integer int1 = 0;
        Assert.assertNotEquals(feet1.getClass(), int1.getClass());
    }

    @Test
    public void given2Lengths_whenOfTypeInchAndBothHasValueZero_shouldBeEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given2Lengths_whenOfTypeInchAndBothHasValueZeroAndOne_shouldBeUnequal() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void  given2Lengths_whenOfTypeInchAndBothHasValueZeroAndNull_shouldBeUnequal() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void  given1Length_whenOfTypeInchAndHasValueNull_shouldReturnTrue(){
        QuantityMeasurement inch1 = null;
        boolean nullCheck = Objects.isNull(inch1);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given1Length_whenOfTypeInchAndHasValueNotNull_shouldReturnTrue() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        boolean nullCheck = Objects.nonNull(inch1);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given2Lengths_whenOfTypeInchAndBothHasSameReference_shouldBeEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = inch1;
        Assert.assertSame(inch1, inch2);
    }

    @Test
    public void  given2Lengths_whenOfTypeInchAndBothHasDifferentReference_shouldBeUnequal() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 0.0);
        Assert.assertNotSame(inch1, inch2);
    }

    @Test
    public void given2Lengths_whenHasSameTypesInch_shouldBeEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 0.0);
        Assert.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    public void given2Lengths_whenHasDifferentTypesInchAndInteger_shouldBeUnequal() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 0.0);
        Integer int1 = 0;
        Assert.assertNotEquals(inch1.getClass(), int1.getClass());
    }

    @Test
    public void given2Lenghts_when1OfTypeInchWithValue12And1OfTypeFeetWithValue1_shouldReturnTrue() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 12);
        boolean compareCheck = feet.compareUnits(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2Lengths_whenOfTypeYardAndBothHasValueZero_shouldBeEqual() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Unit.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Unit.YARD, 0.0);
        Assert.assertEquals(yard1, yard2);
    }

    @Test
    public void given2Lengths_whenOfTypeYardAndBothHasValueZeroAndOne_shouldBeUnequal() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Unit.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Unit.YARD, 1.0);
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void  given2Lengths_whenOfTypeYardAndBothHasValueZeroAndNull_shouldBeUnequal() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Unit.YARD, 0.0);
        QuantityMeasurement yard2 =null;
        Assert.assertNotEquals(yard1, yard2);
    }

    @Test
    public void  given1Length_whenOfTypeYardAndHasValueNull_shouldReturnTrue() {
        QuantityMeasurement yard1 = null;
        boolean nullCheck = Objects.isNull(yard1);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given1Length_whenOfTypeYardAndHasValueNotNull_shouldReturnTrue() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Unit.YARD, 0.0);
        boolean nullCheck = Objects.nonNull(yard1);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given2Lengths_whenOfTypeYardAndBothHasSameReference_shouldBeEqual() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Unit.YARD, 0.0);
        QuantityMeasurement yard2 = yard1;
        Assert.assertSame(yard1, yard2);
    }

    @Test
    public void  given2Lengths_whenOfTypeYardAndBothHasDifferentReference_shouldBeUnequal() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Unit.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Unit.YARD, 1.0);
        Assert.assertNotSame(yard1, yard2);
    }

    @Test
    public void given2Lengths_whenHasSameTypesYard_shouldBeEqual() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Unit.YARD, 0.0);
        QuantityMeasurement yard2 = new QuantityMeasurement(Unit.YARD, 0.0);
        Assert.assertEquals(yard1.getClass(), yard2.getClass());
    }

    @Test
    public void given2Lengths_whenHasDifferentTypesYard_shouldBeUnequal() {
        QuantityMeasurement yard1 = new QuantityMeasurement(Unit.YARD, 0.0);
        Integer int1 = 0;
        Assert.assertNotEquals(yard1.getClass(), int1.getClass());
    }

    @Test
    public void given2Lenghts_when1OfTypeYardWithValue1And1OfTypeFeetWithValue3_shouldReturnTrue() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 3);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        boolean compareCheck = feet.compareUnits(feet, yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2Lenghts_when1OfTypeYardWithValue1And1OfTypeFeetWithValue1_shouldReturnFalse() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        boolean compareCheck = feet.compareUnits(feet, yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given2Lenghts_when1OfTypeYardWithValue1And1OfTypeInchWithValue1_shouldReturnFalse() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 1);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        boolean compareCheck = inch.compareUnits(inch, yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given2Lenghts_when1OfTypeYardWithValue1And1OfTypeInchWithValue36_shouldReturnFalse() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 36);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        boolean compareCheck = yard.compareUnits(yard, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2Lenghts_when1OfTypeInchWithValue36And1OfTypeYardWithValue1_shouldReturnFalse() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 36);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        boolean compareCheck = inch.compareUnits(inch, yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2Lenghts_when1OfTypeFeetWithValue3And1OfTypeYardWithValue1_shouldReturnTrue() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 3);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        boolean compareCheck = yard.compareUnits(yard, feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2Lengths_whenOfTypeCentimeterAndBothHasValueZero_shouldBeEqual() {
        QuantityMeasurement cm1 = new QuantityMeasurement(Unit.CENTIMETER, 0.0);
        QuantityMeasurement cm2 = new QuantityMeasurement(Unit.CENTIMETER, 0.0);
        Assert.assertEquals(cm1, cm2);
    }

    @Test
    public void given2Lengths_whenOfTypeCentimeterAndBothHasValueZeroAndOne_shouldBeUnequal() {
        QuantityMeasurement cm1 = new QuantityMeasurement(Unit.CENTIMETER, 0.0);
        QuantityMeasurement cm2 = new QuantityMeasurement(Unit.CENTIMETER, 1.0);
        Assert.assertNotEquals(cm1, cm2);
    }

    @Test
    public void  given2Lengths_whenOfTypeCentimeterAndBothHasValueZeroAndNull_shouldBeUnequal() {
        QuantityMeasurement cm1 = new QuantityMeasurement(Unit.CENTIMETER, 0.0);
        QuantityMeasurement cm2 =null;
        Assert.assertNotEquals(cm1, cm2);
    }

    @Test
    public void  given1Length_whenOfTypeCenAndHasValueNull_shouldReturnTrue() {
        QuantityMeasurement cm1 = null;
        boolean nullCheck = Objects.isNull(cm1);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given1Length_whenOfTypeCentimeterAndHasValueNotNull_shouldReturnTrue() {
        QuantityMeasurement cm1 = new QuantityMeasurement(Unit.CENTIMETER, 0.0);
        boolean nullCheck = Objects.nonNull(cm1);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given2Lengths_whenOfTypeCentimeterAndBothHasSameReference_shouldBeEqual() {
        QuantityMeasurement cm1 = new QuantityMeasurement(Unit.CENTIMETER, 0.0);
        QuantityMeasurement cm2 = cm1;
        Assert.assertSame(cm1, cm2);
    }

    @Test
    public void  given2Lengths_whenOfTypeCentimeterAndBothHasDifferentReference_shouldBeUnequal() {
        QuantityMeasurement cm1 = new QuantityMeasurement(Unit.CENTIMETER, 0.0);
        QuantityMeasurement cm2 = new QuantityMeasurement(Unit.CENTIMETER, 1.0);
        Assert.assertNotSame(cm1, cm2);
    }

    @Test
    public void given2Lengths_whenHasSameTypesCentimeter_shouldBeEqual() {
        QuantityMeasurement cm1 = new QuantityMeasurement(Unit.CENTIMETER, 0.0);
        QuantityMeasurement cm2 = new QuantityMeasurement(Unit.CENTIMETER, 1.0);
        Assert.assertEquals(cm1.getClass(), cm2.getClass());
    }

    @Test
    public void given2Lengths_whenHasDifferentTypesCentimeter_shouldBeUnequal() {
        QuantityMeasurement cm1 = new QuantityMeasurement(Unit.CENTIMETER, 0.0);
        Integer int1 = 0;
        Assert.assertNotEquals(cm1.getClass(), int1.getClass());
    }

    @Test
    public void given2Lenghts_when1OfTypeInchWithValue2And1OfTypeCentimeterWithValue5_shouldReturnFalse() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement centimeter = new QuantityMeasurement(Unit.CENTIMETER, 5);
        boolean compareCheck = inch.compareUnits(inch, centimeter);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2Lenghts_when1OfTypeCentimeterWithValue5And1OfTypeInchWithValue2_shouldReturnFalse() {
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement centimeter = new QuantityMeasurement(Unit.CENTIMETER, 5);
        boolean compareCheck = centimeter.compareUnits(centimeter, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2Lenghts_whenOfTypeInchesBothWithValue2_shouldAdditionInInches() {
        QuantityMeasurement inch1 = new QuantityMeasurement(Unit.INCH, 2);
        QuantityMeasurement inch2 = new QuantityMeasurement(Unit.INCH, 2);
        double sum = inch1.add(inch1, inch2);
        Assert.assertEquals(4.0, sum, 0.0);
    }

    @Test
    public void given2Lenghts_when1OfTypeFeetWithValue1And1OfTypeInchWithValue2_shouldAdditionInInches() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 2);
        double sum = feet.add(feet, inch);
        Assert.assertEquals(14.0, sum, 0.0);
    }

    @Test
    public void given2Lenghts_whenBothOfTypeFeetWithValue1ForBoth_shouldAdditionInInches() {
        QuantityMeasurement feet1 = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement feet2 = new QuantityMeasurement(Unit.FEET, 1);
        double sum = feet1.add(feet1, feet2);
        Assert.assertEquals(24.0, sum, 0.0);
    }

    @Test
    public void given2Lenghts_when1OfTypeInchWithValue2And1OfTypeCentimeterWithValue2AndHalf_shouldAdditionInInches() {
        QuantityMeasurement centimeter = new QuantityMeasurement(Unit.CENTIMETER, 2.5);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 2);
        double sum = centimeter.add(centimeter, inch);
        Assert.assertEquals(3.0, sum, 0.0);
    }

    @Test
    public void given2Volumes_whenOfTypeGallonAndBothHasValueZero_shouldBeEqual() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Unit.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Unit.GALLON, 0.0);
        Assert.assertEquals(gallon1, gallon2);
    }

    @Test
    public void given2VOlumes_whenOfTypeGallonAndBothHasValueZeroAndOne_shouldBeUnequal() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Unit.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Unit.GALLON, 1.0);
        Assert.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void  given2Volume_whenOfTypeGallonsAndBothHasValueZeroAndNull_shouldBeUnequal() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Unit.GALLON, 0.0);
        QuantityMeasurement gallon2 =null;
        Assert.assertNotEquals(gallon1, gallon2);
    }

    @Test
    public void  given1Volume_whenOfTypeGallonAndHasValueNull_shouldReturnTrue() {
        QuantityMeasurement gallon = null;
        boolean nullCheck = Objects.isNull(gallon);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given1Volume_whenOfTypeGallonAndHasValueNotNull_shouldReturnTrue() {
        QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 0.0);
        boolean nullCheck = Objects.nonNull(gallon);
        Assert.assertTrue(nullCheck);
    }
    @Test
    public void  given2Volumes_whenOfTypeGallonAndBothHasSameReference_shouldBeEqual() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Unit.GALLON, 0.0);
        QuantityMeasurement gallon2 = gallon1;
        Assert.assertSame(gallon1, gallon2);
    }

    @Test
    public void  given2Volumes_whenOfTypeGallonAndBothHasDifferentReference_shouldBeUnequal() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Unit.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Unit.GALLON, 1.0);
        Assert.assertNotSame(gallon1, gallon2);
    }

    @Test
    public void given2Volume_whenHasSameTypesGallons_shouldBeEqual() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Unit.GALLON, 0.0);
        QuantityMeasurement gallon2 = new QuantityMeasurement(Unit.GALLON, 1.0);
        Assert.assertEquals(gallon1.getClass(), gallon2.getClass());
    }

    @Test
    public void given2Volumes_whenHasDifferentTypesGallons_shouldBeUnequal() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(Unit.GALLON, 0.0);
        Integer int1 = 0;
        Assert.assertNotEquals(gallon1.getClass(), int1.getClass());
    }

    @Test
    public void given2Volumes_whenOfTypeLitreAndBothHasValueZero_shouldBeEqual() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Unit.LITRE, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Unit.LITRE, 0.0);
        Assert.assertEquals(litre1, litre2);
    }

    @Test
    public void given2VOlumes_whenOfTypeLitreAndBothHasValueZeroAndOne_shouldBeUnequal() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Unit.LITRE, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Unit.LITRE, 1.0);
        Assert.assertNotEquals(litre1, litre2);
    }

    @Test
    public void  given2Volume_whenOfTypeLitreAndBothHasValueZeroAndNull_shouldBeUnequal() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Unit.LITRE, 0.0);
        QuantityMeasurement litre2 =null;
        Assert.assertNotEquals(litre1, litre2);
    }

    @Test
    public void  given1Volume_whenOfTypeLitreAndHasValueNull_shouldReturnTrue() {
        QuantityMeasurement litre = null;
        boolean nullCheck = Objects.isNull(litre);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given1Volume_whenOfTypeLitreAndHasValueNotNull_shouldReturnTrue() {
        QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 0.0);
        boolean nullCheck = Objects.nonNull(litre);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given2Volumes_whenOfTypeLitreAndBothHasSameReference_shouldBeEqual() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Unit.LITRE, 0.0);
        QuantityMeasurement litre2 = litre1;
        Assert.assertSame(litre1, litre2);
    }

    @Test
    public void  given2Volumes_whenOfTypeLitreAndBothHasDifferentReference_shouldBeUnequal() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Unit.LITRE, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Unit.LITRE, 1.0);
        Assert.assertNotSame(litre1, litre2);
    }

    @Test
    public void given2Volume_whenHasSameTypesLitre_shouldBeEqual() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Unit.LITRE, 0.0);
        QuantityMeasurement litre2 = new QuantityMeasurement(Unit.LITRE, 1.0);
        Assert.assertEquals(litre1.getClass(), litre2.getClass());
    }

    @Test
    public void given2Volumes_whenHasDifferentTypesLitre_shouldBeUnequal() {
        QuantityMeasurement litre1 = new QuantityMeasurement(Unit.LITRE, 0.0);
        Integer int1 = 0;
        Assert.assertNotEquals(litre1.getClass(), int1.getClass());
    }

    @Test
    public void given2Volumes_whenOfTypeMillilitreAndBothHasValueZero_shouldBeEqual() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Unit.MILLILITRE, 0.0);
        QuantityMeasurement millilitre2 = new QuantityMeasurement(Unit.MILLILITRE, 0.0);
        Assert.assertEquals(millilitre1, millilitre2);
    }

    @Test
    public void given2VOlumes_whenOfTypeMillilitreAndBothHasValueZeroAndOne_shouldBeUnequal() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Unit.MILLILITRE, 0.0);
        QuantityMeasurement millilitre2 = new QuantityMeasurement(Unit.MILLILITRE, 1.0);
        Assert.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    public void  given2Volume_whenOfTypeMillilitreAndBothHasValueZeroAndNull_shouldBeUnequal() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Unit.MILLILITRE, 0.0);
        QuantityMeasurement millilitre2 =null;
        Assert.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    public void  given1Volume_whenOfTypeMillilitreAndHasValueNull_shouldReturnTrue() {
        QuantityMeasurement millilitre = null;
        boolean nullCheck = Objects.isNull(millilitre);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given1Volume_whenOfTypeMillilitreAndHasValueNotNull_shouldReturnTrue() {
        QuantityMeasurement millilitre = new QuantityMeasurement(Unit.MILLILITRE, 0.0);
        boolean nullCheck = Objects.nonNull(millilitre);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given2Volumes_whenOfTypeMillilitreAndBothHasSameReference_shouldBeEqual() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Unit.MILLILITRE, 0.0);
        QuantityMeasurement millilitre2 = millilitre1;
        Assert.assertSame(millilitre1, millilitre2);
    }

    @Test
    public void  given2Volumes_whenOfTypeMillilitreAndBothHasDifferentReference_shouldBeUnequal() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Unit.MILLILITRE, 0.0);
        QuantityMeasurement millilitre2 = new QuantityMeasurement(Unit.MILLILITRE, 1.0);
        Assert.assertNotSame(millilitre1, millilitre2);
    }


    @Test
    public void given2Volume_whenHasSameTypesMillilitre_shouldBeEqual() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Unit.MILLILITRE, 0.0);
        QuantityMeasurement millilitre2 = new QuantityMeasurement(Unit.MILLILITRE, 1.0);
        Assert.assertEquals(millilitre1.getClass(), millilitre2.getClass());
    }

    @Test
    public void given2Volumes_whenHasDifferentTypesMillilitre_shouldBeUnequal() {
        QuantityMeasurement millilitre1 = new QuantityMeasurement(Unit.MILLILITRE, 0.0);
        Integer int1 = 0;
        Assert.assertNotEquals(millilitre1.getClass(), int1.getClass());
    }

    @Test
    public void given2Volume_when1OfTypeGallonWithValue1And1OfTypeLitreWithValue3point78_shouldReturnTrue() {
        QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1);
        QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 3.78);
        boolean compareCheck = gallon.compareUnits(gallon, litre);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2Volume_when1OfTypeLitreWithValue1And1OfTypeMillilitreWithValue1000_shouldReturnTrue() {
        QuantityMeasurement millilitre = new QuantityMeasurement(Unit.MILLILITRE, 1000);
        QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1);
        boolean compareCheck = litre.compareUnits(litre, millilitre);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2Volumes_when1OfTypeGallonWithValue1And1OfTypeLitreWithValue3point78_shouldRetrunAdditionInLitres() {
        QuantityMeasurement gallon = new QuantityMeasurement(Unit.GALLON, 1);
        QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 3.78);
        double sum = gallon.add(gallon, litre);
        Assert.assertEquals(7.56, sum, 0.0);
    }

    @Test
    public void given2Volumes_when1OfTypeLitreWithValue1And1OfTypeMilliLitreWithValue1000_shouldReturnAdditionInLitres() {
        QuantityMeasurement millilitre = new QuantityMeasurement(Unit.MILLILITRE, 1000);
        QuantityMeasurement litre = new QuantityMeasurement(Unit.LITRE, 1);
        double sum = litre.add(litre, millilitre);
        Assert.assertEquals(2.0, sum, 0.0);
    }

    @Test
    public void given2Weights_whenOfTypeGramAndBothHasValueZero_shouldBeEqual() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Unit.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Unit.GRAM, 0.0);
        Assert.assertEquals(gram1, gram2);
    }

    @Test
    public void given2Weights_whenOfTypeGramAndBothHasValueZeroAndOne_shouldBeUnequal() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Unit.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Unit.GRAM, 1.0);
        Assert.assertNotEquals(gram1, gram2);
    }

    @Test
    public void  given2Weights_whenOfTypeGramsAndBothHasValueZeroAndNull_shouldBeUnequal() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Unit.GRAM, 0.0);
        QuantityMeasurement gram2 = null;
        Assert.assertNotEquals(gram1,gram2);
    }

    @Test
    public void  given1Weight_whenOfTypeGramAndHasValueNull_shouldReturnTrue() {
        QuantityMeasurement gram = null;
        boolean nullCheck = Objects.isNull(gram);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given1Weight_whenOfTypeGramAndHasValueNotNull_shouldReturnTrue() {
        QuantityMeasurement gram = new QuantityMeasurement(Unit.GRAM, 0.0);
        boolean nullCheck = Objects.nonNull(gram);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given2Weights_whenOfTypeGramAndBothHasSameReference_shouldBeEqual() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Unit.GRAM, 0.0);
        QuantityMeasurement gram2 = gram1;
        Assert.assertSame(gram1, gram2);
    }

    @Test
    public void  given2Weights_whenOfTypeGramAndBothHasDifferentReference_shouldBeUnequal() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Unit.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Unit.GRAM, 1.0);
        Assert.assertNotSame(gram1, gram2);
    }

    @Test
    public void given2Weights_whenHasSameTypesGrams_shouldBeEqual() {
        QuantityMeasurement gram1 = new QuantityMeasurement(Unit.GRAM, 0.0);
        QuantityMeasurement gram2 = new QuantityMeasurement(Unit.GRAM, 0.0);;
        Assert.assertEquals(gram1.getClass(), gram2.getClass());
    }

    @Test
    public void given2Weights_whenHasDifferentTypesGram_shouldBeUnequal() {
        QuantityMeasurement gram = new QuantityMeasurement(Unit.GRAM, 0.0);
        Integer int1 = 0;
        Assert.assertNotEquals(gram.getClass(), int1.getClass());
    }

    @Test
    public void given2Weights_whenOfTypeTonnesAndBothHasValueZero_shouldBeEqual() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Unit.TONNE, 0.0);
        QuantityMeasurement tonne2 = new QuantityMeasurement(Unit.TONNE, 0.0);
        Assert.assertEquals(tonne1, tonne2);
    }

    @Test
    public void given2Weights_whenOfTypeTonneAndBothHasValueZeroAndOne_shouldBeUnequal() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Unit.TONNE, 0.0);
        QuantityMeasurement tonne2 = new QuantityMeasurement(Unit.TONNE, 1.0);
        Assert.assertNotEquals(tonne1, tonne2);
    }

    @Test
    public void  given2Weights_whenOfTypeTonneAndBothHasValueZeroAndNull_shouldBeUnequal() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Unit.TONNE, 0.0);
        QuantityMeasurement tonne2 =null;
        Assert.assertNotEquals(tonne1, tonne2);
    }

    @Test
    public void  given1Weight_whenOfTypeTonneAndHasValueNull_shouldReturnTrue() {
        QuantityMeasurement tonne = null;
        boolean nullCheck = Objects.isNull(tonne);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given1Weight_whenOfTypeTonneAndHasValueNotNull_shouldReturnTrue() {
        QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 0.0);
        boolean nullCheck = Objects.nonNull(tonne);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given2Weights_whenOfTypeTonneAndBothHasSameReference_shouldBeEqual() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Unit.TONNE, 0.0);
        QuantityMeasurement tonne2 = tonne1;
        Assert.assertSame(tonne1, tonne2);
    }

    @Test
    public void  given2Weights_whenOfTypeTOnneAndBothHasDifferentReference_shouldBeUnequal() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Unit.TONNE, 0.0);
        QuantityMeasurement tonne2 = new QuantityMeasurement(Unit.TONNE, 1.0);
        Assert.assertNotSame(tonne1, tonne2);
    }

    @Test
    public void given2Weights_whenHasSameTypesTonne_shouldBeEqual() {
        QuantityMeasurement tonne1 = new QuantityMeasurement(Unit.TONNE, 0.0);
        QuantityMeasurement tonne2 = new QuantityMeasurement(Unit.TONNE, 1.0);
        Assert.assertEquals(tonne1.getClass(), tonne2.getClass());
    }

    @Test
    public void given2Weights_whenHasDifferentTypesTonne_shouldBeUnequal() {
        QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 0.0);
        Integer int1 = 0;
        Assert.assertNotEquals(tonne.getClass(), int1.getClass());
    }

    @Test
    public void given2Weights_whenOfTypeKilogramAndBothHasValueZero_shouldBeEqual() {
        QuantityMeasurement kilogram1 = new QuantityMeasurement(Unit.KILOGRAM, 0.0);
        QuantityMeasurement kilogram2 = new QuantityMeasurement(Unit.KILOGRAM, 0.0);
        Assert.assertEquals(kilogram1, kilogram2);
    }

    @Test
    public void given2Weights_whenOfTypeKilogramAndBothHasValueZeroAndOne_shouldBeUnequal() {
        QuantityMeasurement killogram1 = new QuantityMeasurement(Unit.KILOGRAM, 0.0);
        QuantityMeasurement killograma2 = new QuantityMeasurement(Unit.KILOGRAM, 1.0);
        Assert.assertNotEquals(killogram1, killograma2);
    }

    @Test
    public void  given2Weights_whenOfTypeKillogramsAndBothHasValueZeroAndNull_shouldBeUnequal() {
        QuantityMeasurement kilogram1 = new QuantityMeasurement(Unit.KILOGRAM, 0.0);
        QuantityMeasurement kilogram2 =null;
        Assert.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    public void  given1Weight_whenOfTypeKilogramAndHasValueNull_shouldReturnTrue() {
        QuantityMeasurement kilogram = null;
        boolean nullCheck = Objects.isNull(kilogram);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given1Weight_whenOfTypeKilogramAndHasValueNotNull_shouldReturnTrue() {
        QuantityMeasurement kilogram = new QuantityMeasurement(Unit.KILOGRAM, 0.0);
        boolean nullCheck = Objects.nonNull(kilogram);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given2Weights_whenOfTypeKilogramAndBothHasSameReference_shouldBeEqual() {
        QuantityMeasurement kilogram1 = new QuantityMeasurement(Unit.KILOGRAM, 0.0);
        QuantityMeasurement kilogram2 = kilogram1;
        Assert.assertSame(kilogram1, kilogram2);
    }

    @Test
    public void  given2Weights_whenOfTypeKilogramAndBothHasDifferentReference_shouldBeUnequal() {
        QuantityMeasurement killogram1 = new QuantityMeasurement(Unit.KILOGRAM, 0.0);
        QuantityMeasurement killograma2 = new QuantityMeasurement(Unit.KILOGRAM, 1.0);
        Assert.assertNotSame(killogram1, killograma2);
    }

    @Test
    public void given2Weights_whenHasSameTypesKilograms_shouldBeEqual() {
        QuantityMeasurement killogram1 = new QuantityMeasurement(Unit.KILOGRAM, 0.0);
        QuantityMeasurement killograma2 = new QuantityMeasurement(Unit.KILOGRAM, 1.0);
        Assert.assertEquals(killogram1.getClass(), killograma2.getClass());
    }

    @Test
    public void given2Weights_whenHasDifferentTypesKilogram_shouldBeUnequal() {
        QuantityMeasurement kilogram = new QuantityMeasurement(Unit.KILOGRAM, 0.0);
        Integer int1 = 0;
        Assert.assertNotEquals(kilogram.getClass(), int1.getClass());
    }

    @Test
    public void given2Weights_when1OfTypeKilogramWithValue1And1OfTypeGramWithValue1000_shouldReturnTrue() {
        QuantityMeasurement gram = new QuantityMeasurement(Unit.GRAM, 1000);
        QuantityMeasurement kilogram = new QuantityMeasurement(Unit.KILOGRAM, 1);
        boolean compareCheck = kilogram.compareUnits(kilogram, gram);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2Weights_when1OfTypeKilogramWithValue1000And1OfTypeTonneWithValue1_shouldReturnTrue() {
        QuantityMeasurement kilogram = new QuantityMeasurement(Unit.KILOGRAM, 1000);
        QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1);
        boolean compareCheck = kilogram.compareUnits(tonne, kilogram);
        Assert.assertTrue(compareCheck);
    }


    @Test
    public void given2Weights_when1OfTypeGramWithValue1000And1OfTypeTonneWithValue1_shouldRetrunAdditionInKilogram() {
        QuantityMeasurement tonne = new QuantityMeasurement(Unit.TONNE, 1);
        QuantityMeasurement gram = new QuantityMeasurement(Unit.GRAM, 1000);
        double sum = gram.add(gram, tonne);
        Assert.assertEquals(1001.0, sum, 0.0);
    }

    @Test
    public void given2Temperature_whenOfTypeCelsiusAndBothHasValueZero_shouldBeEqual() {
        QuantityMeasurement celsius1 = new QuantityMeasurement(Unit.CELSIUS, 0.0);
        QuantityMeasurement celsius2 = new QuantityMeasurement(Unit.CELSIUS, 0.0);
        Assert.assertEquals(celsius1, celsius2);
    }

    @Test
    public void given2Temperature_whenOfTypeCelsiusAndBothHasValueZeroAndOne_shouldBeUnequal() {
        QuantityMeasurement celsius1 = new QuantityMeasurement(Unit.CELSIUS, 0.0);
        QuantityMeasurement celsius2 = new QuantityMeasurement(Unit.CELSIUS, 1.0);
        Assert.assertNotEquals(celsius1, celsius2);
    }

    @Test
    public void  given2Temperature_whenOfTypeCelsiusAndBothHasValueZeroAndNull_shouldBeUnequal() {
        QuantityMeasurement celsius1 = new QuantityMeasurement(Unit.CELSIUS, 0.0);
        QuantityMeasurement celsius2 =null;
        Assert.assertNotEquals(celsius1, celsius2);
    }

    @Test
    public void  given1Temperature_whenOfTypeCelsiusAndHasValueNull_shouldReturnTrue() {
        QuantityMeasurement celsius = null;
        boolean nullCheck = Objects.isNull(celsius);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given1Temperature_whenOfTypeCelsiusAndHasValueNotNull_shouldReturnTrue() {
        QuantityMeasurement celsius = new QuantityMeasurement(Unit.CELSIUS, 0.0);
        boolean nullCheck = Objects.nonNull(celsius);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given2Temperature_whenOfTypeCelsiusAndBothHasSameReference_shouldBeEqual() {
        QuantityMeasurement celsius1 = new QuantityMeasurement(Unit.CELSIUS, 0.0);
        QuantityMeasurement celsius2 = celsius1;
        Assert.assertSame(celsius1, celsius2);
    }

    @Test
    public void  given2Temperature_whenOfTypeCelsiusAndBothHasDifferentReference_shouldBeUnequal() {
        QuantityMeasurement celsius1 = new QuantityMeasurement(Unit.CELSIUS, 0.0);
        QuantityMeasurement celsius2 = new QuantityMeasurement(Unit.CELSIUS, 1.0);
        Assert.assertNotSame(celsius1, celsius2);
    }

    @Test
    public void given2Temperature_whenHasSameTypesCelsius_shouldBeEqual() {
        QuantityMeasurement celsius1 = new QuantityMeasurement(Unit.CELSIUS, 0.0);
        QuantityMeasurement celsius2 = new QuantityMeasurement(Unit.CELSIUS, 1.0);
        Assert.assertEquals(celsius1.getClass(), celsius2.getClass());
    }

    @Test
    public void given2Temperature_whenHasDifferentTypesCelsisus_shouldBeUnequal() {
        QuantityMeasurement celsius = new QuantityMeasurement(Unit.CELSIUS, 0.0);
        Integer int1 = 0;
        Assert.assertNotEquals(celsius.getClass(), int1.getClass());
    }


    @Test
    public void given2Temperature_whenOfTypeFahrenheitAndBothHasValueZero_shouldBeEqual() {
        QuantityMeasurement fahrenheit1 = new QuantityMeasurement(Unit.FAHRENHEIT, 0.0);
        QuantityMeasurement fahrenheit2 = new QuantityMeasurement(Unit.FAHRENHEIT, 0.0);
        Assert.assertEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void given2Temperature_whenOfTypeFahrenheitAndBothHasValueZeroAndOne_shouldBeUnequal() {
        QuantityMeasurement fahrenheit1 = new QuantityMeasurement(Unit.FAHRENHEIT, 0.0);
        QuantityMeasurement fahrenheit2 = new QuantityMeasurement(Unit.FAHRENHEIT, 1.0);
        Assert.assertNotEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void  given2Temperature_whenOfTypeFahrenheitAndBothHasValueZeroAndNull_shouldBeUnequal() {
        QuantityMeasurement fahrenheit1 = new QuantityMeasurement(Unit.FAHRENHEIT, 0.0);
        QuantityMeasurement fahrenheit2 = null;
        Assert.assertNotEquals(fahrenheit1, fahrenheit2);
    }

    @Test
    public void  given1Temperature_whenOfTypeFahrenheitAndHasValueNull_shouldReturnTrue() {
        QuantityMeasurement fahrenheit = null;
        boolean nullCheck = Objects.isNull(fahrenheit);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given1Temperature_whenOfTypeFahrenheitAndHasValueNotNull_shouldReturnTrue() {
        QuantityMeasurement fahrenheit = new QuantityMeasurement(Unit.FAHRENHEIT, 0.0);
        boolean nullCheck = Objects.nonNull(fahrenheit);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void  given2Temperature_whenOfTypeFahrenhheitAndBothHasSameReference_shouldBeEqual() {
        QuantityMeasurement fahrenheit1 = new QuantityMeasurement(Unit.FAHRENHEIT, 0.0);
        QuantityMeasurement fahrenheit2 = fahrenheit1;
        Assert.assertSame(fahrenheit1, fahrenheit2);
    }

    @Test
    public void  given2Temperature_whenOfTypeFahreinheitAndBothHasDifferentReference_shouldBeUnequal() {
        QuantityMeasurement fahrenheit1 = new QuantityMeasurement(Unit.FAHRENHEIT, 0.0);
        QuantityMeasurement fahrenheit2 = new QuantityMeasurement(Unit.FAHRENHEIT, 0.0);
        Assert.assertNotSame(fahrenheit1, fahrenheit2);
    }

    @Test
    public void given2Temperature_whenHasSameTypesFahrenheit_shouldBeEqual() {
        QuantityMeasurement fahrenheit1 = new QuantityMeasurement(Unit.FAHRENHEIT, 0.0);
        QuantityMeasurement fahrenheit2 = new QuantityMeasurement(Unit.FAHRENHEIT, 0.0);
        Assert.assertEquals(fahrenheit1.getClass(), fahrenheit2.getClass());
    }

    @Test
    public void given2Temperature_whenHasDifferentTypesFahrenhites_shouldBeUnequal() {
        QuantityMeasurement fahrenheit = new QuantityMeasurement(Unit.FAHRENHEIT, 0.0);
        Integer int1 = 0;
        Assert.assertNotEquals(fahrenheit.getClass(), int1.getClass());
    }

    @Test
    public void given2Temperature_when1OfTypeCelsiusWithValue100And1OfTypeFahrenheitWithValue212_shouldReturnTrue() {
        QuantityMeasurement fahrenheit = new QuantityMeasurement(Unit.FAHRENHEIT, 212);
        QuantityMeasurement celsius = new QuantityMeasurement(Unit.CELSIUS, 100);
        boolean compareCheck = celsius.temperatureComparision(celsius, fahrenheit);
        Assert.assertTrue(compareCheck);
    }

}
