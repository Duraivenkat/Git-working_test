package com.krce;

import org.testng.Assert;
import org.testng.annotations.Test;

public class first_task{

    @Test
    public void testAddition()
    {
        int a=10;
        int b=20;
        int result=a+b;

        Assert.assertEquals(result,300);

    }

}
