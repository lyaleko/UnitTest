package calculator;

import calculators.Rectangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class RectangleTest {

    Rectangle figure;
    double length, width;

    public RectangleTest(double length, double width) {

        this.length = length;
        this.width = width;
        this.figure = new Rectangle();
    }

    @Parameterized.Parameters
    public static List<Object[]> inputData(){
        return Arrays.asList(new Object[][]{
                {new RectangleTest(8.0, 5.0), 8.0, 5.0},

        });
    }
    @Test
    public void figureGetLengthTest(){
        Assert.assertEquals("Rectangle is not correct", length, figure.getLength());
    }

    @Test
    public void figureGetWidthTest(){
        Assert.assertEquals("Rectangle is not correct", width, figure.getWidth());
    }

    @Test
    public void figureSetLengthTest() {
        figure.setLength(25.0);
        Assert.assertEquals("Rectangle is not correct", 25.0,figure.getLength());
    }

    @Test
    public void figureSetWidthTest() {
        figure.setWidth(10.0);
        Assert.assertEquals("Rectangle is not correct", 10.0,figure.getWidth());
    }

}