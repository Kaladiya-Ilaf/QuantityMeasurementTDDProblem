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
    public void given2Lenghts_when1InchWithValue12And1FeetWithValue1_shouldReturnTrue() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 1);
        QuantityMeasurement inch = new QuantityMeasurement(Unit.INCH, 12);
        boolean compareCheck = feet.compareUnits(inch);
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
    public void given2Lenghts_when1YardWithValue1And1FeetWithValue3_shouldReturnTrue() {
        QuantityMeasurement feet = new QuantityMeasurement(Unit.FEET, 3);
        QuantityMeasurement yard = new QuantityMeasurement(Unit.YARD, 1);
        boolean compareCheck = feet.compareUnits(yard);
        Assert.assertTrue(compareCheck);
    }
}
